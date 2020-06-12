package games.ballGame;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class BallBuilder {
    
	private static final int DIAMETER = 25;
	
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
	private final BallGame game;

	public BallBuilder(BallGame game) {
            
            this.game = game;
                
	}

	void move() {
            
		boolean changeOrientation = true;
                
		if (x + xa < 0)
                    
			xa = game.speed;
                
		else if (x + xa > game.getWidth() - DIAMETER)
                    
			xa = - game.speed;
                
		else if (y + ya < 0)
                    
			ya = game.speed;
                
		else if (y + ya > game.getHeight() - DIAMETER)
                    
			game.gameOver();
                
		else if (collision()){
                    
			ya = - game.speed;
			y = game.racquet.getTopY() - DIAMETER;
			game.speed ++;
                        
		} else 
                    
			changeOrientation = false;
				
		x = x + xa;
		y = y + ya;
                
	}

	private boolean collision() {
            
		return game.racquet.getBounds().intersects(getBounds());
                
	}

	public void paint(Graphics2D g) {
            
		g.fillOval(x, y, DIAMETER, DIAMETER);
                
	}

	public Rectangle getBounds() {
            
		return new Rectangle(x, y, DIAMETER, DIAMETER);
                
	}
        
}
