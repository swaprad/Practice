package org;

import org.apache.commons.lang3.StringUtils;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Swapnil Patil";
        reverseString(str);
        reverseWordsOrder(str);
    }

    private static void reverseWordsOrder(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
    private static void reverseString(String str) {
        //Using StringBuilder
        System.out.println(new StringBuilder(str).reverse());

        //using for loop
        String rev = "";
        for(int i=str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);

        //using apache commons lib
        System.out.println(StringUtils.reverse(str));
    }

}
