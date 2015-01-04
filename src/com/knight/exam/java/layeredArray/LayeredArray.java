package com.knight.exam.java.layeredArray;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class LayeredArray {

    public static void main(String[] args) {
        System.out.println(isLayered(new int[]{1, 1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{3, 3, 3, 3, 3, 3, 3}));
        System.out.println(isLayered(new int[]{1, 2, 2, 2, 3, 3}));
        System.out.println(isLayered(new int[]{2, 2, 2, 3, 3, 1, 1}));
        System.out.println(isLayered(new int[]{2}));
        System.out.println(isLayered(new int[]{}));
    }

    static int isLayered(int[] a) {
        if (a.length <= 1)
            return 0;

        int count = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                return 0;

            if (a[i] == a[i + 1])
                count++;

            if (a[i] != a[i + 1]) {
                if (count < 2)
                    return 0;
                count = 1;
            }
        }
        return 1;
    }
}
