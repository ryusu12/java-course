package chapter03.ch3_7;

public class SingleTask implements Runnable {
    private long result;

    public long getResult() {
        return this.result;
    }

    @Override
    public void run() {
        for (long i = 1; i <= 1000; i++) {
            this.result += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
