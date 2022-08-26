package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Larocque
 */

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet results = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginTopPanel = new javax.swing.JPanel();
        loginTitle = new javax.swing.JLabel();
        loginBottomPanel = new javax.swing.JPanel();
        loginCredits = new javax.swing.JLabel();
        loginLogo = new javax.swing.JLabel();
        loginPassword = new javax.swing.JLabel();
        loginID = new javax.swing.JLabel();
        loginIDField = new javax.swing.JTextField();
        loginIDIcon = new javax.swing.JLabel();
        loginClearButton = new javax.swing.JButton();
        loginLoginButton = new javax.swing.JButton();
        loginPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTopPanel.setBackground(new java.awt.Color(66, 68, 74));

        loginTitle.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(255, 255, 255));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("invSYS");

        javax.swing.GroupLayout loginTopPanelLayout = new javax.swing.GroupLayout(loginTopPanel);
        loginTopPanel.setLayout(loginTopPanelLayout);
        loginTopPanelLayout.setHorizontalGroup(
            loginTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginTopPanelLayout.setVerticalGroup(
            loginTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginTopPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        loginBottomPanel.setBackground(new java.awt.Color(66, 68, 74));

        loginCredits.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        loginCredits.setForeground(new java.awt.Color(255, 255, 255));
        loginCredits.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginCredits.setText("Software by Patrick");

        javax.swing.GroupLayout loginBottomPanelLayout = new javax.swing.GroupLayout(loginBottomPanel);
        loginBottomPanel.setLayout(loginBottomPanelLayout);
        loginBottomPanelLayout.setHorizontalGroup(
            loginBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginCredits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginBottomPanelLayout.setVerticalGroup(
            loginBottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBottomPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(loginCredits)
                .addGap(25, 25, 25))
        );

        loginLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/Assets/warehouse.png"))); // NOI18N

        loginPassword.setBackground(new java.awt.Color(255, 255, 255));
        loginPassword.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        loginPassword.setForeground(new java.awt.Color(66, 68, 74));
        loginPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginPassword.setText("Password");

        loginID.setBackground(new java.awt.Color(255, 255, 255));
        loginID.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        loginID.setForeground(new java.awt.Color(66, 68, 74));
        loginID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginID.setText("ID");

        loginIDField.setFont(new java.awt.Font("Cascadia Code", 0, 16)); // NOI18N
        loginIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginIDFieldActionPerformed(evt);
            }
        });

        loginIDIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginIDIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/Assets/user.png"))); // NOI18N

        loginClearButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        loginClearButton.setText("Clear");
        loginClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginClearButtonMouseClicked(evt);
            }
        });

        loginLoginButton.setFont(new java.awt.Font("Cascadia Code", 1, 14)); // NOI18N
        loginLoginButton.setText("Login");
        loginLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLoginButtonMouseClicked(evt);
            }
        });
        loginLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginLoginButtonActionPerformed(evt);
            }
        });

        loginPasswordField.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loginBottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginIDIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginPassword)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(loginPasswordField)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(loginClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(loginLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginIDField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(loginBottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginIDIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginLoginButtonActionPerformed

    }//GEN-LAST:event_loginLoginButtonActionPerformed

    private void loginLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLoginButtonMouseClicked
        if (loginIDField.getText().isEmpty() || loginPasswordField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information. Please enter valid a valid username and password to login.");
        } else {
            String query = "SELECT * FROM SA.USERS WHERE User_Name = '" + loginIDField.getText() + "' AND User_Password = '" + loginPasswordField.getText() + "'";
                try {
                    connection = DriverManager.getConnection("jdbc:derby://localhost:1527/InventoryDB", "sa", "admin");
                    statement = connection.createStatement();
                    results = statement.executeQuery(query);
                    if (results.next()) {
                        new MainMenu().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect username or password.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
            }   
        }
    }//GEN-LAST:event_loginLoginButtonMouseClicked

    private void loginIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginIDFieldActionPerformed

    private void loginClearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginClearButtonMouseClicked
        loginIDField.setText("");
        loginPasswordField.setText("");
    }//GEN-LAST:event_loginClearButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel loginBottomPanel;
    private javax.swing.JButton loginClearButton;
    private javax.swing.JLabel loginCredits;
    private javax.swing.JLabel loginID;
    private javax.swing.JTextField loginIDField;
    private javax.swing.JLabel loginIDIcon;
    private javax.swing.JButton loginLoginButton;
    private javax.swing.JLabel loginLogo;
    private javax.swing.JLabel loginPassword;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JPanel loginTopPanel;
    // End of variables declaration//GEN-END:variables
}