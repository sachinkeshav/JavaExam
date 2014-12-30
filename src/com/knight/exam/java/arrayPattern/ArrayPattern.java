package com.knight.exam.java.arrayPattern;

/**
 * Created by sachinkeshav on 12/31/14.
 */
public class ArrayPattern {

    public static void main(String[] args) {
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{3, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -1, -1, 2, 1}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 2, -1, -1, 1, 2}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, 1, -2, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{1, 1, 1, -1, -1, 1, 1, 1}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{4, -1, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{2, -3, 3}));
        System.out.println(matches(new int[]{1, 2, 3, -5, -5, 2, 3, 18}, new int[]{8}));
    }

    static int matches(int[] a, int[] p) {
        int index = 0;
        for (int i = 0; i < p.length; i++) {
            int temp = p[i] < 0 ? -p[i] : p[i];
            for (int j = 0; j < temp; j++) {
                if ((p[i] > 0 && a[index] < 0) || (p[i] < 0 && a[index] > 0)) {
                    return 0;
                }

                index++;
            }
        }
        return 1;
    }
}
