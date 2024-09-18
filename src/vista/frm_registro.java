

package vista;
import conexion.Docente;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;



public class frm_registro extends javax.swing.JFrame {

    Docente obj_docente;
    
    int xMouse, yMouse;
    public frm_registro() {
        initComponents();
        setDate();
        this.setLocationRelativeTo(null);
        obj_docente = new Docente();
        table_datos.setModel(obj_docente.leer());
    }
    
    private void  setDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        lbl_fecha.setText(now.format(DateTimeFormatter.ofPattern("' ' EEEE dd 'de' MMM 'de' YYYY", spanishLocale)));
    }

        private void select_datos(){
     int fila = table_datos.getSelectedRow();
        lbl_id.setText(table_datos.getValueAt(fila, 0).toString());
        txt_nit.setText(table_datos.getValueAt(fila, 1).toString());
        txt_nombres.setText(table_datos.getValueAt(fila, 2).toString());
        txt_apellidos.setText(table_datos.getValueAt(fila, 3).toString());
        txt_direccion.setText(table_datos.getValueAt(fila, 4).toString());
        txt_telefono.setText(table_datos.getValueAt(fila, 5).toString());
        txt_nacimiento.setText(table_datos.getValueAt(fila, 6).toString());
        txt_codigo.setText(table_datos.getValueAt(fila, 7).toString());
        txt_salario.setText(table_datos.getValueAt(fila, 8).toString());
        txt_labores.setText(table_datos.getValueAt(fila, 9).toString());
        

}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_cerrar = new javax.swing.JPanel();
        lbl_cerrar = new javax.swing.JLabel();
        panel_encabezado = new javax.swing.JPanel();
        lbl_fecha = new javax.swing.JLabel();
        lbl_nit = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_nacimiento = new javax.swing.JLabel();
        lbl_salario = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_labores = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_nit = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_nacimiento = new javax.swing.JTextField();
        txt_codigo = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();
        txt_labores = new javax.swing.JTextField();
        btn_borrar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_datos = new javax.swing.JTable();
        lbl_id = new javax.swing.JLabel();
        lbl_nit2 = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(0, 0, 153));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cerrar.setBackground(new java.awt.Color(255, 0, 0));
        lbl_cerrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cerrar.setText("X");
        lbl_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_cerrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_cerrarLayout = new javax.swing.GroupLayout(panel_cerrar);
        panel_cerrar.setLayout(panel_cerrarLayout);
        panel_cerrarLayout.setHorizontalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panel_cerrarLayout.setVerticalGroup(
            panel_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
        );

        panel_principal.add(panel_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 30, 40));

        panel_encabezado.setBackground(new java.awt.Color(0, 0, 153));
        panel_encabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_encabezadoMouseDragged(evt);
            }
        });
        panel_encabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_encabezadoMousePressed(evt);
            }
        });
        panel_encabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_fecha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_fecha.setText("{dayname}{day} de {month} de {year} ");
        panel_encabezado.add(lbl_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 350, 20));

        panel_principal.add(panel_encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl_nit.setBackground(new java.awt.Color(255, 255, 252));
        lbl_nit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_nit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nit.setText("Nit:");
        panel_principal.add(lbl_nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));

        lbl_nombres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_nombres.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombres.setText("Nombres:");
        panel_principal.add(lbl_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 30));

        lbl_direccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_direccion.setText("Dirección:");
        panel_principal.add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 30));

        lbl_apellidos.setBackground(new java.awt.Color(255, 255, 252));
        lbl_apellidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_apellidos.setText("Apellidos:");
        panel_principal.add(lbl_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        lbl_telefono.setBackground(new java.awt.Color(255, 255, 252));
        lbl_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setText("Télefono:");
        panel_principal.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 100, 30));

        lbl_nacimiento.setBackground(new java.awt.Color(255, 255, 252));
        lbl_nacimiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nacimiento.setText("Fecha nacimiento:");
        panel_principal.add(lbl_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 190, 30));

        lbl_salario.setBackground(new java.awt.Color(255, 255, 252));
        lbl_salario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_salario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_salario.setText("Salario:");
        panel_principal.add(lbl_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 140, 30));

        lbl_codigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_codigo.setText("Codigo docente:");
        panel_principal.add(lbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 180, 30));

        lbl_labores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_labores.setForeground(new java.awt.Color(255, 255, 255));
        lbl_labores.setText("Fecha inicio labores:");
        panel_principal.add(lbl_labores, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 260, 30));

        txt_telefono.setBorder(null);
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        panel_principal.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 170, 30));

        txt_nit.setBorder(null);
        txt_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitActionPerformed(evt);
            }
        });
        panel_principal.add(txt_nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 170, 30));

        txt_nombres.setBorder(null);
        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });
        panel_principal.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 170, 30));

        txt_apellidos.setBorder(null);
        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });
        panel_principal.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 30));

        txt_direccion.setBorder(null);
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        panel_principal.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 30));

        txt_nacimiento.setBorder(null);
        txt_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nacimientoActionPerformed(evt);
            }
        });
        panel_principal.add(txt_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 170, 30));

        txt_codigo.setBorder(null);
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        panel_principal.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 170, 30));

        txt_salario.setBorder(null);
        txt_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioActionPerformed(evt);
            }
        });
        panel_principal.add(txt_salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 170, 30));

        txt_labores.setBorder(null);
        txt_labores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_laboresActionPerformed(evt);
            }
        });
        panel_principal.add(txt_labores, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 170, 30));

        btn_borrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_borrar.setForeground(new java.awt.Color(51, 51, 51));
        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        panel_principal.add(btn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 100, 30));

        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(51, 51, 51));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        panel_principal.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 100, 30));

        btn_modificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(51, 51, 51));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        panel_principal.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 120, 30));

        table_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_datos);

        panel_principal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 810, 150));

        lbl_id.setBackground(new java.awt.Color(255, 255, 252));
        lbl_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        panel_principal.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 30));

        lbl_nit2.setBackground(new java.awt.Color(255, 255, 252));
        lbl_nit2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_nit2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nit2.setText("Id:");
        panel_principal.add(lbl_nit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 30));

        lbl_fondo.setBackground(new java.awt.Color(0, 0, 153));
        panel_principal.add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 460));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Formulario docente");
        panel_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 280, 48));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMousePressed
        // TODO add your handling code here:
        lbl_cerrar.setBackground(Color.white);
    }//GEN-LAST:event_lbl_cerrarMousePressed

    private void lbl_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseExited
        // TODO add your handling code here:
        panel_cerrar.setBackground(Color.gray );
    }//GEN-LAST:event_lbl_cerrarMouseExited

    private void lbl_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseEntered
        // TODO add your handling code here:
        panel_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_lbl_cerrarMouseEntered

    private void lbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lbl_cerrarMouseClicked

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitActionPerformed

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nacimientoActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_salarioActionPerformed

    private void txt_laboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_laboresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_laboresActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        try {
        // Convierte el valor del JTextField txt_salario de String a double
        double salario = Double.parseDouble(txt_salario.getText());

        // Crea el objeto Docente pasando los valores correctos, incluyendo el salario como double
        obj_docente = new Docente(0, 
                                  txt_nit.getText(), 
                                  txt_nombres.getText(), 
                                  txt_apellidos.getText(), 
                                  txt_direccion.getText(), 
                                  txt_telefono.getText(), 
                                  txt_nacimiento.getText(),  
                                  salario, // Aquí pasamos el salario convertido como double
                                  txt_codigo.getText(), 
                                  txt_labores.getText());
   
        // Llama al método crear del objeto docente
        obj_docente.crear();

        // Actualiza la tabla con los datos
        this.table_datos.setModel(obj_docente.leer());

    } catch (NumberFormatException e) {
        // Maneja el caso en que el salario no sea un número válido o sea negativo
        JOptionPane.showMessageDialog(this, "Por favor ingrese un valor numérico válido y positivo para el salario.");
    }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void panel_encabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_encabezadoMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panel_encabezadoMousePressed

    private void panel_encabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_encabezadoMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y -  yMouse);
    }//GEN-LAST:event_panel_encabezadoMouseDragged

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        double salario = Double.parseDouble(txt_salario.getText());
        obj_docente =  new Docente(Integer.valueOf(lbl_id.getText()), txt_nit.getText(), txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(), txt_telefono.getText(), txt_nacimiento.getText(), salario, txt_codigo.getText(), txt_labores.getText());
        obj_docente.actualizar();
        this.table_datos.setModel(obj_docente.leer());
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void table_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_datosMouseClicked
        select_datos();
    }//GEN-LAST:event_table_datosMouseClicked

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        obj_docente = new Docente();
        obj_docente.setId_persona(Integer.valueOf(lbl_id.getText()));
        obj_docente.borrar();
        table_datos.setModel(obj_docente.leer());
    }//GEN-LAST:event_btn_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_labores;
    private javax.swing.JLabel lbl_nacimiento;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nit2;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel panel_cerrar;
    private javax.swing.JPanel panel_encabezado;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTable table_datos;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_labores;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
