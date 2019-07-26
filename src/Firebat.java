public class Firebat extends GroundUnit {

    public Firebat(int hp, int hit, int armor) {
        super(hp, hit, armor);
    }

    public void move() {
        System.out.println("철퍽 철퍽");
    }

    public void death() {
        System.out.println("펑!");
    }

    @Override
    public void spondSound() {
        System.out.println("Need a light");
    }

    @Override
    public void attack(Unit target) {
        target.hp -= (hit-armor);
        System.out.println("파이어벳이 공격했다.");
    }

}
