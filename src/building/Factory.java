package building;

import common.Liftable;
import common.LiftableImpl;

public class Factory extends Building implements Liftable {

    public Factory(int hp, Liftable liftable) {
        super(hp, liftable);
    }

    @Override
    public void lift() {
        liftInterface.lift();
    }
}
