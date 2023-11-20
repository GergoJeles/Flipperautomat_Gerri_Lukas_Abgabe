public class ReadyState implements State {
    private PinballMachine pinballMachine;

    public ReadyState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Additional coin inserted. Credit increased.");
    }

    @Override
    public void pressStart() {
        System.out.println("Game starting!");
        pinballMachine.setState(pinballMachine.getPlayingState());
    }

    @Override
    public void playGame() {
        System.out.println("The game is already in progress.");
    }
}
