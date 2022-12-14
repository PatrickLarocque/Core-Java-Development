package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Patrick Larocque
 */
public class OrderHistory extends javax.swing.JFrame {

    /**
     * Creates new form OrderHistory
     */
    public OrderHistory() {
        initComponents();
        displayOrderHistory();
    }
    
    Connection connection = null;
    Statement statement = null;
    ResultSet results = null;
    
    public void displayOrderHistory() {
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
            statement = connection.createStatement();
            results = statement.executeQuery("SELECT * FROM ORDERS");
            orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderHistoryPanel = new javax.swing.JPanel();
        orderHistoryTopPanel = new javax.swing.JPanel();
        orderHistoryTitle = new javax.swing.JLabel();
        orderHistoryHeader = new javax.swing.JLabel();
        orderHistoryBottomPanel = new javax.swing.JPanel();
        orderHistoryCredits = new javax.swing.JLabel();
        orderHistoryBrand = new javax.swing.JLabel();
        orderHistoryOrdersButton = new javax.swing.JButton();
        orderHistoryMainMenuButton = new javax.swing.JButton();
        orderHistoryID = new javax.swing.JLabel();
        orderOrderHistory = new javax.swing.JLabel();
        orderHistoryCustomerName = new javax.swing.JLabel();
        orderHistoryProductName = new javax.swing.JLabel();
        orderHistoryTablePanel = new javax.swing.JScrollPane();
        orderHistoryTable = new javax.swing.JTable();
        orderHistoryOrderIDField = new javax.swing.JTextField();
        orderHistoryProductNameField = new javax.swing.JTextField();
        orderHistoryCustomerNameField = new javax.swing.JTextField();
        orderHistorySearchButton = new javax.swing.JButton();
        orderHistoryClearButton = new javax.swing.JButton();
        orderHistoryDeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderHistoryTopPanel.setBackground(new java.awt.Color(66, 68, 74));

        orderHistoryTitle.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        orderHistoryTitle.setForeground(new java.awt.Color(255, 255, 255));
        orderHistoryTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistoryTitle.setText("Order History");

        orderHistoryHeader.setFont(new java.awt.Font("OCR A Extended", 1, 30)); // NOI18N
        orderHistoryHeader.setForeground(new java.awt.Color(255, 255, 255));
        orderHistoryHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistoryHeader.setText("Inventory Management System");

        javax.swing.GroupLayout orderHistoryTopPanelLayout = new javax.swing.GroupLayout(orderHistoryTopPanel);
        orderHistoryTopPanel.setLayout(orderHistoryTopPanelLayout);
        orderHistoryTopPanelLayout.setHorizontalGroup(
            orderHistoryTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHistoryTopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orderHistoryTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderHistoryTopPanelLayout.createSequentialGroup()
                        .addComponent(orderHistoryHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderHistoryTopPanelLayout.createSequentialGroup()
                        .addComponent(orderHistoryTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(538, 538, 538))))
        );
        orderHistoryTopPanelLayout.setVerticalGroup(
            orderHistoryTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHistoryTopPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(orderHistoryHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderHistoryTitle)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        orderHistoryBottomPanel.setBackground(new java.awt.Color(66, 68, 74));

        orderHistoryCredits.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        orderHistoryCredits.setForeground(new java.awt.Color(255, 255, 255));
        orderHistoryCredits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistoryCredits.setText("Software by Patrick");

        orderHistoryBrand.setFont(new java.awt.Font("OCR A Extended", 1, 28)); // NOI18N
        orderHistoryBrand.setForeground(new java.awt.Color(255, 255, 255));
        orderHistoryBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistoryBrand.setText("invSYS");

        orderHistoryOrdersButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        orderHistoryOrdersButton.setText("Orders");
        orderHistoryOrdersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistoryOrdersButtonMouseClicked(evt);
            }
        });

        orderHistoryMainMenuButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        orderHistoryMainMenuButton.setText("Main Menu");
        orderHistoryMainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistoryMainMenuButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout orderHistoryBottomPanelLayout = new javax.swing.GroupLayout(orderHistoryBottomPanel);
        orderHistoryBottomPanel.setLayout(orderHistoryBottomPanelLayout);
        orderHistoryBottomPanelLayout.setHorizontalGroup(
            orderHistoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHistoryBottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orderHistoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderHistoryBottomPanelLayout.createSequentialGroup()
                        .addComponent(orderHistoryBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderHistoryBottomPanelLayout.createSequentialGroup()
                        .addComponent(orderHistoryCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)))
                .addComponent(orderHistoryOrdersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderHistoryMainMenuButton)
                .addGap(42, 42, 42))
        );
        orderHistoryBottomPanelLayout.setVerticalGroup(
            orderHistoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderHistoryBottomPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(orderHistoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(orderHistoryBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(orderHistoryOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orderHistoryMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orderHistoryBottomPanelLayout.createSequentialGroup()
                        .addComponent(orderHistoryBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderHistoryCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        orderHistoryID.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        orderHistoryID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistoryID.setText("Order_ID");

        orderOrderHistory.setFont(new java.awt.Font("Cascadia Code", 1, 20)); // NOI18N
        orderOrderHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderOrderHistory.setText("Order History");

        orderHistoryCustomerName.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        orderHistoryCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistoryCustomerName.setText("Customer Name");

        orderHistoryProductName.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        orderHistoryProductName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderHistoryProductName.setText("Product Name");

        orderHistoryTable.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        orderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product", "Quantity", "Customer", "Price", "Total", "Date"
            }
        ));
        orderHistoryTable.setRowHeight(25);
        orderHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistoryTableMouseClicked(evt);
            }
        });
        orderHistoryTablePanel.setViewportView(orderHistoryTable);
        if (orderHistoryTable.getColumnModel().getColumnCount() > 0) {
            orderHistoryTable.getColumnModel().getColumn(0).setMinWidth(70);
            orderHistoryTable.getColumnModel().getColumn(0).setMaxWidth(70);
            orderHistoryTable.getColumnModel().getColumn(2).setMinWidth(70);
            orderHistoryTable.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        orderHistoryOrderIDField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        orderHistoryProductNameField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        orderHistoryCustomerNameField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N

        orderHistorySearchButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        orderHistorySearchButton.setText("Search");
        orderHistorySearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistorySearchButtonMouseClicked(evt);
            }
        });

        orderHistoryClearButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        orderHistoryClearButton.setText("Clear");
        orderHistoryClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistoryClearButtonMouseClicked(evt);
            }
        });

        orderHistoryDeleteButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        orderHistoryDeleteButton.setText("Delete");
        orderHistoryDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistoryDeleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout orderHistoryPanelLayout = new javax.swing.GroupLayout(orderHistoryPanel);
        orderHistoryPanel.setLayout(orderHistoryPanelLayout);
        orderHistoryPanelLayout.setHorizontalGroup(
            orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderHistoryTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(orderHistoryBottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                        .addComponent(orderHistoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderHistoryOrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                        .addComponent(orderHistoryProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderHistoryProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orderHistoryPanelLayout.createSequentialGroup()
                        .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orderHistoryPanelLayout.createSequentialGroup()
                                .addComponent(orderHistorySearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orderHistoryClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orderHistoryDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orderHistoryPanelLayout.createSequentialGroup()
                                .addComponent(orderHistoryCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(orderHistoryCustomerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272))
                    .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(orderHistoryTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        orderHistoryPanelLayout.setVerticalGroup(
            orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                .addComponent(orderHistoryTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderOrderHistory)
                .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderHistoryTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(orderHistoryPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderHistoryOrderIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderHistoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderHistoryCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderHistoryCustomerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderHistoryProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderHistoryProductNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(orderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderHistorySearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderHistoryClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderHistoryDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)))
                .addComponent(orderHistoryBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderHistoryOrdersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistoryOrdersButtonMouseClicked
        new Order().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderHistoryOrdersButtonMouseClicked

    private void orderHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistoryTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)orderHistoryTable.getModel();
        int index = orderHistoryTable.getSelectedRow();
        orderHistoryOrderIDField.setText(model.getValueAt(index, 0).toString());
        orderHistoryCustomerNameField.setText(model.getValueAt(index, 3).toString());
        orderHistoryProductNameField.setText(model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_orderHistoryTableMouseClicked

    private void orderHistoryMainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistoryMainMenuButtonMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_orderHistoryMainMenuButtonMouseClicked


    private void orderHistorySearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistorySearchButtonMouseClicked
        if (orderHistoryOrderIDField.getText().isEmpty() && orderHistoryCustomerNameField.getText().isEmpty() && orderHistoryProductNameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter either an order ID, a product name or a customer name to search");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
                statement = connection.createStatement();
                if (!orderHistoryOrderIDField.getText().isEmpty()) {
                    if (orderHistoryOrderIDField.getText().equalsIgnoreCase("all")) {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS");
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    } else {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS WHERE Order_ID = " + orderHistoryOrderIDField.getText());
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    }
                }
                if (!orderHistoryCustomerNameField.getText().isEmpty() && orderHistoryOrderIDField.getText().isEmpty() && orderHistoryProductNameField.getText().isEmpty()) {
                    if (orderHistoryCustomerNameField.getText().equalsIgnoreCase("all")) {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS");
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    } else {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS WHERE UPPER(Customer_Name) LIKE UPPER('%" + orderHistoryCustomerNameField.getText() + "%')");
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    }
                }
                if (!orderHistoryProductNameField.getText().isEmpty() && orderHistoryOrderIDField.getText().isEmpty() && orderHistoryCustomerNameField.getText().isEmpty()) {
                    if (orderHistoryProductNameField.getText().equalsIgnoreCase("all")) {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS");
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    } else {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS WHERE UPPER(Product_Name) LIKE UPPER('%" + orderHistoryProductNameField.getText() + "%')");
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    }
                }
                if (!orderHistoryProductNameField.getText().isEmpty() && !orderHistoryCustomerNameField.getText().isEmpty()) {
                    if (orderHistoryProductNameField.getText().equalsIgnoreCase("all") || orderHistoryCustomerNameField.getText().equalsIgnoreCase("all")) {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS");
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    } else {
                    results = statement.executeQuery("SELECT * FROM SA.ORDERS WHERE UPPER(Product_Name) LIKE UPPER('%" + orderHistoryProductNameField.getText() + "%') UNION "
                            + "SELECT * FROM SA.ORDERS WHERE UPPER(Customer_Name) LIKE UPPER('%" + orderHistoryCustomerNameField.getText() + "%')");
                    orderHistoryTable.setModel(DbUtils.resultSetToTableModel(results));                        
                    }
                }
                connection.close();
                if (orderHistoryTable.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "No results.");    
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_orderHistorySearchButtonMouseClicked

    private void orderHistoryClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistoryClearButtonMouseClicked
        orderHistoryOrderIDField.setText("");
        orderHistoryCustomerNameField.setText("");
        orderHistoryProductNameField.setText("");
        DefaultTableModel model = (DefaultTableModel) orderHistoryTable.getModel();
        model.setRowCount(0);
        displayOrderHistory();
    }//GEN-LAST:event_orderHistoryClearButtonMouseClicked

    private void orderHistoryDeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistoryDeleteButtonMouseClicked
        if (orderHistoryOrderIDField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter an order ID to be deleted.");
        } else {
            try {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
                String id = orderHistoryOrderIDField.getText();
                String query = "DELETE from SA.ORDERS where Order_ID = " + id;
                Statement add = connection.createStatement();
                add.executeUpdate(query);
                displayOrderHistory();
                JOptionPane.showMessageDialog(this, "Order sucessfully deleted.");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_orderHistoryDeleteButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel orderHistoryBottomPanel;
    private javax.swing.JLabel orderHistoryBrand;
    private javax.swing.JButton orderHistoryClearButton;
    private javax.swing.JLabel orderHistoryCredits;
    private javax.swing.JLabel orderHistoryCustomerName;
    private javax.swing.JTextField orderHistoryCustomerNameField;
    private javax.swing.JButton orderHistoryDeleteButton;
    private javax.swing.JLabel orderHistoryHeader;
    private javax.swing.JLabel orderHistoryID;
    private javax.swing.JButton orderHistoryMainMenuButton;
    private javax.swing.JTextField orderHistoryOrderIDField;
    private javax.swing.JButton orderHistoryOrdersButton;
    private javax.swing.JPanel orderHistoryPanel;
    private javax.swing.JLabel orderHistoryProductName;
    private javax.swing.JTextField orderHistoryProductNameField;
    private javax.swing.JButton orderHistorySearchButton;
    private javax.swing.JTable orderHistoryTable;
    private javax.swing.JScrollPane orderHistoryTablePanel;
    private javax.swing.JLabel orderHistoryTitle;
    private javax.swing.JPanel orderHistoryTopPanel;
    private javax.swing.JLabel orderOrderHistory;
    // End of variables declaration//GEN-END:variables
}
