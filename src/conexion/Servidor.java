package conexion;

import personas.ClasePersonas;
import personas.ConsultaPersonas;
import java.awt.Color;
import java.net.*;
import java.io.*;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class Servidor extends Thread {

    private Socket socket;
    private JMenu estado;
    private JDesktopPane desk;
    private String dir;
    private int flag;

    public Servidor(Socket socket, JMenu estado,JDesktopPane desk) throws UnknownHostException {
        this.socket = socket;
        this.estado = estado;
        this.desk =desk;
        this.dir = ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostString();
        log("Conectado con " + dir);
        estado.setForeground(Color.BLUE);
    }

    @Override
    public void run() {
         try {
        try {

      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
     // ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
   PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
      String cod="";
            while (true) {
               
                    sleep(500);
               flag = in.read();
                if(flag == -1){
            throw new IOException("Error: "+dir+" se ha Desconectado");
                }
        //System.out.println(flag);
                if (in.ready()) {
                    
                    if(flag == 126){  
                        cod = in.readLine();
                       // System.out.println(cod);
                        try {
               String array = new ClasePersonas(null,0,null,null,null,0,0).enviar(cod);
      //System.out.println(array);
      out.println(array);
     // out.writeObject(array);  
         
                        } catch (Exception ex) {
         System.err.println(ex.getMessage());
                        }
                }else if(flag == 94){
                    
                    cod = in.readLine();
                    JOptionPane.showInputDialog(desk,"¿Que Desea hacer?",
                            cod,3, null, new String[]{"Buscar","Insertar"}, "Buscar");
                    
                        ConsultaPersonas ir = new ConsultaPersonas();
        desk.add(ir);
        ir.setVisible(true);
        //ir.bus_cod(cod);
                }
                }
                        
            }

        } catch (IOException e) {
            log("Error: no se pudo establecer conexion con " + dir);
            estado.setForeground(Color.MAGENTA);
            sleep(1000);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                log("Error: No se pudo finalizar la conexion con " + dir);
                estado.setForeground(Color.MAGENTA);
                sleep(1000);
            }
            log("Esperando una conexion");
            estado.setForeground(Color.GRAY);
        }
         } catch (InterruptedException ex) {
                    estado.setText("Error: "+ex.getMessage());
                        estado.setForeground(Color.MAGENTA);
                }  
    }

    private void log(String message) {
        this.estado.setText(message);
    }
}
