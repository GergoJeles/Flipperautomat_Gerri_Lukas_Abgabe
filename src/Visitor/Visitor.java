package Visitor;

import java.lang.annotation.Target;

import Elements.Ramp;

public interface Visitor {
    void visit(Target target);
    void visit(Ramp ramp);
}
