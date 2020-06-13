package games.ballGame;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 * Method in charge of creating the lower platform.
 *
 */
public class PlatformBuilder {

    private static final int Y = 730;
    private static final int WITH = 120;
    private static final int HEIGHT = 30;
    int x = 0;
    int xa = 0;
    private final BallGame game;

    /**
     * Class constructor
     *
     * @param game Enter a game type parameter
     */
    public PlatformBuilder(BallGame game) {

        this.game = game;

    }

    /**
     * Method for moving the platform.
     */
    public void move() {

        if (x + xa > 0 && x + xa < game.getWidth() - WITH) {
            x = x + xa;
        }

    }

    /**
     * Method for drawing the platform.
     *
     * @param graphics Enter an object of type graphics
     */
    public void paint(Graphics2D graphics) {

        graphics.fillRect(x, Y, WITH, HEIGHT);

    }

    /**
     * Method that checks if the key is released
     *
     * @param e Key type parameter
     */
    public void keyReleased(KeyEvent e) {

        xa = 0;

    }

    /**
     * Method that checks if the key is pressed
     *
     * @param e Key type parameter
     */
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = -game.speed;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = game.speed;
        }

    }

    /**
     * Method to obtain the position x, y, width and height.
     *
     * @return position x, y, width and height
     */
    public Rectangle getBounds() {

        return new Rectangle(x, Y, WITH, HEIGHT);

    }

    /**
     * Method to obtain the position and higher.
     * @return Get the top "y"
     */
    public int getTopY() {

        return Y - HEIGHT;

    }

}
