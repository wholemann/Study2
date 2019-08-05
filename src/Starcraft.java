import common.Attackable;
import common.Repairable;
import unit.*;

public class Starcraft {
    public static void main(String[] args) {
        Unit marine = new Marine(40, 5, 0, "마린");
        Unit medic = new Medic(60, 0, 1, "메딕");
        Unit tank = new Tank(150, 30, 1, "시즈탱크");
//
//        if (marine instanceof Attackable) {
//            ((Attackable) marine).attack(medic);
//        }
//
        Scv scv = new Scv(50, 5, 0, "SCV");
        scv.repair(tank);
        scv.repair(medic);

    }
}

