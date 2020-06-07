package mainGame;

import java.util.Random;
import javax.swing.JOptionPane;

public class Events {
    
    String name;
    private int activePlayers = Board.players.size() - 1;
    
    public Events(String name) {
    
        this.name = name;
    
    }
    
    public void start(int actualIndex) {
                                   
        switch (this.name) {          
                      
            case "duel":
                
                int firstIndex = new Random().nextInt(activePlayers);
                
                duelEvent(firstIndex, randomIndex1(firstIndex));               
                                
                break;
                
            case "stealCoins":
                
                stealCoinsEvent(actualIndex, randomIndex1(actualIndex));                
                
                Board.updateCoinsEvent();
                
                break;
                
            case "giveCoins":
                
                giveCoinsEvent(actualIndex);
                
                Board.updateCoinsEvent();
                
                break;
                
            case "loseStar":
                
                loseStarEvent(actualIndex, randomIndex1(actualIndex)); 
                
                Board.updateStarsEvent();
                                
                break;
                
            case "earn2Stars":
                
                earnStarsEvent(actualIndex, 2);
                
                Board.updateStarsEvent();
                
                break;
                
            case "earn5Stars":
                
                earnStarsEvent(actualIndex, 5);
                
                Board.updateStarsEvent();
                
                break;
                
            case "stealStar":
                
                loseStarEvent(randomIndex1(actualIndex), actualIndex);
                
                Board.updateStarsEvent();
                
                break;
                
            case "teleportation":
                
                teleportationEvent(actualIndex, randomIndex1(actualIndex)); 
                
                break;
                
            case "changePositions":
                
                changePositionsEvent(actualIndex, randomIndex1(actualIndex)); //Preguntar si será random o elegido
                
                break;
        
        }
    
    }
    
    private int randomIndex1(int firstIndex) {
    
        int secondIndex = new Random().nextInt(activePlayers);
                
        while (secondIndex == firstIndex) {

            secondIndex = new Random().nextInt(activePlayers);                

        }
        
        return secondIndex;
    
    }   

    private int randomIndex2(int firstIndex, int secondIndex) {
        
        int thirdIndex = 0;
        
        for (int i = 0; i <= activePlayers; i++) {
            
            if (i != firstIndex && i != secondIndex) {
                
                thirdIndex = i;
                
            }
            
        }

        return thirdIndex;

    } 
    
    private int randomIndex3(int firstIndex, int secondIndex, int thirdIndex) {

        int fourthIndex = 0;
        
        for (int i = 0; i <= activePlayers; i++) {
            
            if (i != firstIndex && i != secondIndex && i != thirdIndex) {
                
                fourthIndex = i;
                
            }
            
        }

        return fourthIndex;

    } 
    
    private void duelEvent(int firstIndex, int secondIndex) {
        
        Player firstPlayer = Board.players.get(firstIndex);
        Player secondPlayer = Board.players.get(secondIndex);
        
        // Llamar al minijuego
        // get nombre del minijuego
        
        String message = firstPlayer.getName() + " y " + secondPlayer.getName() + " se enfrentarán en: "; // + nommbre del duelo
        
        JOptionPane.showMessageDialog(null, message, "Evento: Duelo", 1);
        
        /*
        
        gato(firstPlayer, secondPlayer);
        cantidad de clicks(firstPlayer, secondPlayer);  
        Diferencias(firstPlayer, secondPlayer); 
        
        */

    }
    
    private void stealCoinsEvent(int firstIndex, int secondIndex) {          
                        
        Player firstPlayer = Board.players.get(firstIndex);
        Player secondPlayer = Board.players.get(secondIndex);
                        
        String message = firstPlayer.getName() + " perdió " + 0 + " monedas" + " y" + "\n"
                       + secondPlayer.getName() + " ganó " + 0 + " monedas";
        
        int stolenCoins = new Random().nextInt(25);
        
        if (firstPlayer.getCoins() > 0) {
            
            while (stolenCoins == 0 || (firstPlayer.getCoins() - stolenCoins) < 0) {

                stolenCoins = new Random().nextInt(25);

            }

            firstPlayer.setCoins(firstPlayer.getCoins() + stolenCoins);        
            secondPlayer.setCoins(secondPlayer.getCoins() - stolenCoins);
            
            if (stolenCoins == 1) {
                
                message = firstPlayer.getName() + " perdió " + 1 + " moneda" + " y" + "\n"
                        + secondPlayer.getName() + " ganó " + 1 + " moneda";
                
            } else {
            
                message = firstPlayer.getName() + " perdió " + stolenCoins + " monedas" + " y" + "\n"
                        + secondPlayer.getName() + " ganó " + stolenCoins + " monedas";
            
            }
                                   
        }  
        
        JOptionPane.showMessageDialog(null, message, "Evento: Robar Monedas", 1);
        
    }
    
    private void giveCoinsEvent(int firstIndex) {
        
        Player firstPlayer = Board.players.get(firstIndex);
        
        String message = firstPlayer.getName() + " no tiene monedas para regalar";
                
        int lostCoins = new Random().nextInt(51);
        
        while ((lostCoins % activePlayers) != 0 || lostCoins == 0 || (firstPlayer.getCoins() - lostCoins) < 0) {

            lostCoins = new Random().nextInt(61);

        }                
        
        if (firstPlayer.getCoins() >= activePlayers) {                       
            
            firstPlayer.setCoins(firstPlayer.getCoins() - lostCoins);                       

            if (activePlayers == 1) {    

                int secondIndex = randomIndex1(firstIndex);            
                Player secondPlayer = Board.players.get(secondIndex); 

                secondPlayer.setCoins(secondPlayer.getCoins() + lostCoins);
                                
                if (lostCoins == 1) {
                
                    message = firstPlayer.getName() + " perdió " + 1 + " moneda" + " y" + "\n"
                            + secondPlayer.getName() + " ganó " + 1 + " moneda";
                
                } else {

                    message = firstPlayer.getName() + " perdió " + lostCoins + " monedas" + " y" + "\n"
                            + secondPlayer.getName() + " ganó " + lostCoins + " monedas";

                }

            } else if (activePlayers == 2) {

                int secondIndex = randomIndex1(firstIndex);            
                Player secondPlayer = Board.players.get(secondIndex);

                int thirdIndex = randomIndex2(firstIndex, secondIndex);
                Player thirdPlayer = Board.players.get(thirdIndex);                        

                secondPlayer.setCoins(secondPlayer.getCoins() + (lostCoins / activePlayers));
                thirdPlayer.setCoins(thirdPlayer.getCoins() + (lostCoins / activePlayers));
                
                if (lostCoins == 1) {
                
                    message = firstPlayer.getName() + " perdió " + 1 + " moneda" + "," + "\n"
                            + secondPlayer.getName() + " ganó " + 1 + " moneda" + " y" + "\n"
                            + thirdPlayer.getName() + " ganó " + 1 + " moneda";
                
                } else {

                    message = firstPlayer.getName() + " perdió " + (lostCoins / activePlayers) + " monedas" + "," + "\n"
                            + secondPlayer.getName() + " ganó " + (lostCoins / activePlayers) + " monedas" + " y" + "\n"
                            + thirdPlayer.getName() + " ganó " + (lostCoins / activePlayers) + " monedas";

                }
                
            } else if (activePlayers == 3) {

                int secondIndex = randomIndex1(firstIndex);            
                Player secondPlayer = Board.players.get(secondIndex);

                int thirdIndex = randomIndex2(firstIndex, secondIndex);
                Player thirdPlayer = Board.players.get(thirdIndex); 

                int fourthIndex = randomIndex3(firstIndex, secondIndex, thirdIndex);
                Player fourthPlayer = Board.players.get(fourthIndex);
                
                secondPlayer.setCoins(secondPlayer.getCoins() + (lostCoins / activePlayers));
                thirdPlayer.setCoins(thirdPlayer.getCoins() + (lostCoins / activePlayers));
                fourthPlayer.setCoins(fourthPlayer.getCoins() + (lostCoins / activePlayers));
                
                if (lostCoins == 1) {
                
                    message = firstPlayer.getName() + " perdió " + 1 + " moneda" + "," + "\n"
                            + secondPlayer.getName() + " ganó " + 1 + " moneda" + "," + "\n"
                            + thirdPlayer.getName() + " ganó " + 1 + " moneda" + " y" + "\n"
                            + fourthPlayer.getName() + " ganó " + 1 + " moneda";
                
                } else {

                    message = firstPlayer.getName() + " perdió " + (lostCoins / activePlayers) + " monedas" + "," + "\n"
                            + secondPlayer.getName() + " ganó " + (lostCoins / activePlayers) + " monedas" + "," + "\n"
                            + thirdPlayer.getName() + " ganó " + (lostCoins / activePlayers) + " monedas" + " y" + "\n"
                            + fourthPlayer.getName() + " ganó " + (lostCoins / activePlayers) + " monedas";

                }

            }
                        
        }
        
        JOptionPane.showMessageDialog(null, message, "Evento: Regalar Monedas", 1);
                                
    }
    
    private void loseStarEvent(int firstIndex, int secondIndex) {        
        
        Player firstPlayer = Board.players.get(firstIndex);
        Player secondPlayer = Board.players.get(secondIndex);
        
        String message = firstPlayer.getName() + " no tiene estrellas";
        
        if (firstPlayer.getStars() != 0) {
        
            firstPlayer.setStars(firstPlayer.getStars() - 1);        
            secondPlayer.setStars(secondPlayer.getStars() + 1);
            
            message = firstPlayer.getName() + " perdió " + 1 + " estrella" + " y" + "\n"
                    + secondPlayer.getName() + " ganó " + 1 + " estrella";
        
        }
        
        JOptionPane.showMessageDialog(null, message, "Evento: Perder o Robar Estrellas", 1);
        
    }
    
    private void earnStarsEvent(int firstIndex, int numberStars) {
                
        Player firstPlayer = Board.players.get(firstIndex);
        
        firstPlayer.setStars(firstPlayer.getStars() + numberStars);
        
        String message = "";
        
        if (numberStars == 1) {
            
            message = firstPlayer.getName() + " ganó " + 1 + " estrella";
            
        } else {
            
            message = firstPlayer.getName() + " ganó " + numberStars + " estrellas";
            
        }
        
        JOptionPane.showMessageDialog(null, message, "Evento: Ganar Estrellas", 1);
                
    }
    
    private void teleportationEvent(int firstIndex, int secondIndex) {
                
        Player firstPlayer = Board.players.get(firstIndex);
        Player secondPlayer = Board.players.get(secondIndex);
        
        int newCell = secondPlayer.getCell();
        firstPlayer.setCell(newCell);
        
        int newX = Board.principal.findXLocation(newCell);
        int newY = Board.principal.findYLocation(newCell);
        
        String message = firstPlayer.getName() + " se teletransportará a donde está " + secondPlayer.getName();
        
        JOptionPane.showMessageDialog(null, message, "Evento: Teletransportación", 1);
               
        Board.moveToken(firstIndex, newX, newY);               
        
    }
    
    private void changePositionsEvent(int firstIndex, int secondIndex) {
                
        Player firstPlayer = Board.players.get(firstIndex);
        Player secondPlayer = Board.players.get(secondIndex);
        
        int newCell1 = secondPlayer.getCell();
        int newCell2 = firstPlayer.getCell();
                
        firstPlayer.setCell(newCell1);
        secondPlayer.setCell(newCell2);
        
        int newX1 = Board.principal.findXLocation(newCell1);
        int newY1 = Board.principal.findYLocation(newCell1);
        int newX2 = Board.principal.findXLocation(newCell2);
        int newY2 = Board.principal.findYLocation(newCell2);
        
        String message = firstPlayer.getName() + " y " + secondPlayer.getName() + " cambiarán de posiciones";
        
        JOptionPane.showMessageDialog(null, message, "Evento: Cambiar Posiciones", 1);
              
        Board.moveToken(firstIndex, newX1, newY1);
        Board.moveToken(secondIndex, newX2, newY2);
                
    }
                
}

