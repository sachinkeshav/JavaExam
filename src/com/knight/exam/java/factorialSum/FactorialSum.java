package com.knight.exam.java.factorialSum;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class FactorialSum {

    static int[] solve10() {
        int fact10 = factorial(10);

        return new int[]{};
    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;
        else return (factorial(n) * factorial(n - 1));
    }
}
