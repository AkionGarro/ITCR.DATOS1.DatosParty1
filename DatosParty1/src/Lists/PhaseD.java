package Lists;

public class PhaseD extends  ListStructure{
    
    DoubleNode first;
    DoubleNode last;
    
    public PhaseD() {
        
        first = null;
        last = null;
        
    }
    
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
    
    @Override
    public int findXLocation(int cellNumber) {
    
        DoubleNode actual = new DoubleNode();
        actual = first;
        
        do{
            
            if (actual.cell.cellNumber == cellNumber) {
            
                return actual.cell.xPosition;
                
            }
            
            actual = actual.next;

        } while(actual != first);
        
        return -1;
           
    }
    
    @Override
    public int findYLocation(int cellNumber) {
    
        DoubleNode actual = new DoubleNode();
        actual = first;
        
        do{
            
            if (actual.cell.cellNumber == cellNumber) {
            
                return actual.cell.yPosition;
                
            }
            
            actual = actual.next;

        } while(actual != first);
        
        return -1;
           
    }
    
}
