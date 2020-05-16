package Lists;

public class PhaseD extends  ListStructure{
    
    public PhaseD() {
        
    }
    
    @Override
    public void addNode(Cell cell) {
        
        newNode.cell = cell;
        
        if (first == null) {
            
            last = newNode;
            last.next = last;
            last.previous = last;
            first = last;
        
        } else {
            
            newNode.previous = last;
            newNode.next = first;
            last.next = newNode;
            last = newNode;
            
        }
        
    }
    
}
