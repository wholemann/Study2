package building;

import common.Liftable;
import common.StarObject;

public abstract class Building extends StarObject {

    int hp;
    Liftable liftInterface;     // 띄울 수 없는 건물엔 할당되지 않음. 생성자로 강제함.

    public Building(int hp) {
        this.hp = hp;
    }

    public Building(int hp, Liftable liftable) {
        this.hp = hp;
        this.liftInterface = liftable;
    }
}
