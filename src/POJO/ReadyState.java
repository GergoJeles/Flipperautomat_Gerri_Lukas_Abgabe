package POJO;

public class ReadyState implements State {
    
    private FlipperContext flipperAutomat;
    
    public ReadyState(FlipperContext flipperContext){
        this.flipperAutomat = flipperContext;
    }

    @Override
    public void insertCoin(){
        System.out.println("Muenze wurde eingeworfen. Spiel ist bereit.");
    }

    @Override
    public void startNewGame(){
        System.out.println("Starte Spiel!");
        flipperAutomat.setCurrentState(flipperAutomat.getInGameState());
    }

    @Override
    public void playGame(){
        System.out.println("Spiel laueft...");
    }

    
}
