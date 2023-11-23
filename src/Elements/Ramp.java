package Elements;

import Commands.Command;
import Visitor.Visitor;

public class Ramp extends FlipperElement {
    public boolean isOpen;

    public Ramp(Command command){
        super(command);
    }

    @Override
    public void accept(Visitor visitor){

    }

    @Override
    public void close(){
        isOpen = false;
        System.out.println("Rampe geschlossen");
    }

    @Override
    public int getPassThroughCount(){
        return 0;
    }
}