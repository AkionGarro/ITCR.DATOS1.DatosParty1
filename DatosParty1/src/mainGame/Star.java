package mainGame;

import java.util.Random;

/**
 * Class is in charge of creating the star Ramdon.
 * 
 */
public class Star {
    
    private static Star instance = null;
    private int cell;
    private boolean sold;
    
    /**
     * Constructor method.
     */
    protected Star(){
        
        this.cell = new Random().nextInt(38);
        this.sold = false;
                
    }
    
    /**
     * Singleton in charge of creating the star only once.
     * @return Returns the star-like object
     */
    public static Star getStar() {
        
        if (instance == null) {
            
            instance = new Star();
            
        }
        
        return instance;
        
    }
    
    public int getCell() {
        
        return this.cell;
        
    }
    
    public boolean getSold() {
        
        return this.sold;
        
    }
    
    public void setCell() {
        
        this.cell = new Random().nextInt(38);
        
    }       
    
    public void setSoldFalse() {
        
        this.sold = false;
        
    }
    
    public void setSoldTrue() {
        
        this.sold = true;
        
    }
        
}
