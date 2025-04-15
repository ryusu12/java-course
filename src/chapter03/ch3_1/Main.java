package chapter03.ch3_1;

import java.util.Scanner;

// 직접 처리하기
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String userid = scan.nextLine();
            String password = scan.nextLine();
            try {
                if (userid.equals("admin") && password.equals("1234")) {
                    System.out.println("로그인!");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
            }
        }
    }
}
