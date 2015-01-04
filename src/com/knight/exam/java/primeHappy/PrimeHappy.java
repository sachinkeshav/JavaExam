package com.knight.exam.java.primeHappy;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class PrimeHappy {

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
    }

    static int isPrimeHappy(int n) {
        int number = 2;
        boolean primeFlag = false;
        int sum = 0;
        while (number < n) {
            if (isPrime(number)) {
                primeFlag = true;
                sum += number;
            }
            number++;
        }
        if (primeFlag && sum % n == 0)
            return 1;
        else return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }
}
