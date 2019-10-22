package homeworks.homework7;

public enum Species {
    DOG(false, 4, true),
    DOMESTICCAT(false, 4, true),
    FISH(false, 0, false),
    ROBOCAT(false, 4, false),
    UNKNOWN;


    private boolean canFly;
    private int numberOfLags;
    private boolean hasFur;

    Species() {
    }

    Species(boolean canFly, int numberOfLags, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLags = numberOfLags;
        this.hasFur = hasFur;
    }
}
