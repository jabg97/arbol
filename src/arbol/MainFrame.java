package arbol;

import conexion.Servidor;
import conexion.Conex;
import conexion.Crear;
import conexion.License;
import java.awt.Color;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;

import java.nio.file.Paths;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        //ocultar(); 
        java.net.URL imgUrl = this.getClass().getResource("/icon/Icon.png");
        if (imgUrl != null) {
            setIconImage(new ImageIcon(imgUrl).getImage());
        }
        Connection conex = null;
        try {
            conex = new Conex().Conex();
            new Crear(conex);
            conex.close();
        
            Valifecha();
            
            home();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "La base de datos no ha sido importada", "Error", 0);
            try {
                conex.close();
                new Crear().Validar(0);
            } catch (Exception ex1) {
                JOptionPane.showMessageDialog(this, ex1.getMessage(), "Error", 0);
            }
        }
    }

    public void titu(String Titulo) {
        setTitle(Titulo);
    }
    
         public void Actualizar() throws Exception {

             if (!Paths.get("key.bin").toFile().exists()) {     
   new Crear().Validar(1);
            
            }
             
            String key = new String(Base64.getDecoder().decode(Arbol.Leer("key.bin")), "UTF-8");
            String fecha = new License(key,1).getFecha();
            System.out.println(fecha);
            Arbol.Escribir(Base64.getEncoder().encode(fecha.getBytes()), "config.bin");
   
    }   
    
     public void Valifecha() {
        try {
            
            if (!Paths.get("config.bin").toFile().exists()) {     
               Arbol.Escribir(Base64.getEncoder().encode("2017-01-01".getBytes()), "config.bin");
            }
            
            String text = new String(Base64.getDecoder().decode(Arbol.Leer("config.bin")), "UTF-8");
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(text);
            System.err.println(date);
            System.out.println(new Date());
            if(new Date().after(date)){
                Actualizar();
                System.exit(0);
            }       
        
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", 0);
        }
    }

    public void ocultar() {
        estado.setText("");
        //jMenu4.setVisible(false);
        //jMenuItem8.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu11 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        estado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Stock 3.0");
        setPreferredSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jMenu11.setText("   ");
        jMenu11.setEnabled(false);
        jMenuBar1.add(jMenu11);

        jMenu3.setForeground(new java.awt.Color(204, 0, 102));
        jMenu3.setText("Menu Principal");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home.png"))); // NOI18N
        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator1);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Person.png"))); // NOI18N
        jMenuItem4.setText("Ingresar Persona");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);
        jMenu3.add(jSeparator5);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bar_Config.png"))); // NOI18N
        jMenuItem8.setText("Configuracion");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);
        jMenu3.add(jSeparator8);

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        jMenuItem9.setText("Salir");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("   ");
        jMenu6.setEnabled(false);
        jMenuBar1.add(jMenu6);

        estado.setForeground(java.awt.Color.gray);
        estado.setEnabled(false);
        estado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        estado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        estado.setLabel("Esperando una conexion");
        jMenuBar1.add(estado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home() {
        arbol.Home ir = new arbol.Home();
        ir.setSize(Escritorio.getSize());
        Escritorio.add(ir);
        ir.setVisible(true);
        try {
  ir.setMaximum(true);
} catch (Exception e) {
  // Vetoed by internalFrame
  // ... possibly add some handling for this case
}
        ir.toFront();

    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        home();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        config.Config ir = new config.Config();
        Escritorio.add(ir);
        ir.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    
        int desi = JOptionPane.showConfirmDialog(this, "¿ Desea Salir?", "Salir", 2);
        if (desi == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

 
    void Server() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ServerSocket listener = null;
                try {

                    if (!Paths.get("port.bin").toFile().exists()) {
                        Arbol.Escribir("1234".getBytes(), "port.bin");
                    }

                    int Rport = Integer.parseInt(new String(Arbol.Leer("port.bin"), "UTF-8"));
                    listener = new ServerSocket(Rport, 1);
                    while (true) {
                        new Servidor(listener.accept(), estado, Escritorio).start();
                    }
                    } catch (IOException ex) {
             
                    estado.setText("Error: " + ex.getMessage());
                    estado.setForeground(Color.MAGENTA);
                
                  if(ex.getClass().getCanonicalName().equals("java.net.BindException")){
                        JOptionPane.showMessageDialog(null, "Esta Aplicacion Ya esta siendo ejecutada . . . \n","Alerta",2);
                        System.exit(0);
                        }
                    
        }  finally {
                    try {
                        listener.close();
                    } catch (IOException ex) {
                        estado.setText("Error: " + ex.getMessage());
                        estado.setForeground(Color.MAGENTA);
                    }
                }

            }
        }).start();

    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Server();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
personas.Personas ir = new personas.Personas();
        Escritorio.add(ir);
        ir.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu estado;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
