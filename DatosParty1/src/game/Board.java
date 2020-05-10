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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Party 1");
        setBackground(new java.awt.Color(255, 255, 255));

        boardPanel.setBackground(new java.awt.Color(255, 255, 255));
        boardPanel.setForeground(new java.awt.Color(255, 255, 255));
        boardPanel.setAlignmentX(0.0F);

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        informationPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 553, Short.MAX_VALUE)
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(informationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 413, Short.MAX_VALUE))
                    .addComponent(boardPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    public javax.swing.JPanel informationPanel;
    // End of variables declaration//GEN-END:variables
}
