package POJO;

public class GameOverState implements State {
    private FlipperContext flipperAutomat;

    public GameOverState(FlipperContext flipper){
        this.flipperAutomat = flipper;
    }
    @Override
    public void insertCoin(){
        System.out.println("GAME - OVER !\nWeiterspielen?");
        flipperAutomat.setCurrentState(flipperAutomat.getNoCreditState());
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
