package chapter03.ch3_7;

public class MultiTask implements Runnable {
    private final long start;
    private final long end;
    private long result;

    public MultiTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public long getResult() {
        return this.result;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            this.result += i;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}