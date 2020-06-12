package mainGame;

import games.Differences.game.Differences;
import games.MathQuiz.game.MathQuiz;
import games.NumberClicks.game.NumberClicks;
import games.RockPaperScissors.game.RockPaperScissors;
import games.TicTacToe.game.TicTacToe;
import games.ballGame.BallGame;
public class Minigames {
    
    String name;
    
    public Minigames(String name) {
    
        this.name = name;
    
    }
    
    public void start() throws InterruptedException {
                                           
        switch (this.name) {        
                      
            case "differences":
                
                Differences differences = new Differences();
                
                differences.main();               
                                
                break;                
                
            case "mathQuiz":
                
                MathQuiz mathQuiz = new MathQuiz();
                
                mathQuiz.main();                  
                                 
                break;
                
            case "numberClicks":
                
                NumberClicks numberClicks = new NumberClicks();
                
                numberClicks.main();
                                              
                break;
                
            case "rockPaperScissors":
                
                RockPaperScissors rockPaperScissors = new RockPaperScissors();
                
                rockPaperScissors.main();                  
                
                break;
                
            case "ticTacToe":
                
                TicTacToe ticTacToe = new TicTacToe();
                
                ticTacToe.main();                  
                                
                break;
                
            case "ballGame":
                
                BallGame ballGame = new BallGame();
                
                ballGame.main();                                
                
                break;
        
        }
    
    }           
        
}
