package gui;

public class PauseMenu extends javax.swing.JFrame {

    public PauseMenu() {
        initComponents();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PauseMenu().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ResumeButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        GoToDashboardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea Battle | Pause Menu");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(38, 61, 68));

        ResumeButton.setBackground(new java.awt.Color(0, 0, 0));
        ResumeButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        ResumeButton.setForeground(new java.awt.Color(51, 255, 204));
        ResumeButton.setText("Resume");
        ResumeButton.setBorderPainted(false);
        ResumeButton.setPreferredSize(new java.awt.Dimension(300, 100));

        SettingsButton.setBackground(new java.awt.Color(0, 0, 0));
        SettingsButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        SettingsButton.setForeground(new java.awt.Color(51, 255, 204));
        SettingsButton.setText("Settings");
        SettingsButton.setBorderPainted(false);
        SettingsButton.setPreferredSize(new java.awt.Dimension(300, 100));

        GoToDashboardButton.setBackground(new java.awt.Color(0, 0, 0));
        GoToDashboardButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        GoToDashboardButton.setForeground(new java.awt.Color(51, 255, 204));
        GoToDashboardButton.setText("Go to Dashboard");
        GoToDashboardButton.setBorderPainted(false);
        GoToDashboardButton.setPreferredSize(new java.awt.Dimension(300, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(GoToDashboardButton, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                        .addComponent(SettingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ResumeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ResumeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(SettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(GoToDashboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GoToDashboardButton;
    private javax.swing.JButton ResumeButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
