package com.knight.exam.java.primeProduct;

/**
 * Created by sachinkeshav on 1/5/15.
 */
public class PrimeProduct {

    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(18));
        System.out.println(isPrimeProduct(15));
        System.out.println(isPrimeProduct(49));
    }

    static int isPrimeProduct(int n) {
        if (n <= 1)
            return 0;
        boolean primeProduct = false;
        for (int factor = 2; factor < n; factor++) {
            if (n % factor == 0) {
                int nextFactor = n / factor;
                if (nextFactor != factor && isPrime(factor) && isPrime(nextFactor)) {
                    primeProduct = true;
                    break;
                }
            }
        }

        if (primeProduct) return 1;
        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 0;
    }
}
