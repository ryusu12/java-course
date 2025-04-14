package chapter01.ch1_5;

import java.util.Scanner;

public class UserInfoPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TODO: 사용자로부터 이름을 입력받기
        System.out.print("이름을 입력하세요: ");
        String name = scan.next();

        // TODO: 사용자로부터 나이를 입력받기
        System.out.print("나이를 입력하세요: ");
        int age = scan.nextInt();

        // TODO: 입력받은 값 출력
        System.out.println("출력 결과:");
        System.out.println("이름: " + name + "\n나이: " + age);
    }
}
