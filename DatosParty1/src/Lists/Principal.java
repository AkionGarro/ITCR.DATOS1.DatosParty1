package Lists;

public class Principal extends ListStructure{
    
    SingleNode first;
    SingleNode last;
    
    public Principal() {
        
        first = null;
        last = null;
    
    }
    
    @Override
    public void addNode(Cell cell) {
        
        SingleNode newNode = new SingleNode();        
        newNode.cell = cell;
        
        if (first == null) {
            
            first = newNode;
            last = first;
            first.next = last;
                    
        } else {
                        
            last.next = newNode;
            newNode.next = first;
            last = newNode;
            
        }
                
    }
        
}
