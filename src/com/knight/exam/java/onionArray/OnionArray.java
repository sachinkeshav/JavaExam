package com.knight.exam.java.onionArray;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class OnionArray {

    public static void main(String[] args) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
    }

    static int isOnionArray(int[] a) {
        if (a.length == 1 || a.length ==0)
            return 1;

        for (int i = 0, j = a.length - 1; i < j; i++, j--) {
            if (i + j == a.length) {
                if (a[i] + a[j] > 10)
                    return 0;
            }
        }
        return 1;
    }
}
