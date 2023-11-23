package Visitor;

import java.lang.annotation.Target;
import Elements.Ramp;


public interface Visitor {
    void visit(Elements.Target target);
    void visit(Ramp ramp);
    void visit(Target target);
}
