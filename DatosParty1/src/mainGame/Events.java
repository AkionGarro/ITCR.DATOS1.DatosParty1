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
                
                changePositionsEvent(actualIndex, randomIndex1(actualIndex));
                
                break;
        
        }
    
    }
    
    private int randomIndex1(int firstIndex) {
        
        int secondIndex = 0;
                        
        for (int i = 0; i <= activePlayers; i++) {

            if (i != firstIndex) {

                secondIndex = i;

            }

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
                        
        String message = firstPlayer.getName() + " no tiene monedas para ser robadas";
        
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
        
        String newDirection = secondPlayer.getDirection();
        
        int newX = 0;
        int newY = 0;
        
        if (newCell >= 0 && newCell <= 37) {
                        
            firstPlayer.setPhase("principal");
            firstPlayer.setDirection(newDirection);
            newX = Board.principal.findXLocation(newCell);
            newY = Board.principal.findYLocation(newCell);            
            
        } else if (newCell >= 38 && newCell <= 48) {
            
            firstPlayer.setPhase("phaseA");
            firstPlayer.setDirection(newDirection);
            newX = Board.phaseA.findXLocation(newCell);
            newY = Board.phaseA.findYLocation(newCell);
            
        } else if (newCell >= 49 && newCell <= 54) {
            
            firstPlayer.setPhase("phaseB");
            firstPlayer.setDirection(newDirection);
            newX = Board.phaseB.findXLocation(newCell);
            newY = Board.phaseB.findYLocation(newCell);
            
        } else if (newCell >= 55 && newCell <= 68) {
            
            firstPlayer.setPhase("phaseC");
            firstPlayer.setDirection(newDirection);
            newX = Board.phaseC.findXLocation(newCell);
            newY = Board.phaseC.findYLocation(newCell);
            
        } else if (newCell >= 69 && newCell <= 82) {
            
            firstPlayer.setPhase("phaseD");
            firstPlayer.setDirection(newDirection);
            newX = Board.phaseD.findXLocation(newCell);
            newY = Board.phaseD.findYLocation(newCell);           
                        
        }        
        
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
        
        String newDirection1 = secondPlayer.getDirection();
        String newDirection2 = firstPlayer.getDirection();
        
        int newX1 = 0;
        int newY1 = 0;
        int newX2 = 0;
        int newY2 = 0;
        
        if (newCell1 >= 0 && newCell1 <= 37) {
                        
            firstPlayer.setPhase("principal");
            firstPlayer.setDirection(newDirection1);
            newX1 = Board.principal.findXLocation(newCell1);
            newY1 = Board.principal.findYLocation(newCell1);            
            
        } else if (newCell1 >= 38 && newCell1 <= 48) {
            
            firstPlayer.setPhase("phaseA");
            firstPlayer.setDirection(newDirection1);
            newX1 = Board.phaseA.findXLocation(newCell1);
            newY1 = Board.phaseA.findYLocation(newCell1);
            
        } else if (newCell1 >= 49 && newCell1 <= 54) {
            
            firstPlayer.setPhase("phaseB");
            firstPlayer.setDirection(newDirection1);
            newX1 = Board.phaseB.findXLocation(newCell1);
            newY1 = Board.phaseB.findYLocation(newCell1);
            
        } else if (newCell1 >= 55 && newCell1 <= 68) {
            
            firstPlayer.setPhase("phaseC");
            firstPlayer.setDirection(newDirection1);
            newX1 = Board.phaseC.findXLocation(newCell1);
            newY1 = Board.phaseC.findYLocation(newCell1);
            
        } else if (newCell1 >= 69 && newCell1 <= 82) {
            
            firstPlayer.setPhase("phaseD");
            firstPlayer.setDirection(newDirection1);
            newX1 = Board.phaseD.findXLocation(newCell1);
            newY1 = Board.phaseD.findYLocation(newCell1);           
                        
        }
        
        if (newCell2 >= 0 && newCell2 <= 37) {
                        
            secondPlayer.setPhase("principal");
            secondPlayer.setDirection(newDirection2);
            newX2 = Board.principal.findXLocation(newCell2);
            newY2 = Board.principal.findYLocation(newCell2);            
            
        } else if (newCell2 >= 38 && newCell2 <= 48) {
            
            secondPlayer.setPhase("phaseA");
            secondPlayer.setDirection(newDirection2);
            newX2 = Board.phaseA.findXLocation(newCell2);
            newY2 = Board.phaseA.findYLocation(newCell2);
            
        } else if (newCell2 >= 49 && newCell2 <= 54) {
            
            secondPlayer.setPhase("phaseB");
            secondPlayer.setDirection(newDirection2);
            newX2 = Board.phaseB.findXLocation(newCell2);
            newY2 = Board.phaseB.findYLocation(newCell2);
            
        } else if (newCell2 >= 55 && newCell2 <= 68) {
            
            secondPlayer.setPhase("phaseC");
            secondPlayer.setDirection(newDirection2);
            newX2 = Board.phaseC.findXLocation(newCell2);
            newY2 = Board.phaseC.findYLocation(newCell2);
            
        } else if (newCell2 >= 69 && newCell2 <= 82) {
            
            secondPlayer.setPhase("phaseD");
            secondPlayer.setDirection(newDirection2);
            newX2 = Board.phaseD.findXLocation(newCell2);
            newY2 = Board.phaseD.findYLocation(newCell2);           
                        
        }
        
        String message = firstPlayer.getName() + " y " + secondPlayer.getName() + " cambiarán de posiciones";
        
        JOptionPane.showMessageDialog(null, message, "Evento: Cambiar Posiciones", 1);
              
        Board.moveToken(firstIndex, newX1, newY1);
        Board.moveToken(secondIndex, newX2, newY2);
                
    }
                
}

