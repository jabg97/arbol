package personas;

import arbol.Node;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import conexion.Conex;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

public class ClasePersonas {

    Connection con;
    Statement datos;
    JRootPane contenedor;
    int id;
    int nivel, referencia;
    String fecha, nombre, telefono;
    

    public Icon check;

    public ClasePersonas(JRootPane contenedor, int id, String fecha, String nombre, String telefono, int nivel, int referencia) throws Exception {
        this.con = new Conex().Conex();
        this.datos = con.createStatement();
        this.contenedor = contenedor;
        this.id = id;
        this.fecha = fecha;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nivel = nivel;
        this.referencia = referencia;
        check = new ImageIcon(ClasePersonas.class.getResource("/icon/Check.png"));
    }

    private int existe(int buscar) throws SQLException {
        ResultSet resul = datos.executeQuery("SELECT (nivel) FROM personas WHERE id ='" + buscar + "'");
        int nivel_padre = 0;
        while (resul.next()) {
            nivel_padre = resul.getInt(1);
        }

        return nivel_padre;
    }

    private Node hijo(int buscar,int x,int y) throws SQLException {      
        ResultSet resul = datos.executeQuery("SELECT * FROM personas WHERE id = '"+buscar+"'");

        Object[] info = new Object[7];
        int newx =0;
        int newy =0;
        int espacio = 0;

        while (resul.next()) {
            info[0] = resul.getString(1);           
            info[1] = resul.getString(3);
            info[2] = resul.getString(5);
       
            id= Integer.parseInt(info[0].toString());
            nivel= Integer.parseInt(info[2].toString())-1;
            espacio = (int)Math.pow(2,new Node(null, null, null).getMax() - nivel); 
            if(id %2 == 0){
                
            info[3] = x-60*espacio;
            
     
            }else{
                
            info[3] = x+60*espacio;

            }
            
            info[4] = y+100;
            
            info[5] = x;
            info[6] = y;
            
            newx = Integer.parseInt(info[3].toString());
            newy = Integer.parseInt(info[4].toString());
                
        }

        if (info[0]== null) {           
                return null;
            }

        int izq = Integer.parseInt(info[0].toString())*2;
        int der = (Integer.parseInt(info[0].toString())*2)+1;
         
        new Node(null, null, null).getDatos().add(info);
        
        return new Node(info, hijo(izq, newx,newy), hijo(der,newx,newy));
    }

  
    
    public Node arbol(int buscar,int x,int y) throws SQLException {
        ResultSet resul = datos.executeQuery("SELECT * FROM personas WHERE id = '"+buscar+"'");
        Object[] info = new Object[7];

        while (resul.next()) {
            info[0] = resul.getString(1);
            info[1] = resul.getString(3);
            info[2] = resul.getString(5);
            
            
            info[3] = x;
            info[4] = y;   
            info[5] = x;
            info[6] = y;
            
        }
               
        int izq = Integer.parseInt(info[0].toString())*2;
        int der = (Integer.parseInt(info[0].toString())*2)+1; 
        
        new Node(null, null, null).getDatos().add(info);
        Node arbol = new Node(info, hijo(izq, x,y), hijo(der,x,y));
        con.close();
        return arbol;
    }
    
     public void maximo() throws SQLException {
        ResultSet resul = datos.executeQuery("SELECT MAX(nivel) FROM personas");

        while (resul.next()) {
           new Node(null, null, null).setMax(resul.getInt(1));                             
        }
        
        new Node(null, null, null).setDatos(new ArrayList<>());

    }

    public boolean insertar() throws SQLException {

        int nivel_padre = existe(referencia);

        if (nivel_padre <= 0) {
            JOptionPane.showMessageDialog(contenedor, "la Referencia no existe", "Error", 0);
            con.close();
            return false;
        }

        int newID = referencia * 2;
        nivel = existe(newID);

        if (nivel > 0) {
            newID = (referencia * 2) + 1;

            nivel = existe(newID);

            if (nivel > 0) {
                JOptionPane.showMessageDialog(contenedor, "la Referencia ya tiene 2 personas", "Error", 0);
                con.close();
                return false;
            } else {
                nivel_padre++;

                datos.executeUpdate("INSERT INTO personas"
                        + " VALUES('" + newID + "','" + fecha + "','" + nombre + "','" + telefono + "','" + nivel_padre + "','" + referencia + "')");
                JOptionPane.showMessageDialog(contenedor, "El Registro Ha Sido Insertado", "Exito", -1, check);
                con.close();
                return true;
            }
        } else {
            nivel_padre++;
            datos.executeUpdate("INSERT INTO personas"
                    + " VALUES('" + newID + "','" + fecha + "','" + nombre + "','" + telefono + "','" + nivel_padre + "','" + referencia + "')");

            JOptionPane.showMessageDialog(contenedor, "El Registro Ha Sido Insertado", "Exito", -1, check);
            con.close();
            return true;

        }

    }

    public void consulta() throws SQLException {

        ResultSet resul = datos.executeQuery("SELECT * FROM personas ORDER BY id");

        DefaultTableModel modelo1 = (DefaultTableModel) ConsultaPersonas.jTable1.getModel();
        Object[] fila = new Object[7];

        while (resul.next()) {
            fila[0] = resul.getString(1);
            fila[1] = resul.getString(2);
            fila[2] = resul.getString(3);
            fila[3] = resul.getString(4);
            fila[4] = resul.getString(5);
            fila[5] = resul.getString(6);

            modelo1.addRow(fila);
        }
        ConsultaPersonas.jTable1.setModel(modelo1);
        con.close();

    }

    public void buscar_nombre(String buscar) throws SQLException {

        ResultSet resul = datos.executeQuery("SELECT * FROM personas WHERE nombre like '%" + buscar + "%' ORDER BY id");

        DefaultTableModel modelo1 = (DefaultTableModel) ConsultaPersonas.jTable1.getModel();

        if (modelo1.getRowCount() > 0) {
            for (int i = modelo1.getRowCount() - 1; i > -1; i--) {
                modelo1.removeRow(i);
            }
        }

        Object[] fila = new Object[7];

        while (resul.next()) {
            fila[0] = resul.getString(1);
            fila[1] = resul.getString(2);
            fila[2] = resul.getString(3);
            fila[3] = resul.getString(4);
            fila[4] = resul.getString(5);
            fila[5] = resul.getString(6);

            modelo1.addRow(fila);
        }
        ConsultaPersonas.jTable1.setModel(modelo1);
        con.close();

    }

    public String enviar(String bus) throws Exception {
        ResultSet resul = null;
        if (bus == null || "".equals(bus)) {
            resul = datos.executeQuery("SELECT * FROM personas");
        } else {
            resul = datos.executeQuery("SELECT * FROM stock where producto LIKE '%" + bus + "%' ORDER BY tipo");
        }

        String send = "";

        float iva;
        int canti_iva;
        int val_iva;
        int canti;
        int compra;

        while (resul.next()) {
            canti = resul.getInt(3);
            compra = resul.getInt(4);
            iva = resul.getInt(5) / 100.0f;
            canti_iva = (int) (compra * iva);
            val_iva = resul.getInt(6) + canti_iva;

            send += resul.getString(1).trim() + ",";
            send += resul.getString(2).trim() + ",";
            send += String.valueOf(canti).trim() + ",";
            send += String.valueOf(compra).trim() + ",";
            send += String.valueOf(val_iva).trim();
            send += "|";
        }

        con.close();

        return send;

    }

    public String buscar() throws SQLException {

        ResultSet resul = datos.executeQuery("SELECT * FROM personas WHERE id='" + id + "'");
        int id = 0;
        while (resul.next()) {

            id = resul.getInt(1);
            fecha = resul.getString(2);
            nombre = resul.getString(3);
            telefono = resul.getString(4);
            nivel = resul.getInt(5);
            referencia = resul.getInt(6);
        }

        if (id == 0) {

            return "no";

        }

        con.close();

        return "si";

    }

    public void borrar() throws SQLException {
        
        if(id!=1){

        int del = datos.executeUpdate("DELETE FROM personas WHERE id='" + id + "'");

        if (del == 1) {
            JOptionPane.showMessageDialog(contenedor, "El Registro Ha Sido Eleminado", "Exito", -1, check);
        }
        }else{
 JOptionPane.showMessageDialog(contenedor, "Este Registro no se puede Eliminar", "Error", 0);
        }
        con.close();

    }

    public void modificar() throws SQLException {

        int mod = datos.executeUpdate("UPDATE personas "
                + "SET fecha_ingreso ='" + fecha + "',nombre ='" + nombre + "',telefono ='" + telefono + "' WHERE id = '" + id + "'");

        if (mod == 1) {
            JOptionPane.showMessageDialog(contenedor, "El Registro Ha Sido Modificado", "Exito", -1, check);
        }
        con.close();

    }
}
