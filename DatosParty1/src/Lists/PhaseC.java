package Lists;

public class PhaseC extends  ListStructure{
    
    public PhaseC() { 
    
    }
    
    @Override
    public void addNode(Cell cell) {
        
        newNode.cell = cell;
        
        if (first == null) {
            
            last = newNode;
            last.next = null;
            last.previous = null;
            last = first;
        
        } else {
            
            newNode.previous = last;
            newNode.next = null;
            last.next = newNode;
            last = newNode;
            
        }
        
    }
    
}
