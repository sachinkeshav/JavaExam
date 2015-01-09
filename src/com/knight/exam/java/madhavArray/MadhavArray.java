package com.knight.exam.java.madhavArray;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class MadhavArray {

    static int isMadhavArray1(int[] a) {
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

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2, 1, 1}));
        System.out.println(isMadhavArray(new int[]{2, 1, 1, 4, -1, -1}));
        System.out.println(isMadhavArray(new int[]{6, 2, 4, 2, 2, 2, 1, 5, 0, 0}));
        System.out.println(isMadhavArray(new int[]{18, 9, 10, 6, 6, 6}));
        System.out.println(isMadhavArray(new int[]{-6, -3, -3, 8, -5, -4}));
        System.out.println(isMadhavArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1}));
        System.out.println(isMadhavArray(new int[]{3, 1, 2, 3, 0}));
    }

    static int isMadhavArray(int[] a) {
        boolean correctLength = false;
        int n = 2;
        double checkLength = 1;
        while (checkLength <= a.length) {
            checkLength = n * (n + 1) / 2.0;
            if (checkLength == a.length) {
                correctLength = true;
                break;
            }
            n++;
        }
        if (!correctLength) return 0;
        int index = 1;
        for (int i = 2; index < a.length; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += a[index];
                index++;
            }
            if (sum != a[0]) return 0;
        }
        return 1;
    }
}
