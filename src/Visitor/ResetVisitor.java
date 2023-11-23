package Visitor;

import java.lang.annotation.Target;

import javax.lang.model.util.Elements;

import Elements.Bumper;
import Elements.FlipperTarget;
import Elements.Hole;
import Elements.Kicker;
import Elements.Ramp;
import Elements.SlingShot;

public class ResetVisitor implements Visitor {
    @Override
    public void visit(Ramp ramp){
        ramp.close();
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
    @Override
    public void visit(FlipperTarget target) {
        target.reset();
    }
}
