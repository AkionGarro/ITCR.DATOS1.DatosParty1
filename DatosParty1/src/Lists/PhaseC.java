package Lists;

/**
 * Class in charge of the creation of phase C, which has two ways to the player
 * move.
 */
public class PhaseC extends ListStructure {

    DoubleNode first;
    DoubleNode last;

    /**
     * Phase C Constructor.
     */
    public PhaseC() {

        first = null;
        last = null;

    }

    /**
     * Method to add double nodes to the Phase C.
     *
     * @param cell It receives the cell type parameter that inside it has the Y
     * position , X position, color, number and action.
     */
    @Override
    public void addNode(Cell cell) {

        DoubleNode newNode = new DoubleNode();
        newNode.cell = cell;

        if (first == null) {

            first = newNode;
            first.next = null;
            first.previous = null;
            last = first;

        } else {

            last.next = newNode;
            newNode.previous = last;
            newNode.next = null;
            last = newNode;

        }

    }

    /**
     * Method to find position X.
     *
     * @param cellNumber Identifier of the cell
     * @return X position
     */
    @Override
    public int findXLocation(int cellNumber) {

        DoubleNode actual = new DoubleNode();
        actual = first;

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.xPosition;

            }

            actual = actual.next;

        } while (actual != null);

        return -1;

    }

    /**
     * Method to find position Y.
     *
     * @param cellNumber Identifier of the cell
     * @return Y position
     */
    @Override
    public int findYLocation(int cellNumber) {

        DoubleNode actual = new DoubleNode();
        actual = first;

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.yPosition;

            }

            actual = actual.next;

        } while (actual != null);

        return -1;

    }
    
    public int findXLocationPrevious(int cellNumber) {

        DoubleNode actual = new DoubleNode();
        actual = first;

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.xPosition;

            }

            actual = actual.previous;

        } while (actual != null);

        return -1;

    }
    
    public int findYLocationPrevious(int cellNumber) {

        DoubleNode actual = new DoubleNode();
        actual = first;

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.yPosition;

            }

            actual = actual.previous;

        } while (actual != null);

        return -1;

    }

    @Override
    public String findColor(int cellNumber) {

        DoubleNode actual = new DoubleNode();
        actual = first;
        String color = "gray";

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.color;

            }

            actual = actual.next;

        } while (actual != first);

        return color;

    }

}
