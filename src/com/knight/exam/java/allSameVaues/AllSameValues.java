package com.knight.exam.java.allSameVaues;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class AllSameValues {

    public static void main(String[] args) {
        System.out.println(allValuesTheSame(new int[]{1, 1, 1, 1}));
        System.out.println(allValuesTheSame(new int[]{83, 83, 83}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        System.out.println(allValuesTheSame(new int[]{1, -2343456, 1, -2343456}));
        System.out.println(allValuesTheSame(new int[]{0, 0, 0, 0, -1}));
        System.out.println(allValuesTheSame(new int[]{432123456}));
        System.out.println(allValuesTheSame(new int[]{-432123456}));
        System.out.println(allValuesTheSame(new int[]{}));
    }

    static int allValuesTheSame(int[] a) {
        if (a.length <= 0)
            return 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1])
                return 0;
        }
        return 1;
    }
}
