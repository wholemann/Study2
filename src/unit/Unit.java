package unit;

import common.Attackable;
import common.BeAttackable;
import common.StarObject;

public abstract class Unit extends StarObject implements BeAttackable {
    //이동, 미네랄 가스 소비, HP, 건물에서 나옴, 업그레이드가능. 죽음
    //

    private final int MAX_HP;
    private int hp;
    private int hit;
    private int armor;
    private String name;

    public Unit(int hp, int hit, int armor, String name) {
        MAX_HP  = hp;
        this.hp = hp;
        this.hit = hit;
        this.armor = armor;
        this.name = name;

        System.out.println("현재체력 : " + hp);
        System.out.println("공격력 : " + hit);
        System.out.println("방어력 : " + armor);
    }
    public abstract void death();
    public abstract void move();
    public abstract void spondSound();

    public void printStatus() {
        System.out.println("남은 HP " + hp);
    }

    public String getName() {
        return this.name;
    }

    public int getHit() {
        return this.hit;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMaxHp() {
        return this.MAX_HP;
    }

    public void addHp(int amount) {
        this.hp = this.hp + amount;
    }

    public int getArmor() {
        return this.armor;
    }

    @Override
    public void beAttackable(Attackable attacker) {
        int attackerHit = attacker.getHit();
        this.hp = this.getHp() - (attackerHit - this.getArmor());
        System.out.println(this.getName() + "가 공격당함. 현재 HP : " + this.getHp());
    }
}
