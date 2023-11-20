package machine;
public class ReadyState implements State {
    private Machine Machine;

    public ReadyState(Machine Machine) {
        this.Machine = Machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Additional coin inserted. Credit increased.");
    }

    @Override
    public void pressStart() {
        System.out.println("Game starting!");
        Machine.setState(Machine.getPlayingState());
    }

    @Override
    public void playGame() {
        System.out.println("The game is already in progress.");
    }
}
