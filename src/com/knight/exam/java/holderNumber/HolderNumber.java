package com.knight.exam.java.holderNumber;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class HolderNumber {

    public static void main(String[] args) {
        System.out.println(isHolderNumber(3));
        System.out.println(isHolderNumber(7));
        System.out.println(isHolderNumber(31));
        System.out.println(isHolderNumber(127));
    }

    static int isHolderNumber(int n) {
        if (isPrime(n)) {
            int number = 0;
            int product = 1;

            while (number < n) {
                product *= 2;
                number = product - 1;
            }

            if (number == n) return 1;
            return 0;
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
