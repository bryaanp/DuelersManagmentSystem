/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duelers;

/**
 *
 * @author majes
 */
public class RemoveCustomer extends javax.swing.JPanel {

    /**
     * Creates new form RemoveCustomer
     */
    public RemoveCustomer() {
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

        btnSubmit = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        lbAddCustomer = new javax.swing.JLabel();
        combRemoveCustomer = new javax.swing.JComboBox<>();
        lbCustomerID = new javax.swing.JLabel();

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        lbAddCustomer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbAddCustomer.setText("Deactivate Customer");

        combRemoveCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combRemoveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combRemoveCustomerActionPerformed(evt);
            }
        });

        lbCustomerID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbCustomerID.setText("Select Customer ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(lbAddCustomer)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCustomerID)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(combRemoveCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAddCustomer)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCustomerID)
                    .addComponent(combRemoveCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnReturn))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Connection conn;
        MyConnection submitwarehouse = new MyConnection();
        conn = submitwarehouse.getConnection();
        //String sql= "insert into warehouse (warehouseNumber, warehouseAddress)" + "values(?,?)";
        String sql = "insert into warehouse (warehouseNumber, warehouseAddress) values ( '" + txtNumber.getText() + "' , '" + txtAddress.getText() + "')";

        try {

            PreparedStatement pst= conn.prepareStatement(sql);
            // pst.setString(1, txtNumber.getText());
            // pst.setString(2, txtAddress.getText());
            pst.executeUpdate(sql);

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        Warehouse Info = new Warehouse();
        Info.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void combRemoveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combRemoveCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combRemoveCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> combRemoveCustomer;
    private javax.swing.JLabel lbAddCustomer;
    private javax.swing.JLabel lbCustomerID;
    // End of variables declaration//GEN-END:variables
}
