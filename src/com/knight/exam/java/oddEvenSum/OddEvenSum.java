package com.knight.exam.java.oddEvenSum;

/**
 * Created by skushwaha on 12/30/14.
 */
public class OddEvenSum {

    public static void main(String[] args) {
        System.out.println(oddEvenSum(new int[]{1}));
        System.out.println(oddEvenSum(new int[]{1, 2}));
        System.out.println(oddEvenSum(new int[]{1, 2, 3}));
        System.out.println(oddEvenSum(new int[]{1, 2, 3, 4}));
        System.out.println(oddEvenSum(new int[]{3, 3, 4, 4}));
        System.out.println(oddEvenSum(new int[]{3, 2, 3, 4}));
        System.out.println(oddEvenSum(new int[]{4, 1, 2, 3}));
        System.out.println(oddEvenSum(new int[]{1, 1}));
        System.out.println(oddEvenSum(new int[]{}));
    }

    static int oddEvenSum(int[] a) {
        int oddSum = 0;
        int evenSum = 0;

        for (int anA : a) {
            if (anA % 2 == 0)
                evenSum += anA;
            else
                oddSum += anA;
        }

        return (oddSum - evenSum);
    }
}
