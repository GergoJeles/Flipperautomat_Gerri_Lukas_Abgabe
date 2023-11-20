public abstract class PinballElement {
    private Command command;

    public PinballElement(Command command) {
        this.command = command;
    }

    public void hit() {
        if (command != null) {
            command.execute();
        }
    }

    public abstract void accept(Visitor visitor);

    public abstract void close();

    public abstract int getPassThroughCount();
}
