package games.MathQuiz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author gabos
 */
public class MathQuiz extends javax.swing.JFrame {

        Random rand = new Random();
        int n = rand.nextInt(50) + 1;
        int m = rand.nextInt(50) + 1;
        int k = rand.nextInt(50) + 1;
        int total = 0;
        int b,c,d,e=0;
         
        boolean correct = false;
        int o = rand.nextInt(4) + 1;
        
    public MathQuiz() {
        initComponents();
    }
     
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lblOperation = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        readyButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        lblanswer1 = new javax.swing.JLabel();
        lblanswer2 = new javax.swing.JLabel();
        lblanswer3 = new javax.swing.JLabel();
        lblanswer4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOperation.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblOperation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, 262, 80));

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
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, -1));

        readyButton.setText("Ready");
        readyButton.setVisible(false);
        readyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readyButtonMouseClicked(evt);
            }
        });
        getContentPane().add(readyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setVisible(false);
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setVisible(false);
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setVisible(false);
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 185, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setVisible(false);
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 258, -1, -1));
        getContentPane().add(lblanswer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 28));
        getContentPane().add(lblanswer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 24, 28));
        getContentPane().add(lblanswer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 195, 18, 18));
        getContentPane().add(lblanswer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 258, 19, 27));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
     
       quizMath();
       readyButton.setVisible(true);
       startButton.setVisible(false);
       jRadioButton2.setVisible(true);
       jRadioButton3.setVisible(true);
       jRadioButton4.setVisible(true);
       jRadioButton1.setVisible(true);
       
       
       
    }//GEN-LAST:event_startButtonMouseClicked

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        if (o==3){
            correct=true;
        }
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        if (o==2){
            correct=true;
        }
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
        if (o==1){
            correct=true;
        }
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void readyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readyButtonMouseClicked

        if (correct==true){
            JOptionPane.showMessageDialog(this, "Felicidades tu respuesta es correcta");

        }else{
            JOptionPane.showMessageDialog(this, "Tu respuesta es incorrecta");
        }
    }//GEN-LAST:event_readyButtonMouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        if (o==4){
            correct=true;
        }
    }//GEN-LAST:event_jRadioButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public void quizMath(){
        total = (n+m-k);
        lblOperation.setText(String.valueOf(n+"+"+m+"-"+k));

        switch(o){
            case 1:
                lblanswer4.setText(String.valueOf(total));
                lblanswer2.setText(String.valueOf(total-1));
                lblanswer3.setText(String.valueOf(total+2));
                lblanswer1.setText(String.valueOf(total/2));
                break;
                
            case 2:
                lblanswer3.setText(String.valueOf(total));
                lblanswer4.setText(String.valueOf(total-1));
                lblanswer1.setText(String.valueOf(total+2));
                lblanswer2.setText(String.valueOf(total/2));
                break;
                
            case 3:
                lblanswer2.setText(String.valueOf(total));
                lblanswer4.setText(String.valueOf(total-1));
                lblanswer1.setText(String.valueOf(total+2));
                lblanswer3.setText(String.valueOf(total/2)); 
                break;
                
            case 4:
                lblanswer1.setText(String.valueOf(total));
                lblanswer4.setText(String.valueOf(total-1));
                lblanswer3.setText(String.valueOf(total+2));
                lblanswer2.setText(String.valueOf(total/2));  
                break;
                
            
                
                
        }
        System.out.println("gg"+total);
        
        
        
    }
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
            java.util.logging.Logger.getLogger(MathQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathQuiz().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel lblOperation;
    private javax.swing.JLabel lblanswer1;
    private javax.swing.JLabel lblanswer2;
    private javax.swing.JLabel lblanswer3;
    private javax.swing.JLabel lblanswer4;
    private javax.swing.JButton readyButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
