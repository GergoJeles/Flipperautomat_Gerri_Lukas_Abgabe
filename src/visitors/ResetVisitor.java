package visitors;

import elements.Ramp;
import elements.Target;

public class ResetVisitor implements Visitor {
    @Override
    public void visit(Target target) {
        target.reset();
    }

    @Override
    public void visit(Ramp ramp) {
        ramp.close();
    }

}
