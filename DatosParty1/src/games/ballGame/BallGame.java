package games.ballGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * method in charge of creating the game.
 * 
 */
public class BallGame extends JPanel {
    
    BallBuilder ball = new BallBuilder(this);
    PlatformBuilder racquet = new PlatformBuilder(this);
    int speed = 1;
    boolean gameOver = false;

    private int getScore() {

        return speed - 1;

    }

    /**
     * Class Constructor
     */
    public BallGame() {

        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {

                racquet.keyReleased(e);

            }

            @Override
            public void keyPressed(KeyEvent e) {

                racquet.keyPressed(e);

            }

        });

        setFocusable(true);

    }

    /**
     * Method for moving.
     */
    private void move() {

        ball.move();
        racquet.move();

    }

    /**
     * Method for drawing
     * @param g Enter an object of type graphics
     */
    @Override
    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2d);
        racquet.paint(g2d);

        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.BOLD, 40));
        g2d.drawString(String.valueOf("Player score: " + getScore()), 5, 35);

    }

    /**
     * Method responsible for checking if the player lost
     */
    public void gameOver() {
        
        JOptionPane.showMessageDialog(this, "Puntos obtenidos: " + getScore(), "Puntos Obtenidos", 1);
        gameOver = true;
        
    }

    /**
     * The main method of the class.
     * @throws InterruptedException 
     */
    public static void main() throws InterruptedException {

        JFrame frame = new JFrame("Ball Game");
        BallGame game = new BallGame();
        frame.add(game);
        frame.setSize(600, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
                
        while (game.gameOver == false) {
            
            

            game.move();
            game.repaint();
            Thread.sleep(10);            
            
        }

    }
        
}
