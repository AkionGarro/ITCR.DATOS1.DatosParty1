package mainGame;

public class Board extends javax.swing.JFrame {

    private int dice1;
    private int dice2;
    private int total;


    public Board() {

        initComponents();
        configComponents();
        playersInformation();
    }

    private void configComponents() {
        this.setLocationRelativeTo(null);
        tokenPlayer1.setVisible(false);
        tokenPlayer2.setVisible(false);
        tokenPlayer3.setVisible(false);
        tokenPlayer4.setVisible(false);

    }

    private void playersInformation() {

        switch (Window.players.size()) {
            case 2:
                namePlayer1.setText(Window.players.get(0).getNombre());
                namePlayer2.setText(Window.players.get(1).getNombre());
                break;
            case 3:
                namePlayer1.setText(Window.players.get(0).getNombre());
                namePlayer2.setText(Window.players.get(1).getNombre());
                namePlayer3.setText(Window.players.get(2).getNombre());
                break;
            case 4:
                namePlayer1.setText(Window.players.get(0).getNombre());
                namePlayer2.setText(Window.players.get(1).getNombre());
                namePlayer3.setText(Window.players.get(2).getNombre());
                namePlayer4.setText(Window.players.get(3).getNombre());
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPanel = new mainGame.BoardBackground1();
        tokenPlayer1 = new javax.swing.JLabel();
        tokenPlayer2 = new javax.swing.JLabel();
        tokenPlayer3 = new javax.swing.JLabel();
        tokenPlayer4 = new javax.swing.JLabel();
        informationPanel = new mainGame.BoardBackground2();
        dicePanel = new javax.swing.JPanel();
        leftDice1 = new javax.swing.JLabel();
        leftDice2 = new javax.swing.JLabel();
        leftDice3 = new javax.swing.JLabel();
        leftDice4 = new javax.swing.JLabel();
        leftDice5 = new javax.swing.JLabel();
        leftDice6 = new javax.swing.JLabel();
        rightDice1 = new javax.swing.JLabel();
        rightDice2 = new javax.swing.JLabel();
        rightDice3 = new javax.swing.JLabel();
        rightDice4 = new javax.swing.JLabel();
        rightDice5 = new javax.swing.JLabel();
        rightDice6 = new javax.swing.JLabel();
        rollButton = new javax.swing.JLabel();
        coinImage1 = new javax.swing.JLabel();
        coinImage2 = new javax.swing.JLabel();
        coinImage3 = new javax.swing.JLabel();
        coinImage4 = new javax.swing.JLabel();
        activeCoinsPlayer1 = new javax.swing.JLabel();
        activeCoinsPlayer2 = new javax.swing.JLabel();
        activeCoinsPlayer3 = new javax.swing.JLabel();
        activeCoinsPlayer4 = new javax.swing.JLabel();
        startImage1 = new javax.swing.JLabel();
        startImage2 = new javax.swing.JLabel();
        startImage3 = new javax.swing.JLabel();
        startImage4 = new javax.swing.JLabel();
        activeStarsPlayer1 = new javax.swing.JLabel();
        activeStarsPlayer2 = new javax.swing.JLabel();
        activeStarsPlayer3 = new javax.swing.JLabel();
        activeStarsPlayer4 = new javax.swing.JLabel();
        namePlayer1 = new javax.swing.JLabel();
        namePlayer2 = new javax.swing.JLabel();
        namePlayer3 = new javax.swing.JLabel();
        namePlayer4 = new javax.swing.JLabel();
        leaderboard = new javax.swing.JLabel();
        diceBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Party 1");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        boardPanel.setBackground(new java.awt.Color(255, 255, 255));
        boardPanel.setForeground(new java.awt.Color(255, 255, 255));
        boardPanel.setAlignmentX(0.0F);
        boardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tokenPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player1.png"))); // NOI18N
        boardPanel.add(tokenPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 620, -1, -1));

        tokenPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player2.png"))); // NOI18N
        boardPanel.add(tokenPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 620, -1, -1));

        tokenPlayer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player3.png"))); // NOI18N
        boardPanel.add(tokenPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 650, -1, -1));

        tokenPlayer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player4.png"))); // NOI18N
        boardPanel.add(tokenPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 650, -1, -1));

        informationPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        dicePanel.setBackground(new java.awt.Color(255, 255, 255));
        dicePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftDice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 1.png"))); // NOI18N
        dicePanel.add(leftDice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        leftDice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 2.png"))); // NOI18N
        dicePanel.add(leftDice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        leftDice3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 3.png"))); // NOI18N
        dicePanel.add(leftDice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        leftDice4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 4.png"))); // NOI18N
        dicePanel.add(leftDice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        leftDice5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 5.png"))); // NOI18N
        dicePanel.add(leftDice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        leftDice6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 6.png"))); // NOI18N
        dicePanel.add(leftDice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        rightDice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 1.png"))); // NOI18N
        dicePanel.add(rightDice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        rightDice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 2.png"))); // NOI18N
        dicePanel.add(rightDice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        rightDice3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 3.png"))); // NOI18N
        dicePanel.add(rightDice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        rightDice4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 4.png"))); // NOI18N
        dicePanel.add(rightDice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        rightDice5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 5.png"))); // NOI18N
        dicePanel.add(rightDice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        rightDice6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 6.png"))); // NOI18N
        dicePanel.add(rightDice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        rollButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/clickhere.png"))); // NOI18N
        rollButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rollButtonMouseClicked(evt);
            }
        });
        dicePanel.add(rollButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        coinImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\coin.png")); // NOI18N
        dicePanel.add(coinImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        coinImage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\coin.png")); // NOI18N
        dicePanel.add(coinImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 95, -1, -1));

        coinImage3.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\coin.png")); // NOI18N
        dicePanel.add(coinImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 136, -1, -1));

        coinImage4.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\coin.png")); // NOI18N
        dicePanel.add(coinImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 182, -1, -1));

        activeCoinsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeCoinsPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeCoinsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 46, 80, 30));

        activeCoinsPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeCoinsPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeCoinsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 92, 80, 30));

        activeCoinsPlayer3.setBackground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeCoinsPlayer3.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeCoinsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 133, 80, 30));

        activeCoinsPlayer4.setBackground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeCoinsPlayer4.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeCoinsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 178, 80, 30));

        startImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\estrella.png")); // NOI18N
        dicePanel.add(startImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 45, 30, 30));

        startImage2.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\estrella.png")); // NOI18N
        dicePanel.add(startImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 30, 30));

        startImage3.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\estrella.png")); // NOI18N
        dicePanel.add(startImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 132, 30, 30));

        startImage4.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Desktop\\imaes\\estrella.png")); // NOI18N
        dicePanel.add(startImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 177, 30, 30));

        activeStarsPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeStarsPlayer1.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeStarsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 80, 30));

        activeStarsPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeStarsPlayer2.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeStarsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 88, 80, 30));

        activeStarsPlayer3.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeStarsPlayer3.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeStarsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 128, 80, 30));

        activeStarsPlayer4.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        activeStarsPlayer4.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(activeStarsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 174, 80, 30));

        namePlayer1.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer1.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        namePlayer1.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(namePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, 30));

        namePlayer2.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer2.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        namePlayer2.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(namePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, 30));

        namePlayer3.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer3.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        namePlayer3.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(namePlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 155, 100, 30));

        namePlayer4.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer4.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        namePlayer4.setForeground(new java.awt.Color(0, 0, 0));
        dicePanel.add(namePlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 205, 100, 30));

        leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/Leaderboard.png"))); // NOI18N
        dicePanel.add(leaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, -10, 360, 270));

        diceBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/Roll the dices.png"))); // NOI18N
        dicePanel.add(diceBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 390, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(informationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rollButtonMouseClicked
        randomDice1();
        randomDice2();
        
    }//GEN-LAST:event_rollButtonMouseClicked

        public void randomDice1() {
        dice1 = (int) (Math.random() * 6 + 1);
        if (dice1 == 1) {
            leftDice1.setVisible(true);
            leftDice2.setVisible(false);
            leftDice3.setVisible(false);
            leftDice4.setVisible(false);
            leftDice5.setVisible(false);
            leftDice6.setVisible(false);
            return;
        }
        if (dice1 == 2) {
            leftDice1.setVisible(false);
            leftDice2.setVisible(true);
            leftDice3.setVisible(false);
            leftDice4.setVisible(false);
            leftDice5.setVisible(false);
            leftDice6.setVisible(false);

            return;
        }
        if (dice1 == 3) {
            leftDice1.setVisible(false);
            leftDice2.setVisible(false);
            leftDice3.setVisible(true);
            leftDice4.setVisible(false);
            leftDice5.setVisible(false);
            leftDice6.setVisible(false);

            return;
        }
        if (dice1 == 4) {
            leftDice1.setVisible(false);
            leftDice2.setVisible(false);
            leftDice3.setVisible(false);
            leftDice4.setVisible(true);
            leftDice5.setVisible(false);
            leftDice6.setVisible(false);

            return;
        }
        if (dice1 == 5) {
            leftDice1.setVisible(false);
            leftDice2.setVisible(false);
            leftDice3.setVisible(false);
            leftDice4.setVisible(false);
            leftDice5.setVisible(true);
            leftDice6.setVisible(false);

            return;
        }
        if (dice1 == 6) {
            leftDice1.setVisible(false);
            leftDice2.setVisible(false);
            leftDice3.setVisible(false);
            leftDice4.setVisible(false);
            leftDice5.setVisible(false);
            leftDice6.setVisible(true);

            return;
        }

    }

    public void randomDice2() {

        dice2 = (int) (Math.random() * 6 + 1);

        if (dice2 == 1) {
            rightDice1.setVisible(true);
            rightDice2.setVisible(false);
            rightDice3.setVisible(false);
            rightDice4.setVisible(false);
            rightDice5.setVisible(false);
            rightDice6.setVisible(false);

            return;
        }
        if (dice2 == 2) {
            rightDice1.setVisible(false);
            rightDice2.setVisible(true);
            rightDice3.setVisible(false);
            rightDice4.setVisible(false);
            rightDice5.setVisible(false);
            rightDice6.setVisible(false);

            return;
        }
        if (dice2 == 3) {
            rightDice1.setVisible(false);
            rightDice2.setVisible(false);
            rightDice3.setVisible(true);
            rightDice4.setVisible(false);
            rightDice5.setVisible(false);
            rightDice6.setVisible(false);

            return;
        }
        if (dice2 == 4) {
            rightDice1.setVisible(false);
            rightDice2.setVisible(false);
            rightDice3.setVisible(false);
            rightDice4.setVisible(true);
            rightDice5.setVisible(false);
            rightDice6.setVisible(false);

            return;
        }
        if (dice2 == 5) {
            rightDice1.setVisible(false);
            rightDice2.setVisible(false);
            rightDice3.setVisible(false);
            rightDice4.setVisible(false);
            rightDice5.setVisible(true);
            rightDice6.setVisible(false);

            return;
        }
        if (dice2 == 6) {
            rightDice1.setVisible(false);
            rightDice2.setVisible(false);
            rightDice3.setVisible(false);
            rightDice4.setVisible(false);
            rightDice5.setVisible(false);
            rightDice6.setVisible(true);

            return;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeCoinsPlayer1;
    private javax.swing.JLabel activeCoinsPlayer2;
    private javax.swing.JLabel activeCoinsPlayer3;
    private javax.swing.JLabel activeCoinsPlayer4;
    private javax.swing.JLabel activeStarsPlayer1;
    private javax.swing.JLabel activeStarsPlayer2;
    private javax.swing.JLabel activeStarsPlayer3;
    private javax.swing.JLabel activeStarsPlayer4;
    public javax.swing.JPanel boardPanel;
    private javax.swing.JLabel coinImage1;
    private javax.swing.JLabel coinImage2;
    private javax.swing.JLabel coinImage3;
    private javax.swing.JLabel coinImage4;
    private javax.swing.JLabel diceBackground;
    private javax.swing.JPanel dicePanel;
    public javax.swing.JPanel informationPanel;
    private javax.swing.JLabel leaderboard;
    private javax.swing.JLabel leftDice1;
    private javax.swing.JLabel leftDice2;
    private javax.swing.JLabel leftDice3;
    private javax.swing.JLabel leftDice4;
    private javax.swing.JLabel leftDice5;
    private javax.swing.JLabel leftDice6;
    private javax.swing.JLabel namePlayer1;
    private javax.swing.JLabel namePlayer2;
    private javax.swing.JLabel namePlayer3;
    private javax.swing.JLabel namePlayer4;
    private javax.swing.JLabel rightDice1;
    private javax.swing.JLabel rightDice2;
    private javax.swing.JLabel rightDice3;
    private javax.swing.JLabel rightDice4;
    private javax.swing.JLabel rightDice5;
    private javax.swing.JLabel rightDice6;
    private javax.swing.JLabel rollButton;
    private javax.swing.JLabel startImage1;
    private javax.swing.JLabel startImage2;
    private javax.swing.JLabel startImage3;
    private javax.swing.JLabel startImage4;
    private javax.swing.JLabel tokenPlayer1;
    private javax.swing.JLabel tokenPlayer2;
    private javax.swing.JLabel tokenPlayer3;
    private javax.swing.JLabel tokenPlayer4;
    // End of variables declaration//GEN-END:variables
}
