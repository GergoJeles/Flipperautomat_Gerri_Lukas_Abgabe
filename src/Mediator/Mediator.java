package Mediator;

import java.util.List;

import Elements.Ramp;
import Elements.Target;

public class Mediator {
    private List<Target> targets;
    private Ramp Ramp;
    private boolean isRampOpen = false;

    public Mediator(List<Target> targets, Ramp Ramp) {
        this.targets = targets;
        this.Ramp = Ramp;
    }

    public void targetHit(Target target) {
        System.out.println("Hit: " + target);
        if (targets.stream().allMatch(Target::isDown)) {
            openRamp();
            raiseAllTargets();
        }
    }

    private void openRamp() {
        isRampOpen = true;
        System.out.println("Rampe offen!");
    }

    private void raiseAllTargets() {
        targets.forEach(Target::reset);
        System.out.println("Alle Ziele bereit!");
    }

    public boolean isRampOpen() {
        return isRampOpen;
    }

    public void closeRamp() {
        isRampOpen = false;
        System.out.println("Rampe geschlossen!");
    }

    public void registerTarget(Target target) {
        targets.add(target);
        target.setMediator(this);
    }
}
