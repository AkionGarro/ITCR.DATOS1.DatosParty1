package game;

public class Board extends javax.swing.JFrame {

<<<<<<< HEAD
    private int dice1;
    private int dice2;
    private int total;

=======
>>>>>>> parent of 839aa52... DP1-58 DP1-59 Random dices function
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
