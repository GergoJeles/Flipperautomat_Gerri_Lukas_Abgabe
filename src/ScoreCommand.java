public class ScoreCommand implements Command {
    private int points;

    public ScoreCommand(int points) {
        this.points = points;
    }

    @Override
    public void execute() {
        displayPointsAwarded();
    }

    private void displayPointsAwarded() {
        System.out.println("Points awarded: " + points);
    }
}
