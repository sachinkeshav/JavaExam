package com.knight.exam.java.perfectSquare;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class PerfectSquare {
    static int nextPerfectSquare(int n) {
        int nextPerfectSquare = 1;

        if (n < 0)
            return 0;
        else if (n == 0)
            return 1;

        for (int i = 0; i < n; i++)
            if (i * i > n) {
                nextPerfectSquare = i * i;
                break;
            }

        return nextPerfectSquare;
    }
}
