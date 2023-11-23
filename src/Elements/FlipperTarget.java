package Elements;

import Commands.Command;
import Visitor.Visitor;
import Visitor.ResetVisitor;
import Visitor.PointsVisitor;
import Mediator.Mediator;

public class FlipperTarget extends FlipperElement {
   private int hitCount = 0;  // Non- static variable to track hits
    private final int id;
    private boolean isDown = false;
    private Mediator mediator;

    public FlipperTarget(Command command, Mediator mediator) {
        super(command);
        this.mediator = mediator;
        this.id = ++hitCount;
    }

    @Override
    public void hit() {
        super.hit();
        isDown = isDown();
        mediator.targetHit(this);
        hitCount++;
    }

    public boolean isDown() {
        if (isDown == false) {
            this.isDown = true;
        }
        return isDown;
    }

    public void reset() {
        if (isDown == true) {
            isDown = false;    
        }
        System.out.println("Ziel zurueckgesetzt!");
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
