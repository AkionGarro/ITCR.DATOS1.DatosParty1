package games.NumberClicks.game;

import javax.swing.Timer;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import mainGame.Board;

/**
 * This class is in charge of all the graphic configuration of the components
 * and other functions found on the Number Clicks minigame.
 */
public class NumberClicks extends javax.swing.JFrame {

    private Timer time;
    private int hundredths = 60, seconds = 9;
    public int pointsPlayer1, pointsPlayer2, pointsPlayer3, pointsPlayer4, round = 0;
    public ArrayList<Integer> playerPoints = new ArrayList<Integer>();
    private final int firstPlace = 100, secondPlace = 75, thirdPlace = 50, lastPlace = 25;
    public int option = Board.players.size();

    /**
     * This is the constructor of the Number Clicks class, where the initial
     * configuration of the components is made.
     */
    public NumberClicks() {

        time = new Timer(10, action);
        initComponents();
        configComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * Method in charge of the basic configuration of the graphic components of
     * the Number of Clicks window.
     */
    private void configComponents() {

        nextButton.setEnabled(false);

        switch (option) {

            case 2:

                playerClicks1.setVisible(true);
                activeClicks1.setVisible(true);
                playerClicks2.setVisible(true);
                activeClicks2.setVisible(true);
                playerClicks3.setVisible(false);
                activeClicks3.setVisible(false);
                playerClicks4.setVisible(false);
                activeClicks4.setVisible(false);

                break;

            case 3:

                playerClicks1.setVisible(true);
                activeClicks1.setVisible(true);
                playerClicks2.setVisible(true);
                activeClicks2.setVisible(true);
                playerClicks3.setVisible(true);
                activeClicks3.setVisible(true);
                playerClicks4.setVisible(false);
                activeClicks4.setVisible(false);

                break;

            case 4:

                playerClicks1.setVisible(true);
                activeClicks1.setVisible(true);
                playerClicks2.setVisible(true);
                activeClicks2.setVisible(true);
                playerClicks3.setVisible(true);
                activeClicks3.setVisible(true);
                playerClicks4.setVisible(true);
                activeClicks4.setVisible(true);

                break;

            default:

                break;

        }

    }

    /**
     * Method in charge of take care of time while the palyer is playing .
     */
    private ActionListener action = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            hundredths--;

            if (hundredths == 0) {

                seconds--;
                hundredths = 60;

            }

            if (seconds == 0) {

                time.stop();
                hundredths = 0;
                nextButton.setEnabled(true);

            }

            updateTimeLabel();

        }

    };

    /**
     * Method in charge of set the time to the timeRunning label.
     */
    private void updateTimeLabel() {

        String text = (seconds <= 9 ? "0" : "") + seconds + ":" + (hundredths <= 9 ? "0" : "") + hundredths + " s";
        timeRunning.setText(text);

    }

    /**
     * Method in charge of update the players points on the window.
     */
    public void updatePlayersPoints() {

        switch (option) {

            case 2:

                if (round == 1) {

                    pointsPlayer1++;
                    activeClicks1.setText("" + pointsPlayer1);

                } else if (round == 2) {

                    pointsPlayer2++;
                    activeClicks2.setText("" + pointsPlayer2);

                }

                break;

            case 3:

                switch (round) {

                    case 1:

                        pointsPlayer1++;
                        activeClicks1.setText("" + pointsPlayer1);

                        break;

                    case 2:

                        pointsPlayer2++;
                        activeClicks2.setText("" + pointsPlayer2);

                        break;

                    case 3:

                        pointsPlayer3++;
                        activeClicks3.setText("" + pointsPlayer3);

                        break;

                    default:

                        break;

                }

                break;

            case 4:

                switch (round) {

                    case 1:

                        pointsPlayer1++;
                        activeClicks1.setText("" + pointsPlayer1);

                        break;

                    case 2:

                        pointsPlayer2++;
                        activeClicks2.setText("" + pointsPlayer2);

                        break;

                    case 3:

                        pointsPlayer3++;
                        activeClicks3.setText("" + pointsPlayer3);

                        break;

                    case 4:

                        pointsPlayer4++;
                        activeClicks4.setText("" + pointsPlayer4);

                        break;

                    default:

                        break;

                }

                break;

            default:

                break;

        }

    }

    /**
     * Method in charge get the index of the players that are playing.
     *
     * @return The index of the needed player.
     */
    public int getPlayer1Place() {

        int index = 0;

        if (playerPoints.get(0) == (Integer.parseInt(activeClicks1.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activeClicks1.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activeClicks1.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activeClicks1.getText()))) {

            index = 3;

        }

        return index;
    }

    /**
     * Method in charge of getting the index of an specific player.
     *
     * @return The index of the second player.
     */
    public int getPlayer2Place() {

        int index = 0;

        if (playerPoints.get(0) == (Integer.parseInt(activeClicks2.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activeClicks2.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activeClicks2.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activeClicks2.getText()))) {

            index = 3;

        }

        return index;

    }

    /**
     * Method in charge of getting the index of an specific player.
     *
     * @return The index of the third player.
     */
    public int getPlayer3Place() {

        int index = 0;

        if (playerPoints.get(0) == (Integer.parseInt(activeClicks3.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activeClicks3.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activeClicks3.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activeClicks3.getText()))) {

            index = 3;

        }

        return index;

    }

    /**
     * Method in charge of getting the index of an specific player.
     *
     * @return The index of the fourth player.
     */
    public int getPlayer4Place() {

        int index = 0;

        if (playerPoints.get(0) == (Integer.parseInt(activeClicks4.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activeClicks4.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activeClicks4.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activeClicks4.getText()))) {

            index = 3;

        }

        return index;
    }

    /**
     * Method in charge of updating the coins of the first player.
     */
    public void sendPlayer1Coins() {

        switch (getPlayer1Place()) {

            case 0:

                Board.players.get(0).setCoins((Board.players.get(0).getCoins()) + firstPlace);

                break;

            case 1:

                Board.players.get(0).setCoins(Board.players.get(0).getCoins() + secondPlace);

                break;

            case 2:

                Board.players.get(0).setCoins(Board.players.get(0).getCoins() + thirdPlace);

                break;

            case 3:

                Board.players.get(0).setCoins(Board.players.get(0).getCoins() + lastPlace);

                break;

            default:

                break;

        }

    }

    /**
     * Method in charge of updating the coins of the second player.
     */
    public void sendPlayer2Coins() {

        switch (getPlayer2Place()) {

            case 0:

                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + firstPlace);

                break;

            case 1:

                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + secondPlace);

                break;

            case 2:

                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + thirdPlace);

                break;

            case 3:

                Board.players.get(1).setCoins(Board.players.get(1).getCoins() + lastPlace);

                break;

            default:

                break;

        }

    }

    /**
     * Method in charge of updating the coins of the third player.
     */
    public void sendPlayer3Coins() {

        switch (getPlayer3Place()) {

            case 0:

                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + firstPlace);

                break;

            case 1:

                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + secondPlace);

                break;

            case 2:

                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + thirdPlace);

                break;

            case 3:

                Board.players.get(2).setCoins(Board.players.get(2).getCoins() + lastPlace);

                break;

            default:

                break;

        }

    }

    /**
     * Method in charge of updating the coins of the fourth player.
     */
    public void sendPlayer4Coins() {

        switch (getPlayer4Place()) {

            case 0:

                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + firstPlace);

                break;

            case 1:

                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + secondPlace);

                break;

            case 2:

                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + thirdPlace);

                break;

            case 3:

                Board.players.get(3).setCoins(Board.players.get(3).getCoins() + lastPlace);

                break;

            default:

                break;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        btnClickMe = new javax.swing.JLabel();
        btnInstructions = new javax.swing.JButton();
        playerClicks1 = new javax.swing.JLabel();
        playerClicks2 = new javax.swing.JLabel();
        playerClicks3 = new javax.swing.JLabel();
        playerClicks4 = new javax.swing.JLabel();
        activeClicks1 = new javax.swing.JLabel();
        activeClicks2 = new javax.swing.JLabel();
        activeClicks3 = new javax.swing.JLabel();
        activeClicks4 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        timeRunning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Click me Game");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        gamePanel.setBackground(new java.awt.Color(255, 255, 255));
        gamePanel.setPreferredSize(new java.awt.Dimension(360, 312));
        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClickMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/NumberClicks/images/clickMe.png"))); // NOI18N
        btnClickMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClickMeMouseClicked(evt);
            }
        });
        gamePanel.add(btnClickMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        btnInstructions.setBackground(new java.awt.Color(0, 255, 204));
        btnInstructions.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInstructions.setText("Instrucciones");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });
        gamePanel.add(btnInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        playerClicks1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerClicks1.setForeground(new java.awt.Color(0, 0, 0));
        playerClicks1.setText("Clicks jugador 1:");
        gamePanel.add(playerClicks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 20));

        playerClicks2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerClicks2.setForeground(new java.awt.Color(0, 0, 0));
        playerClicks2.setText("Clicks jugador 2:");
        gamePanel.add(playerClicks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 20));

        playerClicks3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerClicks3.setForeground(new java.awt.Color(0, 0, 0));
        playerClicks3.setText("Clicks jugador 3:");
        gamePanel.add(playerClicks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 180, 30));

        playerClicks4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerClicks4.setForeground(new java.awt.Color(0, 0, 0));
        playerClicks4.setText("Clicks jugador 4:");
        gamePanel.add(playerClicks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, -1));

        activeClicks1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activeClicks1.setForeground(new java.awt.Color(0, 0, 0));
        activeClicks1.setText("0");
        gamePanel.add(activeClicks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 50, -1));

        activeClicks2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activeClicks2.setForeground(new java.awt.Color(0, 0, 0));
        activeClicks2.setText("0");
        gamePanel.add(activeClicks2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 50, -1));

        activeClicks3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activeClicks3.setForeground(new java.awt.Color(0, 0, 0));
        activeClicks3.setText("0");
        gamePanel.add(activeClicks3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 205, 50, 20));

        activeClicks4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activeClicks4.setForeground(new java.awt.Color(0, 0, 0));
        activeClicks4.setText("0");
        gamePanel.add(activeClicks4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 245, 50, 20));

        startButton.setBackground(new java.awt.Color(0, 255, 204));
        startButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        gamePanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, 40));

        nextButton.setBackground(new java.awt.Color(0, 255, 204));
        nextButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nextButton.setText("Next Player");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        gamePanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 140, 40));

        exitButton.setBackground(new java.awt.Color(0, 255, 204));
        exitButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        gamePanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 150, 40));

        timeRunning.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        timeRunning.setForeground(new java.awt.Color(0, 0, 0));
        timeRunning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeRunning.setText("30:00 s");
        gamePanel.add(timeRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method in charge of counting how many times the players clicks the
     * button.
     */
    private void btnClickMeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClickMeMouseClicked
        if (time.isRunning()) {
            updatePlayersPoints();
        }

    }//GEN-LAST:event_btnClickMeMouseClicked

    /**
     * Method in charge of showing the instructions of the minigame.
     */
    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed

        String instructions = "El objetivo consiste en obtener la mayor cantidad de puntos en el tiempo establecido (7 segundos), según las siguientes reglas:\n"
                + "\n"
                + "   * En el momento en que se presione el botón \"Click Me\", comenzará a correr el tiempo inmediatamente.\n"
                + "   * Presiona el botón lo más rápido que puedas.\n"
                + "   * Cuando hayan transcurrido los 7 segundos, no podrás contabilizar más puntos.\n"
                + "\n";

        JOptionPane.showMessageDialog(null, instructions);

    }//GEN-LAST:event_btnInstructionsActionPerformed

    /**
     * Method in charge of start the minigame.
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        time.start();
        startButton.setEnabled(false);
        startButton.setText("START");
        round++;

    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * Method in charge of starting a new minigame to pass the turn to the other
     * players.
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        switch (option) {

            case 2:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(false);
                    nextButton.setEnabled(false);

                }

                break;

            case 3:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);

                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);

                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();

                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(false);
                    nextButton.setEnabled(false);

                }

                break;

            case 4:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);

                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);

                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);

                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(true);

                } else if (round == 4) {

                    playerPoints.add(pointsPlayer4);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    sendPlayer4Coins();
                    hundredths = 60;
                    seconds = 9;
                    timeRunning.setText("10:00 s");
                    startButton.setEnabled(false);
                    nextButton.setEnabled(false);

                }

                break;

            default:

                break;

        }

    }//GEN-LAST:event_nextButtonActionPerformed

    /**
     * Method in charge of finishing the minigame.
     */
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        switch (option) {

            case 2:

                if (round == 2) {

                    round = 0;
                    pointsPlayer1 = 0;
                    pointsPlayer2 = 0;
                    dispose();

                } else {

                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

                }

                break;

            case 3:

                if (round == 3) {

                    round = 0;
                    pointsPlayer1 = 0;
                    pointsPlayer2 = 0;
                    pointsPlayer3 = 0;
                    dispose();

                } else {

                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

                }

                break;

            case 4:

                if (round == 4) {

                    round = 0;
                    pointsPlayer1 = 0;
                    pointsPlayer2 = 0;
                    pointsPlayer3 = 0;
                    pointsPlayer4 = 0;
                    dispose();

                } else {

                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

                }

                break;

            default:

                break;

        }
    }//GEN-LAST:event_exitButtonActionPerformed

    /**
     * Method in charge start the minigame.
     */
    public static void main() {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new NumberClicks().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeClicks1;
    private javax.swing.JLabel activeClicks2;
    private javax.swing.JLabel activeClicks3;
    private javax.swing.JLabel activeClicks4;
    private javax.swing.JLabel btnClickMe;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel playerClicks1;
    private javax.swing.JLabel playerClicks2;
    private javax.swing.JLabel playerClicks3;
    private javax.swing.JLabel playerClicks4;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeRunning;
    // End of variables declaration//GEN-END:variables

}
