package Formularios;

import javax.swing.JOptionPane;

public class FrmCalculo extends javax.swing.JFrame {

    int cod = 3;
    String ruta;
    
    public FrmCalculo() {
        initComponents();
        
        this.setTitle("Transportes");
        this.setVisible(true);
        this.setSize(388, 408);
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTransportes = new javax.swing.JLabel();
        lblTraslados = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblRuta3 = new javax.swing.JLabel();
        lblTiempo2 = new javax.swing.JLabel();
        cmbRuta = new javax.swing.JComboBox<>();
        txtTiempo2 = new javax.swing.JTextField();
        chkDatos = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblTiempo3 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        txtRuta2 = new javax.swing.JTextField();
        txtTiempo3 = new javax.swing.JTextField();
        txtPrecio3 = new javax.swing.JTextField();
        txtTraslados = new javax.swing.JTextField();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRuta2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        txtRuta3 = new javax.swing.JTextField();
        txtPrecio2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transporte");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTransportes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTransportes.setForeground(new java.awt.Color(255, 255, 255));
        lblTransportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTransportes.setText("Transportes");
        getContentPane().add(lblTransportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, 336, -1));

        lblTraslados.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblTraslados.setForeground(new java.awt.Color(255, 255, 255));
        lblTraslados.setText("Cantidad de traslados:");
        getContentPane().add(lblTraslados, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 84, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio.setToolTipText("Introduzca el tiempo por cada translado");
        txtPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtPrecio.setCaretColor(new java.awt.Color(102, 102, 102));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 180, 132, 24));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 360, 336, 12));

        lblRuta3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblRuta3.setForeground(new java.awt.Color(255, 255, 255));
        lblRuta3.setText("Ruta:");
        getContentPane().add(lblRuta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 324, -1, -1));

        lblTiempo2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblTiempo2.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo2.setText("Tiempo por traslado 2 (m):");
        getContentPane().add(lblTiempo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 84, -1, -1));

        cmbRuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ruta 34", "Colosio", "Providencia", "Bosques", "Colinas", "Chacon", "Tellez", "Matilde" }));
        cmbRuta.setToolTipText("Seleccione la ruta utilizada");
        cmbRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbRuta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRutaItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 228, 132, 24));

        txtTiempo2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtTiempo2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTiempo2.setToolTipText("Ingrese el tiempo de translado");
        txtTiempo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTiempo2.setCaretColor(new java.awt.Color(102, 102, 102));
        txtTiempo2.setEnabled(false);
        getContentPane().add(txtTiempo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 84, 96, 24));

        chkDatos.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        chkDatos.setForeground(new java.awt.Color(255, 255, 255));
        chkDatos.setText("Más traslados");
        chkDatos.setToolTipText("Seleccione si tiene más de un tiempo o el gasto es variable");
        chkDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDatosActionPerformed(evt);
            }
        });
        getContentPane().add(chkDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 264, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 48, 12, 312));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 48, 12, 312));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 300, 288, 12));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 48, 12, 312));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 48, 12, 312));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 360, 288, 12));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 48, 336, 12));

        lblTiempo3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblTiempo3.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo3.setText("Tiempo por traslado 3 (m):");
        getContentPane().add(lblTiempo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 228, -1, -1));

        lblPrecio2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio2.setText("Precio por traslado 2:");
        getContentPane().add(lblPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 132, -1, -1));

        lblPrecio3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblPrecio3.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio3.setText("Precio por traslado 3:");
        getContentPane().add(lblPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 276, -1, 24));

        jLabel9.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tiempo por traslado (m):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 132, -1, -1));

        jLabel10.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio por traslado:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 180, -1, -1));

        txtTiempo.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTiempo.setToolTipText("Introduzca el tiempo por cada translado");
        txtTiempo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTiempo.setCaretColor(new java.awt.Color(102, 102, 102));
        getContentPane().add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 132, 132, 24));

        txtRuta2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtRuta2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRuta2.setToolTipText("Ingrese el precio del translado");
        txtRuta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtRuta2.setCaretColor(new java.awt.Color(102, 102, 102));
        txtRuta2.setEnabled(false);
        getContentPane().add(txtRuta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 180, 96, 24));

        txtTiempo3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtTiempo3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTiempo3.setToolTipText("Ingrese el tiempo de translado");
        txtTiempo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTiempo3.setCaretColor(new java.awt.Color(102, 102, 102));
        txtTiempo3.setEnabled(false);
        getContentPane().add(txtTiempo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 228, 96, 24));

        txtPrecio3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtPrecio3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio3.setToolTipText("Ingrese el precio del translado");
        txtPrecio3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtPrecio3.setCaretColor(new java.awt.Color(102, 102, 102));
        txtPrecio3.setEnabled(false);
        getContentPane().add(txtPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 276, 96, 24));

        txtTraslados.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtTraslados.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTraslados.setToolTipText("Ingrese la cantidad de traslados");
        txtTraslados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtTraslados.setCaretColor(new java.awt.Color(102, 102, 102));
        txtTraslados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrasladosActionPerformed(evt);
            }
        });
        getContentPane().add(txtTraslados, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 84, 132, 24));

        buttonGroup1.add(chk2);
        chk2.setForeground(new java.awt.Color(255, 255, 255));
        chk2.setSelected(true);
        chk2.setText("2");
        chk2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk2.setEnabled(false);
        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });
        getContentPane().add(chk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 264, -1, -1));

        buttonGroup1.add(chk3);
        chk3.setForeground(new java.awt.Color(255, 255, 255));
        chk3.setText("3");
        chk3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chk3.setEnabled(false);
        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });
        getContentPane().add(chk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 264, -1, -1));

        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpiar los datos introducidos");
        btnLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(78, 35));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 312, -1, -1));

        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setToolTipText("Calcular el tiempo y costo de los traslados");
        btnCalcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setPreferredSize(new java.awt.Dimension(78, 35));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 312, -1, -1));

        jLabel5.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ruta:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 228, -1, -1));

        jLabel6.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ruta:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 228, -1, -1));

        lblRuta2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblRuta2.setForeground(new java.awt.Color(255, 255, 255));
        lblRuta2.setText("Ruta:");
        getContentPane().add(lblRuta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 180, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 48, 288, 12));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 216, 288, 12));

        txtRuta3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtRuta3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRuta3.setToolTipText("Ingrese el precio del translado");
        txtRuta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtRuta3.setCaretColor(new java.awt.Color(102, 102, 102));
        txtRuta3.setEnabled(false);
        getContentPane().add(txtRuta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 324, 96, 24));

        txtPrecio2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        txtPrecio2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecio2.setToolTipText("Ingrese el precio del translado");
        txtPrecio2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        txtPrecio2.setCaretColor(new java.awt.Color(102, 102, 102));
        txtPrecio2.setEnabled(false);
        getContentPane().add(txtPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 132, 96, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 350));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-12, -12, 696, 408));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDatosActionPerformed
        
        if (chkDatos.isSelected()) {
            
            this.setSize(695, 408);
            lblTransportes.setLocation(228 ,12);
            
            chk2.setSelected(true);
            chk3.setSelected(false);
            
            chk2.setEnabled(true);
            chk3.setEnabled(true); 
            
            txtTraslados.setText("0");
            
            txtTiempo2.setEnabled(true);
            txtPrecio2.setEnabled(true);
            
            txtTiempo3.setEnabled(false);
            txtPrecio3.setEnabled(false);
            
            txtRuta2.setEnabled(true);
            txtRuta3.setEnabled(false);
            
            txtTraslados.setEnabled(false);
            txtTraslados.setBackground(new java.awt.Color(172, 172, 172));
            txtTraslados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(172, 172, 172), 1, true));   
            
            lblTraslados.setForeground(new java.awt.Color(172, 172, 172));
            
            dis(1);
            this.cod = 2;
            
        } else {
            
            this.setSize(388, 408);
            lblTransportes.setLocation(120 ,12);

            chk2.setSelected(true);
            chk3.setSelected(false);
            chk2.setEnabled(false);
            chk3.setEnabled(false);
            

            
            
            txtTiempo2.setEnabled(false);
            txtPrecio2.setEnabled(false);
            
            txtTiempo3.setEnabled(false);
            txtPrecio3.setEnabled(false);
            
            txtTraslados.setEnabled(true);
            txtTraslados.setBackground(new java.awt.Color(255, 255, 255));
            txtTraslados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));   
            
            lblTraslados.setForeground(new java.awt.Color(255, 255, 255));
            
            this.cod = 3;
            
        }
        
    }//GEN-LAST:event_chkDatosActionPerformed

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        
        if(chk2.isSelected() && chkDatos.isSelected()){
            
            txtTiempo2.setEnabled(true);
            txtPrecio2.setEnabled(true);
            
            txtTiempo3.setEnabled(false);
            txtPrecio3.setEnabled(false);
            
            txtRuta2.setEnabled(true);
            txtRuta3.setEnabled(false);            
            
            dis(1);
            
            this.cod = 2;
            
        }
        
    }//GEN-LAST:event_chk2ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        
        if(chk3.isSelected() && chkDatos.isSelected()){
            
            txtTiempo2.setEnabled(true);
            txtPrecio2.setEnabled(true);
            
            txtTiempo3.setEnabled(true);
            txtPrecio3.setEnabled(true);
            
            txtRuta2.setEnabled(true);
            txtRuta3.setEnabled(true);
            
            dis(2);
            
            this.cod = 1;
            
        }
        
    }//GEN-LAST:event_chk3ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtTraslados.setText(null);
        txtTiempo.setText(null);
        txtPrecio.setText(null);
        txtTiempo2.setText(null);
        txtPrecio2.setText(null);
        txtTiempo3.setText(null);
        txtPrecio3.setText(null);
        txtRuta2.setText(null);
        txtRuta3.setText(null);
        
        cmbRuta.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
     
        switch (cod) {
            case 3:
                if (comprobacion(cod)){
                    
                    int traslados;
                    double tiempo, precio;
                    
                    traslados = Integer.parseInt(txtTraslados.getText());
                    tiempo = Double.parseDouble(txtTiempo.getText());
                    precio = Double.parseDouble(txtPrecio.getText());
                    
                    if (cmbRuta.getSelectedIndex() == 0){
                        
                        JOptionPane.showInternalMessageDialog(null, "Ingrese una ruta de las opciones", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                        
                    } else {
                        
                        this.dispose();
                        FrmFinal fin = new FrmFinal(calculo(3, traslados, tiempo, 0, 0), calculo(cod, traslados, precio, 0, 0), traslados, rut(this.ruta, " ", " "));
                        
                    }
                    
                } else {
                    
                    JOptionPane.showInternalMessageDialog(null, "Campos vacios", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                    
                }   break;
            case 2:
                if(comprobacion(cod)){
                    
                    double tiempo, tiempo2, precio2, precio;
                    String ruta2;
                    
                    //traslados = Integer.parseInt(txtTraslados.getText());
                    tiempo = Double.parseDouble(txtTiempo.getText());
                    precio = Double.parseDouble(txtPrecio.getText());
                    tiempo2 = Double.parseDouble(txtTiempo2.getText());
                    precio2 = Double.parseDouble(txtPrecio2.getText());
                    ruta2 = txtRuta2.getText();
                    
                    if (cmbRuta.getSelectedIndex() == 0){
                        
                        JOptionPane.showInternalMessageDialog(null, "Ingrese una ruta de las opciones", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                        
                    } else {
                        
                        this.dispose();
                        FrmFinal fin = new FrmFinal(calculo(2, 2, tiempo, tiempo2, 0), calculo(2, 2, precio, precio2, 0), 2, rut(this.ruta, ruta2, " "));
                        
                    }
                    
                } else {
                    
                    JOptionPane.showInternalMessageDialog(null, "Campos vacios", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                    
                }   break;
            case 1:
                if(comprobacion(cod)){
                    
                    double tiempo, tiempo2, tiempo3,  precio2, precio, precio3;
                    String ruta2, ruta3;
                    
                    //traslados = Integer.parseInt(txtTraslados.getText());
                    tiempo = Double.parseDouble(txtTiempo.getText());
                    precio = Double.parseDouble(txtPrecio.getText());
                    tiempo2 = Double.parseDouble(txtTiempo2.getText());
                    precio2 = Double.parseDouble(txtPrecio2.getText());
                    ruta2 = txtRuta2.getText();
                    tiempo3 = Double.parseDouble(txtTiempo3.getText());
                    precio3 = Double.parseDouble(txtPrecio3.getText());
                    ruta3 = txtRuta3.getText();
                    
                    if (cmbRuta.getSelectedIndex() == 0){
                        
                        JOptionPane.showInternalMessageDialog(null, "Ingrese una ruta de las opciones", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                        
                    } else {
                        
                        this.dispose();
                        FrmFinal fin = new FrmFinal(calculo(1, 3, tiempo, tiempo2, tiempo3), calculo(1, 3, precio, precio2, precio3), 3, rut(this.ruta, ruta2, ruta3));
                        
                    }
                    
                } else {
                    
                    JOptionPane.showInternalMessageDialog(null, "Campos vacios", "Datos incompletos", JOptionPane.ERROR_MESSAGE);
                    
                }   break;
            default:
                break;
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cmbRutaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRutaItemStateChanged
        
        this.ruta = String.valueOf(cmbRuta.getSelectedItem());
        
    }//GEN-LAST:event_cmbRutaItemStateChanged

    private void txtTrasladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrasladosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrasladosActionPerformed

    public void dis(int n4){
        
        switch(n4){
            
            case 1:
                
                txtTiempo2.setBackground(new java.awt.Color(255, 255, 255));
                txtTiempo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));   
                
                txtRuta2.setBackground(new java.awt.Color(255, 255, 255));
                txtRuta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));   

                lblTiempo2.setBackground(new java.awt.Color(255, 255, 255));
                lblPrecio2.setBackground(new java.awt.Color(255, 255, 255));
                lblRuta2.setBackground(new java.awt.Color(255, 255, 255));
                
                txtTiempo3.setBackground(new java.awt.Color(172, 172, 172));
                txtTiempo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(172, 172, 172), 1, true));   
                txtRuta3.setBackground(new java.awt.Color(172, 172, 172));
                txtRuta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(172, 172, 172), 1, true));   

                txtPrecio3.setBackground(new java.awt.Color(172, 172, 172));
                txtPrecio3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(172, 172, 172), 1, true));   
                
                lblTiempo3.setForeground(new java.awt.Color(172, 172, 172));
                lblPrecio3.setForeground(new java.awt.Color(172, 172, 172));
                lblRuta3.setForeground(new java.awt.Color(172, 172, 172));
                
                break;
                
            case 2:
                
                txtTiempo2.setBackground(new java.awt.Color(255, 255, 255));
                txtTiempo2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));   
                txtRuta2.setBackground(new java.awt.Color(255, 255, 255));
                txtRuta2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));   

                lblTiempo2.setForeground(new java.awt.Color(255, 255, 255));
                lblPrecio2.setForeground(new java.awt.Color(255, 255, 255));
                lblRuta2.setBackground(new java.awt.Color(255, 255, 255));
                
                txtTiempo3.setBackground(new java.awt.Color(255, 255, 255));
                txtTiempo3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));   
                txtRuta3.setBackground(new java.awt.Color(255, 255, 255));
                txtRuta3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));   
                txtPrecio3.setBackground(new java.awt.Color(255, 255, 255));
                txtPrecio3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

                lblTiempo3.setForeground(new java.awt.Color(255, 255, 255));
                lblPrecio3.setForeground(new java.awt.Color(255, 255, 255));
                lblRuta3.setForeground(new java.awt.Color(255, 255, 255));
                
                break;
            
        }
        
    }
    
    public boolean comprobacion(int nivel){
        
        String c1 = "",c2 = "",c3 = "",c4 = "",c5 = "",c6 = "",c7 = "",c8 = "",c9 = "";
        boolean salida = false;
        
        switch (nivel) {
            
            case 1:
                
                c7 = txtTiempo3.getText();
                c7.replaceAll(" ", "");
                c8 = txtPrecio3.getText();
                c8.replaceAll(" ", "");
                c9 = txtRuta3.getText();
                c9.replaceAll(" ", "");
            
            case 2:
            
                c4 = txtTiempo2.getText();
                c4.replaceAll(" ", "");
                c5 = txtPrecio2.getText();
                c5.replaceAll(" ", "");
                c6 = txtRuta2.getText();
                c6.replaceAll(" ", "");
                
            case 3:
                
                c1 = txtTraslados.getText();
                c1.replaceAll(" ", "");
                c2 = txtTiempo.getText();
                c2.replaceAll(" ", "");
                c3 = txtPrecio.getText();
                c3.replaceAll(" ", "");
                
                break;
        }
        
        if(c1.equals("") || c2.equals("") || c3.equals("")){
            
            salida =  false;

        } else if (nivel == 3){
            
            return true;
            
        } else if (c4.equals("") || c5.equals("") || c6.equals("")){
            
            salida = false;
            
        } else if (nivel == 2){
            
            return true;
            
        } else if (c7.equals("") || c8.equals("") || c9.equals("")){
            
            salida = false;
            
        } else if (nivel == 1){
            
            return true;
            
        }
        
        return salida;
        
    }
    
    public double calculo(int cod, int cantidad, double n1, double n2, double n3){
        
        double resultado = 0;
        
        
        switch (cod) {
            
            case 2:
                
                resultado = n1 + n2;
                
                break;
                
            case 1:
                
                resultado = n1 +  n2 + n3;
                
                break;
                
            case 3:
                
                resultado = n1 * cantidad;
                
        }
        
        return resultado;
        
    }
    
    public String rut(String ruta, String ruta2, String ruta3){
        
        return ruta + "\n" + ruta2 + "\n" + ruta3;
        
    }
    
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
            java.util.logging.Logger.getLogger(FrmCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chkDatos;
    private javax.swing.JComboBox<String> cmbRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblRuta2;
    private javax.swing.JLabel lblRuta3;
    private javax.swing.JLabel lblTiempo2;
    private javax.swing.JLabel lblTiempo3;
    private javax.swing.JLabel lblTransportes;
    private javax.swing.JLabel lblTraslados;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio2;
    private javax.swing.JTextField txtPrecio3;
    private javax.swing.JTextField txtRuta2;
    private javax.swing.JTextField txtRuta3;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtTiempo2;
    private javax.swing.JTextField txtTiempo3;
    private javax.swing.JTextField txtTraslados;
    // End of variables declaration//GEN-END:variables
}
