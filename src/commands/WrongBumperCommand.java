package commands;
public class WrongBumperCommand implements WrongCommand {
    @Override
    public void specialExecute() {
        System.out.println("Executing Incompatible Bumper Command");
    }
}
