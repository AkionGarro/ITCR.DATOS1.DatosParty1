package game;

public class Board extends javax.swing.JFrame {

    private int dice1;
    private int dice2;
    private int total;

    public Board() {

        initComponents();
        configComponents();
    }

    private void configComponents() {
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardPanel = new game.BoardBackground1();
        informationPanel = new game.BoardBackground2();
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
        diceBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Party 1");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        boardPanel.setBackground(new java.awt.Color(255, 255, 255));
        boardPanel.setForeground(new java.awt.Color(255, 255, 255));
        boardPanel.setAlignmentX(0.0F);
        boardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());


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

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public int getPlayerMove() {
        total = getDice1()+getDice2();
        return total;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel boardPanel;
    private javax.swing.JLabel diceBackground;
    private javax.swing.JPanel dicePanel;
    public javax.swing.JPanel informationPanel;
    private javax.swing.JLabel leftDice1;
    private javax.swing.JLabel leftDice2;
    private javax.swing.JLabel leftDice3;
    private javax.swing.JLabel leftDice4;
    private javax.swing.JLabel leftDice5;
    private javax.swing.JLabel leftDice6;
    private javax.swing.JLabel rightDice1;
    private javax.swing.JLabel rightDice2;
    private javax.swing.JLabel rightDice3;
    private javax.swing.JLabel rightDice4;
    private javax.swing.JLabel rightDice5;
    private javax.swing.JLabel rightDice6;
    private javax.swing.JLabel rollButton;
    // End of variables declaration//GEN-END:variables
}
