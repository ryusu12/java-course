package chapter03.ch3_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// filter + map 사용하기
// 홀수만 +10 한 값을 새로 저장하기
public class Main2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // 1. 익명 클래스 사용
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 != 0;
            }
        };
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        };
        List<Integer> resultListClass = arrayList.stream().filter(predicate).map(function).collect(Collectors.toList());
        System.out.println(resultListClass);

        // 2. 람다식 사용
        Predicate<Integer> predicateLamda = num -> num % 2 != 0;
        Function<Integer, Integer> functionLamda = num -> num + 10;
        List<Integer> resultListLamda = arrayList.stream().filter(predicateLamda).map(functionLamda).collect(Collectors.toList());
        System.out.println(resultListLamda);

        // 3. 람다식 직접 대입
        List<Integer> resultListLamdaIn = arrayList.stream().filter(num -> num % 2 != 0).map(num -> num + 10).collect(Collectors.toList());
        System.out.println(resultListLamdaIn);
    }
}
