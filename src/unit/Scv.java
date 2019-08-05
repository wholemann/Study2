package unit;

import common.Repairable;
import common.StarObject;

public class Scv extends GroundUnit {


    public Scv(int hp, int hit, int armor, String name) {
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

    public void repair(StarObject target) {

        if (target instanceof Repairable) {
            Unit r = (Unit) target;
            while (r.getHp() == r.getMaxHp()) {
                r.addHp(5);
            }
            System.out.println(r.getName() + "의 수리가 완료됐습니다.");
        } else {
            System.out.println("걔는 수리가 안 돼");
        }
    }

}
