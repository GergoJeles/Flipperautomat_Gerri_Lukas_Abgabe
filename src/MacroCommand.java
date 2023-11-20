import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {
    private static MacroCommand instance;
    private List<Command> commands = new ArrayList<>();

    private MacroCommand() {}

    public static synchronized MacroCommand getInstance() {
        if (instance == null) {
            instance = new MacroCommand();
        }
        return instance;
    }

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
