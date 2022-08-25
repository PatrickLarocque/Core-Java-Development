package inventorymanagementsystem;

/**
 *
 * @author Patrick Larocque
 */
public class Splash extends javax.swing.JFrame {

    public Splash() {
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

        splashPanel = new javax.swing.JPanel();
        splashProgressBar = new javax.swing.JProgressBar();
        splashTitle = new javax.swing.JLabel();
        splashName = new javax.swing.JLabel();
        splashProgress = new javax.swing.JLabel();
        splashLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        splashProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        splashProgressBar.setFont(splashProgressBar.getFont());
        splashProgressBar.setForeground(new java.awt.Color(0, 102, 255));
        splashProgressBar.setBorder(null);

        splashTitle.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        splashTitle.setForeground(new java.awt.Color(0, 102, 255));
        splashTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        splashTitle.setText("invSYS");

        splashName.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        splashName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        splashName.setText("Inventory Management System");

        splashProgress.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        splashProgress.setText("%");

        splashLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/Assets/inventory.png"))); // NOI18N

        javax.swing.GroupLayout splashPanelLayout = new javax.swing.GroupLayout(splashPanel);
        splashPanel.setLayout(splashPanelLayout);
        splashPanelLayout.setHorizontalGroup(
            splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashPanelLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashPanelLayout.createSequentialGroup()
                        .addGroup(splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(splashTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, splashPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(splashLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(491, 491, 491))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashPanelLayout.createSequentialGroup()
                        .addComponent(splashProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))))
            .addGroup(splashPanelLayout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(splashProgress)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        splashPanelLayout.setVerticalGroup(
            splashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splashPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(splashName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(splashLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splashTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(splashProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splashProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splashPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Create and display the form */
        Splash splash = new Splash();
        splash.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(25);
                splash.splashProgressBar.setValue(i);
                splash.splashProgress.setText(Integer.valueOf(i) + "%");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        new Login().setVisible(true);
        splash.dispose();           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel splashLogo;
    private javax.swing.JLabel splashName;
    private javax.swing.JPanel splashPanel;
    private javax.swing.JLabel splashProgress;
    private javax.swing.JProgressBar splashProgressBar;
    private javax.swing.JLabel splashTitle;
    // End of variables declaration//GEN-END:variables
}