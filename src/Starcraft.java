import java.util.ArrayList;
import java.util.List;

public class Starcraft {
    public static void main(String[] args) {

        List<Unit> unitList = new ArrayList<Unit>();
        Marine marine = new Marine(100, 5, 1);
        //marine.beAttacked();;

        Firebat firebat = new Firebat(100, 7, 2);

        unitList.add(marine);
        unitList.add(firebat);

        firebat.spondSound();
        firebat.move();
        firebat.death();

        marine.spondSound();
        marine.move();
        marine.death();
        marine.attack(firebat);
//        firebat.printStatus();

        firebat.attack(marine);
//        marine.printStatus();

        for(Unit unit : unitList) {
            unit.printStatus();
        }

    }
}

