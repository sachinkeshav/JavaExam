package com.knight.exam.java.packedArray;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class PackedArray {

    public static void main(String[] args) {
        System.out.println(isPacked(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{2, 2, 1}));
        System.out.println(isPacked(new int[]{2, 2, 1, 2, 2}));
        System.out.println(isPacked(new int[]{4, 4, 4, 4, 1, 2, 2, 3, 3, 3}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7, 1}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 1, 7, 7, 7}));
        System.out.println(isPacked(new int[]{7, 7, 7, 7, 7, 7, 7}));
        System.out.println(isPacked(new int[]{}));
        System.out.println(isPacked(new int[]{1, 2, 1}));
        System.out.println(isPacked(new int[]{2, 1, 1}));
        System.out.println(isPacked(new int[]{-3, -3, -3}));
        System.out.println(isPacked(new int[]{0, 2, 2}));
        System.out.println(isPacked(new int[]{2, 1, 2}));
    }

    static int isPacked(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i = j) {
            if (a[i] <= 0)
                return 0;
            for (j = i; j < i + a[i]; j++) {
                if (a[i] != a[j]) {
                    return 0;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            int lastIndex = i;
            for (int k = i; k < a.length; k++) {
                if (a[lastIndex] == a[k]) {
                    if (k - lastIndex > 1) return 0;
                    lastIndex = k;
                }
            }
        }

        return 1;
    }
}
