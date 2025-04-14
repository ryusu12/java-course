package chapter01.ch1_6;

import java.util.Scanner;

// Q1. 산술 연산자 문제
public class Main01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 값 할당 필요
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("덧셈 결과: " + (a + b));
        System.out.println("뺄셈 결과: " + (a - b));
        System.out.println("곱셈 결과: " + (a * b));
        System.out.println("나눗셈 결과: " + (a / b));
        System.out.println("나머지 결과: " + (a % b));
    }
}