public class Kicker extends PinballElement {
    public Kicker(Command command) {
        super(command);
    }

    @Override
    public void accept(Visitor visitor) {

    }

    @Override
    public void close() {

    }

    @Override
    public int getPassThroughCount() {
        return 0;
    }
}
