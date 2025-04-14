package chapter02.ch2_10;

public class Main {
    public static void main(String[] args) {
        // 1. 업캐스팅
        Animal cat = new Cat();
        cat.makeSound();
        cat.exist();
        // 1.1. 'Animal'의 메서드 'scratch'을(를) 해결할 수 없습니다
        //cat.scratch();

        // 2. 다운 캐스팅
        if (cat instanceof Cat) {
            Cat cat2 = (Cat) cat;
            cat2.scratch();
        } else {
            System.out.println("다운캐스팅 실패 : Cat 아님");
        }
        // 2.1. 다운 캐스팅 실패 경우
        if (cat instanceof Dog) {
            Dog dog = (Dog) cat;
            dog.wag();
        } else {
            System.out.println("다운캐스팅 실패 : Dog 아님");
        }


    }
}
