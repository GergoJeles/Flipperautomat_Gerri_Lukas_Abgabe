public class PlayingState implements State {
    private Machine Machine;

    public PlayingState(Machine Machine) {
        this.Machine = Machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Additional credit added.");
    }

    @Override
    public void pressStart() {
        System.out.println("Java project created by: Gergö JELES and Lukas Stuppacher.");
    }

    @Override
    public void playGame() {
        System.out.println("Playing...");
    }
}
