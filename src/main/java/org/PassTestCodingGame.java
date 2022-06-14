package org;

import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PassTestCodingGame {

    public static void main(String[] args) {
        rohit();
        swapnil();
        garima();
        pooja();
        avanti();
        mohiddin();
    }

    public static void rohit() {
        int largest = findLargest(new int[]{2, 9, 7, 5, 4, 9, 2, 2, 1});
        int largest1 = findLargest(new int[]{Integer.MIN_VALUE});
        int largest2 = findLargest(new int[]{12, 2, 9, 7, 5, 4, 9, 2, 2, 1});
        int largest3 = findLargest(new int[]{12, 2, 9, 7, 5, 4, 9, 2, 2, 1, 22});
        System.out.println(largest);
        System.out.println(largest1 + " : " + Integer.MIN_VALUE);
        System.out.println(largest2);
        System.out.println(largest3);
    }

    public static void swapnil() {
        int smallestInterval = findSmallestInterval(new Integer[]{1, 6, 4, 8, 2, 1});
        System.out.println(smallestInterval);
        Integer[] numbers = Stream.iterate(1, t -> t + Math.abs(new Random().nextInt())).limit(100000).toArray(Integer[]::new);
        System.out.println(findSmallestInterval(numbers));
    }

    public static void pooja() {
        SummerSaleDiscountTest();
    }

    public static void garima() {
        System.out.println(isFoo("foo"));
        System.out.println(isFoo(null));

        SummerSaleDiscountTest();
    }

    public static void avanti() {
        Integer[][] leaves = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        Integer leavesAtGivenGrid = remainingLeaves(1, 1, leaves, "LU");
        System.out.println(leavesAtGivenGrid);
    }

    public static void mohiddin() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.nextLine();
        }
        String letters = in.nextLine();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        String[] remaining = filterWords(words, letters);
        System.setOut(outStream);
        for (int i = 0; i < remaining.length; i++) {
            System.out.println(remaining[i]);
        }

        int sum = sumRange(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        System.out.println(sum);
    }

    /**
     * It's almost the Summer Sales!
     * You work for a shop that wishes to give a discount of discount% to the most expensive item
     * purchased by a given customer during the sales period. Only one product can benefit from the
     * discount.
     * You are tasked by the shop owner to implement the method calculateTotalPrice(prices,
     * discount) which takes the list of prices of the products purchased by a customer and the percentage
     * discount as parameters and returns the total purchase price as an integer (rounded down if the total
     * is a float number).
     * Constraints:
     * 0 ≤ discount ≤ 100 0 < price of a product < 100000 0 < number of products < 100
     */
    private static void SummerSaleDiscountTest() {
        Scanner in = new Scanner(System.in);
        int discount = in.nextInt();
        int n = in.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int price = calculateTotalPrice(prices, discount);
        System.setOut(outStream);
        System.out.println(price);
    }

    /**
     * Algorithm.findLargest(int[] numbers) should return the largest number from numbers . The
     * array numbers always contains at least one number.
     * Implement Algorithm.findLargest(int[] numbers) .
     *
     * @param numbers
     * @return
     */
    private static int findLargest(int[] numbers) {
        return IntStream.of(numbers).boxed().max(Integer::compare).get();
    }

    /**
     * Solution.sumRange should return the sum of the integers having a value between 10 to 100 inclusive
     * and belonging to the array ints .
     * Fix Solution.sumRange .
     * Note: the ints parameter is never null.
     *
     * @param ints
     * @return
     */
    private static int sumRange(int[] ints) {
        return Arrays.stream(ints).boxed().filter(i -> (i >= 10 && i <=100)).collect(Collectors.summingInt(Integer::intValue));
    }

    /**
     * Implement the findSmallestInterval(numbers) method which returns the smallest positive
     * interval between two values of the numbers table.
     * For example given the table [1 6 4 8 2] the smallest interval is 1 (difference between 2 and 1 )
     * Constraints:
     * numbers contains at least two numbers and a maximum of 100,000 entries. The solutions which favor
     * execution time on large size arrays will get the most points. The difference between two elements will
     * never exceed the size of an integer for your language
     *
     * @param numbers
     * @return
     */
    private static int findSmallestInterval(Integer[] numbers) {
        Integer smallestInterval = Integer.MAX_VALUE;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            Integer diff = numbers[i + 1] - numbers[i];
            smallestInterval = diff < smallestInterval && diff > 0 ? diff : smallestInterval;
        }
        return smallestInterval;
    }

    /**
     * It's almost the Summer Sales!
     * You work for a shop that wishes to give a discount of discount% to the most expensive item
     * purchased by a given customer during the sales period. Only one product can benefit from the
     * discount.
     * You are tasked by the shop owner to implement the method calculateTotalPrice(prices,
     * discount) which takes the list of prices of the products purchased by a customer and the percentage
     * discount as parameters and returns the total purchase price as an integer (rounded down if the total
     * is a float number).
     * Constraints:
     * 0 ≤ discount ≤ 100 0 < price of a product < 100000 0 < number of products < 100
     */
    private static int calculateTotalPrice(int[] prices, int discount) {
        if ((discount >= 0 && discount <= 100) && (prices.length > 0 && prices.length < 100)) {
            Integer mostExpensive = IntStream.of(prices).boxed().max(Integer::compare).get();
            return (int) (IntStream.of(prices).boxed().collect(Collectors.summingInt(Integer::intValue)) - Math.floor((mostExpensive * discount) / 100));
        }
        return 0;
    }

    /**
     * A.isFoo(String param) should return true if param is equal to the string "foo" , false
     * otherwise.
     * Implement A.isFoo(String param) .
     *
     * @param param
     * @return
     */
    private static boolean isFoo(String param) {
        return param != null ? param.equals("foo") : false;
    }

    /**
     * Objective
     * In this problem, you'll be filtering words based on the letters that they contain. Specifically, you'll be
     * given an input list of words (all lowercase), along with a set of lowercase letters, and asked to filter out
     * the words that don't contain any letters in the given set.
     * Implementation
     * Implement the method filterWords(words, letters) which takes as input: an array of strings (
     * words ), with the words to filter. A string ( letters ), used to filter the words. For example: words =
     * ['the', 'dog', 'got', 'a', 'bone'] letters = 'ae'
     * Your filterWords method should return an array of strings from words that contain at least one
     * letter in letters . The returned list should maintain the same ordering as in words .
     * For the above example, the correct output would be:
     * ['the', 'a', 'bone']
     *
     * @param words
     * @param letters
     * @return
     */
    public static String[] filterWords(String[] words, String letters) {
        return Stream.of(words).filter(word -> {
            for (String letter : letters.split("")) {
                if (word.contains(letter)) {
                    return true;
                }
            }
            return false;
        }).toArray(String[]::new);
    }

    /***
     * Write the body of the calc(array, n1, n2) method.
     * array is an array of integers. The n1 and n2 parameters are integers defined by the relation 0 <=
     * n1 <= n2 < array.length .
     * The calc method should return the sum of the integers of array whose index belongs to the [n1;
     * n2] interval.
     * @param array
     * @param n1
     * @param n2
     * @return
     */
    private static Integer calc(Integer[] array, Integer n1, Integer n2) {
        Integer sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * Objective
     * It is a windy day today and many tree leaves are covering the garden. Write a program that calculates
     * the number of leaves left in the garden based on their location and a series of wind gusts.
     * How it works The ground is represented by a grid that is height squares high and width squares
     * wide. The top left box is located at (0, 0) where the first integer represents the row and the second
     * the column. Each element of the grid represents the number of leaves on the ground. The series of
     * gusts, winds , is a string composed of the characters U (top), D (bottom), R (right), L (left). Each gust
     * of wind moves the leaves on the grid one square in the direction of the wind. The leaves fly out of the
     * garden when the wind pushes them out of the grid.
     * Implementation
     * Implement the method remainingLeaves(width, height, leaves, winds) which:
     * takes as inputs the integers width and height , the 2D integer array leaves and the string winds
     * with : 0 < width < 20 0 < height < 20 0 <= leaves < 20 0 <= number of characters in winds < 20
     * and returns the number of leaves left on the floor as an integer.
     * Important note: in leaves , the first integer represents rows and the second integer represents
     * columns.
     * @param width
     * @param height
     * @param leaves
     * @param wind
     * @return
     */
    private static Integer remainingLeaves(Integer width, Integer height, Integer[][] leaves, String wind) {
        for (String ch : wind.split("")) {
            switch (ch.toUpperCase()) {
                case "R":
                    shiftRight(leaves);
                    break;
                case "L":
                    shiftLeft(leaves);
                    break;
                case "U":
                    shiftUp(leaves);
                    break;
                case "D":
                    shiftDown(leaves);
                    break;
            }
        }
        return leaves[width][height];
    }
    private static void shiftRight(Integer[][] leaves) {
        for(int i=0; i<leaves.length; i++) {
            Integer previous = 0;
            for(int j=0; j<leaves[0].length; j++) {
                Integer temp = leaves[i][j];
                leaves[i][j] = previous;
                previous = temp;
            }
        }
    }
    private static void shiftLeft(Integer[][] leaves) {
        for(int i=0; i<leaves.length; i++) {
            Integer previous = 0;
            for(int j=leaves[0].length-1; j>=0; j--) {
                Integer temp = leaves[i][j];
                leaves[i][j] = previous;
                previous = temp;
            }
        }
    }
    private static void shiftUp(Integer[][] leaves) {
        for(int i=leaves.length-1; i>=0; i--) {
            Integer previous = 0;
            for(int j=leaves[0].length-1; j>=0; j--) {
                Integer temp = leaves[j][i];
                leaves[j][i] = previous;
                previous = temp;
            }
        }
    }
    private static void shiftDown(Integer[][] leaves) {
        for(int i=0; i<leaves.length; i++) {
            Integer previous = 0;
            for(int j=0; j<leaves[0].length; j++) {
                Integer temp = leaves[j][i];
                leaves[j][i] = previous;
                previous = temp;
            }
        }
    }

}