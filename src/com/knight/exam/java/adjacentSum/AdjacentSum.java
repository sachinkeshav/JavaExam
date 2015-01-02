package com.knight.exam.java.adjacentSum;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class AdjacentSum {

    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1, 2, 3, 4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
    }

    static int largestAdjacentSum(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > sum) {
                sum = a[i] + a[i + 1];
            }
        }
        return sum;
    }
}
