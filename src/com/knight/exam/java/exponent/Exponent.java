package com.knight.exam.java.exponent;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class Exponent {

    public static void main(String[] args) {
        System.out.println(getExponent(162, 3));
        System.out.println(getExponent(27, 3));
        System.out.println(getExponent(28, 3));
        System.out.println(getExponent(280, 7));
        System.out.println(getExponent(-250, 5));
        System.out.println(getExponent(18, 1));
        System.out.println(getExponent(128, 4));
    }

    static int getExponent1(int n, int p) {
        if (p <= 1)
            return -1;
        int count = 0;
        n = n > 0 ? n : -n;
        for (int num = n; num > 0; num /= p) {
            if (num % p == 0)
                count++;
            else break;
        }
        return count;
    }

    static int getExponent(int n, int p) {
        if (p <= 1)
            return -1;

        int count = 0;
        n = n > 0 ? n : -n;

        while (n > 0) {
            if (n % p == 0)
                count++;
            else break;

            n /= p;
        }
        return count;
    }
}
