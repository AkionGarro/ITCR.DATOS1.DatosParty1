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
    
}
