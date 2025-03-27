package GUI.views;

import DataAccesObject.ingredienteDAO;
import DataAccesObject.nutrienteDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import clasesDeObjeto.ingrediente;
import clasesDeObjeto.nutriente;

public class crearIngrediente extends javax.swing.JFrame {

    ingredienteDAO iDao = new ingredienteDAO();
    
    List<Long> arrayNutriente = new ArrayList<>();
    
    public crearIngrediente() {
        initComponents();
        iDao.llenarComboBoxNutriente(cbNutriente);
        txtIdNutriente.setVisible(false);
        txtNombre.setVisible(false);
        txtCantidad.setVisible(false);
        txtPorcion.setVisible(false);
        btnCrearNutriente.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        botones();
    }
    
    public void botones(){
    
        btnAgregar.setContentAreaFilled(false); 
        btnAgregar.setBorderPainted(false); 
        btnAgregar.setFocusPainted(false);
        btnMostrar.setContentAreaFilled(false); 
        btnMostrar.setBorderPainted(false); 
        btnMostrar.setFocusPainted(false);
        btnAgregarIngrediente.setContentAreaFilled(false); 
        btnAgregarIngrediente.setBorderPainted(false); 
        btnAgregarIngrediente.setFocusPainted(false);
        btnCrearNutriente.setContentAreaFilled(false); 
        btnCrearNutriente.setBorderPainted(false); 
        btnCrearNutriente.setFocusPainted(false);
        btnCerrar.setContentAreaFilled(false); 
        btnCerrar.setBorderPainted(false); 
        btnCerrar.setFocusPainted(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdIngrediente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbNutriente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new GUI.componentesSwing.ButtonRound();
        btnAgregar = new GUI.componentesSwing.ButtonRound();
        jLabel4 = new javax.swing.JLabel();
        txtNombreIngrediente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadIngrediente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaIngrediente = new javax.swing.JTextArea();
        btnAgregarIngrediente = new GUI.componentesSwing.ButtonRound();
        btnMostrar = new GUI.componentesSwing.ButtonRound();
        txtIdNutriente = new javax.swing.JTextField();
        lblIdNutriente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnCrearNutriente = new GUI.componentesSwing.ButtonRound();
        lblPorcion = new javax.swing.JLabel();
        txtPorcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 229, 215));

        jLabel1.setBackground(new java.awt.Color(34, 34, 34));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(34, 34, 34));
        jLabel1.setText("ID");

        txtIdIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdIngredienteActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(34, 34, 34));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 34, 34));
        jLabel3.setText("Nutriente");

        cbNutriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNutrienteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(34, 34, 34));

        jLabel2.setBackground(new java.awt.Color(243, 229, 215));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 229, 215));
        jLabel2.setText("Ingredientes");

        btnCerrar.setBackground(new java.awt.Color(34, 34, 34));
        btnCerrar.setBorder(null);
        btnCerrar.setForeground(new java.awt.Color(243, 229, 215));
        btnCerrar.setText("cerrar");
        btnCerrar.setRoundBottomLeft(20);
        btnCerrar.setRoundBottomRight(20);
        btnCerrar.setRoundTopLeft(20);
        btnCerrar.setRoundTopRight(20);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        btnAgregar.setBackground(new java.awt.Color(34, 34, 34));
        btnAgregar.setBorder(null);
        btnAgregar.setForeground(new java.awt.Color(243, 229, 215));
        btnAgregar.setText("Agregar");
        btnAgregar.setRoundBottomLeft(20);
        btnAgregar.setRoundBottomRight(20);
        btnAgregar.setRoundTopLeft(20);
        btnAgregar.setRoundTopRight(20);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(34, 34, 34));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(34, 34, 34));
        jLabel4.setText("Nombre");

        jLabel5.setBackground(new java.awt.Color(34, 34, 34));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(34, 34, 34));
        jLabel5.setText("Cantidad");

        jLabel6.setBackground(new java.awt.Color(34, 34, 34));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(34, 34, 34));
        jLabel6.setText("Descripcion");

        areaIngrediente.setColumns(20);
        areaIngrediente.setRows(5);
        jScrollPane1.setViewportView(areaIngrediente);

        btnAgregarIngrediente.setBackground(new java.awt.Color(34, 34, 34));
        btnAgregarIngrediente.setBorder(null);
        btnAgregarIngrediente.setForeground(new java.awt.Color(243, 229, 215));
        btnAgregarIngrediente.setText("Crear");
        btnAgregarIngrediente.setRoundBottomLeft(20);
        btnAgregarIngrediente.setRoundBottomRight(20);
        btnAgregarIngrediente.setRoundTopLeft(20);
        btnAgregarIngrediente.setRoundTopRight(20);
        btnAgregarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIngredienteActionPerformed(evt);
            }
        });

        btnMostrar.setBackground(new java.awt.Color(34, 34, 34));
        btnMostrar.setBorder(null);
        btnMostrar.setForeground(new java.awt.Color(243, 229, 215));
        btnMostrar.setText("crear");
        btnMostrar.setRoundBottomLeft(20);
        btnMostrar.setRoundBottomRight(20);
        btnMostrar.setRoundTopLeft(20);
        btnMostrar.setRoundTopRight(20);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        lblIdNutriente.setBackground(new java.awt.Color(243, 229, 215));
        lblIdNutriente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdNutriente.setForeground(new java.awt.Color(243, 229, 215));
        lblIdNutriente.setText("Id nutriente");

        lblNombre.setBackground(new java.awt.Color(243, 229, 215));
        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(243, 229, 215));
        lblNombre.setText("Nombre");

        lblCantidad.setBackground(new java.awt.Color(243, 229, 215));
        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(243, 229, 215));
        lblCantidad.setText("Cantidad");

        btnCrearNutriente.setBackground(new java.awt.Color(34, 34, 34));
        btnCrearNutriente.setBorder(null);
        btnCrearNutriente.setForeground(new java.awt.Color(243, 229, 215));
        btnCrearNutriente.setText("Crear");
        btnCrearNutriente.setRoundBottomLeft(20);
        btnCrearNutriente.setRoundBottomRight(20);
        btnCrearNutriente.setRoundTopLeft(20);
        btnCrearNutriente.setRoundTopRight(20);
        btnCrearNutriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNutrienteActionPerformed(evt);
            }
        });

        lblPorcion.setBackground(new java.awt.Color(243, 229, 215));
        lblPorcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPorcion.setForeground(new java.awt.Color(243, 229, 215));
        lblPorcion.setText("Porcion diaria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(417, 417, 417))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCantidadIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtIdIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(cbNutriente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreIngrediente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblIdNutriente)
                        .addComponent(txtIdNutriente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNombre)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCantidad)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPorcion)
                        .addComponent(txtPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCrearNutriente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(lblIdNutriente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIdIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbNutriente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidadIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdNutriente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(lblPorcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearNutriente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIngredienteActionPerformed
        
        String Sid = txtIdIngrediente.getText();
        String nombreIngrediente = txtNombreIngrediente.getText();
        String Scantidad = txtCantidadIngrediente.getText();
        String descripcion = areaIngrediente.getText();
        
        if(Sid.isEmpty() || nombreIngrediente.isEmpty() || Scantidad.isEmpty() || descripcion.isEmpty()){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de crear el ingrediente");
            return;
        }
        
        long id = Long.parseLong(Sid);
        double cantidad = Double.parseDouble(Scantidad);
        
        ingrediente i = new ingrediente();
        
        i.setIdIngrediente(id);
        i.setIdNutriente(arrayNutriente);
        i.setNombreIngrediente(nombreIngrediente);
        i.setCantidadIngrediente(cantidad);
        i.setDescripcion(descripcion);
        
        ingredienteDAO iDao = new ingredienteDAO();
        
        if(iDao.crear(i)){
          JOptionPane.showMessageDialog(this, "Producto creado con exito");
        }
        
    }//GEN-LAST:event_btnAgregarIngredienteActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        lblIdNutriente.setForeground(new Color(34,34,34));
        lblNombre.setForeground(new Color(34,34,34));
        lblCantidad.setForeground(new Color(34,34,34));
        lblPorcion.setForeground(new Color(34,34,34));
        
        txtIdNutriente.setVisible(true);
        txtNombre.setVisible(true);
        txtCantidad.setVisible(true);
        txtPorcion.setVisible(true);
        
        btnCrearNutriente.setVisible(true);
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCrearNutrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNutrienteActionPerformed

        String Sid = txtIdNutriente.getText();
        String nombre = txtNombre.getText();
        String Scantidad = txtCantidad.getText();
        String Sporcion = txtPorcion.getText();
        
        if(Sid.isEmpty() || nombre.isEmpty() || Scantidad.isEmpty() || Sporcion.isEmpty()){
            JOptionPane.showMessageDialog(this, "Rellene todos los campos antes de crear");
            return;
        }
        
        long id = Long.parseLong(Sid);
        double cantidad = Double.parseDouble(Scantidad);
        double porcentaje = Double.parseDouble(Sporcion);
        
        nutriente n = new nutriente();
        
        n.setIdNutriente(id);
        n.setNombreNutiente(nombre);
        n.setPorcion(cantidad);
        n.setPorcentajeDiario(porcentaje);
        
        nutrienteDAO nDao = new nutrienteDAO();
        
        if(nDao.crear(n)){
            JOptionPane.showMessageDialog(this, "Nutriente agregado con exito");
        }

    }//GEN-LAST:event_btnCrearNutrienteActionPerformed

    private void cbNutrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNutrienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNutrienteActionPerformed

    private void txtIdIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdIngredienteActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String nutriente = cbNutriente.getSelectedItem().toString();
        
        long idNutriente = Long.parseLong(nutriente.split("-")[0]);
        
        if(arrayNutriente.add(idNutriente))JOptionPane.showMessageDialog(this, "Agregado");
        
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(crearIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearIngrediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearIngrediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaIngrediente;
    private GUI.componentesSwing.ButtonRound btnAgregar;
    private GUI.componentesSwing.ButtonRound btnAgregarIngrediente;
    private GUI.componentesSwing.ButtonRound btnCerrar;
    private GUI.componentesSwing.ButtonRound btnCrearNutriente;
    private GUI.componentesSwing.ButtonRound btnMostrar;
    private javax.swing.JComboBox<String> cbNutriente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblIdNutriente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPorcion;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadIngrediente;
    private javax.swing.JTextField txtIdIngrediente;
    private javax.swing.JTextField txtIdNutriente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreIngrediente;
    private javax.swing.JTextField txtPorcion;
    // End of variables declaration//GEN-END:variables
}
