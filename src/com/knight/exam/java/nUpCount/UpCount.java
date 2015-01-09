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

    public static void main(String[] args) {
        System.out.println(nUpCount1(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5));
        System.out.println(nUpCount1(new int[]{6, 3, 1}, 6));
    }

    static int nUpCount1(int[] a, int n) {
        int prvPartialSum = 0;
        int count = 0;

        for (int anA : a) {
            int sum = prvPartialSum + anA;

            if (prvPartialSum <= n && sum > n)
                count++;

            prvPartialSum = sum;
        }
        return count;
    }
}
