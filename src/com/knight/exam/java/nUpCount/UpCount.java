package com.knight.exam.java.nUpCount;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class UpCount {
    static int nUpCount(int[] a, int n) {
        int counter = 0;

        int previousPartialSum = 0;
        int partialSum = 0;

        for (int i = 0; i < a.length; i++) {
            previousPartialSum = partialSum;
            partialSum += a[i];

            if (previousPartialSum <= n && partialSum > n)
                counter ++;
        }

        return counter;
    }
}
