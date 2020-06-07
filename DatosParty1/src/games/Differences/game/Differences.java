package games.Differences.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.Timer;

public class Differences extends javax.swing.JFrame {

    private Timer time;
    private int hundredths = 0, seconds = 0, minutes = 0, hours = 0;

    public Differences() {
        time = new Timer(10, action);
        initComponents();
        configComponents();

    }

    private void configComponents() {

        this.setLocationRelativeTo(null);
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

        finishButton.setEnabled(false);

    }

    private ActionListener action = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            hundredths++;
            if (hundredths == 100) {
                seconds++;
                hundredths = 0;
            }
            if (seconds == 60) {
                minutes++;
                seconds = 0;
            }
            if (minutes == 60) {
                hours++;
                minutes = 0;

            }

            updateTimeLabel();
        }
    };

    private void updateTimeLabel() {
        String text = (hours <= 9 ? "0" : "") + hours + ":" + (minutes <= 9 ? "0" : "") + minutes + ":" + (seconds <= 9 ? "0" : "") + seconds + ":" + (hundredths <= 9 ? "0" : "") + hundredths;
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
        showDifferenceButton2 = new javax.swing.JLabel();
        showDifferenceButton3 = new javax.swing.JLabel();
        showDifferenceButton4 = new javax.swing.JLabel();
        showDifferenceButton5 = new javax.swing.JLabel();
        showDifferenceButton6 = new javax.swing.JLabel();
        showDifferenceButton7 = new javax.swing.JLabel();
        showDifferenceButton8 = new javax.swing.JLabel();
        showDifferenceButton9 = new javax.swing.JLabel();
        showDifferenceButton10 = new javax.swing.JLabel();
        showDifferenceButton11 = new javax.swing.JLabel();
        showDifferenceButton12 = new javax.swing.JLabel();
        showDifferenceButton13 = new javax.swing.JLabel();
        showDifferenceButton14 = new javax.swing.JLabel();
        showDifferenceButton15 = new javax.swing.JLabel();
        showDifferenceButton16 = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();
        timeRunning = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        finishButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        showDifferenceButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton2MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 650, -1, -1));

        showDifferenceButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton3MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        showDifferenceButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton4MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, -1, -1));

        showDifferenceButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton5MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        showDifferenceButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton6MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, -1, -1));

        showDifferenceButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton7MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        showDifferenceButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton8MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, -1));

        showDifferenceButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton9MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, -1, -1));

        showDifferenceButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton10MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, -1, -1));

        showDifferenceButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton11MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 720, -1, -1));

        showDifferenceButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton12MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 720, -1, -1));

        showDifferenceButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton13MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        showDifferenceButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton14MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, -1));

        showDifferenceButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton15MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        showDifferenceButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/games/Differences/images/checkDifferences.png"))); // NOI18N
        showDifferenceButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDifferenceButton16MouseClicked(evt);
            }
        });
        differencesPanel.add(showDifferenceButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, -1, -1));

        informationPanel.setBackground(new java.awt.Color(255, 255, 255));
        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeRunning.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        timeRunning.setForeground(new java.awt.Color(0, 0, 0));
        timeRunning.setText("00:00:00:00");
        informationPanel.add(timeRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        startButton.setBackground(new java.awt.Color(0, 255, 204));
        startButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        informationPanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 80, 140, 50));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Encuentra las 8 diferencias en el menor tiempo posible.");
        informationPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        finishButton.setBackground(new java.awt.Color(0, 255, 204));
        finishButton.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        finishButton.setText("FINISH");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });
        informationPanel.add(finishButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 80, 140, 50));

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

    private void showDifferenceButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton1MouseClicked
        difference1.setVisible(true);
        difference2.setVisible(true);


    }//GEN-LAST:event_showDifferenceButton1MouseClicked

    private void showDifferenceButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton3MouseClicked
        difference3.setVisible(true);
        difference4.setVisible(true);


    }//GEN-LAST:event_showDifferenceButton3MouseClicked

    private void showDifferenceButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton5MouseClicked
        difference5.setVisible(true);
        difference6.setVisible(true);


    }//GEN-LAST:event_showDifferenceButton5MouseClicked

    private void showDifferenceButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton7MouseClicked
        difference7.setVisible(true);
        difference8.setVisible(true);


    }//GEN-LAST:event_showDifferenceButton7MouseClicked

    private void showDifferenceButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton9MouseClicked
        difference9.setVisible(true);
        difference10.setVisible(true);


    }//GEN-LAST:event_showDifferenceButton9MouseClicked

    private void showDifferenceButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton11MouseClicked
        difference11.setVisible(true);
        difference12.setVisible(true);


    }//GEN-LAST:event_showDifferenceButton11MouseClicked

    private void showDifferenceButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton13MouseClicked
        difference13.setVisible(true);
        difference14.setVisible(true);


    }//GEN-LAST:event_showDifferenceButton13MouseClicked

    private void showDifferenceButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton15MouseClicked
        difference15.setVisible(true);
        difference16.setVisible(true);


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

        finishButton.setEnabled(true);


    }//GEN-LAST:event_startButtonActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed

        if (difference1.isVisible() == true && difference3.isVisible() == true && difference5.isVisible() == true
                && difference7.isVisible() == true && difference9.isVisible() == true && difference11.isVisible() == true
                && difference13.isVisible() == true && difference15.isVisible() == true) {
            time.stop();
            startButton.setEnabled(false);
            finishButton.setEnabled(false);

            if (time.isRunning() == false) {

                playerTime();

            }

        } else {
            JOptionPane.showMessageDialog(null, "No se han encontrado las 8 diferencias.");

        }


    }//GEN-LAST:event_finishButtonActionPerformed

    private void showDifferenceButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton2MouseClicked
        difference1.setVisible(true);
        difference2.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton2MouseClicked

    private void showDifferenceButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton4MouseClicked
        difference3.setVisible(true);
        difference4.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton4MouseClicked

    private void showDifferenceButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton6MouseClicked
        difference5.setVisible(true);
        difference6.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton6MouseClicked

    private void showDifferenceButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton8MouseClicked
        difference7.setVisible(true);
        difference8.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton8MouseClicked

    private void showDifferenceButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton10MouseClicked
        difference9.setVisible(true);
        difference10.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton10MouseClicked

    private void showDifferenceButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton12MouseClicked
        difference11.setVisible(true);
        difference12.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton12MouseClicked

    private void showDifferenceButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton14MouseClicked
        difference13.setVisible(true);
        difference14.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton14MouseClicked

    private void showDifferenceButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDifferenceButton16MouseClicked
        difference15.setVisible(true);
        difference16.setVisible(true);
    }//GEN-LAST:event_showDifferenceButton16MouseClicked

    public int getHundredths() {
        return hundredths;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public void playerTime() {


        System.out.println("El tiempo del jugador fue de " + (getHours() <= 9 ? "0" : "") + getHours() + ":" + (getMinutes() <= 9 ? "0" : "") + getMinutes() + ":" + (getSeconds() <= 9 ? "0" : "") + getSeconds() + ":" + (getHundredths() <= 9 ? "0" : "") + getHundredths());

    }

    public Timer getTime() {
        System.out.println("");
        return time;
    }
    
    




    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Differences().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton finishButton;
    private javax.swing.JLabel imageBackground;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel showDifferenceButton1;
    private javax.swing.JLabel showDifferenceButton10;
    private javax.swing.JLabel showDifferenceButton11;
    private javax.swing.JLabel showDifferenceButton12;
    private javax.swing.JLabel showDifferenceButton13;
    private javax.swing.JLabel showDifferenceButton14;
    private javax.swing.JLabel showDifferenceButton15;
    private javax.swing.JLabel showDifferenceButton16;
    private javax.swing.JLabel showDifferenceButton2;
    private javax.swing.JLabel showDifferenceButton3;
    private javax.swing.JLabel showDifferenceButton4;
    private javax.swing.JLabel showDifferenceButton5;
    private javax.swing.JLabel showDifferenceButton6;
    private javax.swing.JLabel showDifferenceButton7;
    private javax.swing.JLabel showDifferenceButton8;
    private javax.swing.JLabel showDifferenceButton9;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeRunning;
    // End of variables declaration//GEN-END:variables
}
