package games.Differences.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;

public class Differences extends javax.swing.JFrame {

    private Timer time;
    private int hundredths = 60, seconds = 29;
    public static int pointsPlayer1, pointsPlayer2, pointsPlayer3, pointsPlayer4, round = 0;
    public static ArrayList<Integer> playerPoints = new ArrayList<Integer>();

    public Differences() {

        time = new Timer(10, action);
        initComponents();
        configComponents();
        this.setLocationRelativeTo(null);

    }

    private void configComponents() {

        difference1.setVisible(false);
        difference2.setVisible(false);
        difference3.setVisible(false);
        difference4.setVisible(false);
        difference5.setVisible(false);
        difference6.setVisible(false);
        difference7.setVisible(false);
        difference8.setVisible(false);
        difference9.setVisible(false);
        difference10.setVisible(false);
        difference11.setVisible(false);
        difference12.setVisible(false);
        difference13.setVisible(false);
        difference14.setVisible(false);
        difference15.setVisible(false);
        difference16.setVisible(false);

        showDifferenceButton1.setVisible(false);
        showDifferenceButton3.setVisible(false);
        showDifferenceButton5.setVisible(false);
        showDifferenceButton7.setVisible(false);
        showDifferenceButton9.setVisible(false);
        showDifferenceButton11.setVisible(false);
        showDifferenceButton13.setVisible(false);
        showDifferenceButton15.setVisible(false);
        nextButton.setEnabled(false);

    }

    private ActionListener action = new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {

            hundredths--;

            if (hundredths == 0) {

                seconds --;
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

    private void updateTimeLabel() {

        String text = (seconds <= 9 ? "0" : "") + seconds + ":" + (hundredths <= 9 ? "0" : "") + hundredths + " s";
        timeRunning.setText(text);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        differencesPanel = new javax.swing.JPanel();
        difference1 = new javax.swing.JLabel();
        difference2 = new javax.swing.JLabel();
        difference3 = new javax.swing.JLabel();
        difference4 = new javax.swing.JLabel();
        difference5 = new javax.swing.JLabel();
        difference6 = new javax.swing.JLabel();
        difference7 = new javax.swing.JLabel();
        difference8 = new javax.swing.JLabel();
        difference9 = new javax.swing.JLabel();
        difference10 = new javax.swing.JLabel();
        difference11 = new javax.swing.JLabel();
        difference12 = new javax.swing.JLabel();
        difference13 = new javax.swing.JLabel();
        difference14 = new javax.swing.JLabel();
        difference15 = new javax.swing.JLabel();
        difference16 = new javax.swing.JLabel();
        imageBackground = new javax.swing.JLabel();
        showDifferenceButton1 = new javax.swing.JLabel();
        showDifferenceButton3 = new javax.swing.JLabel();
        showDifferenceButton5 = new javax.swing.JLabel();
        showDifferenceButton7 = new javax.swing.JLabel();
        showDifferenceButton9 = new javax.swing.JLabel();
        showDifferenceButton11 = new javax.swing.JLabel();
        showDifferenceButton13 = new javax.swing.JLabel();
        showDifferenceButton15 = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();
        timeRunning = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        playerPoints1 = new javax.swing.JLabel();
        playerPoints2 = new javax.swing.JLabel();
        playerPoints3 = new javax.swing.JLabel();
        playerPoints4 = new javax.swing.JLabel();
        activepoints1 = new javax.swing.JLabel();
        activepoints2 = new javax.swing.JLabel();
        activepoints3 = new javax.swing.JLabel();
        activepoints4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Differences Game");
        setResizable(false);

        differencesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        difference1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, -1));

        difference2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 650, -1, -1));

        difference3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        difference4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, -1, -1));

        difference5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        difference6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, -1, -1));

        difference7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        difference8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, -1));

        difference9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, -1, -1));

        difference10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, -1, -1));

        difference11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, -1, -1));

        difference12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 720, -1, -1));

        difference13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        difference14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, -1));

        difference15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        difference16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        differencesPanel.add(difference16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, -1, -1));

        imageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/ImageDifferences.jpg"))); // NOI18N
        differencesPanel.add(imageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 630));

        showDifferenceButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton1MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, -1));

        showDifferenceButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton3MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        showDifferenceButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton5MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        showDifferenceButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton7MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        showDifferenceButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton9MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, -1, -1));

        showDifferenceButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton11MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, -1, -1));

        showDifferenceButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton13MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        showDifferenceButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton15MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        informationPanel.setBackground(new java.awt.Color(255, 255, 255));
        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeRunning.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        timeRunning.setForeground(new java.awt.Color(0, 0, 0));
        timeRunning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeRunning.setText("30:00 s");
        informationPanel.add(timeRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 200, -1));

        startButton.setBackground(new java.awt.Color(0, 255, 204));
        startButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        informationPanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 180, 50));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Encuentra las 8 diferencias en el menor tiempo posible.");
        informationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        nextButton.setBackground(new java.awt.Color(0, 255, 204));
        nextButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        informationPanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 180, 50));

        playerPoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints1.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints1.setText("Puntos jugador 1:");
        informationPanel.add(playerPoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 180, 20));

        playerPoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints2.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints2.setText("Puntos jugador 2:");
        informationPanel.add(playerPoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 20));

        playerPoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints3.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints3.setText("Puntos jugador 3:");
        informationPanel.add(playerPoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 30));

        playerPoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        playerPoints4.setForeground(new java.awt.Color(0, 0, 0));
        playerPoints4.setText("Puntos jugador 4:");
        informationPanel.add(playerPoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, -1));

        activepoints1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints1.setForeground(new java.awt.Color(0, 0, 0));
        activepoints1.setText("0");
        informationPanel.add(activepoints1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 50, -1));

        activepoints2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints2.setForeground(new java.awt.Color(0, 0, 0));
        activepoints2.setText("0");
        informationPanel.add(activepoints2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 68, 50, -1));

        activepoints3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints3.setForeground(new java.awt.Color(0, 0, 0));
        activepoints3.setText("0");
        informationPanel.add(activepoints3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 106, 50, 20));

        activepoints4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        activepoints4.setForeground(new java.awt.Color(0, 0, 0));
        activepoints4.setText("0");
        informationPanel.add(activepoints4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 142, 50, 20));

        differencesPanel.add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(differencesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(differencesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void prueba() {
        
        if (round == 1) {
            
            pointsPlayer1 ++;            
            activepoints1.setText("" + pointsPlayer1);
            
        } else if (round == 2) {
            
            pointsPlayer2 ++;
            activepoints2.setText("" + pointsPlayer2);

        } else if (round == 3) {
            
            pointsPlayer3 ++;
            activepoints3.setText("" + pointsPlayer3);
            
        } else if (round == 4) {
            
            pointsPlayer4 ++;
            activepoints4.setText("" + pointsPlayer4);
            
        }
        
    }
    
    private void showDifferenceButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton1MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference1.isVisible()) {
                
                difference1.setVisible(true);
                difference2.setVisible(true);
                prueba();
                
            }
            
        }

    }//GEN-LAST:event_showDifferenceButton1MouseClicked

    private void showDifferenceButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton3MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference3.isVisible()) {
                
                difference3.setVisible(true);
                difference4.setVisible(true);
                prueba();
                
            }
            
        }
        
    }//GEN-LAST:event_showDifferenceButton3MouseClicked

    private void showDifferenceButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton5MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference5.isVisible()) {
                
                difference5.setVisible(true);
                difference6.setVisible(true);
                prueba();
                
            }
            
        }
        
    }//GEN-LAST:event_showDifferenceButton5MouseClicked

    private void showDifferenceButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton7MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference7.isVisible()) {
                
                difference7.setVisible(true);
                difference8.setVisible(true);
                prueba();
                
            }
            
        }

    }//GEN-LAST:event_showDifferenceButton7MouseClicked

    private void showDifferenceButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton9MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference9.isVisible()) {
                
                difference9.setVisible(true);
                difference10.setVisible(true);
                prueba();
                
            }
            
        }

    }//GEN-LAST:event_showDifferenceButton9MouseClicked

    private void showDifferenceButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton11MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference11.isVisible()) {
                
                difference11.setVisible(true);
                difference12.setVisible(true);
                prueba();
                
            }
            
        }

    }//GEN-LAST:event_showDifferenceButton11MouseClicked

    private void showDifferenceButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton13MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference13.isVisible()) {
                
                difference13.setVisible(true);
                difference14.setVisible(true);
                prueba();
                
            }
            
        }
        
    }//GEN-LAST:event_showDifferenceButton13MouseClicked

    private void showDifferenceButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton15MouseClicked
        
        if (time.isRunning()) {
            
            if (!difference15.isVisible()) {
                
                difference15.setVisible(true);
                difference16.setVisible(true);
                prueba();
                
            }
            
        }

    }//GEN-LAST:event_showDifferenceButton15MouseClicked

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        showDifferenceButton1.setVisible(true);
        showDifferenceButton3.setVisible(true);
        showDifferenceButton5.setVisible(true);
        showDifferenceButton7.setVisible(true);
        showDifferenceButton9.setVisible(true);
        showDifferenceButton11.setVisible(true);
        showDifferenceButton13.setVisible(true);
        showDifferenceButton15.setVisible(true);
        time.start();
        startButton.setEnabled(false);
        startButton.setText("START");
        round ++;

    }//GEN-LAST:event_startButtonActionPerformed


    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        if (round == 1) {
            
            playerPoints.add(pointsPlayer1);
            
        } else if (round == 2) {
            
            playerPoints.add(pointsPlayer2);
            
        } else if (round == 3) {
            
            playerPoints.add(pointsPlayer3);
            
        } else if (round == 4) {
            
            playerPoints.add(pointsPlayer4);
            
        }

        configComponents();
        hundredths = 60;
        seconds = 30;
        timeRunning.setText("30:00 s");
        startButton.setEnabled(true);

    }//GEN-LAST:event_nextButtonActionPerformed

    public static void main() {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                new Differences().setVisible(true);

            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activepoints1;
    private javax.swing.JLabel activepoints2;
    private javax.swing.JLabel activepoints3;
    private javax.swing.JLabel activepoints4;
    private javax.swing.JLabel difference1;
    private javax.swing.JLabel difference10;
    private javax.swing.JLabel difference11;
    private javax.swing.JLabel difference12;
    private javax.swing.JLabel difference13;
    private javax.swing.JLabel difference14;
    private javax.swing.JLabel difference15;
    private javax.swing.JLabel difference16;
    private javax.swing.JLabel difference2;
    private javax.swing.JLabel difference3;
    private javax.swing.JLabel difference4;
    private javax.swing.JLabel difference5;
    private javax.swing.JLabel difference6;
    private javax.swing.JLabel difference7;
    private javax.swing.JLabel difference8;
    private javax.swing.JLabel difference9;
    private javax.swing.JPanel differencesPanel;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel playerPoints1;
    private javax.swing.JLabel playerPoints2;
    private javax.swing.JLabel playerPoints3;
    private javax.swing.JLabel playerPoints4;
    private javax.swing.JLabel showDifferenceButton1;
    private javax.swing.JLabel showDifferenceButton11;
    private javax.swing.JLabel showDifferenceButton13;
    private javax.swing.JLabel showDifferenceButton15;
    private javax.swing.JLabel showDifferenceButton3;
    private javax.swing.JLabel showDifferenceButton5;
    private javax.swing.JLabel showDifferenceButton7;
    private javax.swing.JLabel showDifferenceButton9;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeRunning;
    // End of variables declaration//GEN-END:variables

}
