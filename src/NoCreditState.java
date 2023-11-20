public class NoCreditState implements State {
    private Machine pinballMachine;

    public NoCreditState(Machine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Ready to play.");
        pinballMachine.setState(pinballMachine.getReadyState());
    }

    @Override
    public void pressStart() {
        System.out.println("Insufficient credit. Please insert a coin.");
    }

    @Override
    public void playGame() {
        System.out.println("Game cannot be started. No credit available.");
    }
}
