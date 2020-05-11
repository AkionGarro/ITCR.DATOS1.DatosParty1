package Lists;

public class PhaseD extends  ListStructure{
    
    public PhaseD() {
        
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
            last.previous = last;
            first = last;
        
        } else {
            
            newCell.previous = last;
            newCell.next = first;
            last.next = newCell;
            last = newCell;
            
        }
        
    }
    
}
