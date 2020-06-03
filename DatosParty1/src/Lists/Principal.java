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
    
    public int findXLocation(int cellNumber) {
    
        SingleNode actual = new SingleNode();
        actual = first;
                
        do{
            
            if (actual.cell.cellNumber == cellNumber) {
            
                return actual.cell.xPosition;
                
            }
            
            actual = actual.next;

        } while(actual != first);
        
        return -1;
           
    }
        
    public int findYLocation(int cellNumber) {
    
        SingleNode actual = new SingleNode();
        actual = first;
        
        do{
            
            if (actual.cell.cellNumber == cellNumber) {
            
                return actual.cell.yPosition;
                
            }
            
            actual = actual.next;

        } while(actual != first);
        
        return -1;
           
    }
    
    @Override
    public String findColor(int cellNumber) {
        
        SingleNode actual = new SingleNode();
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
