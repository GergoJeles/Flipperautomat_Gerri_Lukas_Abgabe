package Elements;

import Commands.Command;
import Visitor.Visitor;

public class Bumper extends FlipperElement {
    public Bumper(Command command){
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
