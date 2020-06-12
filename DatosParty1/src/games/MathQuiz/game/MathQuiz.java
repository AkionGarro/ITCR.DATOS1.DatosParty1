package games.MathQuiz.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MathQuiz extends javax.swing.JFrame {

    private Timer time;
    private int hundredths = 60, seconds = 30;

    Random rand = new Random();
    int total = 0;
    int b, c, d, e,n,m,k = 0;
    int points,option=0;
    boolean correct = false;
    
    public MathQuiz() {
        
        time = new Timer(10, action);
        initComponents();
        setLocationRelativeTo(null);
        
    }
    private ActionListener action = new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            hundredths --;
            
            if (hundredths == 0) {
                
                seconds--;
                hundredths = 60;
                
            }
            
            if (seconds == 0) {
                
                time.stop();
                hundredths = 0;
                
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        gamePanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
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
        lblPoints = new javax.swing.JLabel();
        pointsText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Math Quiz");
        setResizable(false);

        gamePanel.setBackground(new java.awt.Color(255, 255, 255));
        gamePanel.setForeground(new java.awt.Color(255, 255, 255));
        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        startButton.setForeground(new java.awt.Color(0, 0, 0));
        startButton.setText("Start");
        startButton.setVisible(true);
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        gamePanel.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 240, 80));

        finishButton.setBackground(new java.awt.Color(255, 255, 255));
        finishButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        finishButton.setForeground(new java.awt.Color(0, 0, 0));
        finishButton.setText("Finish");
        finishButton.setVisible(false);
        finishButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishButtonMouseClicked(evt);
            }
        });
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });
        gamePanel.add(finishButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 250, 80));

        buttonGroup1.add(option1Button);
        option1Button.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        option1Button.setVisible(false);
        option1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option1ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 30, -1));

        buttonGroup1.add(option2Button);
        option2Button.setVisible(false);
        option2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option2ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        buttonGroup1.add(option3Button);
        option3Button.setVisible(false);
        option3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option3ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option3Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        buttonGroup1.add(option4Button);
        option4Button.setForeground(new java.awt.Color(255, 255, 255));
        option4Button.setVisible(false);
        option4Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option4ButtonMouseClicked(evt);
            }
        });
        gamePanel.add(option4Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        answer1Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer1Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 50, 28));

        answer2Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 50, 30));

        answer3Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 50, 30));

        answer4Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        gamePanel.add(answer4Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 50, 30));

        operationLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        operationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamePanel.add(operationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 500, 150));

        informationPanel.setBackground(new java.awt.Color(255, 255, 255));
        informationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        timeRunning.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        timeRunning.setForeground(new java.awt.Color(0, 0, 0));
        timeRunning.setText("00:00 s");
        informationPanel.add(timeRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        gameTittle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        gameTittle.setForeground(new java.awt.Color(0, 0, 0));
        gameTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameTittle.setText("¡Realiza la operación matemática aleatoria!");
        informationPanel.add(gameTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        gamePanel.add(informationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 130));

        lblPoints.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamePanel.add(lblPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 60));

        pointsText.setVisible(false);
        pointsText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pointsText.setForeground(new java.awt.Color(0, 0, 0));
        pointsText.setText("Points");
        gamePanel.add(pointsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked

        quizMath();
        finishButton.setVisible(true);
        startButton.setVisible(false);
        option2Button.setVisible(true);
        option3Button.setVisible(true);
        option4Button.setVisible(true);
        option1Button.setVisible(true);
        pointsText.setVisible(true);
        lblPoints.setText(String.valueOf(points));

    }//GEN-LAST:event_startButtonMouseClicked

    private void option2ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2ButtonMouseClicked
        
        if (option == 3) {
            
            correct = true;
            
        }
        
    }//GEN-LAST:event_option2ButtonMouseClicked

    private void option3ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3ButtonMouseClicked
        
        if (option == 2) {
            
            correct = true;
            
        }
        
    }//GEN-LAST:event_option3ButtonMouseClicked

    private void option4ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4ButtonMouseClicked
        
        if (option == 1) {
            
            correct = true;
            
        }
        
    }//GEN-LAST:event_option4ButtonMouseClicked

    private void finishButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishButtonMouseClicked
        
        if (correct == true) {
            
            JOptionPane.showMessageDialog(this, "Felicidades tu respuesta es correcta");
            points+=1;
            nextquestion();
            lblPoints.setText(String.valueOf(points));
            buttonGroup1.clearSelection();
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Tu respuesta es incorrecta");
            nextquestion();
            lblPoints.setText(String.valueOf(points));
            buttonGroup1.clearSelection();
                         
        }
               
    }//GEN-LAST:event_finishButtonMouseClicked

    private void option1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1ButtonMouseClicked
        
        if (option == 4) {
            
            correct = true;
            
        }
        
    }//GEN-LAST:event_option1ButtonMouseClicked

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        time.start();
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        
        lblPoints.setText(String.valueOf(points));
        
    }//GEN-LAST:event_finishButtonActionPerformed
    
    public void nextquestion(){
        
        quizMath();
        
    }
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

    public static void main() {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new MathQuiz().setVisible(true);

            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answer1Label;
    private javax.swing.JLabel answer2Label;
    private javax.swing.JLabel answer3Label;
    private javax.swing.JLabel answer4Label;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton finishButton;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel gameTittle;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel operationLabel;
    private javax.swing.JRadioButton option1Button;
    private javax.swing.JRadioButton option2Button;
    private javax.swing.JRadioButton option3Button;
    private javax.swing.JRadioButton option4Button;
    private javax.swing.JLabel pointsText;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel timeRunning;
    // End of variables declaration//GEN-END:variables

}
