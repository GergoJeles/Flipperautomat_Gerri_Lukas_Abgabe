package POJO;

import javax.swing.plaf.nimbus.State;
import POJO.ReadyState;
import POJO.NoCreditState;

public class FlipperContext {

    private static FlipperContext flipper;

    private State readyState;
    private State noCreditState;
    private State inGameState;
    private State gameOverState;
    private State currentState;
    private int credit = 0;
    private int numberOfBalls = 3;

    private FlipperAutomat(){
        readyState = new ReadyState(this);
        noCreditState = new NoCreditState(this);
        inGameState = new InGameState(this);
        gameOverState = new GameOverState(this);
        currentState = noCreditState;
    }

    public static FlipperContext getFlipper(){
        if(flipper == null){
            flipper = new FlipperAutomat();
        }
        return flipper;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public void insertCoin(){
        credit++;
        currentState.insertCoin();
    }

    public void startGame(){
        if(credit > 0) {
            credit--;
            currentState.startNewGame();
        }else{
            System.out.println("Bitte werfen Sie weitere Muenzen ein um zu spielen.");
        }
    }

    public void playGame(){
        currentState.playGame();
        numberOfBalls = 3;
    }

    public void loseBall(){
        numberOfBalls--;
        if (numberOfBalls == 0) {
            System.out.println("Letzte Kugel verschossen! Starte neues Spiel?");
            setCurrentState(getGameOverState());
        }
    }

    public State getNoCreditState(){
        return noCreditState;
    }
    
    public State getReadyState(){
        return readyState;
    }
    
    public State getInGameState(){
        return inGameState;
    }
    
    public State getGameOverState(){
        return gameOverState;
    }
    
    public State getCredit(){
        return credit;
    }
}
