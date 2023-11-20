package machine;
import java.util.List;

import elements.Ramp;
import elements.Target;

public class Mediator {
    private List<Target> targets;
    private Ramp Ramp;
    private boolean isRampOpen = false;

    public Mediator(List<Target> targets, Ramp Ramp) {
        this.targets = targets;
        this.Ramp = Ramp;
    }

    public void targetHit(Target target) {
        System.out.println("Target hit: " + target);
        if (targets.stream().allMatch(Target::isDown)) {
            openRamp();
            raiseAllTargets();
        }
    }

    private void openRamp() {
        isRampOpen = true;
        System.out.println("Ramp opened!");
    }

    private void raiseAllTargets() {
        targets.forEach(Target::reset);
        System.out.println("All targets raised!");
    }

    public boolean isRampOpen() {
        return isRampOpen;
    }

    public void closeRamp() {
        isRampOpen = false;
        System.out.println("Ramp closed!");
    }

    public void registerTarget(Target target) {
        targets.add(target);
        target.setMediator(this);
    }
}
