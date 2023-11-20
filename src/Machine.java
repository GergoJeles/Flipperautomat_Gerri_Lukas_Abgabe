public class Machine {
    private static Machine instance;

    private State noCreditState;
    private State readyState;
    private State playingState;
    private State endState;
    private State currentState;
    private int credits = 0;
    private int lostBalls = 0;

    private Machine() {
        noCreditState = new NoCreditState(this);
        readyState = new ReadyState(this);
        playingState = new PlayingState(this);
        endState = new EndState(this);
        currentState = noCreditState; // Set initial state
    }

    public static Machine getInstance() {
        if (instance == null) {
            instance = new Machine();
        }
        return instance;
    }

    public void insertCoin() {
        credits++;
        currentState.insertCoin();
    }

    public void pressStart() {
        if (credits > 0) {
            credits--;
            currentState.pressStart();
        } else {
            System.out.println("Insufficient credits. Please insert a coin.");
        }
    }

    public void playGame() {
        currentState.playGame();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void loseBall() {
        lostBalls++;
        if (lostBalls >= 3) {
            System.out.println("All balls lost. Game over!");
            setState(endState);
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

    public int getCredits() {
        return credits;
    }
}
