package building;
import common.*;

public class Barracks extends Building implements Repairable, Liftable {

    public Barracks(int hp, Liftable liftable) {
        super(hp, liftable);
    }

    @Override
    public void lift() {
        liftInterface.lift();
    }
}
