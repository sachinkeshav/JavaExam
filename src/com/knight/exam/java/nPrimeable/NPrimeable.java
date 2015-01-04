package com.knight.exam.java.nPrimeable;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class NPrimeable {

    public static void main(String[] args) {
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 2));
        System.out.println(isNPrimeable(new int[]{5, 15, 27}, 3));
        System.out.println(isNPrimeable(new int[]{5, 15, 26}, 2));
        System.out.println(isNPrimeable(new int[]{1, 1, 1, 1, 1, 1, 1}, 4));
        System.out.println(isNPrimeable(new int[]{}, 2));
    }

    static int isNPrimeable(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (!isPrime(a[i] + n))
                return 0;
        }
        return 1;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 0;
    }
}
