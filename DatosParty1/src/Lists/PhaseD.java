package Lists;

/**
 * Class in charge of creating phase C, which has two ways and it's a circular
 * list.
 *
 */
public class PhaseD extends ListStructure {

    DoubleNode first;
    DoubleNode last;

    /**
     * Phase D constructor.
     */
    public PhaseD() {

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
            last = newNode;
            first.next = last;
            last.next = first;
            first.previous = last;
            last.previous = first;

        } else {

            newNode.previous = last;
            newNode.next = first;
            last.next = newNode;
            first.previous = newNode;
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

        } while (actual != first);

        return -1;

    }

    /**
     * method to find position Y.
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

        } while (actual != first);

        return -1;

    }

}
