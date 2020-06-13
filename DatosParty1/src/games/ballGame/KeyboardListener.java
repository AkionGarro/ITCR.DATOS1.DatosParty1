package games.ballGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * In charge of the key listener
 */
public class KeyboardListener implements KeyListener {

    /**
     * method in charge of if a key was pressed
     *
     * @param e Key type parameter
     */
    @Override
    public void keyTyped(KeyEvent e) {
    }

    /**
     * Method that checks if the key is pressed
     *
     * @param e Key type parameter
     */
    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println("keyPressed=" + KeyEvent.getKeyText(e.getKeyCode()));

    }

    /**
     * Method that checks if the key is released
     *
     * @param e Key type parameter
     */
    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("keyReleased=" + KeyEvent.getKeyText(e.getKeyCode()));

    }

}
