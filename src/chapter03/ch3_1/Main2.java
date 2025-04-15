package chapter03.ch3_1;

import java.util.Scanner;

// 책임 전가
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                String userid = scan.nextLine();
                String password = scan.nextLine();
                loginCheck(userid, password);
                System.out.println("로그인!");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void loginCheck(String userid, String password) throws Exception {
        if (!(userid.equals("admin") && password.equals("1234"))) {
            throw new Exception("로그인 실패! 아이디 또는 비밀번호가 잘못되었습니다.");
        }
    }
}
