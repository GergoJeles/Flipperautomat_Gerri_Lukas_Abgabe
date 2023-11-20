public class Target extends MachineElement {
    private int hitCount;  // Non- static variable to track hits
    private final int id;
    private boolean isDown = false;
    private Mediator mediator;

    public Target(Command command, Mediator mediator) {
        super(command);
        this.mediator = mediator;
        this.id = ++hitCount;
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

    public void setMediator(Mediator mediator) {
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
        return hitCount;
    }
}
