package chapter01.ch1_7;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("신호등 색상을 입력하세요 (초록불, 노란불, 빨간불): ");
        String light = scan.next();
        switch (light) {
            case "초록불":
                System.out.println("건너세요!");
                break;
            case "노란불":
                System.out.println("주의하세요!");
                break;
            case "빨간불":
                System.out.println("멈추세요!");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
