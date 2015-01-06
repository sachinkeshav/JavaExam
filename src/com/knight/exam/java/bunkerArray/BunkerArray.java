package com.knight.exam.java.bunkerArray;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class BunkerArray {

    public static void main(String[] args) {
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 7, 3}));
        System.out.println(isBunkerArray(new int[]{4, 9, 6, 15, 21}));

        System.out.println();
        System.out.println(isBunker(new int[]{7, 6, 10, 1}));
        System.out.println(isBunker(new int[]{7, 6, 10}));
        System.out.println(isBunker(new int[]{6, 10, 1}));
        System.out.println(isBunker(new int[]{3, 7, 1, 8, 1}));
    }

    static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 1 && isPrime(a[i + 1]) == 1)
                return 1;
        }
        return 0;
    }

    static int isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return 0;
        }
        return n > 0 ? 1 : 0;
    }

    static int isBunker(int[] a) {
        boolean oneFlag = false;
        boolean primeFlag = false;

        for (int anA : a) {
            if (anA == 1)
                oneFlag = true;

            if (anA != 1 && isPrime(anA) == 1)
                primeFlag = true;
        }

        if ((oneFlag && primeFlag) || (!oneFlag && !primeFlag))
            return 1;
        return 0;
    }
}
