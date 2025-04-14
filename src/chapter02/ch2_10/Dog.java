package chapter02.ch2_10;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void exist() {
        System.out.println("강아지가 존재합니다.");
    }

    public void wag() {
        System.out.println("꼬리 흔들");
    }
}