package Lists;

public class PhaseB extends ListStructure{
    
    SingleNode first;
    SingleNode last;
    
    public PhaseB() {
        
        first = null;
        last = null;
    
    }
    
    @Override
    public void addNode(Cell cell) {
        
        SingleNode newNode = new SingleNode();        
        newNode.cell = cell;
         
        if (first == null) {

            first = newNode;
            first.next = null;
            last = newNode;        

        } else {

            last.next = newNode;
            newNode.next = null;
            last = newNode;

        }
        
    }
    
    @Override
    public int findXLocation(int cellNumber) {
    
        SingleNode actual = new SingleNode();
        actual = first;
        
        do{
            
            if (actual.cell.cellNumber == cellNumber) {
            
                return actual.cell.xPosition;
                
            }
            
            actual = actual.next;

        } while(actual != null);
        
        return -1;
           
    }
    
    @Override
    public int findYLocation(int cellNumber) {
    
        SingleNode actual = new SingleNode();
        actual = first;
        
        do{
            
            if (actual.cell.cellNumber == cellNumber) {
            
                return actual.cell.yPosition;
                
            }
            
            actual = actual.next;

        } while(actual != null);
        
        return -1;
           
    }
    
}
