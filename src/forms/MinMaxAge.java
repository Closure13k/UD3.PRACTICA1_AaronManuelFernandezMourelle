/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forms;

import controller.Reports;
import javax.swing.JOptionPane;

/**
 *
 * @author AaronFM
 */
public class MinMaxAge extends javax.swing.JDialog {

    private static MinMaxAge mma;

    public static MinMaxAge getInstance(ReportViewer parent) {
        if (mma == null) {
            mma = new MinMaxAge(parent, true);
        }
        mma.clearFields();
        return mma;
    }

    private MinMaxAge(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMin = new javax.swing.JLabel();
        txtAgeMin = new javax.swing.JTextField();
        lblMax = new javax.swing.JLabel();
        txtAgeMax = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblMin.setText("Min.");

        lblMax.setText("Max.");

        btnOK.setText("OK!");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMin)
                        .addGap(18, 18, 18)
                        .addComponent(txtAgeMin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(lblMax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAgeMax, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgeMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMin)
                    .addComponent(lblMax)
                    .addComponent(txtAgeMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(294, 119));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        verifyAgeAndSendReport();
    }//GEN-LAST:event_btnOKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JTextField txtAgeMax;
    private javax.swing.JTextField txtAgeMin;
    // End of variables declaration//GEN-END:variables

    private void verifyAgeAndSendReport() {
        try {
            Integer minAge = Integer.parseInt(txtAgeMin.getText());
            Integer maxAge = Integer.parseInt(txtAgeMax.getText());
            if (minAge > maxAge) {
                txtAgeMax.setText(minAge.toString());
                txtAgeMin.setText(maxAge.toString());
            }
            Reports.customRangedAgeReport(minAge, maxAge);
        } catch (NumberFormatException nfex) {
            JOptionPane.showMessageDialog(rootPane, "Introduce valores numéricos.");
        }
    }

    private void clearFields() {
        txtAgeMax.setText("");
        txtAgeMin.setText("");
    }
}
