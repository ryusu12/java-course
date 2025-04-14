package chapter02.ch2_10;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void exist() {
        System.out.println("고양이가 존재합니다.");
    }

    public void scratch() {
        System.out.println("스크래치!");
    }
}
