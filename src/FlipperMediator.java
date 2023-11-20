import java.util.List;

public class FlipperMediator {
    private List<Target> targets;
    private Ramp ramp;
    private boolean isRampOpen = false;

    public FlipperMediator(List<Target> targets, Ramp ramp) {
        this.targets = targets;
        this.ramp = ramp;
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
