package com.knight.exam.java.pairwiseSum;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class PairwiseSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{2, 1, 18})));
        System.out.println(Arrays.toString(pairwiseSum(new int[]{})));
    }

    static int[] pairwiseSum(int[] a) {
        if (a.length <= 0 || a.length % 2 != 0)
            return null;

        int[] result = new int[a.length / 2];

        for (int i = 0, index = 0; i < a.length - 1 && index < result.length; i = i + 2, index++) {
            result[index] = a[i] + a[i + 1];
        }

        return result;
    }
}
