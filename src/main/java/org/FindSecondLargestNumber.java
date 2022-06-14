package org;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        Integer[] arr = {3,7,14,8,2,5,9,11};
        Integer largest = 0;
        Integer secondLargest = 0;

        for(int i=0; i<arr.length; i++) {
            if(largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if(secondLargest < arr[i]) {
                secondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);

        Optional<Integer> first = Arrays.stream(arr)
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst();
        System.out.println(first.get());
    }
}
