package Formularios;
public class FrmFinal extends javax.swing.JFrame {
    public FrmFinal() {
        initComponents();
        
        this.setTitle("Transportes");
        this.setVisible(true);
        this.setSize(350, 450);
        this.setLocationRelativeTo(null);
    }
    public FrmFinal(double tiempoFinal, double gastos, int traslados, String rutas){
        initComponents();
        this.setTitle("Transportes");
        this.setVisible(true);
        this.setSize(350, 450);
        this.setLocationRelativeTo(null);
        this.lblTiempoFinal.setText(String.valueOf(tiempoFinal) + " minutos");
        this.lblGastos.setText("$ " + String.valueOf(gastos));
        this.lblTraslados.setText(String.valueOf(traslados));
        this.txtRuta.setText(rutas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        lblTransportes = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblTransportes1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRuta = new javax.swing.JTextArea();
        jSeparator11 = new javax.swing.JSeparator();
        lblTiempoFinal = new javax.swing.JLabel();
        lblGastos = new javax.swing.JLabel();
        lblTraslados = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        Background = new javax.swing.JLabel();

        lblTransportes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTransportes.setForeground(new java.awt.Color(255, 255, 255));
        lblTransportes.setText("Transportes");

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTransportes1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTransportes1.setForeground(new java.awt.Color(255, 255, 255));
        lblTransportes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTransportes1.setText("Datos finales");
        getContentPane().add(lblTransportes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 12, 252, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 260, 24, 12));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 420, 300, 12));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 48, 12, 372));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 48, 12, 372));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiempo final:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 72, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total de gastos:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 132, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ruta(s) tomadas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 252, 108, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Traslados hechos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 192, -1, -1));

        txtRuta.setEditable(false);
        txtRuta.setColumns(20);
        txtRuta.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        txtRuta.setRows(5);
        txtRuta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtRuta.setOpaque(false);
        jScrollPane1.setViewportView(txtRuta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 288, 252, 108));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 48, 300, 12));

        lblTiempoFinal.setBackground(new java.awt.Color(255, 255, 255));
        lblTiempoFinal.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblTiempoFinal.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempoFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempoFinal.setText("Resultado");
        getContentPane().add(lblTiempoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 72, 108, -1));

        lblGastos.setBackground(new java.awt.Color(255, 255, 255));
        lblGastos.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblGastos.setForeground(new java.awt.Color(255, 255, 255));
        lblGastos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGastos.setText("Resultado");
        getContentPane().add(lblGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 132, 108, -1));

        lblTraslados.setBackground(new java.awt.Color(255, 255, 255));
        lblTraslados.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        lblTraslados.setForeground(new java.awt.Color(255, 255, 255));
        lblTraslados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTraslados.setText("Resultado");
        getContentPane().add(lblTraslados, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 192, 108, -1));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 260, 168, 12));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/background2.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblGastos;
    private javax.swing.JLabel lblTiempoFinal;
    private javax.swing.JLabel lblTransportes;
    private javax.swing.JLabel lblTransportes1;
    private javax.swing.JLabel lblTraslados;
    private javax.swing.JTextArea txtRuta;
    // End of variables declaration//GEN-END:variables
}
