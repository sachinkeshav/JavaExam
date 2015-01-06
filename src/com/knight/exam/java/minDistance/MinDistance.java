package com.knight.exam.java.minDistance;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class MinDistance {

    public static void main(String[] args) {
        System.out.println(minDistance(13013));
        System.out.println(minDistance(8));
    }

    static int minDistance(int n) {
        int previousFactor = 1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i - previousFactor < minDistance)
                    minDistance = i - previousFactor;

                previousFactor = i;
            }
        }

        return minDistance;
    }
}
