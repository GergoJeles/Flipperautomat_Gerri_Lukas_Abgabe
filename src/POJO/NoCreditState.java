package POJO;

import POJO.FlipperContext;
import POJO.State;

public class NoCreditState implements State{
    private FlipperContext flipperAutomat;

    public NoCreditState(FlipperContext flipper){
        this.flipperAutomat = flipper;
    }

    @Override
    public void insertCoin(){
        System.out.println("Muenze angenommen, starte Spiel.");
        flipperAutomat.setCurrentState(flipperAutomat.getReadyState());
    }

    @Override
    public void startNewGame(){
        System.out.println("Bitte Muenze einwerfen um zu spielen.");
    }

    @Override
    public void playGame(){
        System.out.println("Keine Credits mehr! Bitte neue Muenze einwerfen.");
    }
}
