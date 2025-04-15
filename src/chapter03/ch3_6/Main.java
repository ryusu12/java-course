package chapter03.ch3_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// filter 사용하기
// 짝수만 가져와서 배열에 새로 저장하기
public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // 익명 클래스
        Predicate<Integer> function = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        List<Integer> resultArrClass = arr.stream().filter(function).collect(Collectors.toList());
        System.out.println(resultArrClass);

        // 람다식
        Predicate<Integer> functionLamda = (num -> num % 2 == 0);
        List<Integer> resultArrLamda = arr.stream().filter(functionLamda).collect(Collectors.toList());
        System.out.println(resultArrLamda);

        // 직접 람다식 대입
        List<Integer> resultArrIn = arr.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(resultArrIn);
    }
}
