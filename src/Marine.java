public class Marine extends GroundUnit {

    public Marine(int hp, int hit, int armor) {
        super(hp, hit, armor);
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
    public void attack(Unit target) {
        target.hp -= (hit-armor);
        System.out.println("마린이 공격을 했다.");

    }


}
