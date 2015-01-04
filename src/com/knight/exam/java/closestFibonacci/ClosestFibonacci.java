package com.knight.exam.java.closestFibonacci;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class ClosestFibonacci {

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13));
        System.out.println(closestFibonacci(12));
        System.out.println(closestFibonacci(33));
        System.out.println(closestFibonacci(34));
    }

    static int closestFibonacci(int n) {
        int fibonacci = 1;
        if (n == 1 || n == 2) {
            fibonacci = 1;
        }
        int fibo1 = 1;
        int fibo2 = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            if (fibonacci > n) return fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }

        return 0;
    }
}
