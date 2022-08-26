package inventorymanagementsystem;

import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Patrick Larocque
 */

public class Product extends javax.swing.JFrame {

    public Product() {
        initComponents();
        displayProducts();
        getCategories();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    Connection connection = null;
    Statement statement = null;
    ResultSet results = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productPanel = new javax.swing.JPanel();
        productTopPanel = new javax.swing.JPanel();
        productTitle = new javax.swing.JLabel();
        productHeader = new javax.swing.JLabel();
        productBottomPanel = new javax.swing.JPanel();
        productCredits = new javax.swing.JLabel();
        productBrand = new javax.swing.JLabel();
        productMainMenuButton = new javax.swing.JButton();
        productTablePanel = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        productList = new javax.swing.JLabel();
        productID = new javax.swing.JLabel();
        productName = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();
        productDescription = new javax.swing.JLabel();
        productCategory = new javax.swing.JLabel();
        productAddButton = new javax.swing.JButton();
        productUpdateButton = new javax.swing.JButton();
        productDeleteButton = new javax.swing.JButton();
        productIDField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        productQuantityField = new javax.swing.JTextField();
        productPriceField = new javax.swing.JTextField();
        productCategoryDropdown = new javax.swing.JComboBox<>();
        productQuantity = new javax.swing.JLabel();
        productDescriptionField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productTopPanel.setBackground(new java.awt.Color(66, 68, 74));

        productTitle.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        productTitle.setForeground(new java.awt.Color(255, 255, 255));
        productTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productTitle.setText("Product Menu");

        productHeader.setFont(new java.awt.Font("OCR A Extended", 1, 30)); // NOI18N
        productHeader.setForeground(new java.awt.Color(255, 255, 255));
        productHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productHeader.setText("Inventory Management System");

        javax.swing.GroupLayout productTopPanelLayout = new javax.swing.GroupLayout(productTopPanel);
        productTopPanel.setLayout(productTopPanelLayout);
        productTopPanelLayout.setHorizontalGroup(
            productTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTopPanelLayout.createSequentialGroup()
                .addGroup(productTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productTopPanelLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(productHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productTopPanelLayout.createSequentialGroup()
                        .addGap(522, 522, 522)
                        .addComponent(productTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productTopPanelLayout.setVerticalGroup(
            productTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTopPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(productHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productTitle)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        productBottomPanel.setBackground(new java.awt.Color(66, 68, 74));

        productCredits.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        productCredits.setForeground(new java.awt.Color(255, 255, 255));
        productCredits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productCredits.setText("Software by Patrick");

        productBrand.setFont(new java.awt.Font("OCR A Extended", 1, 28)); // NOI18N
        productBrand.setForeground(new java.awt.Color(255, 255, 255));
        productBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productBrand.setText("invSYS");

        productMainMenuButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        productMainMenuButton.setText("Main Menu");
        productMainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMainMenuButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout productBottomPanelLayout = new javax.swing.GroupLayout(productBottomPanel);
        productBottomPanel.setLayout(productBottomPanelLayout);
        productBottomPanelLayout.setHorizontalGroup(
            productBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productBottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(productBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBottomPanelLayout.createSequentialGroup()
                        .addComponent(productCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBottomPanelLayout.createSequentialGroup()
                        .addComponent(productBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422)))
                .addComponent(productMainMenuButton)
                .addGap(58, 58, 58))
        );
        productBottomPanelLayout.setVerticalGroup(
            productBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productBottomPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(productBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBottomPanelLayout.createSequentialGroup()
                        .addComponent(productBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productBottomPanelLayout.createSequentialGroup()
                        .addComponent(productMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        productTable.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Price", "Description", "Category"
            }
        ));
        productTable.setRowHeight(25);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        productTablePanel.setViewportView(productTable);

        productList.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        productList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productList.setText("Product List");

        productID.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        productID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productID.setText("Product ID");

        productName.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        productName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productName.setText("Name");

        productPrice.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        productPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPrice.setText("Price");

        productDescription.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        productDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productDescription.setText("Description");

        productCategory.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        productCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productCategory.setText("Category");

        productAddButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        productAddButton.setText("Add");
        productAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productAddButtonMouseClicked(evt);
            }
        });

        productUpdateButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        productUpdateButton.setText("Update");
        productUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productUpdateButtonMouseClicked(evt);
            }
        });

        productDeleteButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        productDeleteButton.setText("Delete");
        productDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productDeleteButtonMouseClicked(evt);
            }
        });

        productIDField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        productNameField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        productQuantityField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        productPriceField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        productCategoryDropdown.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        productQuantity.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        productQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productQuantity.setText("Quanity");

        productDescriptionField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(productNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(productQuantityField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(productPriceField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(productCategoryDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productDescriptionField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addComponent(productAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(productUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(productDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addComponent(productTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productPanelLayout.createSequentialGroup()
                        .addComponent(productList, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))))
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addComponent(productTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productCategoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(productList)
                        .addGap(18, 18, 18)
                        .addComponent(productTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(productBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAddButtonMouseClicked
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
            PreparedStatement add = connection.prepareStatement("INSERT into PRODUCT VALUES (?, ?, ?, ?, ?, ?)");
            add.setInt(1, Integer.valueOf(productIDField.getText()));
            add.setString(2, productNameField.getText());
            add.setInt(3, Integer.valueOf(productQuantityField.getText()));
            add.setDouble(4, Double.valueOf(productPriceField.getText()));
            add.setString(5, productDescriptionField.getText());
            add.setString(6, productCategoryDropdown.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product sucessfully added.");
            connection.close();
            displayProducts();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_productAddButtonMouseClicked

    private void productDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDeleteButtonMouseClicked
        if (productIDField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a product to be deleted.");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
                String id = productIDField.getText();
                String query = "DELETE from SA.PRODUCT where Product_ID = " + id;
                Statement add = connection.createStatement();
                add.executeUpdate(query);
                displayProducts();
                JOptionPane.showMessageDialog(this, "Product sucessfully deleted.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_productDeleteButtonMouseClicked

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        int index = productTable.getSelectedRow();
        productIDField.setText(model.getValueAt(index, 0).toString());
        productNameField.setText(model.getValueAt(index, 1).toString());
        productQuantityField.setText(model.getValueAt(index, 2).toString());
        productPriceField.setText(model.getValueAt(index, 3).toString());
        productDescriptionField.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_productTableMouseClicked

    private void productUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productUpdateButtonMouseClicked
        if (productIDField.getText().isEmpty() || productNameField.getText().isEmpty() || productQuantityField.getText().isEmpty() || productPriceField.getText().isEmpty() || productDescriptionField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information. Please fill out all required fields.");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
                String updateQuery = "UPDATE SA.PRODUCT SET Product_Name = '" + productNameField.getText() + "', Product_Quantity = " + 
                        productQuantityField.getText() + ", Product_Price = " + productPriceField.getText() + ", Product_Description = '" + productDescriptionField.getText() +
                        "', Product_Category = '" + productCategoryDropdown.getSelectedItem().toString() + "' WHERE Product_ID = " + productIDField.getText();
                Statement add = connection.createStatement();
                add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Product sucessfully updated.");
                displayProducts();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_productUpdateButtonMouseClicked

    private void productMainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMainMenuButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productMainMenuButtonMouseClicked
    
    public void displayProducts() {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
            statement = connection.createStatement();
            results = statement.executeQuery("SELECT * FROM PRODUCT");
            productTable.setModel(DbUtils.resultSetToTableModel(results));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void getCategories() {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
            statement = connection.createStatement();
            String query = "SELECT * FROM SA.CATEGORY";
            results = statement.executeQuery(query);
            while (results.next()) {
                String category = results.getString("Category_Name");
                productCategoryDropdown.addItem(category);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton productAddButton;
    private javax.swing.JPanel productBottomPanel;
    private javax.swing.JLabel productBrand;
    private javax.swing.JLabel productCategory;
    private javax.swing.JComboBox<String> productCategoryDropdown;
    private javax.swing.JLabel productCredits;
    private javax.swing.JButton productDeleteButton;
    private javax.swing.JLabel productDescription;
    private javax.swing.JTextField productDescriptionField;
    private javax.swing.JLabel productHeader;
    private javax.swing.JLabel productID;
    private javax.swing.JTextField productIDField;
    private javax.swing.JLabel productList;
    private javax.swing.JButton productMainMenuButton;
    private javax.swing.JLabel productName;
    private javax.swing.JTextField productNameField;
    private javax.swing.JPanel productPanel;
    private javax.swing.JLabel productPrice;
    private javax.swing.JTextField productPriceField;
    private javax.swing.JLabel productQuantity;
    private javax.swing.JTextField productQuantityField;
    private javax.swing.JTable productTable;
    private javax.swing.JScrollPane productTablePanel;
    private javax.swing.JLabel productTitle;
    private javax.swing.JPanel productTopPanel;
    private javax.swing.JButton productUpdateButton;
    // End of variables declaration//GEN-END:variables
}
