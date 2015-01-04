package com.knight.exam.java.zeroLimited;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class ZeroLimited {

    public static void main(String[] args) {
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0}));
        System.out.println(isZeroLimited(new int[]{0, 1}));
        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{}));
    }

    static int isZeroLimited(int[] a) {
        for (int x = 1; x < a.length; x += 3) { // x = 3 * n + 1 = 1, 4, 7, 10, ...

            for (int i = 0; i < a.length; i++) {
                if (i == x) {
                    if (a[i] != 0)
                        return 0;
                    break;
                }
                if (a[i] == 0)
                    return 0;
                break;
            }
        }
        return 1;
    }
}
