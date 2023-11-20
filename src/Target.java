public class Target extends PinballElement {
    private static int counter = 0;
    private final int id;
    private boolean isDown = false;
    private FlipperMediator mediator;

    public Target(Command command, FlipperMediator mediator) {
        super(command);
        this.mediator = mediator;
        this.id = ++counter;
    }

    @Override
    public void hit() {
        super.hit();
        isDown = true;
        mediator.targetHit(this);
    }

    public boolean isDown() {
        return isDown;
    }

    public void reset() {
        isDown = false;
        System.out.println("Target reset");
    }

    public void setMediator(FlipperMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String toString() {
        return "Target " + id;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void close() {
    }

    @Override
    public int getPassThroughCount() {
        return 0;
    }

    public int getHitCount() {
        return counter;
    }
}
