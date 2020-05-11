package Lists;

public class ListStructure {
    
    Cell first;
    Cell last;
    Cell newCell = new Cell();
    
    public ListStructure() {
        
        first = null;
        last = null;  
    
    }
    
    public void addCell(int cellNumber, int xPosition, int yPosition, String color) {
        
        newCell.cellNumber = cellNumber;
        newCell.xPosition = xPosition;
        newCell.yPosition = yPosition;
        newCell.color = color;
        
    }
    
}
