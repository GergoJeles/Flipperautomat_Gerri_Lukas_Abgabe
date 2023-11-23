package Visitor;

import java.lang.annotation.Target;

public class PointsVisitor implements Visitor{
    private int totalScore;

    public PointsVisitor(){
        resetPoints();
    }

    @Override
    public void visit(Target target) {
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
}
