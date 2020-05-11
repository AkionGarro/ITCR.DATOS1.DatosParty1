package game;

public class Player {

    private String nombre;
    private int stars;
    private int coins;

    public Player(String nombre, int stars, int coins) {
        this.nombre = nombre;
        this.stars = stars;
        this.coins = coins;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStars() {
        return stars;
    }

    public int getCoins() {
        return coins;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
    
    
    
    

}
