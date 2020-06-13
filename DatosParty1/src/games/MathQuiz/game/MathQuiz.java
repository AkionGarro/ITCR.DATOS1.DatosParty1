package games.MathQuiz.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import mainGame.Board;

/**
 * This class is in charge of all the graphic configuration of the components
 * and other functions found on the Math Quiz minigame.
 */
public class MathQuiz extends javax.swing.JFrame {

    private Timer time;
    private int hundredths = 60, seconds = 60;
    public int pointsPlayer1, pointsPlayer2, pointsPlayer3, pointsPlayer4, round = 0;
    public ArrayList<Integer> playerPoints = new ArrayList<Integer>();
    private final int firstPlace = 100, secondPlace = 75, thirdPlace = 50, lastPlace = 25;
    public int playerSize = Board.players.size();

    Random rand = new Random();
    int total = 0;
    int b, c, d, e, n, m, k = 0;
    int points, option = 0;
    boolean correct = false;

    /**
     * This is the constructor of the Math Quiz class, where the initial
     * configuration of the components is made.
     */
    public MathQuiz() {

        time = new Timer(10, action);
        initComponents();
        configComponents();
        setLocationRelativeTo(null);

    }

    /**
     * Method in charge of the basic configuration of the graphic components of
     * the math Quiz window.
     */
    private void configComponents() {

        nextButton.setEnabled(false);

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

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        gamePanel = new javax.swing.JPanel();
        checkButton = new javax.swing.JButton();
        option1Button = new javax.swing.JRadioButton();
        option2Button = new javax.swing.JRadioButton();
        option3Button = new javax.swing.JRadioButton();
        option4Button = new javax.swing.JRadioButton();
        answer1Label = new javax.swing.JLabel();
        answer2Label = new javax.swing.JLabel();
        answer3Label = new javax.swing.JLabel();
        answer4Label = new javax.swing.JLabel();
        operationLabel = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();
        timeRunning = new javax.swing.JLabel();
        gameTittle = new javax.swing.JLabel();
        playerPoints1 = new javax.swing.JLabel();
        playerPoints2 = new javax.swing.JLabel();
        playerPoints3 = new javax.swing.JLabel();
        playerPoints4 = new javax.swing.JLabel();
        activepoints1 = new javax.swing.JLabel();
        activepoints2 = new javax.swing.JLabel();
        activepoints4 = new javax.swing.JLabel();
        activepoints3 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        btnInstructions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Math Quiz");
        setResizable(false);

        gamePanel.setBackground(new java.awt.Color(255, 255, 255));
        gamePanel.setForeground(new java.awt.Color(255, 255, 255));
        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkButton.setBackground(new java.awt.Color(0, 255, 204));
        checkButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        checkButton.setForeground(new java.awt.Color(0, 0, 0));
        checkButton.setText("Check Answer");
        checkButton.setVisible(false);
        checkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkButtonMouseClicked(evt);
            }
        });
        gamePanel.add(checkButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 740, 250, 80));

        option1Button.setBackground(new java.awt.Color(0, 255, 204));
        buttonGroup1.add(option1Button);
        option1Button.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        option1Button.setVisible(false);
        option1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option1ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 30, -1));

        option2Button.setBackground(new java.awt.Color(0, 255, 204));
        buttonGroup1.add(option2Button);
        option2Button.setVisible(false);
        option2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option2ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 700, -1, -1));

        option3Button.setBackground(new java.awt.Color(0, 255, 204));
        buttonGroup1.add(option3Button);
        option3Button.setVisible(false);
        option3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option3ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, -1, 30));

        option4Button.setBackground(new java.awt.Color(0, 255, 204));
        buttonGroup1.add(option4Button);
        option4Button.setForeground(new java.awt.Color(255, 255, 255));
        option4Button.setVisible(false);
        option4Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option4ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option4Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, -1, -1));

        answer1Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 50, 28));

        answer2Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 700, 50, 30));

        answer3Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 50, 30));

        answer4Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 700, 50, 30));

        operationLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        operationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamePanel.add(operationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 550, 150));

        informationPanel.setBackground(new java.awt.Color(255, 255, 255));
        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeRunning.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        timeRunning.setForeground(new java.awt.Color(0, 0, 0));
        timeRunning.setText("00:00 s");
        informationPanel.add(timeRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        gameTittle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        gameTittle.setForeground(new java.awt.Color(0, 0, 0));
        gameTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameTittle.setText("¡Realiza la operación matemática aleatoria!");
        informationPanel.add(gameTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 550, 60));

        playerPoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints1.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints1.setText("Puntos jugador 1:");
        informationPanel.add(playerPoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 20));

        playerPoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints2.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints2.setText("Puntos jugador 2:");
        informationPanel.add(playerPoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 20));

        playerPoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints3.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints3.setText("Puntos jugador 3:");
        informationPanel.add(playerPoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 180, 30));

        playerPoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints4.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints4.setText("Puntos jugador 4:");
        informationPanel.add(playerPoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 180, -1));

        activepoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints1.setForeground(new java.awt.Color(0, 0, 0));
        activepoints1.setText("0");
        informationPanel.add(activepoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, -1));

        activepoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints2.setForeground(new java.awt.Color(0, 0, 0));
        activepoints2.setText("0");
        informationPanel.add(activepoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, -1));

        activepoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints4.setForeground(new java.awt.Color(0, 0, 0));
        activepoints4.setText("0");
        informationPanel.add(activepoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 372, 50, 20));

        activepoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints3.setForeground(new java.awt.Color(0, 0, 0));
        activepoints3.setText("0");
        informationPanel.add(activepoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 335, 50, 20));

        startButton.setBackground(new java.awt.Color(0, 255, 204));
        startButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        informationPanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 50));

        nextButton.setBackground(new java.awt.Color(0, 255, 204));
        nextButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nextButton.setText("Next Player");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        informationPanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 190, 50));

        exitButton.setBackground(new java.awt.Color(0, 255, 204));
        exitButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        informationPanel.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 180, 50));

        btnInstructions.setBackground(new java.awt.Color(0, 255, 204));
        btnInstructions.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInstructions.setText("Instrucciones");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });
        informationPanel.add(btnInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 560, 50));

        gamePanel.add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method in charge of detecting when the second button is pressed.
     */
    private void option2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2ButtonMouseClicked

        if (option == 3) {

            correct = true;
        }


    }//GEN-LAST:event_option2ButtonMouseClicked

    /**
     * Method in charge of detecting when the third button is pressed.
     */
    private void option3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3ButtonMouseClicked

        if (option == 2) {

            correct = true;

        }


    }//GEN-LAST:event_option3ButtonMouseClicked

    /**
     * Method in charge of detecting when the fourth button is pressed.
     */
    private void option4ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4ButtonMouseClicked

        if (option == 1) {

            correct = true;

        }

    }//GEN-LAST:event_option4ButtonMouseClicked

    /**
     * Method in charge of checking if the player press the correct option.
     */
    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked

        if (time.isRunning()) {
            if (correct == true) {
                updatePlayersPoints();
                JOptionPane.showMessageDialog(this, "Felicidades tu respuesta es correcta");
                points += 1;
                nextquestion();
                //lblPoints.setText(String.valueOf(points));
                buttonGroup1.clearSelection();

            } else {

                JOptionPane.showMessageDialog(this, "Tu respuesta es incorrecta");
                nextquestion();
                //lblPoints.setText(String.valueOf(points));
                buttonGroup1.clearSelection();

            }
            correct = false;
        }


    }//GEN-LAST:event_checkButtonMouseClicked

    /**
     * Method in charge of detecting when the first button is pressed.
     */
    private void option1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1ButtonMouseClicked

        if (option == 4) {
            correct = true;

        }

    }//GEN-LAST:event_option1ButtonMouseClicked

    /**
     * Method in charge start the minigame.
     */
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        option1Button.setVisible(true);
        option2Button.setVisible(true);
        option3Button.setVisible(true);
        option4Button.setVisible(true);
        checkButton.setVisible(true);
        quizMath();
        time.start();
        startButton.setEnabled(false);
        startButton.setText("START");
        round++;

    }//GEN-LAST:event_startButtonActionPerformed

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

    /**
     * Method in charge of starting a new minigame to pass the turn to the other
     * players.
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        switch (playerSize) {

            case 2:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    hundredths = 60;
                    seconds = 30;
                    timeRunning.setText("20:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    hundredths = 60;
                    seconds = 29;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(false);
                    nextButton.setEnabled(false);

                }

                break;

            case 3:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    hundredths = 60;
                    seconds = 29;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    hundredths = 60;
                    seconds = 29;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    Collections.sort(playerPoints, Collections.reverseOrder());
                    sendPlayer1Coins();
                    sendPlayer2Coins();
                    sendPlayer3Coins();
                    configComponents();
                    hundredths = 60;
                    seconds = 29;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(false);
                    nextButton.setEnabled(false);

                }

                break;

            case 4:

                if (round == 1) {

                    playerPoints.add(pointsPlayer1);
                    hundredths = 60;
                    seconds = 29;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 2) {

                    playerPoints.add(pointsPlayer2);
                    hundredths = 60;
                    seconds = 29;
                    timeRunning.setText("30:00 s");
                    startButton.setEnabled(true);

                } else if (round == 3) {

                    playerPoints.add(pointsPlayer3);
                    hundredths = 60;
                    seconds = 29;
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
                    seconds = 29;
                    timeRunning.setText("30:00 s");
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

        switch (playerSize) {

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
     * Method in charge of updating the visible questions on the window.
     */
    public void nextquestion() {
        quizMath();

    }

    /**
     * Method in charge updating the players answers.
     */
    public void quizMath() {

        option = rand.nextInt(4) + 1;
        n = rand.nextInt(50) + 1;
        m = rand.nextInt(50) + 1;
        k = rand.nextInt(50) + 1;
        total = (n + m - k);
        operationLabel.setText(String.valueOf(n + "+" + m + "-" + k));

        switch (option) {

            case 1:

                answer4Label.setText(String.valueOf(total));
                answer2Label.setText(String.valueOf(total - 1));
                answer3Label.setText(String.valueOf(total + 2));
                answer1Label.setText(String.valueOf(total / 2));

                break;

            case 2:

                answer3Label.setText(String.valueOf(total));
                answer4Label.setText(String.valueOf(total - 1));
                answer1Label.setText(String.valueOf(total + 2));
                answer2Label.setText(String.valueOf(total / 2));

                break;

            case 3:

                answer2Label.setText(String.valueOf(total));
                answer4Label.setText(String.valueOf(total - 1));
                answer1Label.setText(String.valueOf(total + 2));
                answer3Label.setText(String.valueOf(total / 2));

                break;

            case 4:

                answer1Label.setText(String.valueOf(total));
                answer4Label.setText(String.valueOf(total - 1));
                answer3Label.setText(String.valueOf(total + 2));
                answer2Label.setText(String.valueOf(total / 2));

                break;

        }

    }

    /**
     * Method in charge start the minigame.
     */
    public static void main() {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new MathQuiz().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activepoints1;
    private javax.swing.JLabel activepoints2;
    private javax.swing.JLabel activepoints3;
    private javax.swing.JLabel activepoints4;
    private javax.swing.JLabel answer1Label;
    private javax.swing.JLabel answer2Label;
    private javax.swing.JLabel answer3Label;
    private javax.swing.JLabel answer4Label;
    private javax.swing.JButton btnInstructions;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel gameTittle;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel operationLabel;
    private javax.swing.JRadioButton option1Button;
    private javax.swing.JRadioButton option2Button;
    private javax.swing.JRadioButton option3Button;
    private javax.swing.JRadioButton option4Button;
    private javax.swing.JLabel playerPoints1;
    private javax.swing.JLabel playerPoints2;
    private javax.swing.JLabel playerPoints3;
    private javax.swing.JLabel playerPoints4;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeRunning;
    // End of variables declaration//GEN-END:variables

}
