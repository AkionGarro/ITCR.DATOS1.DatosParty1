package mainGame;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class in charge of creating the stack to add the events.
 *
 */
public class Stack {

    static ArrayList<String> nameAppearances = new ArrayList<>();
    ArrayList<Integer> numberAppearances = new ArrayList<>();

    int top = -1;
    String stack[] = new String[52];

    /**
     * Constructor Method.
     */
    public Stack() {

        nameAppearances.add("duel");
        nameAppearances.add("stealCoins");
        nameAppearances.add("giveCoins");
        nameAppearances.add("loseStar");
        nameAppearances.add("earn2Stars");
        nameAppearances.add("earn5Stars");
        nameAppearances.add("stealStar");
        nameAppearances.add("teleportation");
        nameAppearances.add("changePositions");

        numberAppearances.add(10);
        numberAppearances.add(10);
        numberAppearances.add(5);
        numberAppearances.add(5);
        numberAppearances.add(3);
        numberAppearances.add(1);
        numberAppearances.add(3);
        numberAppearances.add(10);
        numberAppearances.add(5);

    }

    /**
     * Enter the events into the stack.
     *
     * @param event The type of event you enter.
     */
    public void push(String event) {

        top++;
        stack[top] = event;

    }

    /**
     * Method in charge of returning the item that is at the top of the stack
     * and deletes it.
     *
     * @return The event that is at the top.
     */
    public String pop() {

        String event;

        if (top == -1) {

            return null;

        } else {

            event = stack[top];
            stack[top] = null;
            top--;

        }

        return event;

    }

    /**
     * Method for shuffling the event stack
     *
     * @return Whether or not there are items inside the stack.
     */
    public boolean empty() {

        if (top == -1) {

            return true;

        } else {

            return false;

        }

    }

    /**
     * Method for shuffling the event stack
     */
    public void shuffle() {

        int index;

        while (checkArray(numberAppearances) == false) {

            index = new Random().nextInt(9);

            if (!numberAppearances.get(index).equals(0)) {

                push(nameAppearances.get(index));

                numberAppearances.set(index, numberAppearances.get(index) - 1);

            }

        }

    }

    private boolean checkArray(ArrayList numberAppearances) {

        for (int i = 0; i < numberAppearances.size(); i++) {

            if (!numberAppearances.get(i).equals(0)) {

                return false;

            }

        }

        return true;

    }

}
