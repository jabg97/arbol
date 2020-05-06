
package conexion;
import arbol.Arbol;

import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class Crear {
public Icon check;
    Connection con;
    Statement datos;
  
    
      public Crear(){}
    
     public Crear(Connection conex) throws Exception {
        this.datos = conex.createStatement();      
        datos.executeQuery("select * from personas WHERE id = '1'"); 
     }
        
    
    
    private void Inicio() throws Exception {
           this.con = new Conex().Conex();
        this.datos = con.createStatement();

      check = new ImageIcon(Crear.class.getResource("/icon/Check.png"));

        
  datos.executeUpdate(" CREATE TABLE IF NOT EXISTS personas(" +
"id INT," +
"fecha_ingreso DATE," +          
"nombre VARCHAR(60)," +
"telefono VARCHAR(30)," +
"nivel INT," +          
"referencia INT," +
"PRIMARY KEY(id)," +
"FOREIGN KEY (referencia)" + 
"REFERENCES personas(id)" +
")");
String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
  datos.executeUpdate("INSERT INTO personas "
+ "VALUES('1','"+fecha+"','Root','0','1','1')");
                
                JOptionPane.showMessageDialog(null, "La Base de Datos ha sido Importada","Exito",-1,check);               
                
con.close();
        }
        
  
        
    public void Validar(int ope){
try{
            //Escribir(Base64.getEncoder().encode("1554135-2711".getBytes()),"config.bin");
            String contra = "";
            String fecha = "";
            //String text = new String(Base64.getDecoder().decode(Leer("config.bin")), "UTF-8");
            do {

                JPanel panel = new JPanel();
                JLabel label = new JLabel("Ingrese una Contraseña:");
                JPasswordField pass = new JPasswordField(10);
                panel.add(label);
                panel.add(pass);
                String[] options = new String[]{"OK", "Cancel"};
                int option = JOptionPane.showOptionDialog(null, panel,"Contraseña",
                        JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, options, options[1]);
                if (option == 0) // pressing OK button
                {

                        char[] password = pass.getPassword();
                    contra = new String(password);
                    
                    fecha = new License(contra,ope).getFecha();
                    
                } else {
                    System.exit(0);
                }
            } while (fecha.equals("")|| fecha== null);
            Arbol.Escribir(Base64.getEncoder().encode(fecha.getBytes()), "config.bin");
            Arbol.Escribir(Base64.getEncoder().encode(contra.getBytes()), "key.bin");
            Inicio();
        } catch (Exception ex) {
System.exit(0);                    }
    }    

  
    
}
