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

public class Game extends JPanel {

	BallBuilder ball = new BallBuilder(this);
	PlatformBuilder racquet = new PlatformBuilder(this);
	int speed = 1;

	private int getScore() {
            
		return speed - 1;
                
	}

	public Game() {
            
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

	private void move() {
            
            ball.move();
            racquet.move();
                
	}

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

	public void gameOver() {
            
		JOptionPane.showMessageDialog(this, "Puntos obtenidos: " + getScore(),
                "Game Over", JOptionPane.YES_NO_OPTION);
		System.exit(ABORT);
                
	}

	public static void main(String[] args) throws InterruptedException {
            
		JFrame frame = new JFrame("Ball Game");
		Game game = new Game();
		frame.add(game);
		frame.setSize(600, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);

		while (true) {
                    
			game.move();
			game.repaint();
			Thread.sleep(10);
                        
		}
                
	}
        
}
