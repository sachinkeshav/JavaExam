package com.knight.exam.java.twinArray;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class TwinArray {

    public static void main(String[] args) {
        System.out.println(isTwin(new int[]{3, 5, 8, 10, 27}));
        System.out.println(isTwin(new int[]{11, 9, 12, 13, 23}));
        System.out.println(isTwin(new int[]{5, 3, 14, 7, 18, 67}));
        System.out.println(isTwin(new int[]{13, 14, 15, 3, 5}));
        System.out.println(isTwin(new int[]{1, 17, 8, 25, 67}));
    }

    static int isTwin(int[] a) {
        boolean twinPrimeFlag;
        for (int a1 : a) {
            twinPrimeFlag = true;
            if (isPrime(a1) && (isPrime(a1 - 2) || isPrime(a1 + 2))) {
                twinPrimeFlag = false;
                for (int a2 : a) {
                    if (isPrime(a1 - 2) && a2 == a1 - 2) {
                        twinPrimeFlag = true;
                        break;
                    }

                    if (isPrime(a1 + 2) && a2 == a1 + 2) {
                        twinPrimeFlag = true;
                        break;
                    }
                }
            }
            if (!twinPrimeFlag)
                return 0;
        }
        return 1;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }
}
