package com.knight.exam.java.sumSafe;

/**
 * Created by sachinkeshav on 12/31/14.
 */
public class SumSafe {

    public static void main(String[] args) {
        System.out.println(isSumSafe(new int[]{5, -5, 0}));
        System.out.println(isSumSafe(new int[]{5, -2, 1}));
        System.out.println(isSumSafe(new int[]{}));
    }

    static int isSumSafe(int[] a) {
        if (a.length == 0) return 0;

        int sum = 0;

        for (int anA : a) {
            sum += anA;
        }

        for (int anA : a) {
            if (anA == sum)
                return 0;
        }

        return 1;
    }
}
