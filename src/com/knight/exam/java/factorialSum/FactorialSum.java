package com.knight.exam.java.factorialSum;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class FactorialSum {

    static int[] solve101() {
        int fact10 = factorial(10);
        int[] resultArray = new int[2];
        int[] tempArray = new int[10];

        for (int i = 0; i < 10; i++) {
            tempArray[i] = factorial(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (tempArray[i] * tempArray[j] == fact10) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                    return resultArray;
                }
            }
        }
        return resultArray;
    }

    private static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else return (n * factorial(n - 1));
    }

    static int[] solve10() {
        int fact10 = factorial(10);
        int[] result = new int[2];

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (factorial(i) * factorial(j) == fact10) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
