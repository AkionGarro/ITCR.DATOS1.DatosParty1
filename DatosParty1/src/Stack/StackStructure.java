package Stack;

import java.util.ArrayList;

public abstract class StackStructure {

    public abstract void push(String event);       
        
    public abstract String pop();
    
    public abstract boolean empty();
    
    public abstract void shuffle();    
    
    public abstract boolean checkArray(ArrayList numberAppearances);
        
}
