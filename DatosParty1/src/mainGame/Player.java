package mainGame;

/**
 * Class for creating players.
 */
public class Player {

    private int number;
    private String name;
    private int stars;
    private int coins;
    private int cell;
    private String phase;
    private String direction;

    /**
     * Player class constructor.
     * @param number player identifier
     * @param name   player name.
     */
    public Player(int number, String name) {
        
        this.number = number;
        this.name = name;
        this.stars = 0;
        this.coins = 100;
        this.cell = 0;
        this.phase = "principal";
        this.direction = "next";
        
    }
    

    public int getNumber() {
        
        return this.number;
        
    }

    public String getName() {
        
        return this.name;
        
    }

    public int getStars() {
        
        return this.stars;
        
    }

    public int getCoins() {
        
        return this.coins;
        
    }
    
    public int getCell() {
        
        return this.cell;
        
    }
    
    public String getPhase() {
        
        return this.phase;
        
    }
    
    public String getDirection() {
        
        return this.direction;
        
    }
    
    public void setStars(int stars) {
        
        this.stars = stars;
        
    }

    public void setCoins(int coins) {
        
        this.coins = coins;
        
    }
    
    public void setCell(int cell) {
        
        this.cell = cell;
        
    }
    
    public void setPhase(String phase) {
        
        this.phase = phase;
        
    }
    
    public void setDirection(String direction) {
        
        this.direction = direction;
        
    }

}
