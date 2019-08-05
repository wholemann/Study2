package unit;
import common.*;

public class Marine extends GroundUnit implements Attackable, BeAttackable {


    public Marine(int hp, int hit, int armor, String name) {
        super(hp, hit, armor, name);
    }

    @Override
    public void move() {
        System.out.println("뚜벅뚜벅");
    }

    @Override
    public void death() {
        System.out.println("반으로 쪼개짐");
    }

    @Override
    public void spondSound() {
        System.out.println("옛설");
    }


    @Override
    public void attack(BeAttackable target) {
        int targetHp = target.getHp();

        targetHp = target.getHp() - (this.getHit() - target.getArmor());

        System.out.println(this.getName() + "가 공격함. 상대 HP : " + targetHp);
    }
}

