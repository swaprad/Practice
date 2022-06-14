package org;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharactersInString {

    public static void main(String[] args) {
        String str = "Swapnil Patila";
        List<Integer> list = str.chars().boxed().collect(Collectors.toList());
        Map<Character, Integer> map = str.chars().filter(ch -> Collections.frequency(list, ch) > 1)
                .boxed()
                .distinct()
                .collect(Collectors.toMap(ch -> (char) ch.intValue(), ch -> Collections.frequency(list, ch)));
        System.out.println(map);
    }
}
