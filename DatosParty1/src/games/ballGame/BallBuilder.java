package games.ballGame;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Method in charge of creating ball.
 *
 */
public class BallBuilder {

    private static final int DIAMETER = 25;

    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    private final BallGame game;

    /**
     * Class constructor
     *
     * @param game Enter a game type parameter
     */
    public BallBuilder(BallGame game) {

        this.game = game;

    }

    /**
     * Method for moving the ball.
     */
    void move() {

        boolean changeOrientation = true;

        if (x + xa < 0) {
            xa = game.speed;
        } else if (x + xa > game.getWidth() - DIAMETER) {
            xa = -game.speed;
        } else if (y + ya < 0) {
            ya = game.speed;
        } else if (y + ya > game.getHeight() - DIAMETER) {
            game.gameOver();
        } else if (collision()) {

            ya = -game.speed;
            y = game.racquet.getTopY() - DIAMETER;
            game.speed++;

        } else {

            changeOrientation = false;

            x = x + xa;
            y = y + ya;

        }

    }

    /**
     * Method in charge of knowing if there was a collision with the walls.
     *
     * @return whether there are collisions or not
     */
    private boolean collision() {

        return game.racquet.getBounds().intersects(getBounds());

    }

    /**
     * Method for drawing the ball.
     *
     * @param g Enter an object of type graphics
     */
    public void paint(Graphics2D g) {

        g.fillOval(x, y, DIAMETER, DIAMETER);

    }

    /**
     * Method to obtain the position x, y, width and height.
     *
     * @return position x, y, width and height
     */
    public Rectangle getBounds() {

        return new Rectangle(x, y, DIAMETER, DIAMETER);

    }

}
