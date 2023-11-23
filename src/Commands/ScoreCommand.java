package Commands;

public class ScoreCommand implements Command {
    private int score;

    public ScoreCommand(int score){
        this.score = score;
    }

    @Override
    public void execute(){
        displayScorePoints();
    }
    private void displayScorePoints(){
        System.out.printf("Punktestand: " + score);
    }
}
