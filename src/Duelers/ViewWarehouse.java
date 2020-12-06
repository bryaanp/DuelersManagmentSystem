/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duelers;

import javax.swing.*;
import java.util.ArrayList;
import java.sql.*;

public class ViewWarehouse extends javax.swing.JFrame {
    private static JComboBox<String> combWarehoustList;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form ViewWarehouse
     */
    public ViewWarehouse() {
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

        jPanel1 = new javax.swing.JPanel();
        lbrViewWarehouse = new javax.swing.JLabel();
        lbNumber = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        combWarehoustList = new javax.swing.JComboBox<String>();
        btnReturn = new javax.swing.JButton();
        lbListofitem = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbrViewWarehouse.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbrViewWarehouse.setText("View Warehouse");

        lbNumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNumber.setText("Warehouse List");

        btnDone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDone.setText("Done");

        combWarehoustList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combWarehoustList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combWarehoustListActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        lbListofitem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbListofitem.setText("List of Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbListofitem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity)
                            .addComponent(combWarehoustList, 0, 187, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbrViewWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbrViewWarehouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combWarehoustList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNumber))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbListofitem)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDone)
                    .addComponent(btnReturn))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combWarehoustListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combWarehoustListActionPerformed
        // TODO add your handling code here:
//        MyConnection listAction = new MyConnection();
//        conn = listAction.getConnection();
//        String sql = "Select warehouseNumber from warehouse ORDER BY warehouseNumber";
////        ArrayList<String> warehouseList = new ArrayList<String>();
////        combWarehoustList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2" }));
//        try {
//            pst= conn.prepareStatement(sql);
//            rs = pst.executeQuery();
//            while(rs.next())
//            {
//               int warehouseID = Integer.parseInt(rs.getString("warehouseNumber"));
//
//                combWarehoustList.addItem(String.valueOf(warehouseID));
//
//            }
//        }
//        catch (Exception ex)
//        {
//            JOptionPane.showMessageDialog(null, ex);
//        }
    }//GEN-LAST:event_combWarehoustListActionPerformed

//    public  void viewTable(Connection conn) throws SQLException {
//        String query = "select warehouseNumber, warehouseAddress from warehouse";
//        try (Statement stmt = conn.createStatement()) {
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                String warehouseAddress = rs.getString("warehouseAddress");
//                int warehouseNumber = rs.getInt("warehouseNumber");
//                combWarehoustList.addItem(warehouseAddress);
//
//                System.out.println(warehouseAddress + ", " + warehouseNumber);
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        Warehouse Info = new Warehouse();
        Info.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed


    private static void displayWarehouse() {//GEN-FIRST:event_combWarehoustListActionPerformed
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        MyConnection listAction = new MyConnection();
        conn = listAction.getConnection();
        String sql = "Select warehouseNumber from warehouse ORDER BY warehouseNumber";

        try {
            pst= conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                int warehouseID = Integer.parseInt(rs.getString("warehouseNumber"));
                combWarehoustList.addItem(String.valueOf(warehouseID));
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
        Connection conn;
        MyConnection listAction = new MyConnection();
        conn = listAction.getConnection();
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
            java.util.logging.Logger.getLogger(ViewWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewWarehouse().setVisible(true);
                displayWarehouse();
//                try {
//                    new ViewWarehouse().viewTable(conn);
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbListofitem;
    private javax.swing.JLabel lbNumber;
    private javax.swing.JLabel lbrViewWarehouse;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
