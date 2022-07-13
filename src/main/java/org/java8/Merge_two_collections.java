package org.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Merge_two_collections {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList();
        ArrayList<Integer> al2 = new ArrayList();
        al1.add(1);al2.add(1);
        al1.add(2);al2.add(2);
        al1.add(3);al2.add(3);

        Iterator<Integer> it = al2.iterator();
        List<Integer> list1 = al1.stream().map(i -> it.next() + i).collect(Collectors.toList());
        System.out.println(al1);
        System.out.println(al2);
        System.out.println(list1);
        System.out.println("-----------------");

        List<String> strList1 = Arrays.asList("one", "two", "three");
        List<String> strList2 = Arrays.asList("-", "-", "-");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        Iterator<String> itr1 = strList2.iterator();
        Iterator<Integer> intItr = intList.iterator();
        List<String> collected1 = strList1.stream().map(s -> s.concat(itr1.next()).concat(intItr.next().toString())).collect(Collectors.toList());
        System.out.println(collected1);
        System.out.println("-----------------");

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "L");map1.put(2, "M");map1.put(3, "N");map1.put(4, "O");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "B");map2.put(2, "G");map2.put(3, "R");

        map1.forEach((key, value) -> map2.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
        map2.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        System.out.println("-----------------");



    }
}
