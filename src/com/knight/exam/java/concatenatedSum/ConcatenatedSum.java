package com.knight.exam.java.concatenatedSum;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class ConcatenatedSum {

    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    static int checkConcatenatedSum(int n, int catlen) {
        int tempNum = n;
        int sum = 0;

        while (tempNum > 0) {
            int digit = tempNum % 10;
            tempNum /= 10;
            for (int i = 1, j = 1; j <= catlen; i *= 10, j++) {
                sum += digit * i;
            }
        }
        if (n == sum) return 1;
        return 0;
    }
}
