/**
 * Realice un programa que permita determinar qué paquete se puede comprar una persona
 * con el dinero que recibirá en diciembre, considerando lo siguiente:
 * • Paquete A. Si recibe $50,000 o más se comprará una televisión, un modular,
 * tres pares de zapatos, cinco camisas y cinco pantalones.
 * • Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000,
 * se comprará una grabadora, tres pares de zapatos, cinco camisas y cinco pantalones.
 * • Paquete C. Si recibe menos de $20,000 pero más (o igual) de $10,000,
 * se comprará dos pares de zapatos, tres camisas y tres pantalones.
 * • Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par
 * de zapatos, dos camisas y dos pantalones.
 */
package Formulario;

public class Formulario_practica_02 extends javax.swing.JFrame {

    String paquete;
    int monto;

    public Formulario_practica_02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbMonto.setText("MONTO RECIBIDO:");

        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbMonto)
                .addGap(4, 4, 4)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lbMonto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        monto = Integer.parseInt(txtMonto.getText());
        
        if(monto >=50){
          paquete = "A";
        }else{
            if(monto >=20 && monto < 50){
                paquete = "B";
            }else{
                if(monto >=10 && monto < 20){
                    paquete = "C";
                }else{
                    paquete = "D";
                }
            }
        }
        switch (paquete) {
            case "A":
                System.out.println("Su paquetes es: " + paquete);
                System.out.println("Un televisión");
                System.out.println("Un modular");
                System.out.println("Tres pares de zapatos");
                System.out.println("Cinco camisas");
                System.out.println("Cinco pantalones");
                break;
                
            case "B":
                System.out.println("Su paquetes es: " + paquete);
                System.out.println("Una grabadora");
                System.out.println("Tres pares de zapatos");
                System.out.println("Cinco camisas");
                System.out.println("Cinco pantalones");
                break;

            case "C":
                System.out.println("Su paquetes es: " + paquete);
                System.out.println("Dos pares de zapatos");
                System.out.println("Tres camisas");
                System.out.println("Tres pantalones");
                break;
                
           case "D":
                System.out.println("Su paquetes es: " + paquete);
                System.out.println("Un  par de zapatos");
                System.out.println("Dos camisas");
                System.out.println("Dos pantalones");
                break;


        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_practica_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_practica_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_practica_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_practica_02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_practica_02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbMonto;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

}
