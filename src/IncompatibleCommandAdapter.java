// The adapter that adapts the incompatible interface to the Command interface
public class IncompatibleCommandAdapter implements Command {
    private IncompatibleCommand incompatibleCommand;

    public IncompatibleCommandAdapter(IncompatibleCommand incompatibleCommand) {
        this.incompatibleCommand = incompatibleCommand;
    }

    @Override
    public void execute() {
        incompatibleCommand.specialExecute();
    }
}
