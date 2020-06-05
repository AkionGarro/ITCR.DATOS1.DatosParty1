package Lists;

/**
 * Creation of the main path of the board.
 *
 */
public class Principal extends ListStructure {

    SingleNode first;
    SingleNode last;

    /**
     * Main phase constructor.
     */
    public Principal() {

        first = null;
        last = null;

    }

    /**
     * Method to add nodes to the circular list.
     *
     * @param cell It receives the cell type parameter that inside it has the Y
     * position , X position, color, number and action.
     */
    @Override
    public void addNode(Cell cell) {

        SingleNode newNode = new SingleNode();
        newNode.cell = cell;

        if (first == null) {

            first = newNode;
            last = first;
            first.next = last;

        } else {

            last.next = newNode;
            newNode.next = first;
            last = newNode;

        }

    }

    /**
     * Method to find position X.
     *
     * @param cellNumber Identifier of the cell
     * @return X position
     */
    public int findXLocation(int cellNumber) {

        SingleNode actual = new SingleNode();
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
     *
     * Method to find position Y.
     *
     * @param cellNumber Identifier of the cell
     * @return Y position
     */
    public int findYLocation(int cellNumber) {

        SingleNode actual = new SingleNode();
        actual = first;

        do {

            if (actual.cell.cellNumber == cellNumber) {

                return actual.cell.yPosition;

            }

            actual = actual.next;

        } while (actual != first);

        return -1;

    }

    @Override
    public String findColor(int cellNumber) {

        SingleNode actual = new SingleNode();
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
