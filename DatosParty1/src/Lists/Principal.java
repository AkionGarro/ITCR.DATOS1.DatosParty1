package Lists;

public class Principal extends ListStructure{
    
    public Principal() {
    
    }
    
    @Override
    public void addCell(int cellNumber, int xPosition, int yPosition, String color) {
    
        newCell.cellNumber = cellNumber;
        newCell.xPosition = xPosition;
        newCell.yPosition = yPosition;
        newCell.color = color;
        
        if (first == null) {
            
            last = newCell;
            last.next = last;
            first = last;
        
        } else {
            
            newCell.next = first;
            last.next = newCell;
            last = newCell;
            
        }
        
    }
    
}
