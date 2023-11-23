package Commands;

import java.util.ArrayList;
import java.util.List;

public class GameCommand implements Command{
    private static GameCommand instance;
    private List<Command> listOfCommands = new ArrayList<>();

    private GameCommand(){}

    public static GameCommand getInstance() {
            if(instance == null) {
                instance = new GameCommand();
            }
            return instance;
        }

    public void addCommand(Command command){
        listOfCommands.add(command);
    }

    @Override
    public void execute(){
        for(Command command : listOfCommands) {
            command.execute();
        }
    }
}
