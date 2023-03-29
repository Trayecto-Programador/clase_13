/**
 * Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C),
 * cada uno tiene un precio por kilómetro recorrido por persona, 
 * los costos respectivos son $2.0, $2.5 y $3.0. 
 * Se requiere determinar el costo total y por persona del viaje considerando 
 * que cuando éste se presupuesta debe haber un mínimo de 20 personas,
 * de lo contrario el cobro se realiza con base en este número límite.
 */
package formulario;

import javax.swing.JOptionPane;

public class Formulario_Practica_03 extends javax.swing.JFrame {

    public Formulario_Practica_03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTipo = new javax.swing.JLabel();
        lbCantPersonas = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtCantPersonas = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbKilometros = new javax.swing.JLabel();
        txtKilometros = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTipo.setText("TIPO DE AUTOBUS");

        lbCantPersonas.setText("CANTIDAD DE PERSONAS");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbKilometros.setText("KILOMETROS RECCORRIDOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbKilometros)
                            .addComponent(lbCantPersonas)
                            .addComponent(lbTipo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKilometros, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKilometros)
                    .addComponent(txtKilometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCantPersonas)
                    .addComponent(txtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnSalir))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String tipos;
        int  kilometros, cantidadPersonas;
        double precioA, precioB, precioC,costoTotal;
        
        precioA = 2;
        precioB = 2.5;
        precioC = 3;
        tipos = txtTipo.getText();
        kilometros = Integer.parseInt(txtKilometros.getText());
        cantidadPersonas = Integer.parseInt(txtCantPersonas.getText());
        
        switch (tipos) {
            case "A":
                if(cantidadPersonas < 20){
                    costoTotal = kilometros * precioA * 20;
                    JOptionPane.showMessageDialog(null, "Costo total:" + costoTotal);
                }else{
                    costoTotal = kilometros * precioA * cantidadPersonas;
                    JOptionPane.showMessageDialog(null, "Costo total:" + costoTotal);
                }
                break;
                
            case "B":
                if(cantidadPersonas < 20){
                    costoTotal = kilometros * precioB * 20;
                    JOptionPane.showMessageDialog(null, "Costo total:" + costoTotal);
                }else{
                    costoTotal = kilometros * precioB * cantidadPersonas;
                    JOptionPane.showMessageDialog(null, "Costo total:" + costoTotal);
                }
                break;
                
             case "C":
                if(cantidadPersonas < 20){
                    costoTotal = kilometros * precioC * 20;
                    JOptionPane.showMessageDialog(null, "Costo total:" + costoTotal);
                }else{
                    costoTotal = kilometros * precioC * cantidadPersonas;
                    JOptionPane.showMessageDialog(null, "Costo total:" + costoTotal);
                }
                break;

        }
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Practica_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Practica_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Practica_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Practica_03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Practica_03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lbCantPersonas;
    private javax.swing.JLabel lbKilometros;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JTextField txtCantPersonas;
    private javax.swing.JTextField txtKilometros;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
