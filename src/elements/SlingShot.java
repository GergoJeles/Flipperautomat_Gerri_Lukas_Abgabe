package elements;
import commands.Command;
import visitors.Visitor;

public class SlingShot extends MachineElement {
    public SlingShot(Command command) {
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