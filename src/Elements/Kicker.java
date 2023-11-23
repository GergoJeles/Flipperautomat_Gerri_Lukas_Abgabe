package Elements;

import Commands.Command;
import Visitor.Visitor;

public class Kicker extends FlipperElement {
    public Kicker(Command command){
        super(command);
    }

    @Override
    public void accept(Visitor visitor){

    }

    @Override
    public void close(){

    }

    @Override
    public int getPassThroughCount(){
        return 0;
    }
}