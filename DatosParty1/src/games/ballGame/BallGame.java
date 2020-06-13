package games.ballGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import mainGame.Board;

public class BallGame extends javax.swing.JFrame {

    private Timer time;
    private int hundredths = 60, seconds = 29;
    public int pointsPlayer1, pointsPlayer2, pointsPlayer3, pointsPlayer4, round = 0;
    public ArrayList<Integer> playerPoints = new ArrayList<Integer>();
    private final int firstPlace = 100, secondPlace = 75, thirdPlace = 50, lastPlace = 25;
    public int option = Board.players.size();

    /**
     * Creates new form BallGame
     */
    public BallGame() {

        initComponents();
        configComponents();
        this.setLocationRelativeTo(null);

    }

    private void configComponents() {

        nextButton.setEnabled(false);

        switch (option) {

            case 2:

                playerPoints1.setVisible(true);
                activepoints1.setVisible(true);
                playerPoints2.setVisible(true);
                activepoints2.setVisible(true);
                playerPoints3.setVisible(false);
                activepoints3.setVisible(false);
                playerPoints4.setVisible(false);
                activepoints4.setVisible(false);

                break;

            case 3:

                playerPoints1.setVisible(true);
                activepoints1.setVisible(true);
                playerPoints2.setVisible(true);
                activepoints2.setVisible(true);
                playerPoints3.setVisible(true);
                activepoints3.setVisible(true);
                playerPoints4.setVisible(false);
                activepoints4.setVisible(false);

                break;

            case 4:

                playerPoints1.setVisible(true);
                activepoints1.setVisible(true);
                playerPoints2.setVisible(true);
                activepoints2.setVisible(true);
                playerPoints3.setVisible(true);
                activepoints3.setVisible(true);
                playerPoints4.setVisible(true);
                activepoints4.setVisible(true);

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
                    activepoints1.setText("" + pointsPlayer1);

                } else if (round == 2) {

                    pointsPlayer2++;
                    activepoints2.setText("" + pointsPlayer2);

                }

                break;

            case 3:

                switch (round) {

                    case 1:

                        pointsPlayer1++;
                        activepoints1.setText("" + pointsPlayer1);

                        break;

                    case 2:

                        pointsPlayer2++;
                        activepoints2.setText("" + pointsPlayer2);

                        break;

                    case 3:

                        pointsPlayer3++;
                        activepoints3.setText("" + pointsPlayer3);

                        break;

                    default:

                        break;

                }

                break;

            case 4:

                switch (round) {

                    case 1:

                        pointsPlayer1++;
                        activepoints1.setText("" + pointsPlayer1);

                        break;

                    case 2:

                        pointsPlayer2++;
                        activepoints2.setText("" + pointsPlayer2);

                        break;

                    case 3:

                        pointsPlayer3++;
                        activepoints3.setText("" + pointsPlayer3);

                        break;

                    case 4:

                        pointsPlayer4++;
                        activepoints4.setText("" + pointsPlayer4);

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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBall = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();
        lblPoints = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        activepoints4 = new javax.swing.JLabel();
        playerPoints4 = new javax.swing.JLabel();
        playerPoints3 = new javax.swing.JLabel();
        activepoints3 = new javax.swing.JLabel();
        activepoints2 = new javax.swing.JLabel();
        playerPoints2 = new javax.swing.JLabel();
        playerPoints1 = new javax.swing.JLabel();
        activepoints1 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        btnInstructions = new javax.swing.JButton();
        timeRunning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ball Game");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Player/coin.png"))); // NOI18N
        btnBall.setBorderPainted(false);
        btnBall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBallActionPerformed(evt);
            }
        });
        jPanel1.add(btnBall, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lblScore.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setText("Puntaje: ");
        jPanel1.add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 11, -1, -1));

        lblPoints.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblPoints.setForeground(new java.awt.Color(255, 255, 255));
        lblPoints.setText("0");
        jPanel1.add(lblPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 11, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 25, -1, -1));

        activepoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints4.setForeground(new java.awt.Color(0, 0, 0));
        activepoints4.setText("0");
        jPanel1.add(activepoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 50, 20));

        playerPoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints4.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints4.setText("Puntos jugador 4:");
        jPanel1.add(playerPoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));

        playerPoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints3.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints3.setText("Puntos jugador 3:");
        jPanel1.add(playerPoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 180, 30));

        activepoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints3.setForeground(new java.awt.Color(0, 0, 0));
        activepoints3.setText("0");
        jPanel1.add(activepoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 50, 20));

        activepoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints2.setForeground(new java.awt.Color(0, 0, 0));
        activepoints2.setText("0");
        jPanel1.add(activepoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 50, -1));

        playerPoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints2.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints2.setText("Puntos jugador 2:");
        jPanel1.add(playerPoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 20));

        playerPoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints1.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints1.setText("Puntos jugador 1:");
        jPanel1.add(playerPoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, 20));

        activepoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints1.setForeground(new java.awt.Color(0, 0, 0));
        activepoints1.setText("0");
        jPanel1.add(activepoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 50, -1));

        startButton.setBackground(new java.awt.Color(0, 255, 204));
        startButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        jPanel1.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 180, 50));

        nextButton.setBackground(new java.awt.Color(0, 255, 204));
        nextButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        nextButton.setText("Next Player");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 180, 50));

        exitButton.setBackground(new java.awt.Color(0, 255, 204));
        exitButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 180, 50));

        btnInstructions.setBackground(new java.awt.Color(0, 255, 204));
        btnInstructions.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btnInstructions.setText("Instrucciones");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });
        jPanel1.add(btnInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 50));

        timeRunning.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        timeRunning.setForeground(new java.awt.Color(0, 0, 0));
        timeRunning.setText("00:00 s");
        jPanel1.add(timeRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method in charge get the index of the players that are playing.
     *
     * @return The index of the needed player.
     */
    public int getPlayer1Place() {

        int index = 0;

        if (playerPoints.get(0) == (Integer.parseInt(activepoints1.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activepoints1.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activepoints1.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activepoints1.getText()))) {

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

        if (playerPoints.get(0) == (Integer.parseInt(activepoints2.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activepoints2.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activepoints2.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activepoints2.getText()))) {

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

        if (playerPoints.get(0) == (Integer.parseInt(activepoints3.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activepoints3.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activepoints3.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activepoints3.getText()))) {

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

        if (playerPoints.get(0) == (Integer.parseInt(activepoints4.getText()))) {

            index = 0;

        } else if (playerPoints.get(1) == (Integer.parseInt(activepoints4.getText()))) {

            index = 1;

        } else if (playerPoints.get(2) == (Integer.parseInt(activepoints4.getText()))) {

            index = 2;

        } else if (playerPoints.get(3) == (Integer.parseInt(activepoints4.getText()))) {

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
     * Method in charge of updating the coins of the fourth player. *
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Timer timer = new Timer(800, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Random random = new Random();
                int x = random.nextInt((350 - 0 + 1)) + 0;
                int y = random.nextInt((180 - 0 + 1)) + 0;
                btnBall.setLocation(x, y);

            }

        });

        timer.start();

    }//GEN-LAST:event_formWindowOpened

    private void btnBallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBallActionPerformed

        int z = Integer.parseInt(lblPoints.getText());
        lblPoints.setText("" + (z + 100));

        if (z == 400) {

            lblPoints.setVisible(false);
            lblScore.setVisible(false);
            btnBall.setVisible(false);
            jLabel1.setText("Ganaste");

        }


    }//GEN-LAST:event_btnBallActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        time.start();
        startButton.setEnabled(false);
        startButton.setText("START");
        round++;

    }//GEN-LAST:event_startButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        switch (option) {

            case 2:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(false);

                }

                break;

            case 3:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(false);

                }

                break;

            case 4:

                if (round == 1) {
                    playerPoints.add(pointsPlayer1);
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 4) {

                    playerPoints.add(pointsPlayer4);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    sendPlayer4Coins();
                    
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(false);

                }

                break;

            default:

                break;

        }

    }//GEN-LAST:event_nextButtonActionPerformed

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

        if (Board.round == 13) {

            Board.mingameFinished = true;
            Board.checkEndGame();

        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed

        String instructions = "El objetivo consiste en obtener la mayor cantidad de diferencias en el tiempo establecido (30 segundos), según las siguientes reglas:\n"
                + "\n"
                + "   * En el momento en que se presione el botón \"Start\", comenzará a correr el tiempo inmediatamente.\n"
                + "   * Busca las diferencias en la parte izquierda de la pantalla.\n"
                + "   * Cuando hayan transcurrido los 30 segundos, no podrás contabilizar más diferencias.\n"
                + "   * Al final de su ronda presionar el boton next player.\n"
                + "   * Si eres el jugador final para volver al tablero presionar exit.\n"
                + "\n";

        JOptionPane.showMessageDialog(null, instructions);
    }//GEN-LAST:event_btnInstructionsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BallGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BallGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BallGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BallGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BallGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activepoints1;
    private javax.swing.JLabel activepoints2;
    private javax.swing.JLabel activepoints3;
    private javax.swing.JLabel activepoints4;
    private javax.swing.JButton btnBall;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblScore;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel playerPoints1;
    private javax.swing.JLabel playerPoints2;
    private javax.swing.JLabel playerPoints3;
    private javax.swing.JLabel playerPoints4;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeRunning;
    // End of variables declaration//GEN-END:variables
}
