package Visitor;

import java.lang.annotation.Target;

import Elements.Bumper;
import Elements.FlipperTarget;
import Elements.Hole;
import Elements.Kicker;
import Elements.Ramp;
import Elements.SlingShot;

public class PointsVisitor implements Visitor{
    private int totalScore;

    public PointsVisitor(){
        resetPoints();
    }

    @Override
    public void visit(FlipperTarget target) {
        int scorePoints = target.getHitCount() * 2;
        totalScore += scorePoints;
        System.out.printf("Punkte erhalten: " +scorePoints);
    }

    public int getTotalScore(){
        return totalScore;
    }

    public void resetPoints(){
        totalScore = 0;
        System.out.println("Punktestand wurde zurückgesetzt!");
    }

    @Override
    public void visit(Ramp ramp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public void visit(Bumper bumper) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public void visit(Hole hole) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public void visit(Kicker kicker) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }

    @Override
    public void visit(SlingShot slingShot) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'visit'");
    }
}
