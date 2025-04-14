package chapter02.ch2_3;

class MyDouble {
    double num;

    MyDouble(double num) {
        this.num = num;
    }

    // 덧셈
    public MyDouble addNum(MyDouble other) {
        return new MyDouble(this.num + other.num);
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}

public class PrimitiveVsWrapperPerformance {
    public static void main(String[] args) {
        int iteration = 10_000_000; // 1000만 번 반복

        // 기본형 연산 성능 테스트
        long startTime1 = System.nanoTime();

        double sum1 = 0;
        for (int i = 0; i < iteration; i++) {
            sum1 += i * 1.1;  // 기본형 연산
        }
        long endTime1 = System.nanoTime();
        long primitiveTime = endTime1 - startTime1;

        // 래퍼 클래스 연산 성능 테스트
        long startTime2 = System.nanoTime();
        MyDouble sum2 = new MyDouble(0.0);
        for (int i = 0; i < iteration; i++) {
            sum2 = sum2.addNum(new MyDouble(i * 1.1)); // 오토박싱 & 언박싱 발생
        }
        long endTime2 = System.nanoTime();
        long wrapperTime = endTime2 - startTime2;

        // 결과 출력
        System.out.println("기본형(double) 연산 시간: " + primitiveTime + " ns");
        System.out.println("MyDouble 클래스 연산 시간: " + wrapperTime + " ns");
        System.out.println("MyDouble vs double 성능 차이: " + (double) wrapperTime / primitiveTime);
    }
}
