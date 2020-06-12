package Stack;

import java.util.ArrayList;
import java.util.Random;

public class StackEvents extends StackStructure {
    
    static ArrayList<String> nameAppearances = new ArrayList<>();
    ArrayList<Integer> numberAppearances = new ArrayList<>();
  
    private int top;  
    private String stack[];
    
    public StackEvents() {
        
        this.top = -1;
        this.stack = new String[52];
    
        nameAppearances.add("duel");
        nameAppearances.add("stealCoins");
        nameAppearances.add("giveCoins");
        nameAppearances.add("loseStar");
        nameAppearances.add("earn2Stars");
        nameAppearances.add("earn5Stars");
        nameAppearances.add("stealStar");
        nameAppearances.add("teleportation");
        nameAppearances.add("changePositions");
        
        numberAppearances.add(10);
        numberAppearances.add(10);
        numberAppearances.add(5);
        numberAppearances.add(5);
        numberAppearances.add(3);
        numberAppearances.add(1);
        numberAppearances.add(3);
        numberAppearances.add(10);
        numberAppearances.add(5);
    
    }
            
    @Override
    public void push(String event) {
               
        top ++;
        stack[top] = event;       
          
    }
    
    @Override
    public String pop() {
        
        String event;
    
        if (top == -1) {
        
            return null;
        
        } else {
        
            event = stack[top];
            stack[top] = null;
            top --;
        
        }
        
        return event;
    
    }
    
    @Override
    public boolean empty() {
    
        if (top == -1) {
        
            return true;
        
        } else {
        
            return false;
            
        }
    
    }
    
    @Override
    public void shuffle() {
    
        int index;
        
        while (checkArray(numberAppearances) == false) {
            
            index = new Random().nextInt(9);
            
            if (!numberAppearances.get(index).equals(0)) {
                
                push(nameAppearances.get(index));
                
                numberAppearances.set(index, numberAppearances.get(index) - 1);
                            
            }
            
        }
        
    }     
    
    @Override
    public boolean checkArray(ArrayList numberAppearances) {
        
        for (int i = 0; i < numberAppearances.size(); i++) {
        
            if (!numberAppearances.get(i).equals(0)) {
                
                return false;
                        
            }
                
        }
        
        return true;
        
    }
        
}
