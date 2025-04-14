package chapter01.ch1_9;

public class EvenNumberFinder {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 10, 15, 20};
        System.out.print("짝수:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(" " + arr[i]);
        }
    }
}