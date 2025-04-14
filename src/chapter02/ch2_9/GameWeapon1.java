package chapter02.ch2_9;

// 1. 인터페이스로 추상계층 구현
interface Weapon1 {
    void waiting();
}

interface RangedWeapon1 extends Weapon1 {
    void reload();
}

class Gun implements RangedWeapon1 {
    @Override
    public void waiting() {
        System.out.println("공격 준비");
    }

    @Override
    public void reload() {
        System.out.println("총알 장전");
    }

    public void shoot() {
        System.out.println("총알 발사");
    }
}