package chapter03.ch3_7;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        long singleStart = System.currentTimeMillis();

        SingleTask singleTask = new SingleTask();
        Thread singleThread = new Thread(singleTask);
        singleThread.start();
        try {
            singleThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long singleResult = singleTask.getResult();
        long singleEnd = System.currentTimeMillis();
        System.out.println("싱글 쓰레드 합계: " + singleResult);
        System.out.println("싱글 쓰레드 소요시간: " + (singleEnd - singleStart));

        System.out.println();

        long multiStart = System.currentTimeMillis();

        MultiTask multiTask1 = new MultiTask(1, 250);
        MultiTask multiTask2 = new MultiTask(251, 500);
        MultiTask multiTask3 = new MultiTask(501, 750);
        MultiTask multiTask4 = new MultiTask(751, 1000);

        Thread multiThread1 = new Thread(multiTask1);
        Thread multiThread2 = new Thread(multiTask2);
        Thread multiThread3 = new Thread(multiTask3);
        Thread multiThread4 = new Thread(multiTask4);

        multiThread1.start();
        multiThread2.start();
        multiThread3.start();
        multiThread4.start();

        try {
            multiThread1.join();
            multiThread2.join();
            multiThread3.join();
            multiThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long result = multiTask1.getResult() + multiTask2.getResult() + multiTask3.getResult() + multiTask4.getResult();
        long multiEnd = System.currentTimeMillis();

        System.out.println("multiTask 작업시간 : " + (multiEnd - multiStart));
        System.out.println("multiTask 값 : " + result);
    }
}
