package commands;
// The adapter that adapts the incompatible interface to the Command interface

public class WrongCommandAdapter implements Command {
    private WrongCommand incompatibleCommand;

    public WrongCommandAdapter(WrongCommand incompatibleCommand) {
        this.incompatibleCommand = incompatibleCommand;
    }

    @Override
    public void execute() {
        incompatibleCommand.specialExecute();
    }
}
