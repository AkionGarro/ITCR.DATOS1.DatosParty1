package Lists;

public abstract class ListStructure {
    
    Node first = null;
    Node last = null;
    Node newNode = new Node();
    
    public abstract void addNode(Cell cell);      
        
}