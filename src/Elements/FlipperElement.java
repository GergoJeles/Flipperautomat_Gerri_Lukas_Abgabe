package Elements;

import Commands.Command;
import Visitor.Visitor;
public abstract class FlipperElement {
    private Command command;

    public FlipperElement(Command command) {
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
