package games.RockPaperScissors.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import mainGame.Board;

/**
 * This class is in charge of all the graphic configuration of the components
 * and other functions found on the Rock, Paper, Scissors minigame.
 */
public class RockPaperScissors extends javax.swing.JFrame {
    
    int turn = 0;
    int yourScore = 0;
    int computerScore = 0;
    int userElection;
    int computerElection;
    Random random;
     public int pointsPlayer1, pointsPlayer2, pointsPlayer3, pointsPlayer4, round = 0;
    public ArrayList<Integer> playerPoints = new ArrayList<Integer>();
    private final int firstPlace = 100, secondPlace = 75, thirdPlace = 50, lastPlace = 25;
    public int playerSize = Board.players.size();

    /**
     * This is the constructor of the Rock, Paper, Scissors class, where the initial
     * configuration of the components is made.
     */
    public RockPaperScissors() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        lblWinner.setVisible(false);  
        
        switch (playerSize) {
                
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblYourElection = new javax.swing.JLabel();
        lblComputerElection = new javax.swing.JLabel();
        btnRock = new javax.swing.JLabel();
        btnPaper = new javax.swing.JLabel();
        btnScissors = new javax.swing.JLabel();
        lblTurn = new javax.swing.JLabel();
        lblYourScore = new javax.swing.JLabel();
        lblComputerScore = new javax.swing.JLabel();
        lblWinner = new javax.swing.JLabel();
        btnInstrucctions = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnNext1 = new javax.swing.JButton();
        playerPoints1 = new javax.swing.JLabel();
        playerPoints2 = new javax.swing.JLabel();
        playerPoints3 = new javax.swing.JLabel();
        playerPoints4 = new javax.swing.JLabel();
        activepoints1 = new javax.swing.JLabel();
        activepoints2 = new javax.swing.JLabel();
        activepoints3 = new javax.swing.JLabel();
        activepoints4 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblYourElection.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblYourElection.setForeground(new java.awt.Color(65, 65, 65));
        lblYourElection.setText("Tú elejiste:");
        panel.add(lblYourElection, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblComputerElection.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblComputerElection.setForeground(new java.awt.Color(65, 65, 65));
        lblComputerElection.setText("La computadora eligió:");
        panel.add(lblComputerElection, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        btnRock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/RockPaperScissors/images/rock.png"))); // NOI18N
        btnRock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRockMouseClicked(evt);
            }
        });
        panel.add(btnRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        btnPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/RockPaperScissors/images/paper.png"))); // NOI18N
        btnPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaperMouseClicked(evt);
            }
        });
        panel.add(btnPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        btnScissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/RockPaperScissors/images/scissors.png"))); // NOI18N
        btnScissors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScissorsMouseClicked(evt);
            }
        });
        panel.add(btnScissors, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        lblTurn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTurn.setForeground(new java.awt.Color(60, 65, 65));
        lblTurn.setText("Turno: 0");
        panel.add(lblTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        lblYourScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblYourScore.setForeground(new java.awt.Color(60, 65, 65));
        lblYourScore.setText("Tu puntaje: 0");
        panel.add(lblYourScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        lblComputerScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblComputerScore.setForeground(new java.awt.Color(60, 65, 65));
        lblComputerScore.setText("Puntaje de la computadora: 0");
        panel.add(lblComputerScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        lblWinner.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblWinner.setForeground(new java.awt.Color(60, 65, 65));
        lblWinner.setText("El ganador es:");
        panel.add(lblWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        btnInstrucctions.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInstrucctions.setText("Instrucciones");
        btnInstrucctions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrucctionsActionPerformed(evt);
            }
        });
        panel.add(btnInstrucctions, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btnNext.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNext.setText("Siguiente");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        panel.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 120, 40));

        btnNext1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNext1.setText("Exit");
        btnNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNext1ActionPerformed(evt);
            }
        });
        panel.add(btnNext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 120, 40));

        playerPoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints1.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints1.setText("Puntos jugador 1:");
        panel.add(playerPoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 180, 20));

        playerPoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints2.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints2.setText("Puntos jugador 2:");
        panel.add(playerPoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 180, 20));

        playerPoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints3.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints3.setText("Puntos jugador 3:");
        panel.add(playerPoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 180, 30));

        playerPoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints4.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints4.setText("Puntos jugador 4:");
        panel.add(playerPoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 180, -1));

        activepoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints1.setForeground(new java.awt.Color(0, 0, 0));
        activepoints1.setText("0");
        panel.add(activepoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 50, -1));

        activepoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints2.setForeground(new java.awt.Color(0, 0, 0));
        activepoints2.setText("0");
        panel.add(activepoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 50, -1));

        activepoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints3.setForeground(new java.awt.Color(0, 0, 0));
        activepoints3.setText("0");
        panel.add(activepoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 50, 20));

        activepoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints4.setForeground(new java.awt.Color(0, 0, 0));
        activepoints4.setText("0");
        panel.add(activepoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 50, 20));

        startButton.setBackground(new java.awt.Color(0, 255, 204));
        startButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        panel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Method in charge of detecting when the player press the rock button.
     */
    private void btnRockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRockMouseClicked
        
        if (yourScore == 3 || computerScore == 3) {
            
            finishGame();
            
        } else {            
            
            random = new Random();
            userElection = 1;
            computerElection = random.nextInt(3) + 1;
            turn ++;
            lblTurn.setText("Turno: " + Integer.toString(turn));

            lblYourElection.setText("Tú elejiste: Piedra");

            if (computerElection == 1) {

                lblComputerElection.setText("La computadora eligió: Piedra");

            } else if (computerElection == 2) {                

                lblComputerElection.setText("La computadora eligió: Papel");
                computerScore ++;
                lblComputerScore.setText("Puntaje de la computadora: " + computerScore);

                } else {

                    lblComputerElection.setText("La computadora eligió: Tijeras");
                    yourScore ++;
                    updatePlayersPoints();
                    lblYourScore.setText("Tu puntaje: " + Integer.toString(yourScore));

                }
        
        }
        
        if (yourScore == 3 || computerScore == 3) {
            
            finishGame();
            
        }        
        
    }//GEN-LAST:event_btnRockMouseClicked

    /**
     * Method in charge of detecting when the player press the paper button.
     */
    private void btnPaperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPaperMouseClicked
        
        if (yourScore == 3 || computerScore == 3) {
            
            finishGame();
            
        } else {
        
            random = new Random();
            userElection = 2;
            computerElection = random.nextInt(3) + 1;
            turn ++;
            lblTurn.setText("Turno: " + Integer.toString(turn));

            lblYourElection.setText("Tú elejiste: Papel");

            if (computerElection == 1) {

                lblComputerElection.setText("La computadora eligió: Piedra");
                yourScore ++;
                updatePlayersPoints();
                lblYourScore.setText("Tu puntaje: " + Integer.toString(yourScore));

            } else if (computerElection == 2) {

                lblComputerElection.setText("La computadora eligió: Papel");

                } else {

                    lblComputerElection.setText("La computadora eligió: Tijeras");
                    computerScore ++;
                    lblComputerScore.setText("Puntaje de la computadora: " + computerScore);

                }
        
        }
        
        if (yourScore == 3 || computerScore == 3) {
                        
            finishGame();
            
        } 
                
    }//GEN-LAST:event_btnPaperMouseClicked
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
    public void updatePlayersPoints() {

        switch (playerSize) {

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

        }}
    /**
     * Method in charge of detecting when the player press the scissors button.
     */
    private void btnScissorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScissorsMouseClicked
        
        if (yourScore == 3 || computerScore == 3) {
            
            finishGame();
            
        } else {
            
            random = new Random();
            userElection = 3;
            computerElection = random.nextInt(3) + 1;
            turn ++;
            lblTurn.setText("Turno: " + Integer.toString(turn));

            lblYourElection.setText("Tú elejiste: Tijeras");

            if (computerElection == 1) {

                lblComputerElection.setText("La computadora eligió: Piedra");
                computerScore ++;
                lblComputerScore.setText("Puntaje de la computadora: " + computerScore);

            } else if (computerElection == 2) {

                    lblComputerElection.setText("La computadora eligió: Papel");
                    yourScore ++;
                    updatePlayersPoints();
                    System.out.println(""+playerPoints);
                    lblYourScore.setText("Tu puntaje: " + Integer.toString(yourScore));

                } else {

                    lblComputerElection.setText("La computadora eligió: Tijeras");

                }
        
        }
        
        if (yourScore == 3 || computerScore == 3) {
            
            finishGame();
            
        } 
         
    }//GEN-LAST:event_btnScissorsMouseClicked

    /**
     * Method in charge of showing the instructions of the minigame.
     */
    private void btnInstrucctionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrucctionsActionPerformed
        
        String instructions =   "El objetivo consiste en vencer al oponente seleccionando el arma que gana, según las siguientes reglas:\n" +
                                "\n" +
                                "   * La piedra aplasta la tijera. (Gana la piedra).\n" +
                                "   * La tijera corta el papel. (Gana la tijera).\n" +
                                "   * El papel envuelve la piedra. (Gana el papel).S\n" +
                                "\n" +
                                "En caso de empate (que los jugadores elijan el mismo elemento), se juega otra vez.\n" +
                                "Esto se repite hasta que uno de los jugadores obtenga tres puntos, y será entonces el vencedor del juego.\n" +  
                                "\n";
        
        JOptionPane.showMessageDialog(null, instructions);
        
    }//GEN-LAST:event_btnInstrucctionsActionPerformed

    /**
     * Method in charge of starting a new minigame to pass the turn to the other players.
     */
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        


    }//GEN-LAST:event_btnNextActionPerformed

    private void btnNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNext1ActionPerformed

        dispose();

        if (Board.round == 13) {

            Board.mingameFinished = true;
            Board.checkEndGame();

        }

    }//GEN-LAST:event_btnNext1ActionPerformed

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        turn = 0;
        yourScore = 0;
        computerScore = 0;
        lblYourScore.setText("Tu puntaje: " + Integer.toString(yourScore));
        lblComputerScore.setText("Puntaje de la computadora: " + computerScore);
        lblTurn.setText("Turno: " + Integer.toString(turn));
        switch (playerSize) {

            case 2:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    startButton.setEnabled(true);
                    btnRock.setEnabled(false);
                    btnPaper.setEnabled(false);
                    btnScissors.setEnabled(false);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    startButton.setEnabled(false);
                    btnNext.setEnabled(false);
                    btnRock.setEnabled(false);
                    btnPaper.setEnabled(false);
                    btnScissors.setEnabled(false);

                }

                break;

            case 3:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    startButton.setEnabled(true);
                    btnNext.setEnabled(false);
                    

                }

                break;

            case 4:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    startButton.setEnabled(true);
                    
                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    startButton.setEnabled(true);

                } else if (round == 4) {

                    playerPoints.add(pointsPlayer4);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    sendPlayer4Coins();
                    startButton.setEnabled(false);
                    btnNext.setEnabled(false);

                }

                break;

            default:

                break;

        }
    }//GEN-LAST:event_btnNextMouseClicked

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        lblWinner.setVisible(false);
        btnRock.setEnabled(true);
        btnPaper.setEnabled(true);
        btnScissors.setEnabled(true);
        startButton.setEnabled(false);
        startButton.setText("START");
        round++;
    }//GEN-LAST:event_startButtonActionPerformed

    /**
     * Method in charge of finishing the minigame.
     * 
     * @return The result is true if someone has win the game, otherwise, it will return false.
     */
    private boolean finishGame() {
        
        boolean result = false;
        
        if (yourScore == 3) {

            lblWinner.setVisible(true);
            lblWinner.setText("El ganador es: El Jugador");
            result = true;

            } else if (computerScore == 3) {

                lblWinner.setVisible(true);
                lblWinner.setText("El ganador es: La Computadora");
                result = true;

            }
        
        return result;
        
    }
    
    /**
     * Method in charge start the minigame.
     */
    public static void main() {

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new RockPaperScissors().setVisible(true);
                
            }
            
        });
        
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activepoints1;
    private javax.swing.JLabel activepoints2;
    private javax.swing.JLabel activepoints3;
    private javax.swing.JLabel activepoints4;
    private javax.swing.JButton btnInstrucctions;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNext1;
    private javax.swing.JLabel btnPaper;
    private javax.swing.JLabel btnRock;
    private javax.swing.JLabel btnScissors;
    private javax.swing.JLabel lblComputerElection;
    private javax.swing.JLabel lblComputerScore;
    private javax.swing.JLabel lblTurn;
    private javax.swing.JLabel lblWinner;
    private javax.swing.JLabel lblYourElection;
    private javax.swing.JLabel lblYourScore;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel playerPoints1;
    private javax.swing.JLabel playerPoints2;
    private javax.swing.JLabel playerPoints3;
    private javax.swing.JLabel playerPoints4;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

}

