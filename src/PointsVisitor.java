public class PointsVisitor implements Visitor {
    private int points;

    public PointsVisitor() {
        this.points = 0;
    }

    @Override
    public void visit(Target target) {
        points += target.getHitCount() * 10;
    }

    @Override
    public void visit(Ramp ramp) {
        points += ramp.getPassThroughCount() * 20;
    }

    public int getTotalPoints() {
        return points;
    }

    public void resetPoints() {
        points = 0;
    }
}
