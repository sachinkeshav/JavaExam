package com.knight.exam.java.isolatedNumber;

/**
 * Created by skushwaha on 12/31/14.
 */
public class IsolatedNumber {

    public static void main(String[] args) {
        System.out.println(isIsolated(69));
        System.out.println(isIsolated(163));
        System.out.println(isIsolated(162));
        System.out.println(isIsolated(2));
        System.out.println(isIsolated(3));
        System.out.println(isIsolated(8));
        System.out.println(isIsolated(9));
        System.out.println(isIsolated(14));
        System.out.println(isIsolated(24));
        System.out.println(isIsolated(28));
        System.out.println(isIsolated(34));
        System.out.println(isIsolated(58));
        System.out.println(isIsolated(63));
    }

    static int isIsolated(long n) {
        if (n >= 2097151 || n < 0) return -1;

        long square = n * n;
        long cube = n * n * n;
        while (cube > 0) {
            long cubeRemainder = cube % 10;
            cube /= 10;

            long tempSquare = square;
            while (tempSquare > 0) {
                long squareRemainder = tempSquare % 10;
                tempSquare /= 10;

                if (squareRemainder == cubeRemainder)
                    return 0;
            }
        }

        return 1;
    }
}
