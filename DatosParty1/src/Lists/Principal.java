package Lists;

public class Principal extends ListStructure{
    
    public Principal() {
    
    }
    
    @Override
    public void addNode(Cell cell) {
        
        newNode.cell = cell;
        
        if (first == null) {
            
            last = newNode;
            last.next = last;
            first = last;
        
        } else {
            
            newNode.next = first;
            last.next = newNode;
            last = newNode;
            
        }
        
    }
        
}
