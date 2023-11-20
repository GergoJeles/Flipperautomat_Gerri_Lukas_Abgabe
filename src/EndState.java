public class EndState implements State {
    private PinballMachine pinballMachine;

    public EndState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("The game is over. Please start a new game.");
        pinballMachine.setState(pinballMachine.getNoCreditState());
    }

    @Override
    public void pressStart() {
        System.out.println("The game is over. Checking credits...");
        if (pinballMachine.getCredit() > 0) {
            pinballMachine.setState(pinballMachine.getReadyState());
            System.out.println("Ready to play!");
        } else {
            pinballMachine.setState(pinballMachine.getNoCreditState());
            System.out.println("No credit available. Please insert a coin.");
        }
    }

    @Override
    public void playGame() {
        System.out.println("Game is over.");
    }
}
