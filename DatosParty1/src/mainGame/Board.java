package mainGame;

import java.util.Random;

/**
 * This class is in charge of all the graphic configuration of the components
 * and other functions found on the board.
 *
 */
public class Board extends javax.swing.JFrame {

    private int rightDice;
    private int leftDice;
    private int playerPlaying = 0;

    /**
     * This is the constructor of the board class, where the initial
     * configuration of the components is made.
     */
    public Board() {

        initComponents();
        configComponents();
        playersInformation();

    }

    /**
     * Method in charge of the basic configuration of the graphic components of
     * the board.
     */
    public void configComponents() {

        this.setLocationRelativeTo(null);

        lblTokenPlayer3.setVisible(false);
        lblTokenPlayer4.setVisible(false);

        coinImage3.setVisible(false);
        coinImage4.setVisible(false);
        startImage3.setVisible(false);
        startImage4.setVisible(false);

    }

    /**
     * Place the information of the created players in the leaderboard.
     */
    public void playersInformation() {

        if (Window.player3Active == true && Window.player4Active == false) {

            lblTokenPlayer3.setVisible(true);
            coinImage3.setVisible(true);
            startImage3.setVisible(true);
            leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/leaderboard3.png")));

        } else if (Window.player3Active == true && Window.player4Active == true) {

            lblTokenPlayer3.setVisible(true);
            coinImage3.setVisible(true);
            startImage3.setVisible(true);

            lblTokenPlayer4.setVisible(true);
            coinImage4.setVisible(true);
            startImage4.setVisible(true);
            leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/leaderboard4.png")));

        }

        switch (Window.players.size()) {

            case 2:

                namePlayer1.setText(Window.players.get(0).getName());
                namePlayer2.setText(Window.players.get(1).getName());
                updateLeaderboard();

                break;

            case 3:

                namePlayer1.setText(Window.players.get(0).getName());
                namePlayer2.setText(Window.players.get(1).getName());
                namePlayer3.setText(Window.players.get(2).getName());
                updateLeaderboard();

                break;

            case 4:

                namePlayer1.setText(Window.players.get(0).getName());
                namePlayer2.setText(Window.players.get(1).getName());
                namePlayer3.setText(Window.players.get(2).getName());
                namePlayer4.setText(Window.players.get(3).getName());
                updateLeaderboard();

                break;

            default:

                break;
        }

    }

    /**
     * Update the graphic information of the current players in the leaderboard.
     */
    private void updateLeaderboard() {

        switch (Window.players.size()) {

            case 2:

                activeCoinsPlayer1.setText(String.valueOf(Window.players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(Window.players.get(1).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(Window.players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(Window.players.get(1).getStars()));
                activeCoinsPlayer3.setVisible(false);
                activeCoinsPlayer4.setVisible(false);
                activeStarsPlayer3.setVisible(false);
                activeStarsPlayer4.setVisible(false);

                break;

            case 3:

                activeCoinsPlayer1.setText(String.valueOf(Window.players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(Window.players.get(1).getCoins()));
                activeCoinsPlayer3.setText(String.valueOf(Window.players.get(2).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(Window.players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(Window.players.get(1).getStars()));
                activeStarsPlayer3.setText(String.valueOf(Window.players.get(2).getStars()));
                activeCoinsPlayer4.setVisible(false);
                activeStarsPlayer4.setVisible(false);

                break;

            case 4:

                activeCoinsPlayer1.setText(String.valueOf(Window.players.get(0).getCoins()));
                activeCoinsPlayer2.setText(String.valueOf(Window.players.get(1).getCoins()));
                activeCoinsPlayer3.setText(String.valueOf(Window.players.get(2).getCoins()));
                activeCoinsPlayer4.setText(String.valueOf(Window.players.get(3).getCoins()));
                activeStarsPlayer1.setText(String.valueOf(Window.players.get(0).getStars()));
                activeStarsPlayer2.setText(String.valueOf(Window.players.get(1).getStars()));
                activeStarsPlayer3.setText(String.valueOf(Window.players.get(2).getStars()));
                activeStarsPlayer4.setText(String.valueOf(Window.players.get(3).getStars()));

                break;

            default:

                break;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new mainGame.BoardBackground();
        btnRollDices = new javax.swing.JButton();
        lblRightDice = new javax.swing.JLabel();
        lblLeftDice = new javax.swing.JLabel();
        diceBackground = new javax.swing.JLabel();
        lblTokenPlayer1 = new javax.swing.JLabel();
        lblTokenPlayer2 = new javax.swing.JLabel();
        lblTokenPlayer3 = new javax.swing.JLabel();
        lblTokenPlayer4 = new javax.swing.JLabel();
        namePlayer1 = new javax.swing.JLabel();
        namePlayer2 = new javax.swing.JLabel();
        namePlayer3 = new javax.swing.JLabel();
        namePlayer4 = new javax.swing.JLabel();
        activeStarsPlayer1 = new javax.swing.JLabel();
        activeStarsPlayer2 = new javax.swing.JLabel();
        activeStarsPlayer3 = new javax.swing.JLabel();
        activeStarsPlayer4 = new javax.swing.JLabel();
        startImage1 = new javax.swing.JLabel();
        startImage2 = new javax.swing.JLabel();
        startImage3 = new javax.swing.JLabel();
        startImage4 = new javax.swing.JLabel();
        activeCoinsPlayer1 = new javax.swing.JLabel();
        activeCoinsPlayer2 = new javax.swing.JLabel();
        activeCoinsPlayer3 = new javax.swing.JLabel();
        activeCoinsPlayer4 = new javax.swing.JLabel();
        coinImage1 = new javax.swing.JLabel();
        coinImage2 = new javax.swing.JLabel();
        coinImage3 = new javax.swing.JLabel();
        coinImage4 = new javax.swing.JLabel();
        leaderboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Party 1");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRollDices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/clickhere.png"))); // NOI18N
        btnRollDices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollDicesActionPerformed(evt);
            }
        });
        panel.add(btnRollDices, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, -1));

        lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 1.png"))); // NOI18N
        panel.add(lblRightDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 540, -1, -1));

        lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dado 1.png"))); // NOI18N
        panel.add(lblLeftDice, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, -1, -1));

        diceBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/rollDices.png"))); // NOI18N
        panel.add(diceBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, 390, 180));

        lblTokenPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player1.png"))); // NOI18N
        panel.add(lblTokenPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 612, -1, -1));

        lblTokenPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player2.png"))); // NOI18N
        panel.add(lblTokenPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 612, -1, -1));

        lblTokenPlayer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player3.png"))); // NOI18N
        panel.add(lblTokenPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 640, -1, -1));

        lblTokenPlayer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/player4.png"))); // NOI18N
        panel.add(lblTokenPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 640, -1, -1));

        namePlayer1.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer1.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 100, 30));

        namePlayer2.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer2.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 100, 30));

        namePlayer3.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer3.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 100, 30));

        namePlayer4.setBackground(new java.awt.Color(0, 0, 0));
        namePlayer4.setFont(new java.awt.Font("Elephant", 1, 20)); // NOI18N
        panel.add(namePlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 100, 30));

        activeStarsPlayer1.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeStarsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 80, 30));

        activeStarsPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeStarsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, 80, 30));

        activeStarsPlayer3.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeStarsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 80, 30));

        activeStarsPlayer4.setBackground(new java.awt.Color(0, 0, 0));
        activeStarsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeStarsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 80, 30));

        startImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 30, 30));

        startImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 30, 30));

        startImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 30, 30));

        startImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/star.png"))); // NOI18N
        panel.add(startImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 420, 30, 30));

        activeCoinsPlayer1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeCoinsPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 80, 30));

        activeCoinsPlayer2.setBackground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeCoinsPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 80, 30));

        activeCoinsPlayer3.setBackground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeCoinsPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 80, 30));

        activeCoinsPlayer4.setBackground(new java.awt.Color(0, 0, 0));
        activeCoinsPlayer4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        panel.add(activeCoinsPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 80, 30));

        coinImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        coinImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, -1));

        coinImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        coinImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        panel.add(coinImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, -1, -1));

        leaderboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/leaderboard2.png"))); // NOI18N
        panel.add(leaderboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1103, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method for the movement of the player's token with the information of the
     * dice.
     */
    private void btnRollDicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollDicesActionPerformed

        checkPlayerPlaying();

        rightDice = new Random().nextInt(6) + 1;
        leftDice = new Random().nextInt(6) + 1;

        randomRightDice(rightDice);
        randomLeftDice(leftDice);

        Player actualPlayer = Window.players.get(playerPlaying);

        int moveToCell = actualPlayer.getCell() + rightDice + leftDice;

        if (moveToCell > 37) {

            moveToCell -= 38;

        }

        actualPlayer.setCell(moveToCell);

        int x = Window.principal.findXLocation(moveToCell);
        int y = Window.principal.findYLocation(moveToCell);

        if (playerPlaying == 0) {

            moveToken(0, x, y);

        } else if (playerPlaying == 1) {

            moveToken(1, x, y);

        } else if (playerPlaying == 2) {

            moveToken(2, x, y);

        } else {

            moveToken(3, x, y);

        }

        playerPlaying++;

    }//GEN-LAST:event_btnRollDicesActionPerformed

    /**
     * Perform the animation of the right dice graphically.
     *
     * @param dice It is an integer type ramdom number
     */
    public void randomRightDice(int dice) {

        if (dice == 1) {

            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice1.png")));

        } else if (dice == 2) {

            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice2.png")));

        } else if (dice == 3) {

            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice3.png")));

        } else if (dice == 4) {

            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice4.png")));

        } else if (dice == 5) {

            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice5.png")));

        } else if (dice == 6) {

            lblRightDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice6.png")));

        }

    }

    /**
     * Perform the animation of the left dice graphically.
     *
     * @param dice It is an integer type ramdom number
     */
    public void randomLeftDice(int dice) {

        if (dice == 1) {

            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice1.png")));

        } else if (dice == 2) {

            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice2.png")));

        } else if (dice == 3) {

            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice3.png")));

        } else if (dice == 4) {

            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice4.png")));

        } else if (dice == 5) {

            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice5.png")));

        } else if (dice == 6) {

            lblLeftDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dice/dice6.png")));

        }

    }

    /**
     * Method to check which player token has to be moved.
     *
     * @param playerToken Identifier of each player's token.
     * @param x position x where the token is located.
     * @param y position y where the token is located.
     */
    private void moveToken(int playerToken, int x, int y) {

        if (x != -1 && y != -1) {

            if (playerToken == 0) {

                lblTokenPlayer1.setLocation(x, y);

            } else if (playerToken == 1) {

                lblTokenPlayer2.setLocation(x + 29, y);

            } else if (playerToken == 2) {

                lblTokenPlayer3.setLocation(x, y + 28);

            } else {

                lblTokenPlayer4.setLocation(x + 29, y + 29);

            }

        } else {

            // validar caso en el que la ficha no esté en el board principal
            // Recordar que si el metodo retorna un -1, quiere decir que el jugador no esta en ese tablero especifico
        }

    }

    /**
     * Method to check the correct functioning of the players' turns.
     */
    public void checkPlayerPlaying() {

        if (Window.player3Active == false && Window.player4Active == false) {

            if (playerPlaying > 1) {

                playerPlaying = 0;

            }

        } else if (Window.player3Active == true && Window.player4Active == false) {

            if (playerPlaying > 2) {

                playerPlaying = 0;

            }

        } else if (Window.player3Active == true && Window.player4Active == true) {

            if (playerPlaying > 3) {

                playerPlaying = 0;

            }

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
    private javax.swing.JButton btnRollDices;
    private javax.swing.JLabel coinImage1;
    private javax.swing.JLabel coinImage2;
    private javax.swing.JLabel coinImage3;
    private javax.swing.JLabel coinImage4;
    private javax.swing.JLabel diceBackground;
    private javax.swing.JLabel lblLeftDice;
    private javax.swing.JLabel lblRightDice;
    private javax.swing.JLabel lblTokenPlayer1;
    private javax.swing.JLabel lblTokenPlayer2;
    private javax.swing.JLabel lblTokenPlayer3;
    private javax.swing.JLabel lblTokenPlayer4;
    private javax.swing.JLabel leaderboard;
    private javax.swing.JLabel namePlayer1;
    private javax.swing.JLabel namePlayer2;
    private javax.swing.JLabel namePlayer3;
    private javax.swing.JLabel namePlayer4;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel startImage1;
    private javax.swing.JLabel startImage2;
    private javax.swing.JLabel startImage3;
    private javax.swing.JLabel startImage4;
    // End of variables declaration//GEN-END:variables
}
