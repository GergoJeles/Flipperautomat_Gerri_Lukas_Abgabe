package Visitor;

import java.lang.annotation.Target;

import javax.lang.model.util.Elements;

import Elements.Target;
import Elements.Ramp;

public class ResetVisitor implements Visitor {
    @Override
    public void visit(Target target){
        target.reset();
    }
    @Override
    public void visit(Ramp ramp){
        ramp.close();
    }
}
