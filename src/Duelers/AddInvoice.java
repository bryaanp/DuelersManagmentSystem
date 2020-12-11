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
import javax.swing.table.DefaultTableModel;
public class AddInvoice extends javax.swing.JFrame {

    /**
     * Creates new form AddInvoice
     */
    public AddInvoice() {
        initComponents();
        displayCustomers();
        displaySalesPerson();
        displayWarehouse();
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
        txtDate = new javax.swing.JTextField();
        txtShippingAmount = new javax.swing.JTextField();
        txtInvoice = new javax.swing.JTextField();
        txtTotalAmount = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReturnInvoiceMenu = new javax.swing.JButton();
        lbSalespersonList = new javax.swing.JLabel();
        combSalespersonList = new javax.swing.JComboBox<>();
        lbProduct = new javax.swing.JLabel();
        combProductList = new javax.swing.JComboBox<>();
        lbWarehouse = new javax.swing.JLabel();
        combWarehouseList = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        btnCalculateTotalAmount = new javax.swing.JButton();
        lbShippingAmount1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbProduct1 = new javax.swing.JLabel();

        btnReturn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbaddInvoice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbaddInvoice.setText("ADD INVOICE");

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
        lbInvoiceNo.setText("Invoice #");

        txtDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDate.setText("YYYY-MM-DD");

        txtShippingAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtShippingAmount.setText("0");
        txtShippingAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtShippingAmountActionPerformed(evt);
            }
        });

        txtInvoice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txtTotalAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReturnInvoiceMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReturnInvoiceMenu.setText("Return");
        btnReturnInvoiceMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnInvoiceMenuActionPerformed(evt);
            }
        });

        lbSalespersonList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSalespersonList.setText("Select Salesperson");

        combSalespersonList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lbProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbProduct.setText("Products List: ");

        combProductList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        /*
        combProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combProductListActionPerformed(evt);
            }
        });
        */

        lbWarehouse.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbWarehouse.setText("Warehouse");

        combWarehouseList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combWarehouseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combWarehouseListActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "UPC", "Cost", "Quantity", "Warehouse"}
        )

        {public boolean isCellEditable(int row, int column){
            return false;}}
    );
    jScrollPane3.setViewportView(productTable);

    btnCalculateTotalAmount.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
    btnCalculateTotalAmount.setText("Calculate");
    btnCalculateTotalAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCalculateTotalAmountActionPerformed(evt);
        }
    });

    lbShippingAmount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    lbShippingAmount1.setText("Total Amount");

    lbProduct1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    lbProduct1.setText("Product");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(lbWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combCustomerList, 0, 164, Short.MAX_VALUE)
                            .addComponent(combWarehouseList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combSalespersonList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(125, 125, 125))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(lbProduct))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(btnReturnInvoiceMenu)
                            .addGap(89, 89, 89)
                            .addComponent(btnSubmit)
                            .addGap(119, 119, 119))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbProduct1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(combProductList, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbShippingAmount)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtShippingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(46, 46, 46))))
        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbCustomerList)
                        .addComponent(lbSalespersonList)
                        .addComponent(lbInvoiceDate)
                        .addComponent(lbInvoiceNo))
                    .addGap(41, 41, 41)
                    .addComponent(txtInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addComponent(lbaddInvoice))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(lbShippingAmount1)
                    .addGap(18, 18, 18)
                    .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)
                    .addComponent(btnCalculateTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(lbaddInvoice)
            .addGap(18, 18, 18)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbInvoiceNo))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbInvoiceDate))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(combCustomerList)
                .addComponent(lbCustomerList))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(combSalespersonList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbSalespersonList))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(combWarehouseList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbWarehouse))
            .addGap(31, 31, 31)
            .addComponent(lbProduct)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(combProductList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtShippingAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbShippingAmount)
                .addComponent(lbProduct1))
            .addGap(45, 45, 45)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbShippingAmount1)
                .addComponent(btnCalculateTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnReturnInvoiceMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combCustomerListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combCustomerListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combCustomerListActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Connection conn;
        MyConnection addProduct = new MyConnection();
        conn = addProduct.getConnection();
        
        if(txtShippingAmount.getText() == "0"){
            calculateTotal();
        }
        
        String selectedCust = combCustomerList.getSelectedItem().toString();
        String selectedSales = combSalespersonList.getSelectedItem().toString();
        String selectedInvoice = txtInvoice.getText();
        String selectedProduct = combProductList.getSelectedItem().toString();
        String selectedWarehouse = combWarehouseList.getSelectedItem().toString();
        String sql =  "INSERT invoice (invoiceID, invoiceDate, custID, salesID, upc,"
                + " warehouseID, shippingAmount, totalAmount, paymentAmount, openStatus)" 
                + "VALUES (" + selectedInvoice + ",'" + txtDate.getText() + "', "
                + selectedCust + ", " + selectedSales + ", " + selectedProduct + ", "
                + selectedWarehouse + ", "+ txtShippingAmount.getText() + ", "
                + txtTotalAmount.getText() + ",'0','1');";
        String sqlProduct = "UPDATE product SET quantityAvailable = quantityAvailable - 1, "
                + "quantitySold = quantitySold + 1  WHERE upc = " 
                + Integer.parseInt(selectedProduct)+";";
        try {
            PreparedStatement pst= conn.prepareStatement(sql);
            PreparedStatement pst2 = conn.prepareStatement(sqlProduct);
            pst.executeUpdate(sql);
            pst2.executeUpdate(sqlProduct);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        //pst.close();                    
        dispose();
        new Invoice().setVisible(true);        
//        boolean checked10 = checkBoxLess10.isSelected();
//        boolean checked30 = checkBoxGreater30.isSelected();
//        if(checked10) {
//             sql = "UPDATE invoice SET totalAmount = totalAmount - (totalAmount * .10) WHERE invoiceID = " + selectedInvoice;
//            try{
//                PreparedStatement pst= conn.prepareStatement(sql);
//                pst.executeUpdate(sql);
//                dispose();
//                new Invoice().setVisible(true);
//            }
//            catch(Exception ex){
//                JOptionPane.showMessageDialog(null, ex);
//            }
//        }
//        else if (checked30) {
//            sql = "UPDATE invoice SET totalAmount = totalAmount + (totalAmount * .02) WHERE invoiceID = " + selectedInvoice;
//            try{
//                PreparedStatement pst= conn.prepareStatement(sql);
//                pst.executeUpdate(sql);
//                dispose();
//                new Invoice().setVisible(true);
//            }
//            catch(Exception ex){
//                JOptionPane.showMessageDialog(null, ex);
//            }
//        }
//        else {
//            dispose();
//            new Invoice().setVisible(true);
//        }

    }
//GEN-LAST:event_btnSubmitActionPerformed
//not used
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        dispose();
        new Invoice().setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnReturnInvoiceMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnInvoiceMenuActionPerformed
        dispose();
        new Invoice().setVisible(true);
    }//GEN-LAST:event_btnReturnInvoiceMenuActionPerformed

    private void combWarehouseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combWarehouseListActionPerformed
        combProductList.removeAllItems();
        displayProduct();
    }//GEN-LAST:event_combWarehouseListActionPerformed
//
//    private void combProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combProductListActionPerformed
//    }//GEN-LAST:event_combProductListActionPerformed

    private void txtShippingAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtShippingAmountActionPerformed
  
    }//GEN-LAST:event_txtShippingAmountActionPerformed
    private void calculateTotal(){
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        MyConnection productCost = new MyConnection();
        conn = productCost.getConnection();
        //if (ItxtShippingAmount.getText())
        String selectedProduct = combProductList.getSelectedItem().toString();
        String selectedCust = combCustomerList.getSelectedItem().toString();
        String sql = "Select SellingPrice from product WHERE UPC = " + selectedProduct;
        String taxSql = "Select salesTax from customer WHERE customerID = " + selectedCust;
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            PreparedStatement pst2 = conn.prepareStatement(taxSql);
            ResultSet rs2 = pst2.executeQuery();
            while(rs.next() && rs2.next()){
                double totalAmt = Double.parseDouble(txtShippingAmount.getText()) + rs.getDouble("SellingPrice");
                totalAmt += (totalAmt * (rs2.getDouble("salesTax")/100));
                txtTotalAmount.setText(String.format("%.2f",totalAmt));
            }
            pst.close();

        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void btnCalculateTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateTotalAmountActionPerformed
        calculateTotal();
    }//GEN-LAST:event_btnCalculateTotalAmountActionPerformed


    private static void displayCustomers(){
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        MyConnection customerList = new MyConnection();
        conn = customerList.getConnection();
        String sql = "Select customerID from customer WHERE status = 'Active' OR status = 'active';
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                String customerID = Integer.toString(rs.getInt("customerID"));
                combCustomerList.addItem(customerID);
            }
            pst.close();

        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    private static void deleteAllRows(DefaultTableModel model){
        for( int i = model.getRowCount() - 1; i >= 0; i-- ) {
            model.removeRow(i);
        }    
    }
    private static void displayProduct(){
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
        MyConnection listAction = new MyConnection();
        conn = listAction.getConnection();
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        deleteAllRows(model);                  

        String sql = "SELECT ProductName, UPC, SellingPrice, quantityAvailable, warehouseNum"
                + " FROM product p WHERE warehouseNum = " + 
                combWarehouseList.getSelectedItem().toString() + " AND quantityAvailable != 0;";
 
        try {
            pst= conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                String name = rs.getString("ProductName");
                String upc = rs.getString("UPC");
                float price = rs.getFloat("SellingPrice");
                int quantity = rs.getInt("quantityAvailable");
                int warehouse = rs.getInt("warehouseNum");
                Object[] products = {name, upc, price, quantity, warehouse,0};
                model = (DefaultTableModel) productTable.getModel();
                model.addRow(products);
                combProductList.addItem(upc);
            }
            pst.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void displayWarehouse() {
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
                int warehouseNumber = Integer.parseInt(rs.getString("warehouseNumber"));
                combWarehouseList.addItem(String.valueOf(warehouseNumber));
            }
            pst.close();
        }
        catch (Exception ex)
        {
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
        pst.close();
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
    private javax.swing.JButton btnCalculateTotalAmount;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnReturnInvoiceMenu;
    private javax.swing.JButton btnSubmit;
    private static javax.swing.JComboBox<String> combCustomerList;
    private static javax.swing.JComboBox<String> combProductList;
    private static javax.swing.JComboBox<String> combSalespersonList;
    private static javax.swing.JComboBox<String> combWarehouseList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCustomerList;
    private javax.swing.JLabel lbInvoiceDate;
    private javax.swing.JLabel lbInvoiceNo;
    private javax.swing.JLabel lbProduct;
    private javax.swing.JLabel lbProduct1;
    private javax.swing.JLabel lbSalespersonList;
    private javax.swing.JLabel lbShippingAmount;
    private javax.swing.JLabel lbShippingAmount1;
    private javax.swing.JLabel lbWarehouse;
    private javax.swing.JLabel lbaddInvoice;
    private static javax.swing.JTable productTable;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtInvoice;
    private javax.swing.JTextField txtShippingAmount;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
