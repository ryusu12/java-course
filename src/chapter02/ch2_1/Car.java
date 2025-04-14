package chapter02.ch2_1;

public class Car {
    // 속성
    String carName;
    int gas;
    boolean accel;

    // 생성자
    Car(String carName, boolean accel) {
        this.carName = carName;
        this.gas = 100;
        this.accel = accel;
    }

    // 주행 기능
    void drive() {
        System.out.println("남은 연료: " + --gas);
    }

    // 가속 기능
    void accelerate(boolean state) {
        this.accel = state;
        System.out.println(this.accel);
    }
}