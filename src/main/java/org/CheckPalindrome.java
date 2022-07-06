package org;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(new CheckPalindrome().isPalindrome("asddsap"));
    }

    private boolean isPalindrome(String str) {
        List<Character> list = str.chars().boxed().map(i -> (char) i.intValue()).collect(Collectors.toList());
        Map<Character, Integer> map =
                list.stream().distinct().collect(Collectors.toMap(Function.identity(), ch -> Collections.frequency(list, ch)));
        map.entrySet().forEach(System.out::println);
        return map.entrySet().stream().filter(e -> e.getValue()%2 == 1).count() <= 1;
    }
}
