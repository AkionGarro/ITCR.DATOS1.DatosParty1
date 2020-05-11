package Lists;

public class PhaseB extends ListStructure{
    
    public PhaseB() {  
    
    }    
    
    @Override
    public void addCell(int cellNumber, int xPosition, int yPosition, String color) {
        
        newCell.cellNumber = cellNumber;
        newCell.xPosition = xPosition;
        newCell.yPosition = yPosition;
        newCell.color = color;         
         
        if (first == null) {

            first = newCell;
            first.next = null;
            last = newCell;        

        } else {

            last.next = newCell;
            newCell.next = null;
            last = newCell;

        }
        
    }
    
}
