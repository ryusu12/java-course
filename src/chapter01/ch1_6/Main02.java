package chapter01.ch1_6;

import java.util.Scanner;

// Q2. 비교 연산자 문제
public class Main02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("x가 y보다 큰가? " + (x > y));
        System.out.println("x가 y보다 작은가? " + (x < y));
        System.out.println("x가 y보다 같은가? " + (x == y));
        System.out.println("x가 y보다 다른가? " + (x != y));
    }
}