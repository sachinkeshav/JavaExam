package com.knight.exam.java.divisibleBy;

/**
 * Created by skushwaha on 12/30/14.
 */
public class DivisibleBy {

    public static void main(String[] args) {
        System.out.println(isDivisible(new int[]{3, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{4}, 2));
        System.out.println(isDivisible(new int[]{3, 4, 3, 6, 36}, 3));
        System.out.println(isDivisible(new int[]{6, 12, 24, 36}, 12));
        System.out.println(isDivisible(new int[]{}, 3));
    }

    static int isDivisible(int[] a, int divisor) {
        for (int anA : a) {
            if (anA % divisor != 0)
                return 0;
        }

        return 1;
    }
}
