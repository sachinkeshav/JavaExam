package com.knight.exam.java.digitSum;

/**
 * Created by skushwaha on 1/5/15.
 */
public class DigitSum {

    public static void main(String[] args) {
        System.out.println(isDigitSum(32121, 10));
        System.out.println(isDigitSum(32121, 9));
        System.out.println(isDigitSum(13, 6));
        System.out.println(isDigitSum(3, 3));
        System.out.println(isDigitSum(-543, 3));
    }

    static int isDigitSum(int n, int m) {
        if (n < 0 || m < 0)
            return -1;

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit;
        }

        if (sum < m) return 1;
        return 0;
    }
}
