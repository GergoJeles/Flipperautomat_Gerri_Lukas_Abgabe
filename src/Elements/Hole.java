package Elements;

import Commands.Command;
import Visitor.Visitor;

public class Hole extends FlipperElement {
    public Hole(Command command){
        super(command);
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    @Override
    public void close(){

    }

    @Override
    public int getPassThroughCount(){
        return 0;
    }
}
