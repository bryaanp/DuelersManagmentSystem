/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duelers;

/**
 *
 * @author taghr
 */
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class AddInvoice extends javax.swing.JFrame {

    /**
     * Creates new form AddInvoice
     */
    public AddInvoice() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReturn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbaddInvoice = new javax.swing.JLabel();
        lbShippingAmount = new javax.swing.JLabel();
        lbInvoiceDate = new javax.swing.JLabel();
        lbCustomerList = new javax.swing.JLabel();
        combCustomerList = new javax.swing.JComboBox<>();
        lbInvoiceNo = new javax.swing.JLabel();
        lbTotalAmount1 = new javax.swing.JLabel();
        checkBoxLess30 = new javax.swing.JCheckBox();
        checkBoxGreater30 = new javax.swing.JCheckBox();
        txtDate = new javax.swing.JTextField();
        txtShippingAmount = new javax.swing.JTextField();
        txtInvoice = new javax.swing.JTextField();
        txtTotalAmount = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReturn1 = new javax.swing.JButton();
        lbSalespersonList = new javax.swing.JLabel();
        combSalespersonList = new javax.swing.JComboBox<>();

        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbaddInvoice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbaddInvoice.setText("Add Invoice");

        lbShippingAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbShippingAmount.setText("Shipping Amount");

        lbInvoiceDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbInvoiceDate.setText("Date");

        lbCustomerList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCustomerList.setText("Select Customer");

        combCustomerList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combCustomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combCustomerListActionPerformed(evt);
            }
        });

        lbInvoiceNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbInvoiceNo.setText("Invoice#");

        lbTotalAmount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTotalAmount1.setText("Total Amount");

        checkBoxLess30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBoxLess30.setText("Less than 30 days");
        checkBoxLess30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLess30ActionPerformed(evt);
            }
        });

        checkBoxGreater30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBoxGreater30.setText("More than 30 days");
        checkBoxGreater30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxGreater30ActionPerformed(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtShippingAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtInvoice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtTotalAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReturn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn1.setText("Return");
        btnReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn1ActionPerformed(evt);
            }
        });

        lbSalespersonList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSalespersonList.setText("Select Salesperson");

        combSalespersonList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(txtInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtShippingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSalespersonList)
                                    .addComponent(lbCustomerList)
                                    .addComponent(lbInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate)
                                    .addComponent(combSalespersonList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combCustomerList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(checkBoxLess30, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(checkBoxGreater30, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTotalAmount1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbShippingAmount)
                                .addGap(263, 263, 263)))
                        .addGap(6, 6, 6)))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(lbaddInvoice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnReturn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbaddInvoice)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInvoiceNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbInvoiceDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustomerList)
                    .addComponent(combCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSalespersonList)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(combSalespersonList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbShippingAmount)
                    .addComponent(txtShippingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotalAmount1)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxLess30)
                    .addComponent(checkBoxGreater30))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnReturn1))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxGreater30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxGreater30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxGreater30ActionPerformed

    private void checkBoxLess30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLess30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxLess30ActionPerformed

    private void combCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combCustomerListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combCustomerListActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Connection conn;
        MyConnection addProduct = new MyConnection();
        conn = addProduct.getConnection();
        String sql = "insert into product (InvoiceNum, Date, ShippingAmount, TotalAmount) "
        + "values ( '" + txtInvoiceNumber.getText() + "' , '" + txtUPC.getText() + "' , '" +
        txtSellingPrice.getText() + "' , '" + txtCostPrice.getText() + "' , '" + txtProductDetails.getText() +"')";

        try {

            PreparedStatement pst= conn.prepareStatement(sql);
            pst.executeUpdate(sql);

        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        dispose();
        new Customer().setVisible(true);
    }
//GEN-LAST:event_btnSubmitActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        dispose();
        new Customer().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Customer().setVisible(true);
    }//GEN-LAST:event_btnReturn1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnReturn1;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox checkBoxGreater30;
    private javax.swing.JCheckBox checkBoxLess30;
    private javax.swing.JComboBox<String> combCustomerList;
    private javax.swing.JComboBox<String> combSalespersonList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCustomerList;
    private javax.swing.JLabel lbInvoiceDate;
    private javax.swing.JLabel lbInvoiceNo;
    private javax.swing.JLabel lbSalespersonList;
    private javax.swing.JLabel lbShippingAmount;
    private javax.swing.JLabel lbTotalAmount1;
    private javax.swing.JLabel lbaddInvoice;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtInvoice;
    private javax.swing.JTextField txtShippingAmount;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
