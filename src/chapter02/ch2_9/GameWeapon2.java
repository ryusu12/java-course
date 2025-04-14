package chapter02.ch2_9;

// 2. 클래스로 추상계층 구현
class Weapon2 {
    void waiting() {
        System.out.println("공격 준비");
    }
}

class RangedWeapon2 extends Weapon2 {
    public void reload() {
        System.out.println("장전");
    }
}

class Bow extends RangedWeapon2 {
    @Override
    public void reload() {
        System.out.println("화살 장전");
    }

    public void shoot() {
        System.out.println("화살 발사");
    }
}
