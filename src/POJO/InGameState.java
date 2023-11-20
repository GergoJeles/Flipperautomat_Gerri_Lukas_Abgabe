package POJO;

public class InGameState implements State {

    private FlipperContext flipperAutomat;

    public InGameState(FlipperContext flipper) {
        this.flipperAutomat = flipper;
    }

    @Override
    public void insertCoin(){
        System.out.println("Spiel laueft...");
    }

    @Override
    public void startNewGame(){
        System.out.println("Spiel laueft bereits...");
    }
    @Override
    public void playGame(){
        System.out.println("Spiel laeuft bereits, spiel weiter...");
    }
}
