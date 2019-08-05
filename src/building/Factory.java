package building;

import common.Liftable;
import common.LiftableImpl;

public class Factory extends Building implements Liftable {
    LiftableImpl liftImpl;
    public Factory(int hp) {
        super(hp);
    }

    @Override
    public void lift() {

    }
}
