package com.knight.exam.java.primeCount;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class PrimeCount {
    static int primeCount(int start, int end) {
        int counter = 0;

        if (end < start || (start == end && start == 1))
            return counter;

        if (start < 0)
            start = 0;


        for (int i = start; i <= end; i++) {
            boolean primeFlag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeFlag = false;
                    break;
                }
            }
            if (primeFlag)
                counter++;

        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(primeCount1(10, 30));
        System.out.println(primeCount1(11, 29));
        System.out.println(primeCount1(20, 22));
        System.out.println(primeCount1(1, 1));
        System.out.println(primeCount1(5, 5));
        System.out.println(primeCount1(6, 2));
        System.out.println(primeCount1(-10, 6));
    }

    static int primeCount1(int start, int end) {
        if (start <= 1)
            start = 2;
        if (end < start)
            return 0;


        int count = 0;

        for (int i = start; i <= end; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }
}
