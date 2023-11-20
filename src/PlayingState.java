public class PlayingState implements State {
    private PinballMachine pinballMachine;

    public PlayingState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Additional credit added.");
    }

    @Override
    public void pressStart() {
        System.out.println("Software authors: Max Mustermann and Erika Musterfrau.");
    }

    @Override
    public void playGame() {
        System.out.println("Playing...");
    }
}
