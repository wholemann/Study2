package building;
import common.*;

public class Barracks extends Building implements Repairable, Liftable {

    LiftableImpl liftImpl;

    public Barracks(int hp) {
        super(hp);
        liftImpl = new LiftableImpl();
    }

    @Override
    public void lift() {
        liftImpl.lift();
    }
}
