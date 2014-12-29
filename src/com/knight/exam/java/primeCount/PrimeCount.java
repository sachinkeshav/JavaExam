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
}
