public class Ramp extends PinballElement {
    private boolean isOpen;

    public Ramp(Command command) {
        super(command);
    }

    @Override
    public void accept(Visitor visitor) {
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Ramp closed");
    }

    @Override
    public int getPassThroughCount() {
        return 0;
    }
}
