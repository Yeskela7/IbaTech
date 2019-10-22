package homeworks.homework6;

public enum Species {
    DOG(false, 4, true),
    CAT(false, 4, true),
    FISH(false, 0, false),
    ROBOCAT(false, 4, false),
    DRAGON(true, 4, false);


    private boolean canFly;
    private int numberOfLags;
    private boolean hasFur;


    Species(boolean canFly, int numberOfLags, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLags = numberOfLags;
        this.hasFur = hasFur;
    }
}
