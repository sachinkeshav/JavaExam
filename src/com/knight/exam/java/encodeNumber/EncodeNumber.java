package com.knight.exam.java.encodeNumber;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class EncodeNumber {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }

    static int[] encodeNumber(int n) {
        if (n <= 1)
            return null;

        int size = 0;
        int nCopy = n;
        for (int i = 2; i <= nCopy; ) {
            if (isPrime(i) && nCopy % i == 0) {
                size++;
                nCopy /= i;
            } else i++;
        }

        int[] result = new int[size];
        nCopy = n;

        for (int i = 0, j = 2; i < size && j <= nCopy; ) {
            if (isPrime(j) && nCopy % j == 0) {
                result[i] = j;
                i++;
                nCopy /= j;
            } else j++;
        }

        return result;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }
}
