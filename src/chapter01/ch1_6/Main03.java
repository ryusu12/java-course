package chapter01.ch1_6;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // TODO: 사용자로부터 첫 번째 문자열 입력받기
        System.out.print("첫 번째 문자열을 입력하세요: ");
        String str1 = scan.next();
        // TODO: 사용자로부터 두 번째 문자열 입력받기
        System.out.print("두 번째 문자열을 입력하세요: ");
        String str2 = scan.next();
        // TODO: 문자열 비교 결과를 변수 result 에 저장
        boolean result = str1.equals(str2);
        // TODO: 결과 출력
        System.out.println("두 문자열이 같은가요? " + result);
    }
}