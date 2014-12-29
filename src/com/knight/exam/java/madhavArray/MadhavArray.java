package com.knight.exam.java.madhavArray;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class MadhavArray {

    static int isMadhavArray(int[] a) {
        int result = 0;
        int length = a.length;

        if (isCorrectLength(length)) {
            int counter = 1;
            for (int i = 1; counter < length; i++) {
                int sum = 0;
                result = 0;
                for (int j = 0; j < i + 1; j++) {
                    sum += a[counter];
                    counter++;
                }
                System.out.println(sum);
                if (sum != a[0]) {
                    return result;
                } else result = 1;
            }
        }

        return result;
    }

    private static boolean isCorrectLength(int length) {
        double root1 = (-1 + root(1 + 8 * length)) / 2;
        double root2 = (-1 - root(1 + 8 * length)) / 2;

        return root1 == (int) root1 || root2 == (int) root2;
    }

    private static double root(int n) {
        double root = 1.0;

        for (int i = 0; i < n; i++) {
            root = 0.5 * (root + n / root);
        }
        return root;
    }
}
