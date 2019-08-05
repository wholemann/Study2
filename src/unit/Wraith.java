package unit;

import common.Repairable;

public class Wraith extends AirUnit implements Repairable {

    public Wraith(int hp, int hit, int armor, String name) {
        super(hp, hit, armor, name);
    }

    @Override
    public void death() {

    }

    @Override
    public void move() {

    }

    @Override
    public void spondSound() {

    }
}
