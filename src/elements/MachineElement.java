package elements;

import commands.Command;
import visitors.Visitor;


public abstract class MachineElement {
    private Command command;

    public MachineElement(Command command) {
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
