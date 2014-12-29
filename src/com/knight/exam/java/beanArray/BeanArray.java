package com.knight.exam.java.beanArray;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class BeanArray {

    public static void main(String[] args) {
        System.out.println(isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isBeanArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isBeanArray(new int[]{10, 5, 5}));
        System.out.println(isBeanArray(new int[]{0, 6, 8, 20}));
        System.out.println(isBeanArray(new int[]{3}));
        System.out.println(isBeanArray(new int[]{8, 5, -5, 5, 3}));
    }

    static int isBeanArray(int[] a) {
        int a1 = a[0];
        int sum = 0;

        for (int anA : a) {
            if (isPrime(anA)) {
                sum += anA;
            }
        }

        if ((sum == 0 && a1 != 0) || sum != a1) return 0;
        else return 1;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }
}
