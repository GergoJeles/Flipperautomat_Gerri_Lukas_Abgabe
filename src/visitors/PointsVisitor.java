package visitors;

import elements.Ramp;
import elements.Target;

public class PointsVisitor implements Visitor {
    private int totalPoints;

    public PointsVisitor() {
        resetPoints();
    }

    @Override
    public void visit(Target target) {
        int targetPoints = target.getHitCount() * 5;
        totalPoints += targetPoints;
        System.out.println("Target points added: " + targetPoints);
    }

    @Override
    public void visit(Ramp ramp) {
        int rampPoints = ramp.getPassThroughCount() * 10;
        totalPoints += rampPoints;
        System.out.println("Ramp points added: " + rampPoints);
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void resetPoints() {
        totalPoints = 0;
        System.out.println("Total points reset.");
    }
}
