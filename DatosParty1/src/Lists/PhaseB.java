package Lists;

public class PhaseB extends ListStructure{
    
    public PhaseB() {  
    
    }
    
    @Override
    public void addNode(Cell cell) {
        
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
    
}
