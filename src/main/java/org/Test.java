package org;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String args[]) {
        int[] a = {4, 3, 3, 4, 1, 2, 2, 3, 6, 5, 4, 5};
        System.out.println(solution(a));
    }
    public static String solution(int[] a) {
        Map<Integer, Long> duplicatesMap = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long countOf3 = duplicatesMap.entrySet().stream().filter(e -> e.getValue() == 3).count();
        System.out.println(countOf3);
        long countOf2 = duplicatesMap.entrySet().stream().filter(e -> e.getValue() == 2).count();
        System.out.println(countOf2);

        return (countOf2 == 2) && (countOf3 == 2)? "YES" : "NO";
    }
}
