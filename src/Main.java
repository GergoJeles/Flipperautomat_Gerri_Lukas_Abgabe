import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ASCIIArtFactory factoryA = ASCIIArtFactoryA.getInstance();
        ASCIIArtFactory factoryB = ASCIIArtFactoryB.getInstance();
        PinballMachine machine = PinballMachine.getInstance();
        MacroCommand holeCommands = MacroCommand.getInstance();

        // No credit - Attempt to start the game
        machine.pressStart();

        // Insert coins, transition to the Ready state
        machine.insertCoin();
        machine.insertCoin();

        // Start the game, transition to the Playing state
        machine.pressStart();

        // While playing - Pressing the start button shows the authors
        machine.pressStart();

        // Create a Macro Command for the Hole element
        holeCommands.add(new ScoreCommand(1000)); // Award 1000 points
        holeCommands.add(new ChoosePlayerCommand()); // Bonus points for choosing a player

        // Create the Mediator
        FlipperMediator mediator = new FlipperMediator(new ArrayList<>(), new Ramp(new ScoreCommand(200)));

        // Instantiate Target objects with the Mediator
        Target target1 = new Target(new ScoreCommand(100), mediator);
        Target target2 = new Target(new ScoreCommand(100), mediator);
        Target target3 = new Target(new ScoreCommand(100), mediator);

        // Register targets with the Mediator
        mediator.registerTarget(target1);
        mediator.registerTarget(target2);
        mediator.registerTarget(target3);

        // Create the incompatible command
        IncompatibleBumperCommand incompatibleBumperCommand = new IncompatibleBumperCommand();

        // Create the adapter and wrap the incompatible command
        IncompatibleCommandAdapter adapter = new IncompatibleCommandAdapter(incompatibleBumperCommand);

        // Create Pinball elements
        Hole hole = new Hole(holeCommands);
        Bumper adaptedBumper = new Bumper(adapter);
        Ramp ramp = new Ramp(new ScoreCommand(200));
        SlingShot slingShot = new SlingShot(new ScoreCommand(50));
        Kicker kicker = new Kicker(new ScoreCommand(300));

        // Hit the elements
        hole.hit();
        adaptedBumper.hit();
        ramp.hit();
        target1.hit();
        target2.hit();
        target3.hit();
        slingShot.hit();
        kicker.hit();

        // Create visitors
        ResetVisitor resetVisitor = new ResetVisitor();
        PointsVisitor pointsVisitor = new PointsVisitor();

        // List of Pinball elements
        List<PinballElement> elements = Arrays.asList(target1, ramp);

        // Reset all elements
        elements.forEach(element -> element.accept(resetVisitor));

        // Calculate points
        elements.forEach(element -> element.accept(pointsVisitor));
        System.out.println("Total points: " + pointsVisitor.getTotalPoints());

        // Calculate points after each ball loss
        machine.loseBall();
        pointsVisitor.resetPoints();
        elements.forEach(element -> element.accept(pointsVisitor));
        System.out.println("New score: " + pointsVisitor.getTotalPoints());

        // Create ASCII Art with different factories
        String asciiStartA = factoryA.createASCIIArt("Press Start");
        String asciiStartB = factoryB.createASCIIArt("Press Start");

        // Output on the display
        System.out.println(asciiStartA);
        System.out.println(asciiStartB);

        // Simulate losing a ball
        machine.loseBall();
        machine.loseBall();
        machine.loseBall(); // Machine transitions to the End-State

        // After the game - depending on credit, transition to No-Credit or Ready state
        machine.insertCoin();
    }
}
