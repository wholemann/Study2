public abstract class Unit {
    //이동, 미네랄 가스 소비, HP, 건물에서 나옴, 업그레이드가능. 죽음

    int upgrade;
    int hp;
    int hit;
    int armor;

    public Unit(int hp, int hit, int armor) {
        this.hp = hp;
        this.hit = hit;
        this.armor = armor;

        System.out.println("현재체력 : " + hp);
        System.out.println("공격력 : " + hit);
        System.out.println("방어력 : " + armor);
    }
    public abstract void death();
    public abstract void move();
    public abstract void spondSound();
    public abstract void attack(Unit target);
    public void printStatus() {
        System.out.println("남은 HP " + hp);
    }

    public void beAttacked() {
        hp -= 20;
        System.out.println("현재체력 : " + hp);
    }

}
