package mainGame;

import java.util.Random;

public class Events {
    
    String name;
    private int activePlayers = Window.players.size() - 1;
    
    public Events(String name) {
    
        this.name = name;
    
    }
    
    public void start(int actualIndex) {
                                   
        switch (this.name) {          
                      
            case "duel":
                
                int firstIndex = new Random().nextInt(activePlayers);
                
                duelEvent(firstIndex, randomIndex(firstIndex));               
                                
                break;
                
            case "stealCoins":
                
                stealCoinsEvent(actualIndex, randomIndex(actualIndex));
                
                Board.updateCoins();
                
                break;
                
            case "giveCoins":
                
                giveCoinsEvent(actualIndex);
                
                Board.updateCoins();
                
                break;
                
            case "loseStar":
                
                loseStarEvent(actualIndex, randomIndex(actualIndex)); 
                
                Board.updateStars();
                                
                break;
                
            case "earn2Stars":
                
                earnStarsEvent(actualIndex, 2);
                
                Board.updateStars();
                
                break;
                
            case "earn5Stars":
                
                earnStarsEvent(actualIndex, 5);
                
                Board.updateStars();
                
                break;
                
            case "stealStar":
                
                loseStarEvent(randomIndex(actualIndex), actualIndex);
                
                Board.updateStars();
                
                break;
                
            case "teleportation":
                
                teleportationEvent(actualIndex, randomIndex(actualIndex)); 
                
                break;
                
            case "changePositions":
                
                changePositionsEvent(actualIndex, randomIndex(actualIndex)); //Preguntar si será random o elegido
                
                break;
        
        }
    
    }
    
    public int randomIndex(int firstIndex) {
    
        int secondIndex = new Random().nextInt(activePlayers);
                
        while (secondIndex == firstIndex) {

            secondIndex = new Random().nextInt(activePlayers);                

        }
        
        return secondIndex;
    
    } 
    
    public void duelEvent(int firstIndex, int secondIndex) {
        
        // gato(actualPlayer, necessaryPlayer);
        // o
        //cantidad de clicks(actualPlayer, necessaryPlayer);           
    
    }
    
    public void stealCoinsEvent(int firstIndex, int secondIndex) {            
                        
        Player firstPlayer = Window.players.get(firstIndex);
        Player secondPlayer = Window.players.get(secondIndex);
        
        int stolenCoins = new Random().nextInt(25);
        
        if (firstPlayer.getCoins() != 0) {
            
            while (stolenCoins == 0 || (firstPlayer.getCoins() - stolenCoins) < 0) {

                stolenCoins = new Random().nextInt(25);

            }

            firstPlayer.setCoins(firstPlayer.getCoins() + stolenCoins);        
            secondPlayer.setCoins(secondPlayer.getCoins() - stolenCoins);
                
        }        
        
    }
    
    public void giveCoinsEvent(int firstIndex) {
        
        Player firstPlayer = Window.players.get(firstIndex);
        
        int lostCoins = new Random().nextInt(61);
        
        while ((lostCoins % activePlayers) != 0 || lostCoins == 0 || (firstPlayer.getCoins() - lostCoins) < 0) {
                                    
            lostCoins = new Random().nextInt(61);
            
        }
        
        firstPlayer.setCoins(firstPlayer.getCoins() - lostCoins);
        
        if (activePlayers == 1) {      
            
            int secondIndex = randomIndex(firstIndex);            
            Player secondPlayer = Window.players.get(secondIndex); 
            
            secondPlayer.setCoins(secondPlayer.getCoins() + lostCoins);
            
        } else if (activePlayers == 2) {
                                    
            int secondIndex = randomIndex(firstIndex);            
            Player secondPlayer = Window.players.get(secondIndex);
            
            int thirdIndex = randomIndex(firstIndex);
            
            while (thirdIndex == firstIndex || thirdIndex == secondIndex) {
                
                thirdIndex = randomIndex(firstIndex);
                
            }
                        
            Player thirdPlayer = Window.players.get(thirdIndex);                        
            
            secondPlayer.setCoins(secondPlayer.getCoins() + (lostCoins % activePlayers));
            thirdPlayer.setCoins(thirdPlayer.getCoins() + (lostCoins % activePlayers));
                        
        } else if (activePlayers == 3) {
            
            int secondIndex = randomIndex(firstIndex);            
            Player secondPlayer = Window.players.get(secondIndex);
            
            int thirdIndex = randomIndex(firstIndex);
            
            while (thirdIndex == firstIndex || thirdIndex == secondIndex) {
                
                thirdIndex = randomIndex(firstIndex);
                
            }
                        
            Player thirdPlayer = Window.players.get(thirdIndex);  
            
            int fourthIndex = randomIndex(firstIndex);
            
            while (fourthIndex == firstIndex || fourthIndex == secondIndex || fourthIndex == thirdIndex) {
                
                fourthIndex = randomIndex(firstIndex);
                
            }
            
            Player fourthPlayer = Window.players.get(fourthIndex);
            
            secondPlayer.setCoins(secondPlayer.getCoins() + (lostCoins % activePlayers));
            thirdPlayer.setCoins(thirdPlayer.getCoins() + (lostCoins % activePlayers));
            fourthPlayer.setCoins(fourthPlayer.getCoins() + (lostCoins % activePlayers));
            
        }
                        
    }
    
    public void loseStarEvent(int firstIndex, int secondIndex) {
        
        Player firstPlayer = Window.players.get(firstIndex);
        Player secondPlayer = Window.players.get(secondIndex);
        
        if (firstPlayer.getStars() != 0) {
        
            firstPlayer.setStars(firstPlayer.getStars() - 1);        
            secondPlayer.setStars(secondPlayer.getStars() + 1);
        
        }
        
    }
    
    private void earnStarsEvent(int firstIndex, int numberStars) {
        
        Player firstPlayer = Window.players.get(firstIndex);
        
        firstPlayer.setStars(firstPlayer.getStars() + numberStars);
        
    }
    
    public void teleportationEvent(int firstIndex, int secondIndex) {
        
        Player firstPlayer = Window.players.get(firstIndex);
        Player secondPlayer = Window.players.get(secondIndex);
        
        int newCell = secondPlayer.getCell();
        firstPlayer.setCell(newCell);
        
        int newX = Window.principal.findXLocation(newCell);
        int newY = Window.principal.findYLocation(newCell);
               
        Board.moveToken(firstIndex, newX, newY);               
        
    }
    
    public void changePositionsEvent(int firstIndex, int secondIndex) {
        
        System.out.println("ChangePositions");
        
        Player firstPlayer = Window.players.get(firstIndex);
        Player secondPlayer = Window.players.get(secondIndex);
        
        int newCell1 = secondPlayer.getCell();
        int newCell2 = firstPlayer.getCell();
                
        firstPlayer.setCell(newCell1);
        secondPlayer.setCell(newCell2);
        
        int newX1 = Window.principal.findXLocation(newCell1);
        int newY1 = Window.principal.findYLocation(newCell1);
        int newX2 = Window.principal.findXLocation(newCell2);
        int newY2 = Window.principal.findYLocation(newCell2);     

        System.out.println(firstIndex + "   " + newCell1);
        System.out.println(secondIndex + "   " + newCell2);        
              
        Board.moveToken(firstIndex, newX1, newY1);
        Board.moveToken(secondIndex, newX2, newY2);
                
    }
                
}
