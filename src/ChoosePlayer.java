import java.util.Random;

public class ChoosePlayer implements Command {
    private static final Random random = new Random();

    @Override
    public void execute() {
        int playerNumber = getRandomPlayerNumber(1, 3);
        System.out.println("Player " + playerNumber + " chosen. Bonus points!");
    }

    private int getRandomPlayerNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
