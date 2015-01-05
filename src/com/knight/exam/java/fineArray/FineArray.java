package com.knight.exam.java.fineArray;

/**
 * Created by skushwaha on 1/5/15.
 */
public class FineArray {

    public static void main(String[] args) {
        System.out.println(isFineArray(new int[]{4, 7, 9, 6, 5}));
        System.out.println(isFineArray(new int[]{4, 9, 6, 33}));
        System.out.println(isFineArray(new int[]{3, 8, 15}));
        System.out.println(isFineArray(new int[]{53, 8, 15}));
    }

    static int isFineArray(int[] a) {
        int twinPrime = 0;
        boolean twinPrimeFlag = false;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                if (isPrime(a[i] - 2) == 0 && isPrime(a[i] + 2) == 0)
                    return 0;
                if (isPrime(a[i] - 2) == 1) {
                    twinPrime = a[i] - 2;
                    twinPrimeFlag = true;
                }
                if (isPrime(a[i] + 2) == 1) {
                    twinPrime = a[i] + 2;
                    twinPrimeFlag = true;
                }
            }

            if (twinPrimeFlag) {
                boolean flag = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == twinPrime) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    return 0;
            }
        }
        return 1;
    }

    static int isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return 0;
        }
        return n > 0 ? 1 : 0;
    }
}
