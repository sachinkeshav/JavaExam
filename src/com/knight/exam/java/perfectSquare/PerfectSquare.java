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

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(6));
        System.out.println(isPerfectSquare(36));
        System.out.println(isPerfectSquare(0));
        System.out.println(isPerfectSquare(-5));
    }

    static int isPerfectSquare(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        int square;
        int number = 1;

        do {
            square = number * number;
            number++;
        } while (square <= n);
        return square;
    }
}
