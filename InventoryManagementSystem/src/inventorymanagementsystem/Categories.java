package inventorymanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Patrick Larocque
 */

public class Categories extends javax.swing.JFrame {

    public Categories() {
        initComponents();
        displayCategories();
    }
    
    Connection connection = null;
    Statement statement = null;
    ResultSet results = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        categoryPanel = new javax.swing.JPanel();
        categoryTopPanel = new javax.swing.JPanel();
        categoryTitle = new javax.swing.JLabel();
        categoryHeader = new javax.swing.JLabel();
        categoryBottomPanel = new javax.swing.JPanel();
        categoryCredits = new javax.swing.JLabel();
        categoryBrand = new javax.swing.JLabel();
        categoryTablePanel = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        categoryList = new javax.swing.JLabel();
        categoryID = new javax.swing.JLabel();
        categoryName = new javax.swing.JLabel();
        categoryAddButton = new javax.swing.JButton();
        categoryEditButton = new javax.swing.JButton();
        categoryDeleteButton = new javax.swing.JButton();
        categoryMainMenuButton = new javax.swing.JButton();
        categoryIDField = new javax.swing.JTextField();
        categoryNameField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        categoryTopPanel.setBackground(new java.awt.Color(66, 68, 74));

        categoryTitle.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        categoryTitle.setForeground(new java.awt.Color(255, 255, 255));
        categoryTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryTitle.setText("User Menu");

        categoryHeader.setFont(new java.awt.Font("OCR A Extended", 1, 30)); // NOI18N
        categoryHeader.setForeground(new java.awt.Color(255, 255, 255));
        categoryHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryHeader.setText("Inventory Management System");

        javax.swing.GroupLayout categoryTopPanelLayout = new javax.swing.GroupLayout(categoryTopPanel);
        categoryTopPanel.setLayout(categoryTopPanelLayout);
        categoryTopPanelLayout.setHorizontalGroup(
            categoryTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryTopPanelLayout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addGroup(categoryTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryTopPanelLayout.createSequentialGroup()
                        .addComponent(categoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(489, 489, 489))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryTopPanelLayout.createSequentialGroup()
                        .addComponent(categoryHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))))
        );
        categoryTopPanelLayout.setVerticalGroup(
            categoryTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryTopPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(categoryHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryTitle)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        categoryBottomPanel.setBackground(new java.awt.Color(66, 68, 74));

        categoryCredits.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        categoryCredits.setForeground(new java.awt.Color(255, 255, 255));
        categoryCredits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryCredits.setText("Software by Patrick");

        categoryBrand.setFont(new java.awt.Font("OCR A Extended", 1, 28)); // NOI18N
        categoryBrand.setForeground(new java.awt.Color(255, 255, 255));
        categoryBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryBrand.setText("invSYS");

        javax.swing.GroupLayout categoryBottomPanelLayout = new javax.swing.GroupLayout(categoryBottomPanel);
        categoryBottomPanel.setLayout(categoryBottomPanelLayout);
        categoryBottomPanelLayout.setHorizontalGroup(
            categoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryBottomPanelLayout.createSequentialGroup()
                .addGroup(categoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryBottomPanelLayout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(categoryCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryBottomPanelLayout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(categoryBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        categoryBottomPanelLayout.setVerticalGroup(
            categoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryBottomPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(categoryBrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoryCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        categoryTable.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Category Name"
            }
        ));
        categoryTable.setRowHeight(25);
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        categoryTablePanel.setViewportView(categoryTable);

        categoryList.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        categoryList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryList.setText("Category List");

        categoryID.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        categoryID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryID.setText("Category ID");

        categoryName.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        categoryName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryName.setText("Category Name");

        categoryAddButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        categoryAddButton.setText("Add");
        categoryAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryAddButtonMouseClicked(evt);
            }
        });
        categoryAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryAddButtonActionPerformed(evt);
            }
        });

        categoryEditButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        categoryEditButton.setText("Edit");
        categoryEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryEditButtonMouseClicked(evt);
            }
        });
        categoryEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryEditButtonActionPerformed(evt);
            }
        });

        categoryDeleteButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        categoryDeleteButton.setText("Delete");
        categoryDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryDeleteButtonMouseClicked(evt);
            }
        });
        categoryDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDeleteButtonActionPerformed(evt);
            }
        });

        categoryMainMenuButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        categoryMainMenuButton.setText("Main Menu");
        categoryMainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryMainMenuButtonMouseClicked(evt);
            }
        });
        categoryMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryMainMenuButtonActionPerformed(evt);
            }
        });

        categoryIDField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        categoryIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIDFieldActionPerformed(evt);
            }
        });

        categoryNameField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        categoryNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryNameFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout categoryPanelLayout = new javax.swing.GroupLayout(categoryPanel);
        categoryPanel.setLayout(categoryPanelLayout);
        categoryPanelLayout.setHorizontalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(categoryBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(categoryPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(categoryAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(categoryEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(categoryDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(categoryMainMenuButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryPanelLayout.createSequentialGroup()
                        .addComponent(categoryTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryPanelLayout.createSequentialGroup()
                        .addComponent(categoryList, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
        );
        categoryPanelLayout.setVerticalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoryPanelLayout.createSequentialGroup()
                .addComponent(categoryTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoryList)
                .addGap(18, 18, 18)
                .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryPanelLayout.createSequentialGroup()
                        .addComponent(categoryTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(categoryPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(categoryMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addComponent(categoryBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(categoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categoryAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryAddButtonActionPerformed

    }//GEN-LAST:event_categoryAddButtonActionPerformed

    private void categoryEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryEditButtonActionPerformed

    }//GEN-LAST:event_categoryEditButtonActionPerformed

    private void categoryDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDeleteButtonActionPerformed

    }//GEN-LAST:event_categoryDeleteButtonActionPerformed

    private void categoryMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryMainMenuButtonActionPerformed

    }//GEN-LAST:event_categoryMainMenuButtonActionPerformed

    private void categoryIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIDFieldActionPerformed

    }//GEN-LAST:event_categoryIDFieldActionPerformed

    private void categoryNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryNameFieldActionPerformed

    }//GEN-LAST:event_categoryNameFieldActionPerformed

    private void categoryAddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryAddButtonMouseClicked
                try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
            PreparedStatement add = connection.prepareStatement("INSERT into CATEGORY VALUES (?, ?)");
            add.setInt(1, Integer.valueOf(categoryIDField.getText()));
            add.setString(2, categoryNameField.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Category sucessfully added.");
            connection.close();
            displayCategories();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_categoryAddButtonMouseClicked

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)categoryTable.getModel();
        int index = categoryTable.getSelectedRow();
        categoryIDField.setText(model.getValueAt(index, 0).toString());
        categoryNameField.setText(model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_categoryTableMouseClicked

    private void categoryDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryDeleteButtonMouseClicked
        if (categoryIDField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a category to be deleted.");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
                String id = categoryIDField.getText();
                String query = "DELETE from SA.CATEGORY where Category_ID = " + id;
                Statement add = connection.createStatement();
                add.executeUpdate(query);
                displayCategories();
                JOptionPane.showMessageDialog(this, "Category sucessfully deleted.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_categoryDeleteButtonMouseClicked

    private void categoryEditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryEditButtonMouseClicked
        if (categoryIDField.getText().isEmpty() || categoryNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information. Please fill out all required fields.");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
                String updateQuery = "UPDATE SA.CATEGORY SET Category_Name = '" + categoryNameField.getText() + "' WHERE Category_ID = " + categoryIDField.getText();
                Statement add = connection.createStatement();
                add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Category sucessfully modified.");
                displayCategories();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_categoryEditButtonMouseClicked

    private void categoryMainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryMainMenuButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoryMainMenuButtonMouseClicked
    
        public void displayCategories() {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
            statement = connection.createStatement();
            results = statement.executeQuery("SELECT * FROM CATEGORY");
            categoryTable.setModel(DbUtils.resultSetToTableModel(results));
        } catch (SQLException ex) {
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
                new Categories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoryAddButton;
    private javax.swing.JPanel categoryBottomPanel;
    private javax.swing.JLabel categoryBrand;
    private javax.swing.JLabel categoryCredits;
    private javax.swing.JButton categoryDeleteButton;
    private javax.swing.JButton categoryEditButton;
    private javax.swing.JLabel categoryHeader;
    private javax.swing.JLabel categoryID;
    private javax.swing.JTextField categoryIDField;
    private javax.swing.JLabel categoryList;
    private javax.swing.JButton categoryMainMenuButton;
    private javax.swing.JLabel categoryName;
    private javax.swing.JTextField categoryNameField;
    private javax.swing.JPanel categoryPanel;
    private javax.swing.JTable categoryTable;
    private javax.swing.JScrollPane categoryTablePanel;
    private javax.swing.JLabel categoryTitle;
    private javax.swing.JPanel categoryTopPanel;
    // End of variables declaration//GEN-END:variables
}