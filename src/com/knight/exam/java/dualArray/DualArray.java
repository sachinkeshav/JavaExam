package com.knight.exam.java.dualArray;

/**
 * Created by skushwaha on 12/29/14.
 */
public class DualArray {

    public static void main(String[] args) {
        System.out.println(isDual(new int[]{1, 2, 1, 3, 3, 2}));
        System.out.println(isDual(new int[]{2, 5, 2, 5, 5}));
        System.out.println(isDual(new int[]{3, 1, 1, 2, 2}));
    }

    static int isDual(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    count++;
                }
            }

            if (count != 2) {
                return 0;
            }
        }

        return 1;
    }
}
