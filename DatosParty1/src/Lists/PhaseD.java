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
    
}
