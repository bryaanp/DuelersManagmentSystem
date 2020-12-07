/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duelers;

/**
 *
 * @author bryan
 */
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ViewCustomer extends javax.swing.JFrame {

    /**
     * Creates new form ViewCustomer
     */
    public ViewCustomer() {
        initComponents();
        displayCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        lbViewCustomer = new javax.swing.JLabel();
        btnReturn1 = new javax.swing.JButton();
        lbCustomerList = new javax.swing.JLabel();
        combCustomerList = new javax.swing.JComboBox<>();
        lbFName = new javax.swing.JLabel();
        lbLName = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbPhone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbViewCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbViewCustomer.setText("View Customer");

        btnReturn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn1.setText("Return");
        btnReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturn1ActionPerformed(evt);
            }
        });

        lbCustomerList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCustomerList.setText("Customer List");

        combCustomerList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combCustomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combCustomerListActionPerformed(evt);
            }
        });

        lbFName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbFName.setText("First Name");

        lbLName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbLName.setText("Last Name");

        lbID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbID.setText("Customer ID");

        lbPhone.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbPhone.setText("Phone");

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbEmail.setText("Email");

        lbAddress.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbAddress.setText("Address");

        lbStatus.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbStatus.setText("Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(combCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLName)
                            .addComponent(lbFName)
                            .addComponent(lbID)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmail)
                                    .addComponent(lbPhone)
                                    .addComponent(lbAddress)
                                    .addComponent(lbStatus))))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFName)
                            .addComponent(lbViewCustomer)
                            .addComponent(txtLName)
                            .addComponent(txtID)
                            .addComponent(txtPhone)
                            .addComponent(txtEmail)
                            .addComponent(txtAddress)
                            .addComponent(txtStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnReturn1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lbViewCustomer)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustomerList)
                    .addComponent(combCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbLName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtLName, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPhone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatus))
                .addGap(21, 21, 21)
                .addComponent(btnReturn1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combCustomerListActionPerformed
        // TODO add your handling code here:
        Connection conn;
        MyConnection ViewCustomer = new MyConnection();
        conn = ViewCustomer.getConnection();
        try{
            String sql = "select * from customer where customerID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, (String)combCustomerList.getSelectedItem());
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                txtFName.setText(rs.getString("FirstName"));
                txtLName.setText(rs.getString("LastName"));
                txtID.setText(rs.getString("customerID"));
                txtPhone.setText(rs.getString("phone"));
                txtEmail.setText(rs.getString("email"));
                txtAddress.setText(rs.getString("address"));
                txtStatus.setText(rs.getString("status"));
            }
            pst.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_combCustomerListActionPerformed

    private void btnReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturn1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Customer().setVisible(true);
    }//GEN-LAST:event_btnReturn1ActionPerformed

    private void displayCustomers(){
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
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn1;
    private javax.swing.JComboBox<String> combCustomerList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbCustomerList;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFName;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLName;
    private javax.swing.JLabel lbPhone;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbViewCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
