package org;

public class ReverseNumber {
    public static void main(String[] args) {
        Integer number = 12345;
        Integer reverseNumber = 0;
        while(number>0) {
            int rem = number%10;
            reverseNumber = reverseNumber*10 + rem;
            number = number/10;
        }
        System.out.println("reverseNumber = " + reverseNumber);
    }
}
