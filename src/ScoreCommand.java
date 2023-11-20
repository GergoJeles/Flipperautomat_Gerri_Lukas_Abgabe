public class ScoreCommand implements Command {
    private int score;

    public ScoreCommand(int score) {
        this.score = score;
    }

    @Override
    public void execute() {
        System.out.println("Points awarded: " + score);
    }
}
