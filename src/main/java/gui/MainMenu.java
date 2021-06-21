package gui;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainMenu extends javax.swing.JFrame {
    public MainMenu() {
        super("Sea Battle | Main Menu");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        initComponents();
        initListeners();
    }

    private void initListeners() {
        initRegisterButtonListeners();
        initLoginButtonListeners();
        initExitButtonListeners();
        initSettingsButtonListeners();
    }

    private void initRegisterButtonListeners() {
        RegisterButton.addActionListener(
                e -> {
                    RegisterMenu registerMenu = new RegisterMenu(this);
                    this.setVisible(false);
                    registerMenu.setVisible(true);
                }
        );
    }

    private void initLoginButtonListeners() {
        LoginButton.addActionListener(
                e -> {
                    LoginMenu loginMenu = new LoginMenu(this);
                    this.setVisible(false);
                    loginMenu.setVisible(true);
                }
        );
    }

    private void initExitButtonListeners() {
        this.dispose();
    }

    private void initSettingsButtonListeners() {
        SettingsButton.addActionListener(
                e -> {
                    Settings settings = new Settings(this);
                    this.setVisible(false);
                    settings.setVisible(true);
                }
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BottumPanel = new javax.swing.JPanel();
        RegisterButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        TopPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea Battle | Main Menu");
        setResizable(false);

        BottumPanel.setBackground(new java.awt.Color(38, 61, 68));

        RegisterButton.setBackground(new java.awt.Color(0, 0, 0));
        RegisterButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("Register");
        RegisterButton.setBorderPainted(false);
        RegisterButton.setFocusable(false);
        RegisterButton.setPreferredSize(new java.awt.Dimension(200, 100));
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(0, 0, 0));
        LoginButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setBorderPainted(false);
        LoginButton.setFocusable(false);
        LoginButton.setPreferredSize(new java.awt.Dimension(200, 100));

        SettingsButton.setBackground(new java.awt.Color(0, 0, 0));
        SettingsButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        SettingsButton.setForeground(new java.awt.Color(255, 255, 255));
        SettingsButton.setText("Settings");
        SettingsButton.setBorderPainted(false);
        SettingsButton.setFocusable(false);
        SettingsButton.setPreferredSize(new java.awt.Dimension(200, 100));

        ExitButton.setBackground(new java.awt.Color(0, 0, 0));
        ExitButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.setBorderPainted(false);
        ExitButton.setFocusable(false);
        ExitButton.setPreferredSize(new java.awt.Dimension(200, 100));

        TopPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\arastoo\\Pictures\\NavalBattle\\logo.jpg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 100));

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
                TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopPanelLayout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TopPanelLayout.setVerticalGroup(
                TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TopPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\arastoo\\Pictures\\NavalBattle\\05.jpg")); // NOI18N

        javax.swing.GroupLayout BottumPanelLayout = new javax.swing.GroupLayout(BottumPanel);
        BottumPanel.setLayout(BottumPanelLayout);
        BottumPanelLayout.setHorizontalGroup(
                BottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BottumPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(BottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RegisterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LoginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                        .addComponent(TopPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BottumPanelLayout.setVerticalGroup(
                BottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BottumPanelLayout.createSequentialGroup()
                                .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17)
                                .addGroup(BottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(BottumPanelLayout.createSequentialGroup()
                                                .addGroup(BottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(BottumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BottumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BottumPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed

    }//GEN-LAST:event_RegisterButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottumPanel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
