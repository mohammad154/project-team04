package gui;

import javax.swing.*;

import utils.GuiUtils;

public class Settings extends javax.swing.JFrame {
    private final JFrame MAIN_MENU_FRAME;

    public Settings(JFrame mainMenuFrame) {
        super("Sea Battle | Login Menu");

        this.MAIN_MENU_FRAME = mainMenuFrame;

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        initListeners();
        initComponents();
    }

    private void initListeners() {
        initWindowListeners();
        initGoBackToMainMenuButtonListeners();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Theme01Button = new javax.swing.JButton();
        Theme02Button = new javax.swing.JButton();
        Theme03Button = new javax.swing.JButton();
        GoBackToMainMenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea Battle | Main Settings");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\arastoo\\Pictures\\NavalBattle\\logo.jpg")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(38, 61, 68));

        jLabel2.setBackground(new java.awt.Color(38, 61, 68));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Theme : ");

        Theme01Button.setBackground(new java.awt.Color(0, 0, 0));
        Theme01Button.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        Theme01Button.setForeground(new java.awt.Color(51, 255, 204));
        Theme01Button.setText("Theme01");
        Theme01Button.setBorderPainted(false);

        Theme02Button.setBackground(new java.awt.Color(0, 0, 0));
        Theme02Button.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        Theme02Button.setForeground(new java.awt.Color(51, 255, 204));
        Theme02Button.setText("Theme02");
        Theme02Button.setBorderPainted(false);

        Theme03Button.setBackground(new java.awt.Color(0, 0, 0));
        Theme03Button.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        Theme03Button.setForeground(new java.awt.Color(51, 255, 204));
        Theme03Button.setText("Theme03");
        Theme03Button.setBorderPainted(false);

        GoBackToMainMenuButton.setBackground(new java.awt.Color(0, 0, 0));
        GoBackToMainMenuButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        GoBackToMainMenuButton.setForeground(new java.awt.Color(51, 255, 204));
        GoBackToMainMenuButton.setText("Go Back to Main Menu");
        GoBackToMainMenuButton.setBorderPainted(false);
        GoBackToMainMenuButton.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/04.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Theme01Button)
                                .addGap(26, 26, 26)
                                .addComponent(Theme02Button)
                                .addGap(27, 27, 27)
                                .addComponent(Theme03Button)
                                .addContainerGap(85, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(GoBackToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(93, 93, 93))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(158, 158, 158))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Theme01Button)
                                        .addComponent(Theme02Button)
                                        .addComponent(Theme03Button))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GoBackToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void initGoBackToMainMenuButtonListeners() {
        GoBackToMainMenuButton.addActionListener(e -> closeWindow());
    }

    private void closeWindow() {
        this.dispose();
        MAIN_MENU_FRAME.setVisible(true);
    }

    private void initWindowListeners() {
        GuiUtils.addWindowClosingListener(this, e -> closeWindow());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GoBackToMainMenuButton;
    private javax.swing.JButton Theme01Button;
    private javax.swing.JButton Theme02Button;
    private javax.swing.JButton Theme03Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
