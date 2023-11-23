package Mediator;

import java.util.List;

import Elements.Ramp;
import Elements.FlipperTarget;

public class Mediator {
    private List<FlipperTarget> targets;
    private Ramp Ramp;
    private boolean isRampOpen = false;

    public Mediator(List<FlipperTarget> targets, Ramp Ramp) {
        this.targets = targets;
        this.Ramp = Ramp;
    }

    public void targetHit(FlipperTarget target) {
        System.out.println("Hit: " + target);
        if (targets.stream().allMatch(FlipperTarget::isDown)) {
            openRamp();
            raiseAllTargets();
        }
    }

    private void openRamp() {
        isRampOpen = true;
        System.out.println("Rampe offen!");
    }

    private void raiseAllTargets() {
        targets.forEach(FlipperTarget::reset);
        System.out.println("Alle Ziele bereit!");
    }

    public boolean isRampOpen() {
        return isRampOpen;
    }

    public void closeRamp() {
        isRampOpen = false;
        System.out.println("Rampe geschlossen!");
    }

    public void registerTarget(FlipperTarget target) {
        targets.add(target);
        target.setMediator(this);
    }
}
