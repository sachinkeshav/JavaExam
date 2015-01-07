package com.knight.exam.java.fibonacciNumber;

/**
 * Created by sachinkeshav on 1/7/15.
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(3));
        System.out.println(isFibonacci(4));
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(6));
        System.out.println(isFibonacci(7));
        System.out.println(isFibonacci(8));
        System.out.println(isFibonacci(9));
        System.out.println(isFibonacci(10));
        System.out.println(isFibonacci(11));
        System.out.println(isFibonacci(12));
        System.out.println(isFibonacci(13));
    }

    static int isFibonacci(int n) {
        if (n == 1)
            return 1;

        int fibonacci = 0;
        int fibo1 = 1;
        int fibo2 = 1;

        while (fibonacci < n) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }

        if (fibonacci == n) return 1;
        return 0;
    }
}
