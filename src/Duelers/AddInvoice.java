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
import java.sql.ResultSet;
import java.sql.SQLException;
public class AddInvoice extends javax.swing.JFrame {

    /**
     * Creates new form AddInvoice
     */
    public AddInvoice() {
        initComponents();
        displayCustomers();
        displaySalesPerson();
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
        checkBoxLess10 = new javax.swing.JCheckBox();
        checkBoxGreater30 = new javax.swing.JCheckBox();
        txtDate = new javax.swing.JTextField();
        txtShippingAmount = new javax.swing.JTextField();
        txtInvoice = new javax.swing.JTextField();
        txtTotalAmount = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReturn1 = new javax.swing.JButton();
        lbSalespersonList = new javax.swing.JLabel();
        combSalespersonList = new javax.swing.JComboBox<>();
        lbProduct = new javax.swing.JLabel();
        txtProduct = new javax.swing.JTextField();

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

        checkBoxLess10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        checkBoxLess10.setText("Less than 10 days");
        checkBoxLess10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxLess10ActionPerformed(evt);
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

        lbProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbProduct.setText("Product(s)");

        txtProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtProduct.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCustomerList)
                                    .addComponent(lbInvoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbSalespersonList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate)
                            .addComponent(combCustomerList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combSalespersonList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(txtInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbShippingAmount)
                                            .addComponent(lbTotalAmount1)
                                            .addComponent(lbProduct))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                                    .addComponent(txtShippingAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtProduct))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(checkBoxLess10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(checkBoxGreater30, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnReturn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbaddInvoice)
                .addGap(170, 170, 170))
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
                    .addComponent(combCustomerList, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combSalespersonList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSalespersonList))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbShippingAmount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtShippingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTotalAmount1)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxLess10)
                    .addComponent(checkBoxGreater30))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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

    private void checkBoxLess10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxLess10ActionPerformed

    }//GEN-LAST:event_checkBoxLess10ActionPerformed

    private void combCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combCustomerListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combCustomerListActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Connection conn;
        MyConnection addProduct = new MyConnection();
        conn = addProduct.getConnection();
        String selectedCust = combCustomerList.getSelectedItem().toString();
        String selectedSales = combSalespersonList.getSelectedItem().toString();
        String selectedInvoice = txtInvoice.getText();
        String sql = "insert into Invoice (InvoiceID, invoiceDate, custID, salesID, productName, ShippingAmount, TotalAmount) "
        + "values ( '" + txtInvoice.getText() + "' , '" + txtDate.getText() + "' , '" + selectedCust + "' , '" + selectedSales +
                "' , '" + txtProduct.getText() + "' , '" + txtShippingAmount.getText() + "' , '" + txtTotalAmount.getText()
                 +"')";
        try {
            PreparedStatement pst= conn.prepareStatement(sql);
            pst.executeUpdate(sql);

        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

        boolean checked10 = checkBoxLess10.isSelected();
        boolean checked30 = checkBoxGreater30.isSelected();
        if(checked10) {
             sql = "UPDATE invoice SET totalAmount = totalAmount - (totalAmount * .10) WHERE invoiceID = " + selectedInvoice;
            try{
                PreparedStatement pst= conn.prepareStatement(sql);
                pst.executeUpdate(sql);
                dispose();
                new Invoice().setVisible(true);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if (checked30) {
            sql = "UPDATE invoice SET totalAmount = totalAmount + (totalAmount * .02) WHERE invoiceID = " + selectedInvoice;
            try{
                PreparedStatement pst= conn.prepareStatement(sql);
                pst.executeUpdate(sql);
                dispose();
                new Invoice().setVisible(true);
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else {
            dispose();
            new Invoice().setVisible(true);
        }

    }
//GEN-LAST:event_btnSubmitActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        dispose();
        new Invoice().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn1ActionPerformed
        dispose();
        new Invoice().setVisible(true);
    }//GEN-LAST:event_btnReturn1ActionPerformed


    private static void displayCustomers(){
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        MyConnection customerList = new MyConnection();
        conn = customerList.getConnection();
        String sql = "Select customerID from customer ORDER BY customerID";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String customerID = Integer.toString(rs.getInt("customerID"));
                combCustomerList.addItem(customerID);
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    private static void displaySalesPerson() {
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        MyConnection listAction = new MyConnection();
        conn = listAction.getConnection();
        String sql = "Select emp_ID from salesperson ORDER BY emp_ID";
        try {
            pst= conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                int empID = Integer.parseInt(rs.getString("emp_ID"));
                combSalespersonList.addItem(String.valueOf(empID));
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
    private javax.swing.JCheckBox checkBoxLess10;
    private static javax.swing.JComboBox<String> combCustomerList;
    private static javax.swing.JComboBox<String> combSalespersonList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCustomerList;
    private javax.swing.JLabel lbInvoiceDate;
    private javax.swing.JLabel lbInvoiceNo;
    private javax.swing.JLabel lbProduct;
    private javax.swing.JLabel lbSalespersonList;
    private javax.swing.JLabel lbShippingAmount;
    private javax.swing.JLabel lbTotalAmount1;
    private javax.swing.JLabel lbaddInvoice;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtInvoice;
    private javax.swing.JTextField txtProduct;
    private javax.swing.JTextField txtShippingAmount;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
