package com.knight.exam.java.niceArray;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class NiceArray {

    public static void main(String[] args) {
        System.out.println(isNice(new int[]{2, 10, 9, 3}));
        System.out.println(isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isNice(new int[]{0, -1, 1}));
        System.out.println(isNice(new int[]{3, 4, 5, 7}));

        System.out.println();
        System.out.println(isNice2(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isNice2(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isNice2(new int[]{10, 5, 5}));
        System.out.println(isNice2(new int[]{0, 6, 8, 20}));
        System.out.println(isNice2(new int[]{3}));
        System.out.println(isNice2(new int[]{8, 5, -5, 5, 3}));
    }

    static int isNice(int[] a) {
        for (int a1 : a) {
            boolean niceFlag = false;
            for (int a2 : a) {
                if (a2 == a1 - 1 || a2 == a1 + 1) {
                    niceFlag = true;
                    break;
                }
            }
            if (!niceFlag)
                return 0;
        }
        return 1;
    }

    static int isNice2(int[] a) {
        int primeSum = 0;

        for (int anA : a) {
            if (isPrime(anA) == 1)
                primeSum += anA;
        }
        if (a[0] == primeSum) return 1;
        return 0;
    }

    static int isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return 0;
        }
        return n > 1 ? 1 : 0;
    }
}
