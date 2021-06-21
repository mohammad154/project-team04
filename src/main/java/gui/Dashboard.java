package gui;

import javax.swing.*;

import utils.GuiUtils;

public class Dashboard extends javax.swing.JFrame {

    private final JFrame MAIN_MENU_FRAME;

    public Dashboard(JFrame mainMenu, String username) {
        super("Sea Battle | Dashboard");

        this.MAIN_MENU_FRAME = mainMenu;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initListeners();
        WelcomeUserLabel.setText("Welcome " + username + " !");
    }

    private void initListeners() {
        initWindowListeners();
        initLogOutButtonListeners();
        initSinglePlayerButtonListener();
    }

    private void initSinglePlayerButtonListener() {
        SinglePlayerButton.addActionListener(
                e -> {
                    SinglePlayer singlePlayer = new SinglePlayer();
                    this.setVisible(false);
                    singlePlayer.setVisible(true);
                }
        );
    }

    private void initWindowListeners() {
        GuiUtils.addWindowClosingListener(this, e -> closeWindow());
    }

    private void initLogOutButtonListeners() {
        this.dispose();
        MAIN_MENU_FRAME.setVisible(true);
    }

    private void closeWindow() {
        this.dispose();
        MAIN_MENU_FRAME.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        WelcomeUserLabel = new javax.swing.JLabel();
        SinglePlayerButton = new javax.swing.JButton();
        MultiPlayerButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea Battle | Dashboard");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 204));
        jLabel1.setText("Dashboard");

        jPanel2.setBackground(new java.awt.Color(38, 61, 68));

        WelcomeUserLabel.setBackground(new java.awt.Color(38, 61, 68));
        WelcomeUserLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        WelcomeUserLabel.setForeground(new java.awt.Color(51, 255, 204));
        WelcomeUserLabel.setText("Welcome Username!");
        WelcomeUserLabel.setPreferredSize(new java.awt.Dimension(300, 100));

        SinglePlayerButton.setBackground(new java.awt.Color(0, 0, 0));
        SinglePlayerButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        SinglePlayerButton.setForeground(new java.awt.Color(51, 255, 204));
        SinglePlayerButton.setText("Single Player");
        SinglePlayerButton.setBorderPainted(false);
        SinglePlayerButton.setPreferredSize(new java.awt.Dimension(200, 100));

        MultiPlayerButton.setBackground(new java.awt.Color(0, 0, 0));
        MultiPlayerButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        MultiPlayerButton.setForeground(new java.awt.Color(51, 255, 204));
        MultiPlayerButton.setText("Multi Player");
        MultiPlayerButton.setToolTipText("");
        MultiPlayerButton.setBorderPainted(false);
        MultiPlayerButton.setPreferredSize(new java.awt.Dimension(200, 100));

        SettingsButton.setBackground(new java.awt.Color(0, 0, 0));
        SettingsButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        SettingsButton.setForeground(new java.awt.Color(51, 255, 204));
        SettingsButton.setText("Settings");
        SettingsButton.setBorderPainted(false);
        SettingsButton.setPreferredSize(new java.awt.Dimension(200, 100));

        LogOutButton.setBackground(new java.awt.Color(0, 0, 0));
        LogOutButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(51, 255, 204));
        LogOutButton.setText("Log out");
        LogOutButton.setBorderPainted(false);
        LogOutButton.setPreferredSize(new java.awt.Dimension(200, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(MultiPlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(SinglePlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(SettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(WelcomeUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(WelcomeUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(SinglePlayerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(MultiPlayerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LogOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton MultiPlayerButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton SinglePlayerButton;
    private javax.swing.JLabel WelcomeUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
