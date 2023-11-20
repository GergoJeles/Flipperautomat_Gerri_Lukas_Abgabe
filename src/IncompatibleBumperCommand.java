public class IncompatibleBumperCommand implements IncompatibleCommand {
    @Override
    public void specialExecute() {
        System.out.println("Executing Incompatible Bumper Command");
    }
}
