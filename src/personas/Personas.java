package personas;

import java.awt.Cursor;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Personas extends javax.swing.JInternalFrame {

    public Icon check;

    public Personas() {
        initComponents();
        check = new ImageIcon(Personas.class.getResource("/icon/Check.png"));
    }

    String accion;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        f5 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        f2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        f4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        f3 = new javax.swing.JTextField();
        f6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        borrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        insertar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Personas");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestion Personas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Persona", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 0, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Nivel");

        f5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        f5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        f1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        f1.setForeground(new java.awt.Color(0, 153, 255));
        f1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha");

        f2.setDate(new Date());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Telefono");

        f4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        f4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Nombre");

        f3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        f3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        f6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        f6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Referencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(f1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(f2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(f4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(f5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)))
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11))
                    .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f6)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de Control", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(153, 0, 51))); // NOI18N

        borrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(102, 102, 102));
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        borrar.setText("Borrar");
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(102, 102, 102));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(102, 102, 102));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        insertar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertar.setForeground(new java.awt.Color(102, 102, 102));
        insertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        insertar.setText("Insertar");
        insertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        consultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        consultar.setForeground(new java.awt.Color(102, 102, 102));
        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Paste.png"))); // NOI18N
        consultar.setText("Consultar");
        consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(102, 102, 102));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(102, 102, 102));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Cancel.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

        try {
            this.setCursor(new Cursor(3));
            ClasePersonas con = new ClasePersonas(this.getRootPane(), Integer.parseInt(f1.getText()), null, null, null, 0, 0);
            int desi = JOptionPane.showConfirmDialog(this, "¿ Desea Borrar Este Registro ?", "Confirmar", 2);

            if (desi == 0) {

                con.borrar();
                this.f1.setText("");
              
                this.f2.setDate(new Date());
                this.f3.setText("");
                this.f4.setText("");
                this.f5.setText("");
                this.f6.setText("");

                this.insertar.setEnabled(true);
                this.buscar.setEnabled(true);
                this.modificar.setEnabled(false);
                this.borrar.setEnabled(false);
                this.cancelar.setEnabled(false);
                this.consultar.setEnabled(true);

            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage(), "Error", 0);
        }
        this.setCursor(new Cursor(0));
    }//GEN-LAST:event_borrarActionPerformed


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        this.f1.setEnabled(false);
        this.f2.setEnabled(true);
        this.f3.setEnabled(true);
        this.f4.setEnabled(true);
        this.f5.setEnabled(false);
        this.f6.setEnabled(false);

        this.modificar.setEnabled(false);
        this.borrar.setEnabled(false);
        this.guardar.setEnabled(true);
        accion = "modificar";
    }//GEN-LAST:event_modificarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        ConsultaPersonas tabla = new ConsultaPersonas();
        getParent().add(tabla);
        tabla.setVisible(true);
    }//GEN-LAST:event_consultarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        this.f1.setEnabled(true);
        this.f2.setEnabled(false);
        this.f3.setEnabled(false);
        this.f4.setEnabled(false);
        this.f5.setEnabled(false);
        this.f6.setEnabled(false);

        this.insertar.setEnabled(false);
        this.buscar.setEnabled(false);
        this.modificar.setEnabled(false);
        this.borrar.setEnabled(false);
        this.guardar.setEnabled(true);
        this.cancelar.setEnabled(true);
        this.consultar.setEnabled(false);
        accion = "buscar";
    }//GEN-LAST:event_buscarActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed

        this.f1.setText("AUTOMATICO");
        this.f5.setText("AUTOMATICO");

        this.f2.setEnabled(true);
        this.f3.setEnabled(true);
        this.f4.setEnabled(true);
        this.f6.setEnabled(true);

        this.insertar.setEnabled(false);
        this.buscar.setEnabled(false);
        this.modificar.setEnabled(false);
        this.borrar.setEnabled(false);
        this.guardar.setEnabled(true);
        this.cancelar.setEnabled(true);
        this.consultar.setEnabled(false);
        accion = "insertar";
    }//GEN-LAST:event_insertarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        try {

            this.setCursor(new Cursor(3));
            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(f2.getDate());
            ClasePersonas con;

            switch (accion) {

                case "insertar":
con = new ClasePersonas(this.getRootPane(), 0, fecha, f3.getText().toUpperCase(), f4.getText(), 0, Integer.parseInt(f6.getText()));
                    

int inser = JOptionPane.showConfirmDialog(this, "¿ Desea Insertar Este Registro ?", "Confirmar", 0);

                   
if (inser == 0) {
                        if (con.insertar()) {

                            this.f1.setEnabled(false);
                            this.f2.setEnabled(false);
                            this.f3.setEnabled(false);
                            this.f4.setEnabled(false);
                            this.f5.setEnabled(false);
                            this.f6.setEnabled(false);

                            this.f1.setText("");
                            
                            this.f2.setDate(new Date());
                            this.f3.setText("");
                            this.f4.setText("");
                            this.f5.setText("");
                            this.f6.setText("");

                            this.insertar.setEnabled(true);
                            this.buscar.setEnabled(true);
                            this.modificar.setEnabled(false);
                            this.borrar.setEnabled(false);
                            this.guardar.setEnabled(false);
                            this.cancelar.setEnabled(false);
                            this.consultar.setEnabled(true);

                        }
                    }
                    break;

                case "buscar":


            con = new ClasePersonas(this.getRootPane(), Integer.parseInt(f1.getText()), null, null, null, 0, 0);

                    switch (con.buscar()) {
                        
                        
                        case "si":

                            this.f1.setText(String.valueOf(con.id));

                            Date fec = new SimpleDateFormat("yyyy-MM-dd").parse(con.fecha);
                            this.f2.setDate(fec);
                            this.f3.setText(con.nombre);
                            this.f4.setText(con.telefono);
                            this.f5.setText(String.valueOf(con.nivel));
                            this.f6.setText(String.valueOf(con.referencia));

                            this.guardar.setEnabled(false);
                            this.modificar.setEnabled(true);
                            this.borrar.setEnabled(true);
                            this.f1.setEnabled(false);
                            JOptionPane.showMessageDialog(this, "Registro Encontrado", "Exito", -1, check);
                            break;

                        case "no":

                            JOptionPane.showMessageDialog(this, "El Registro no Existe", "No Existe", 2);

                            break;

                    }

                    break;

                case "modificar":
con = new ClasePersonas(this.getRootPane(), Integer.parseInt(f1.getText()), fecha, f3.getText().toUpperCase(), f4.getText(), Integer.parseInt(f5.getText()), Integer.parseInt(f6.getText()));
                   
int modi = JOptionPane.showConfirmDialog(this, "¿ Desea Modificar Este Registro ?", "Confirmar", 0);

                    if (modi == 0) {

                        con.modificar();

                        this.f2.setEnabled(false);
                        this.f3.setEnabled(false);
                        this.f4.setEnabled(false);
                        this.f5.setEnabled(false);
                        this.f5.setEnabled(false);
                        this.f4.setEnabled(false);

                        this.f1.setText("");
                       
                        this.f2.setDate(new Date());
                        this.f3.setText("");
                        this.f4.setText("");
                        this.f5.setText("");
                        this.f6.setText("");

                        this.insertar.setEnabled(true);
                        this.buscar.setEnabled(true);
                        this.guardar.setEnabled(false);
                        this.cancelar.setEnabled(false);
                        this.consultar.setEnabled(true);

                    }
                    break;

            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage(), "Error", 0);
        }
        this.setCursor(new Cursor(0));
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        this.f1.setEnabled(false);
        this.f2.setEnabled(false);
        this.f3.setEnabled(false);
        this.f4.setEnabled(false);
        this.f5.setEnabled(false);
        this.f6.setEnabled(false);

        this.f1.setText("");                     
                        this.f2.setDate(new Date());
                        this.f3.setText("");
                        this.f4.setText("");
                        this.f5.setText("");
                        this.f6.setText("");

        this.insertar.setEnabled(true);
        this.buscar.setEnabled(true);
        this.modificar.setEnabled(false);
        this.borrar.setEnabled(false);
        this.guardar.setEnabled(false);
        this.cancelar.setEnabled(false);
        this.consultar.setEnabled(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        this.f1.setEnabled(false);
        this.f2.setEnabled(false);
        this.f3.setEnabled(false);
        this.f4.setEnabled(false);
        this.f5.setEnabled(false);
        this.f6.setEnabled(false);

        this.f1.setText("");
        this.f3.setText("");
        this.f4.setText("");
        this.f5.setText("");
        this.f6.setText("");

        this.modificar.setEnabled(false);
        this.borrar.setEnabled(false);
        this.guardar.setEnabled(false);
        this.cancelar.setEnabled(false);
        this.consultar.setEnabled(true);


    }//GEN-LAST:event_formInternalFrameOpened

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
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton consultar;
    private javax.swing.JTextField f1;
    private com.toedter.calendar.JDateChooser f2;
    private javax.swing.JTextField f3;
    private javax.swing.JTextField f4;
    private javax.swing.JTextField f5;
    private javax.swing.JTextField f6;
    private javax.swing.JButton guardar;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modificar;
    // End of variables declaration//GEN-END:variables
}
