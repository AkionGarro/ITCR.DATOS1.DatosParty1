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
     * @param coins  Initial amount of coins for each player.
     */
    public Player(int number, String name, int coins) {
        
        this.number = number;
        this.name = name;
        this.stars = 0;
        this.coins = coins;
        this.cell = 0;
        this.phase = "principal";
        this.direction = "next";
        
    }
    

    public int getNumber() {
        
        return number;
        
    }

    public String getName() {
        
        return name;
        
    }

    public int getStars() {
        
        return stars;
        
    }

    public int getCoins() {
        
        return coins;
        
    }
    
    public int getCell() {
        
        return cell;
        
    }
    
    public String getPhase() {
        
        return phase;
        
    }
    
    public String getDirection() {
        
        return direction;
        
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
    
    public void setPhase(int cell) {
        
        this.phase = getPhase();
        
    }
    
    public void setDirection(int cell) {
        
        this.direction = getDirection();
        
    }

}
