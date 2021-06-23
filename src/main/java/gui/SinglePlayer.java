package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.*;

public class SinglePlayer extends javax.swing.JFrame {

    JLabel example;
    JPanel[] panel = new JPanel[100];
    int p = 0;
    JLayeredPane layeredPane = new JLayeredPane();
    JLabel[][] label = new JLabel[10][10];
    final JLabel[][] label2 = new JLabel[10][10];
    Random rand = new Random();

    public SinglePlayer() {
        LabelCreator();
        LabelCreator2();
        addTables();
        initComponents();
    }

    private void setOpo() {
        int i;
        int j;
        int g;
        int c = 0;
        int f = 0;
        for (int k = 0; k <= 3; k++) {
            c = 0;
            while (c == 0) {
                i = rand.nextInt(10);
                j = rand.nextInt(10);
                if (label2[i][j].getBackground() != Color.red) {
                    label2[i][j].setBackground(Color.red);
                    c++;
                }
            }
        }
        for (int k = 0; k <= 2; k++) {
            c = 0;
            while (c == 0) {
                f = 0;
                g = rand.nextInt(2);
                if (g == 0) {
                    i = rand.nextInt(10);
                    j = rand.nextInt(9) + 1;
                    for (int l = j - 1; l <= j; l++) {
                        if (label2[i][l].getBackground() == Color.red) {
                            f++;
                        }
                    }
                    if (f == 0) {
                        for (int l = j - 1; l <= j; l++) {
                            label2[i][l].setBackground(Color.red);
                            c++;
                        }
                    }
                } else {
                    i = rand.nextInt(9);
                    j = rand.nextInt(10);
                    for (int l = i; l <= i + 1; l++) {
                        if (label2[l][j].getBackground() == Color.red) {
                            f++;
                        }
                    }
                    if (f == 0) {
                        for (int l = i; l <= i + 1; l++) {
                            label2[l][j].setBackground(Color.red);
                            c++;
                        }
                    }
                }
            }
        }
        for (int k = 0; k <= 1; k++) {
            c = 0;
            while (c == 0) {
                f = 0;
                g = rand.nextInt(2);
                if (g == 0) {
                    i = rand.nextInt(10);
                    j = rand.nextInt(8) + 2;
                    for (int l = j - 2; l <= j; l++) {
                        if (label2[i][l].getBackground() == Color.red) {
                            f++;
                        }
                    }
                    if (f == 0) {
                        for (int l = j - 2; l <= j; l++) {
                            label2[i][l].setBackground(Color.red);
                            c++;
                        }
                    }
                } else {
                    i = rand.nextInt(8);
                    j = rand.nextInt(10);
                    for (int l = i; l <= i + 2; l++) {
                        if (label2[l][j].getBackground() == Color.red) {
                            f++;
                        }
                    }
                    if (f == 0) {
                        for (int l = i; l <= i + 2; l++) {
                            label2[l][j].setBackground(Color.red);
                            c++;
                        }
                    }
                }
            }
        }
        c = 0;
        while (c == 0) {
            f = 0;
            g = rand.nextInt(2);
            if (g == 0) {
                i = rand.nextInt(10);
                j = rand.nextInt(7) + 3;
                for (int k = j - 3; k <= j; k++) {
                    if (label2[i][k].getBackground() == Color.red) {
                        f++;
                    }
                }
                if (f == 0) {
                    for (int k = j - 3; k <= j; k++) {
                        label2[i][k].setBackground(Color.red);
                        c++;
                    }
                }
            } else {
                i = rand.nextInt(7);
                j = rand.nextInt(10);
                for (int k = i; k <= i + 3; k++) {
                    if (label2[k][j].getBackground() != Color.red) {
                        f++;
                    }
                }
                if (f == 0) {
                    for (int k = i; k <= i + 3; k++) {
                        label2[k][j].setBackground(Color.red);
                        c++;
                    }
                }
            }
        }
        StartButton.setEnabled(false);
    }

    private void addTables() {
        ImageIcon ocean = new ImageIcon(new ImageIcon("oceangrid.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        ImageIcon radar = new ImageIcon(new ImageIcon("radargrid.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        JLabel oceanGrid = new JLabel();
        JLabel radarGrid = new JLabel();
        oceanGrid.setBounds(40, 160, 200, 200);
        radarGrid.setBounds(280, 160, 200, 200);
        oceanGrid.setIcon(ocean);
        radarGrid.setIcon(radar);
        this.add(oceanGrid);
        this.add(radarGrid);
    }

    private void LabelCreator() {
        int x = 40;
        int y = 160;

        for (int i = 0; i < label.length; i++) {
            for (int j = 0; j < label.length; j++) {
                label[i][j] = new JLabel();
                label[i][j].setBounds(x, y, 20, 20);
                label[i][j].setForeground(Color.green);
                this.add(label[i][j]);
                x += 20;
            }
            y += 20;
            x = 40;
        }
    }

    private void D4Action() {
        int n = 0;
        int i = Integer.valueOf(D4r.getText());
        int j = Integer.valueOf(D4c.getText());
        if (i >= 0 && i < 10 && j >= 0 && j < 10) {
            for (int k = i - 1; k < i + 1; k++) {
                for (int l = j - 1; l <= j + 1; l++) {
                    if (k != 10 && k != -1 && l != 10 && l != -1) {
                        if (label[k][l].getText() != "") {
                            n++;
                        }
                    }
                }
            }
            if (n == 0) {
                label[i][j].setText("D4");
                D4Button.setEnabled(false);
            } else {
                D4r.setText("Try");
                D4c.setText("again");
            }
        } else {
            D4r.setText("Try");
            D4c.setText("again");
        }
    }

    private void D3Action() {
        int n = 0;
        int i = Integer.valueOf(D3r.getText());
        int j = Integer.valueOf(D3c.getText());
        if (i >= 0 && i < 10 && j >= 0 && j < 10) {
            for (int k = i - 1; k < i + 1; k++) {
                for (int l = j - 1; l <= j + 1; l++) {
                    if (k != 10 && k != -1 && l != 10 && l != -1) {
                        if (label[k][l].getText() != "") {
                            n++;
                        }
                    }
                }
                if (n == 0) {
                    label[i][j].setText("D3");
                    D3Button.setEnabled(false);
                } else {
                    D3r.setText("Try");
                    D3c.setText("again");
                }
            }
        } else {
            D3r.setText("Try");
            D3c.setText("again");
        }
    }

    private void D2Action() {
        int n = 0;
        int i = Integer.valueOf(D2r.getText());
        int j = Integer.valueOf(D2c.getText());
        if (i >= 0 && i < 10 && j >= 0 && j < 10) {
            for (int k = i - 1; k < i + 1; k++) {
                for (int l = j - 1; l <= j + 1; l++) {
                    if (k != 10 && k != -1 && l != 10 && l != -1) {
                        if (label[k][l].getText() != "") {
                            n++;
                        }
                    }
                }
            }
            if (n == 0) {
                label[i][j].setText("D2");
                D2Button.setEnabled(false);
            } else {
                D2r.setText("Try");
                D2c.setText("again");
            }
        } else {
            D2r.setText("Try");
            D2c.setText("again");
        }
    }

    private void D1Action() {
        int n = 0;
        int i = Integer.valueOf(D1r.getText());
        int j = Integer.valueOf(D1c.getText());
        if (i >= 0 && i < 10 && j >= 0 && j < 10) {
            for (int k = i - 1; k < i + 1; k++) {
                for (int l = j - 1; l <= j + 1; l++) {
                    if (k != 10 && k != -1 && l != 10 && l != -1) {
                        if (label[k][l].getText() != "") {
                            n++;
                        }
                    }
                }
            }
            if (n == 0) {
                label[i][j].setText("D1");
                D1Button.setEnabled(false);
            } else {
                D1r.setText("Try");
                D1c.setText("again");
            }
        } else {
            D1r.setText("Try");
            D1c.setText("again");
        }
    }

    private void C3Action() {
        int n = 0;
        int i = Integer.valueOf(C3r.getText());
        int j = Integer.valueOf(C3c.getText());
        if (C3Combo.getSelectedItem() == "Amudi") {
            if (i <= 8 && i >= 0 && j <= 9 && j >= 0) {
                for (int k = i + 1; k >= i; k--) {
                    if (label[k][j].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = i + 1; k >= i; k--) {
                        label[k][j].setText("C3");
                    }
                    C3Button.setEnabled(false);
                } else {
                    C3r.setText("Try");
                    C3c.setText("again");
                }
            } else {
                C3r.setText("Try");
                C3c.setText("again");
            }
        } else if (C3Combo.getSelectedItem() == "Ofoqi") {
            if (j <= 9 && j >= 1 && i <= 9 && i >= 0) {
                for (int k = j - 1; k <= j; k++) {
                    if (label[i][k].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = j - 1; k <= j; k++) {
                        label[i][k].setText("C3");
                    }
                    C3Button.setEnabled(false);
                } else {
                    C3r.setText("Try");
                    C3c.setText("again");
                }
            } else {
                C3r.setText("Try");
                C3c.setText("again");
            }
        }
    }

    private void C2Action() {
        int n = 0;
        int i = Integer.valueOf(C2r.getText());
        int j = Integer.valueOf(C2c.getText());
        if (C2Combo.getSelectedItem() == "Amudi") {
            if (i <= 8 && i >= 0 && j <= 9 && j >= 0) {
                for (int k = i + 1; k >= i; k--) {
                    if (label[k][j].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = i + 1; k >= i; k--) {
                        label[k][j].setText("C2");
                    }
                    C2Button.setEnabled(false);
                } else {
                    C2r.setText("Try");
                    C2c.setText("again");
                }
            } else {
                C2r.setText("Try");
                C2c.setText("again");
            }
        } else if (C2Combo.getSelectedItem() == "Ofoqi") {
            if (j <= 9 && j >= 1 && i <= 9 && i >= 0) {
                for (int k = j - 1; k <= j; k++) {
                    if (label[i][k].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = j - 1; k <= j; k++) {
                        label[i][k].setText("C2");
                    }
                    C2Button.setEnabled(false);
                } else {
                    C2r.setText("Try");
                    C2c.setText("again");
                }
            } else {
                C2r.setText("Try");
                C2c.setText("again");
            }
        }
    }

    private void C1Action() {
        int n = 0;
        int i = Integer.valueOf(C1r.getText());
        int j = Integer.valueOf(C1c.getText());
        if (C1Combo.getSelectedItem() == "Amudi") {
            if (i <= 8 && i >= 0 && j <= 9 && j >= 0) {
                for (int k = i + 1; k >= i; k--) {
                    if (label[k][j].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = i + 1; k >= i; k--) {
                        label[k][j].setText("C1");
                    }
                    C1Button.setEnabled(false);
                } else {
                    C1r.setText("Try");
                    C1c.setText("again");
                }
            } else {
                C1r.setText("Try");
                C1c.setText("again");
            }
        } else if (C1Combo.getSelectedItem() == "Ofoqi") {
            if (j <= 9 && j >= 1 && i <= 9 && i >= 0) {
                for (int k = j - 1; k <= j; k++) {
                    if (label[i][k].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = j - 1; k <= j; k++) {
                        label[i][k].setText("C1");
                    }
                    C1Button.setEnabled(false);
                } else {
                    C1r.setText("Try");
                    C1c.setText("again");
                }
            } else {
                C1r.setText("Try");
                C1c.setText("again");
            }
        }
    }

    private void B2Action() {
        int n = 0;
        int i = Integer.valueOf(B2r.getText());
        int j = Integer.valueOf(B2c.getText());
        if (B2Combo.getSelectedItem() == "Amudi") {
            if (i <= 7 && i >= 0 && j <= 9 && j >= 0) {
                for (int k = i + 2; k >= i; k--) {
                    if (label[k][j].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = i + 2; k >= i; k--) {
                        label[k][j].setText("B2");
                    }
                    B2Button.setEnabled(false);
                } else {
                    B2r.setText("Try");
                    B2c.setText("again");
                }
            } else {
                B2r.setText("Try");
                B2c.setText("again");
            }
        } else if (B2Combo.getSelectedItem() == "Ofoqi") {
            if (j <= 9 && j >= 2 && i <= 9 && i >= 0) {
                for (int k = j - 2; k <= j; k++) {
                    if (label[i][k].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = j - 2; k <= j; k++) {
                        label[i][k].setText("B2");
                    }
                    B2Button.setEnabled(false);
                } else {
                    B2r.setText("Try");
                    B2c.setText("again");
                }
            } else {
                B2r.setText("Try");
                B2c.setText("again");
            }
        }
    }

    private void B1Action() {
        int n = 0;
        int i = Integer.valueOf(B1r.getText());
        int j = Integer.valueOf(B1c.getText());
        if (B1Combo.getSelectedItem() == "Amudi") {
            if (i <= 7 && i >= 0 && j <= 9 && j >= 0) {
                for (int k = i + 2; k >= i; k--) {
                    if (label[k][j].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = i + 2; k >= i; k--) {
                        label[k][j].setText("B1");
                    }
                    B1Button.setEnabled(false);
                } else {
                    B1r.setText("Try");
                    B1c.setText("again");
                }
            } else {
                B1r.setText("Try");
                B1c.setText("again");
            }
        } else if (B1Combo.getSelectedItem() == "Ofoqi") {
            if (j <= 9 && j >= 2 && i <= 9 && i >= 0) {
                for (int k = j - 2; k <= j; k++) {
                    if (label[i][k].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = j - 2; k <= j; k++) {
                        label[i][k].setText("B1");
                    }
                    B1Button.setEnabled(false);
                } else {
                    B1r.setText("Try");
                    B1c.setText("again");
                }
            } else {
                B1r.setText("Try");
                B1c.setText("again");
            }
        }
    }

    private void A1Action() {
        int n = 0;
        int i = Integer.valueOf(A1r.getText());
        int j = Integer.valueOf(A1c.getText());
        if (A1Combo.getSelectedItem() == "Amudi") {
            if (i <= 6 && i >= 0 && j <= 9 && j >= 0) {
                for (int k = i + 3; k >= i; k--) {
                    if (label[k][j].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = i + 3; k >= i; k--) {
                        label[k][j].setText("A1");
                    }
                    A1Button.setEnabled(false);
                } else {
                    A1r.setText("Try");
                    A1c.setText("again");
                }
            } else {
                A1r.setText("Try");
                A1c.setText("again");
            }
        } else if (A1Combo.getSelectedItem() == "Ofoqi") {
            if (j <= 9 && j >= 3 && i <= 9 && i >= 0) {
                for (int k = j - 3; k <= j; k++) {
                    if (label[i][k].getText() != "") {
                        n++;
                    }
                }
                if (n == 0) {
                    for (int k = j - 3; k <= j; k++) {
                        label[i][k].setText("A1");
                    }
                    A1Button.setEnabled(false);
                } else {
                    A1r.setText("Try");
                    A1c.setText("again");
                }
            } else {
                A1r.setText("Try");
                A1c.setText("again");
            }
        }
    }

    private void strikeBack() {
        int i, j;
        int s = 0;
        int k = 0;
        int h = 0;
        while (s == 0) {
            i = rand.nextInt(10);
            j = rand.nextInt(10);
            if ((label[i][j].getText() != "") && (label[i][j].getText() != "!") && (label[i][j].getForeground() == Color.green)) {
                label[i][j].setForeground(Color.red);
            } else if (label[i][j].getText() == "") {
                label[i][j].setForeground(Color.yellow);
                label[i][j].setText("!");
                s++;
            }
        }
        for (int l = 0; l < 10; l++) {
            for (int m = 0; m < 10; m++) {
                if (label[l][m].getForeground() == Color.red) {
                    k++;
                }
            }
        }
        for (int l = 0; l < 10; l++) {
            for (int m = 0; m < 10; m++) {
                if (label2[l][m].getText() == "*") {
                    h++;
                }
            }
        }
        if (h == 20) {
            jLabel2.setText("You win!");
        } else if (k == 20) {
            jLabel2.setText("You lose!");
        }

    }

    private void mouseCreat(int i, int j) {
        label2[i][j].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (label2[i][j].getForeground() == Color.green) {
                    if (label2[i][j].getBackground() == Color.red) {
                        label2[i][j].setForeground(Color.red);
                        label2[i][j].setText("*");
                    } else {
                        label2[i][j].setForeground(Color.yellow);
                        label2[i][j].setText("!");
                        strikeBack();
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void LabelCreator2() {
        int x = 280;
        int y = 160;
        for (int i = 0; i < label2.length; i++) {
            for (int j = 0; j < label2.length; j++) {
                label2[i][j] = new JLabel();
                label2[i][j].setBounds(x, y, 20, 20);
                label2[i][j].setForeground(Color.green);
                label2[i][j].setText("?");
                label2[i][j].setVisible(true);
                mouseCreat(i, j);
                this.add(label2[i][j]);
                x += 20;
            }
            y += 20;
            x = 280;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PauseButton = new javax.swing.JButton();
        C3Label = new javax.swing.JLabel();
        C3r = new javax.swing.JTextField();
        C3c = new javax.swing.JTextField();
        C3Combo = new javax.swing.JComboBox<>();
        C3Button = new javax.swing.JButton();
        C2Button = new javax.swing.JButton();
        C2Combo = new javax.swing.JComboBox<>();
        C2c = new javax.swing.JTextField();
        C2r = new javax.swing.JTextField();
        C2Label = new javax.swing.JLabel();
        B2Button = new javax.swing.JButton();
        C1Button = new javax.swing.JButton();
        B2Combo = new javax.swing.JComboBox<>();
        C1Combo = new javax.swing.JComboBox<>();
        B2c = new javax.swing.JTextField();
        C1c = new javax.swing.JTextField();
        B2r = new javax.swing.JTextField();
        C1r = new javax.swing.JTextField();
        B2Label = new javax.swing.JLabel();
        C1Label = new javax.swing.JLabel();
        B1Button = new javax.swing.JButton();
        A1Button = new javax.swing.JButton();
        D4Button = new javax.swing.JButton();
        D3Button = new javax.swing.JButton();
        A1Combo = new javax.swing.JComboBox<>();
        B1Combo = new javax.swing.JComboBox<>();
        B1c = new javax.swing.JTextField();
        A1c = new javax.swing.JTextField();
        D4c = new javax.swing.JTextField();
        D3c = new javax.swing.JTextField();
        D3r = new javax.swing.JTextField();
        D4r = new javax.swing.JTextField();
        A1r = new javax.swing.JTextField();
        B1r = new javax.swing.JTextField();
        B1Label = new javax.swing.JLabel();
        A1Label = new javax.swing.JLabel();
        D4Label = new javax.swing.JLabel();
        D3Label = new javax.swing.JLabel();
        D1Label = new javax.swing.JLabel();
        D2Label = new javax.swing.JLabel();
        D1r = new javax.swing.JTextField();
        D2r = new javax.swing.JTextField();
        D1c = new javax.swing.JTextField();
        D2c = new javax.swing.JTextField();
        D1Button = new javax.swing.JButton();
        D2Button = new javax.swing.JButton();
        StartButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sea Battle | Single Player");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(38, 61, 68));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("Single Player");

        PauseButton.setBackground(new java.awt.Color(51, 255, 204));
        PauseButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        PauseButton.setText("Pause");
        PauseButton.setBorderPainted(false);
        PauseButton.setPreferredSize(new java.awt.Dimension(100, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(162, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
        );

        C3Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        C3Label.setForeground(new java.awt.Color(51, 255, 204));
        C3Label.setText("C3");

        C3r.setPreferredSize(new java.awt.Dimension(40, 20));

        C3c.setPreferredSize(new java.awt.Dimension(40, 20));

        C3Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Amudi", "Ofoqi"}));

        C3Button.setText("done");
        C3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ButtonActionPerformed(evt);
            }
        });

        C2Button.setText("done");
        C2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ButtonActionPerformed(evt);
            }
        });

        C2Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Amudi", "Ofoqi"}));

        C2c.setPreferredSize(new java.awt.Dimension(40, 20));

        C2r.setPreferredSize(new java.awt.Dimension(40, 20));

        C2Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        C2Label.setForeground(new java.awt.Color(51, 255, 204));
        C2Label.setText("C2");

        B2Button.setText("done");
        B2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ButtonActionPerformed(evt);
            }
        });

        C1Button.setText("done");
        C1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ButtonActionPerformed(evt);
            }
        });

        B2Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Amudi", "Ofoqi"}));

        C1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Amudi", "Ofoqi"}));

        B2c.setPreferredSize(new java.awt.Dimension(40, 20));

        C1c.setPreferredSize(new java.awt.Dimension(40, 20));

        B2r.setPreferredSize(new java.awt.Dimension(40, 20));

        C1r.setPreferredSize(new java.awt.Dimension(40, 20));

        B2Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        B2Label.setForeground(new java.awt.Color(51, 255, 204));
        B2Label.setText("B2");

        C1Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        C1Label.setForeground(new java.awt.Color(51, 255, 204));
        C1Label.setText("C1");

        B1Button.setText("done");
        B1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ButtonActionPerformed(evt);
            }
        });

        A1Button.setText("done");
        A1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ButtonActionPerformed(evt);
            }
        });

        D4Button.setText("done");
        D4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ButtonActionPerformed(evt);
            }
        });

        D3Button.setText("done");
        D3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ButtonActionPerformed(evt);
            }
        });

        A1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Amudi", "Ofoqi"}));

        B1Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Amudi", "Ofoqi"}));

        B1c.setPreferredSize(new java.awt.Dimension(40, 20));

        A1c.setPreferredSize(new java.awt.Dimension(40, 20));

        D4c.setPreferredSize(new java.awt.Dimension(40, 20));

        D3c.setPreferredSize(new java.awt.Dimension(40, 20));

        D3r.setPreferredSize(new java.awt.Dimension(40, 20));

        D4r.setPreferredSize(new java.awt.Dimension(40, 20));

        A1r.setPreferredSize(new java.awt.Dimension(40, 20));

        B1r.setPreferredSize(new java.awt.Dimension(40, 20));

        B1Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        B1Label.setForeground(new java.awt.Color(51, 255, 204));
        B1Label.setText("B1");

        A1Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        A1Label.setForeground(new java.awt.Color(51, 255, 204));
        A1Label.setText("A1");

        D4Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        D4Label.setForeground(new java.awt.Color(51, 255, 204));
        D4Label.setText("D4");

        D3Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        D3Label.setForeground(new java.awt.Color(51, 255, 204));
        D3Label.setText("D3");

        D1Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        D1Label.setForeground(new java.awt.Color(51, 255, 204));
        D1Label.setText("D1");

        D2Label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        D2Label.setForeground(new java.awt.Color(51, 255, 204));
        D2Label.setText("D2");

        D1r.setPreferredSize(new java.awt.Dimension(40, 20));

        D2r.setPreferredSize(new java.awt.Dimension(40, 20));

        D1c.setPreferredSize(new java.awt.Dimension(40, 20));

        D2c.setPreferredSize(new java.awt.Dimension(40, 20));

        D1Button.setText("done");
        D1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ButtonActionPerformed(evt);
            }
        });

        D2Button.setText("done");
        D2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ButtonActionPerformed(evt);
            }
        });

        StartButton.setBackground(new java.awt.Color(0, 0, 0));
        StartButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        StartButton.setForeground(new java.awt.Color(51, 255, 204));
        StartButton.setText("Start");
        StartButton.setBorderPainted(false);
        StartButton.setPreferredSize(new java.awt.Dimension(100, 50));
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(C2Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C2r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C2Button))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(C1Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C1r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(C1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(C1Button))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(A1Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(A1r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(A1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(A1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(A1Button))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(B1Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(B1r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(B1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(B1Button))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(B2Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(B2r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(B2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(B2Button)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(D4Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(D4r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(D4c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77)
                                                .addComponent(D4Button))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(D3Label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(D3r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(D3c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77)
                                                .addComponent(D3Button))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(C3Label)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(C3r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(C3c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(C3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(C3Button))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(D1Label)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(D1r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(77, 77, 77)
                                                        .addComponent(D1Button))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(D2Label)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(D2r, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(D2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(77, 77, 77)
                                                        .addComponent(D2Button))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(C3Label)
                                                        .addComponent(C3r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C3c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C3Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C3Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(D1Label)
                                                        .addComponent(D1r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D1Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(D2Label)
                                                        .addComponent(D2r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D2Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(D3Label)
                                                        .addComponent(D3r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D3c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D3Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(D4Label)
                                                        .addComponent(D4r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D4c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(D4Button)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(A1Label)
                                                        .addComponent(A1r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(A1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(A1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(A1Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(B1Label)
                                                        .addComponent(B1r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B1Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(B2Label)
                                                        .addComponent(B2r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B2Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(C1Label)
                                                        .addComponent(C1r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C1c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C1Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C1Button))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(C2Label)
                                                        .addComponent(C2r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C2c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C2Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(C2Button))))
                                .addGap(14, 14, 14))
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

    private void A1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ButtonActionPerformed
        A1Action();
    }//GEN-LAST:event_A1ButtonActionPerformed

    private void B1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ButtonActionPerformed
        B1Action();
    }//GEN-LAST:event_B1ButtonActionPerformed

    private void B2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ButtonActionPerformed
        B2Action();
    }//GEN-LAST:event_B2ButtonActionPerformed

    private void C1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ButtonActionPerformed
        C1Action();
    }//GEN-LAST:event_C1ButtonActionPerformed

    private void C2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ButtonActionPerformed
        C2Action();
    }//GEN-LAST:event_C2ButtonActionPerformed

    private void C3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ButtonActionPerformed
        C3Action();
    }//GEN-LAST:event_C3ButtonActionPerformed

    private void D1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ButtonActionPerformed
        D1Action();
    }//GEN-LAST:event_D1ButtonActionPerformed

    private void D2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ButtonActionPerformed
        D2Action();
    }//GEN-LAST:event_D2ButtonActionPerformed

    private void D3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ButtonActionPerformed
        D3Action();
    }//GEN-LAST:event_D3ButtonActionPerformed

    private void D4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ButtonActionPerformed
        D4Action();
    }//GEN-LAST:event_D4ButtonActionPerformed

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed

        setOpo();
    }//GEN-LAST:event_StartButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1Button;
    private javax.swing.JComboBox<String> A1Combo;
    private javax.swing.JLabel A1Label;
    private javax.swing.JTextField A1c;
    private javax.swing.JTextField A1r;
    private javax.swing.JButton B1Button;
    private javax.swing.JComboBox<String> B1Combo;
    private javax.swing.JLabel B1Label;
    private javax.swing.JTextField B1c;
    private javax.swing.JTextField B1r;
    private javax.swing.JButton B2Button;
    private javax.swing.JComboBox<String> B2Combo;
    private javax.swing.JLabel B2Label;
    private javax.swing.JTextField B2c;
    private javax.swing.JTextField B2r;
    private javax.swing.JButton C1Button;
    private javax.swing.JComboBox<String> C1Combo;
    private javax.swing.JLabel C1Label;
    private javax.swing.JTextField C1c;
    private javax.swing.JTextField C1r;
    private javax.swing.JButton C2Button;
    private javax.swing.JComboBox<String> C2Combo;
    private javax.swing.JLabel C2Label;
    private javax.swing.JTextField C2c;
    private javax.swing.JTextField C2r;
    private javax.swing.JButton C3Button;
    private javax.swing.JComboBox<String> C3Combo;
    private javax.swing.JLabel C3Label;
    private javax.swing.JTextField C3c;
    private javax.swing.JTextField C3r;
    private javax.swing.JButton D1Button;
    private javax.swing.JLabel D1Label;
    private javax.swing.JTextField D1c;
    private javax.swing.JTextField D1r;
    private javax.swing.JButton D2Button;
    private javax.swing.JLabel D2Label;
    private javax.swing.JTextField D2c;
    private javax.swing.JTextField D2r;
    private javax.swing.JButton D3Button;
    private javax.swing.JLabel D3Label;
    private javax.swing.JTextField D3c;
    private javax.swing.JTextField D3r;
    private javax.swing.JButton D4Button;
    private javax.swing.JLabel D4Label;
    private javax.swing.JTextField D4c;
    private javax.swing.JTextField D4r;
    private javax.swing.JButton PauseButton;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
