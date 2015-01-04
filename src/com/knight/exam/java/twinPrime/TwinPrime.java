package com.knight.exam.java.twinPrime;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class TwinPrime {

    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));
    }

    static int isTwinPrime(int n) {
        if (isPrime(n)) {
            if (isPrime(n - 2) || isPrime(n + 2))
                return 1;
        }
        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 0;
    }
}
