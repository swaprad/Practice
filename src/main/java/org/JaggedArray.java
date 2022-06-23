package org;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = j;
            }
        }
        Arrays.stream(arr).forEach(ar -> {
            Arrays.stream(ar).forEach(n -> System.out.print(n + ", "));
            System.out.println();
        });

    }
}
