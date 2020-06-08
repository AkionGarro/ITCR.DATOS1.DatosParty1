package games.RockPaperScissors.game;

import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissors extends javax.swing.JFrame {

    public RockPaperScissors() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        lblWinner.setVisible(false);        
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        lblYourElection.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblYourElection.setForeground(new java.awt.Color(65, 65, 65));
        lblYourElection.setText("Tú elejiste:");

        lblComputerElection.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblComputerElection.setForeground(new java.awt.Color(65, 65, 65));
        lblComputerElection.setText("La computadora eligió:");

        btnRock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/RockPaperScissors/images/rock.png"))); // NOI18N
        btnRock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRockMouseClicked(evt);
            }
        });

        btnPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/RockPaperScissors/images/paper.png"))); // NOI18N
        btnPaper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPaperMouseClicked(evt);
            }
        });

        btnScissors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/RockPaperScissors/images/scissors.png"))); // NOI18N
        btnScissors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScissorsMouseClicked(evt);
            }
        });

        lblTurn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTurn.setForeground(new java.awt.Color(60, 65, 65));
        lblTurn.setText("Turno: 0");

        lblYourScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblYourScore.setForeground(new java.awt.Color(60, 65, 65));
        lblYourScore.setText("Tu puntaje: 0");

        lblComputerScore.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblComputerScore.setForeground(new java.awt.Color(60, 65, 65));
        lblComputerScore.setText("Puntaje de la computadora: 0");

        lblWinner.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblWinner.setForeground(new java.awt.Color(60, 65, 65));
        lblWinner.setText("El ganador es:");

        btnInstrucctions.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnInstrucctions.setText("Instrucciones");
        btnInstrucctions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrucctionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYourElection)
                    .addComponent(lblComputerElection)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnRock)
                        .addGap(18, 18, 18)
                        .addComponent(btnPaper)
                        .addGap(18, 18, 18)
                        .addComponent(btnScissors))
                    .addComponent(lblTurn)
                    .addComponent(lblYourScore)
                    .addComponent(lblComputerScore)
                    .addComponent(lblWinner)
                    .addComponent(btnInstrucctions))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInstrucctions)
                .addGap(18, 18, 18)
                .addComponent(lblYourElection)
                .addGap(18, 18, 18)
                .addComponent(lblComputerElection)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRock)
                    .addComponent(btnPaper)
                    .addComponent(btnScissors))
                .addGap(18, 18, 18)
                .addComponent(lblTurn)
                .addGap(18, 18, 18)
                .addComponent(lblYourScore)
                .addGap(18, 18, 18)
                .addComponent(lblComputerScore)
                .addGap(18, 18, 18)
                .addComponent(lblWinner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
                    lblYourScore.setText("Tu puntaje: " + Integer.toString(yourScore));

                }
        
        }
        
        if (yourScore == 3 || computerScore == 3) {
            
            finishGame();
            
        }        
        
    }//GEN-LAST:event_btnRockMouseClicked

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
                    lblYourScore.setText("Tu puntaje: " + Integer.toString(yourScore));

                } else {

                    lblComputerElection.setText("La computadora eligió: Tijeras");

                }
        
        }
        
        if (yourScore == 3 || computerScore == 3) {
            
            finishGame();
            
        } 
         
    }//GEN-LAST:event_btnScissorsMouseClicked

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
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RockPaperScissors().setVisible(true);
            }
        });
    }
    
    int turn = 0;
    int yourScore = 0;
    int computerScore = 0;
    int userElection;
    int computerElection;
    Random random;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstrucctions;
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
    // End of variables declaration//GEN-END:variables
}

