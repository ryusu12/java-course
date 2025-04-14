package chapter02.ch2_9;

// 주제 : 게임 공격 시스템
public class Main {
    public static void main(String[] args) {
        Bow bow = new Bow();
        bow.waiting();
        bow.reload();
        bow.shoot();
        System.out.println();

        Gun gun = new Gun();
        gun.waiting();
        gun.reload();
        gun.shoot();
    }
}

