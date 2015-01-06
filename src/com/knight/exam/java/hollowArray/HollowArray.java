package com.knight.exam.java.hollowArray;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class HollowArray {

    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0}));
    }

    static int isHollow1(int[] a) {
        if (a.length < 3)
            return 0;

        int precedingNonZeros = 0;
        int trailingNonZeros = 0;
        int zeros = 0;

        int i, j, k;
        for (i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                precedingNonZeros++;
                if (i < a.length - 1 && a[i + 1] == 0)
                    break;
            }
            if (i < a.length - 1 && a[i] == 0 && a[i + 1] != 0)
                return 0;
        }
        if (precedingNonZeros == a.length - 1)
            return 0;

        for (j = precedingNonZeros == 0 ? 0 : i + 1; j < a.length; j++) {
            if (a[j] == 0) {
                zeros++;
                if (j < a.length - 1 && a[j + 1] != 0)
                    break;
            }
        }

        if (precedingNonZeros + zeros == a.length - 1 || zeros < 3)
            return 0;

        for (k = j + 1; k < a.length; k++) {
            if (a[k] != 0) {
                trailingNonZeros++;
                if (k < a.length - 1 && a[k + 1] == 0)
                    return 0;
            }
        }

        if (precedingNonZeros == trailingNonZeros && zeros >= 3) return 1;
        return 0;
    }

    static int isHollow(int[] a) {
        if (a.length < 3)
            return 0;
        int zeroCount = 0;

        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            if ((a[i] == 0 && a[j] != 0) || (a[i] != 0 && a[j] == 0)) {
                return 0;
            }
            if (i == j && a[i] == 0) {
                zeroCount++;
            } else {
                if (a[i] == 0)
                    zeroCount++;

                if (a[j] == 0)
                    zeroCount++;
            }
        }

        if (zeroCount >= 3) return 1;
        return 0;
    }
}
