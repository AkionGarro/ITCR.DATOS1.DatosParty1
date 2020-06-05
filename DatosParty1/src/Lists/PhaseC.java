package Lists;

public class PhaseC extends  ListStructure{
    
    DoubleNode first;
    DoubleNode last;
    
    public PhaseC() {
        
        first = null;
        last = null;
    
    }
    
    @Override
    public void addNode(Cell cell) {
        
        DoubleNode newNode = new DoubleNode();        
        newNode.cell = cell;
        
        if (first == null) {
            
            first = newNode;
            first.next = null;
            first.previous = null;
            last = first;
        
        } else {
            
            last.next = newNode;
            newNode.previous = last;
            newNode.next = null;
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

        } while(actual != null);
        
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

        } while(actual != null);
        
        return -1;
           
    }
    
    @Override
    public String findColor(int cellNumber) {
        
        DoubleNode actual = new DoubleNode();
        actual = first;
        String color = "gray";
        
        do{
            
            if (actual.cell.cellNumber == cellNumber) {
            
                return actual.cell.color;
                
            }
            
            actual = actual.next;

        } while(actual != first);
        
        return color;
        
    }
    
}
