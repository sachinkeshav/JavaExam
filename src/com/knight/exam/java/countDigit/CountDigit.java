package com.knight.exam.java.countDigit;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class CountDigit {

    public static void main(String[] args) {
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
    }

    static int countDigit(int n, int digit) {
        if (n < 0 || digit < 0)
            return -1;

        int digitCount = 0;

        while (n > 0) {
            int d = n % 10;
            n /= 10;
            if (d == digit)
                digitCount++;
        }
        return digitCount;
    }
}
