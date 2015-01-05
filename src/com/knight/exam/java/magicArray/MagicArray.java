package com.knight.exam.java.magicArray;

/**
 * Created by sachinkeshav on 1/5/15.
 */
public class MagicArray {

    public static void main(String[] args) {
        System.out.println(isMagicArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isMagicArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isMagicArray(new int[]{10, 5, 5}));
        System.out.println(isMagicArray(new int[]{0, 6, 8, 20}));
        System.out.println(isMagicArray(new int[]{3}));
        System.out.println(isMagicArray(new int[]{8, 5, -5, 5, 3}));
    }

    static int isMagicArray(int[] a) {
        if (a.length == 0)
            return 0;

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
        return n > 0 ? 1 : 0;
    }
}
