public class ChoosePlayerCommand implements Command {
    // This implementation randomly selects a player and awards bonus points.
    @Override
    public void execute() {
        int playerNumber = (int) (Math.random() * 3) + 1; // Chooses a number between 1 and 3
        System.out.println("Player " + playerNumber + " chosen. Bonus points!");
    }
}
