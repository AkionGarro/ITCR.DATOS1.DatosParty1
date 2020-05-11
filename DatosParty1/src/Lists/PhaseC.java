package Lists;

public class PhaseC extends  ListStructure{
    
    public PhaseC() { 
    
    }
    
    @Override
    public void addCell(int cellNumber, int xPosition, int yPosition, String color) {
        
        newCell.cellNumber = cellNumber;
        newCell.xPosition = xPosition;
        newCell.yPosition = yPosition;
        newCell.color = color;
        
        if (first == null) {
            
            last = newCell;
            last.next = null;
            last.previous = null;
            last = first;
        
        } else {
            
            newCell.previous = last;
            newCell.next = null;
            last.next = newCell;
            last = newCell;
            
        }
        
    }
    
}
