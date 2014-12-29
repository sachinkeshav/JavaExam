package com.knight.exam.java.squarePair;

/**
 * Created by sachinkeshav on 12/28/14.
 */
public class SquarePair {

    static int countSquarePair(int[] a) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > 0 && a[j] > 0) {

                    if (isPerfectSquare(a[i] + a[j])) {

                        count++;
                    }
                }
            }

        }
        return count;
    }

    static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);

        return sqrt == (int) sqrt;
    }
}
