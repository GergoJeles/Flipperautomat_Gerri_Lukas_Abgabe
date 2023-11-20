public class PinballMachine {
    private static PinballMachine instance;

    private State noCreditState;
    private State readyState;
    private State playingState;
    private State endState;
    private State state;
    private int credit = 0;
    private int lostBalls = 0;

    private PinballMachine() {
        noCreditState = new NoCreditState(this);
        readyState = new ReadyState(this);
        playingState = new PlayingState(this);
        endState = new EndState(this);
        state = noCreditState; // Set initial state
    }

    public static PinballMachine getInstance() {
        if (instance == null) {
            instance = new PinballMachine();
        }
        return instance;
    }

    public void insertCoin() {
        credit++;
        state.insertCoin();
    }

    public void pressStart() {
        if (credit > 0) {
            credit--;
            state.pressStart();
        } else {
            System.out.println("Insufficient credit.");
        }
    }

    public void playGame() {
        state.playGame();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void loseBall() {
        lostBalls++;
        if (lostBalls >= 3) {
            System.out.println("All balls lost. Game over!");
            setState(getEndState());
            lostBalls = 0;
        }
    }

    public State getNoCreditState() {
        return noCreditState;
    }

    public State getReadyState() {
        return readyState;
    }

    public State getPlayingState() {
        return playingState;
    }

    public State getEndState() {
        return endState;
    }

    public int getCredit() {
        return credit;
    }
}
