package com.knight.exam.java.centeredArray;

/**
 * Created by sachinkeshav on 1/5/15.
 */
public class CenteredArray {

    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[]{3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[]{3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[]{}));
        System.out.println(isCentered(new int[]{1}));
    }

    static int isCentered(int[] a) {
        if (a.length == 0 || a.length % 2 == 0)
            return 0;

        int centerIndex = (a.length - 1) / 2;
        int centerValue = a[centerIndex];

        for (int i = 0; i < a.length; i++) {
            if (i != centerIndex && a[i] <= centerValue)
                return 0;
        }
        return 1;
    }
}
