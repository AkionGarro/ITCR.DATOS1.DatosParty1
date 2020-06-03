package Lists;

/**
 * Class in charge of creating the cells in the board.
 *
 */
public class Cell {

    int cellNumber;
    int xPosition;
    int yPosition;
    String color;
    String action;

    /**
     * Constructor of the cell class.
     *
     * @param cellNumber Cell identifier.
     * @param xPosition X position of the cell on the board.
     * @param yPosition y position of the cell on the board.
     * @param color Color identifier.
     * @param action Event or action performed by each cell.
     */
    public Cell(int cellNumber, int xPosition, int yPosition, String color, String action) {

        this.cellNumber = cellNumber;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
        this.action = action;

    }

}
