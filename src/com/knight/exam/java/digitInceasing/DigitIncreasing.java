package com.knight.exam.java.digitInceasing;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class DigitIncreasing {

    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(24));
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }

    static int isDigitIncreasing(int n) {

        for (int i = 1; i <= 9; i++) {
            int sum = 0;
            int product = 0;

            while (sum < n) {
                product = (product * 10) + i;
                sum += product;
            }

            if (sum == n)
                return 1;
        }

        return 0;
    }
}
