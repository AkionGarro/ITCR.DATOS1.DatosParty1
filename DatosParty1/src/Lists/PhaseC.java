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
    
}
