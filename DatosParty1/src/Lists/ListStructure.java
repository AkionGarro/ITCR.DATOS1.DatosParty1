package Lists;

/**
 * Abstract class in charge of the list structure.
 *
 */
public abstract class ListStructure {

    /**
     * Abstract method to add nodes to the list.
     *
     * @param cell It receives the cell type parameter that inside it has the Y
     * position , X position, color, number and action.
     */
    public abstract void addNode(Cell cell);

    /**
     * Abstract method to find position X.
     *
     * @param cellNumber Identifier of the cell.
     * @return The X position.
     */
    public abstract int findXLocation(int cellNumber);

    /**
     * Abstract method to find position y.
     *
     * @param cellNumber Identifier of the cell.
     * @return The Y position.
     */
    public abstract int findYLocation(int cellNumber);

    public abstract String findColor(int cellNumber);

}
