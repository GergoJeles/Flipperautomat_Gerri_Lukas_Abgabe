package Visitor;

import Elements.Bumper;
import Elements.Hole;
import Elements.Kicker;
import Elements.Ramp;
import Elements.SlingShot;
import Elements.FlipperTarget;

public interface Visitor {
    void visit(FlipperTarget target);
    void visit(Ramp ramp);
    void visit(Bumper bumper);
    void visit(Hole hole);
    void visit(Kicker kicker);
    void visit(SlingShot slingShot);
}
