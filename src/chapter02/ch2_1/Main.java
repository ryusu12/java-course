package chapter02.ch2_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("차 이름", false);
        car.drive();
        car.accelerate(true);
    }
}
