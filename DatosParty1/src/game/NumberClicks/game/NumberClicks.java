package MiniGames;

import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class NumberClicks extends javax.swing.JFrame {

    public NumberClicks() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClickMe = new javax.swing.JLabel();
        lblClicks = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        btnInstructions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 312));

        btnClickMe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/NumberClicks/images/clickMe.png"))); // NOI18N
        btnClickMe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClickMeMouseClicked(evt);
            }
        });

        lblClicks.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblClicks.setForeground(new java.awt.Color(60, 63, 65));
        lblClicks.setText("Cantidad de Clicks: 0");

        lblTime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTime.setForeground(new java.awt.Color(60, 63, 65));
        lblTime.setText("Tiempo: 7 seg");

        btnInstructions.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInstructions.setText("Instrucciones");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClicks))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnClickMe))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInstructions)
                .addGap(18, 18, 18)
                .addComponent(lblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClickMe)
                .addGap(18, 18, 18)
                .addComponent(lblClicks)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickMeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClickMeMouseClicked
        
        timer.start();
        
        clicks ++;
        
        if (seg > 0) {
        
        lblClicks.setText("Cantidad de Clicks: " + clicks);
        
        } else {
        
            timer.stop();
            
        }
        
    }//GEN-LAST:event_btnClickMeMouseClicked

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed
        
        String instructions =   "El objetivo consiste en obtener la mayor cantidad de puntos en el tiempo establecido (7 segundos), según las siguientes reglas:\n" +
                                "\n" +
                                "   * En el momento en que se presione el botón \"Click Me\", comenzará a correr el tiempo inmediatamente.\n" +
                                "   * Presiona el botón lo más rápido que puedas.\n" +
                                "   * Cuando hayan transcurrido los 7 segundos, no podrás contabilizar más puntos.\n" + 
                                "\n";
        
        JOptionPane.showMessageDialog(null, instructions);        
        
    }//GEN-LAST:event_btnInstructionsActionPerformed
    
    int seg = 7;
    
    int clicks = 0;
    
    Timer timer = new Timer(1000, new ActionListener() {
        
        public void actionPerformed(ActionEvent e) {            
            
            seg --;
            
            if (seg >= 0) {
                
                lblTime.setText("Tiempo: " + seg + " seg");
                        
            }
            
        }
        
    });    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberClicks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClickMe;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClicks;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
