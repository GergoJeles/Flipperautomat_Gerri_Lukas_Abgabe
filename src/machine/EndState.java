package machine;
public class EndState implements State {
    private final Machine machine;

    public EndState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("The game is over. Please start a new game.");
        transitionToNoCreditState();
    }

    @Override
    public void pressStart() {
        System.out.println("The game is over. Checking credits...");
        if (hasCredits()) {
            transitionToReadyState();
            System.out.println("Ready to play!");
        } else {
            transitionToNoCreditState();
            System.out.println("No credit available. Please insert a coin.");
        }
    }

    @Override
    public void playGame() {
        System.out.println("Game is over.");
    }

    private void transitionToReadyState() {
        machine.setState(machine.getReadyState());
    }

    private void transitionToNoCreditState() {
        machine.setState(machine.getNoCreditState());
    }

    private boolean hasCredits() {
        return machine.getCredits() > 0;
    }
}
