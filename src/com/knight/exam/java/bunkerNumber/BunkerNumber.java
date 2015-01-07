package com.knight.exam.java.bunkerNumber;

/**
 * Created by skushwaha on 12/29/14.
 */
public class BunkerNumber {

    public static void main(String[] args) {
        System.out.println(isBunker(11));
        System.out.println(isBunker(22));
        System.out.println(isBunker(8));
    }

    static int isBunker1(int n) {
        if (n == 1) {
            return 1;
        }

        int prevNum = 1;
        int num = 0;

        for (int i = 2; i < Integer.MAX_VALUE && num <= n; i++) {
            num = prevNum + i - 1;
            prevNum = num;
            if (num == n) {
                return 1;
            }
        }

        return 0;
    }

    static int isBunker(int n) {
        int previousElement = 1;
        int index = 0;
        int element = 0;

        while (element < n) {
            element = previousElement + index;
            previousElement = element;
            index++;
        }

        if (element == n) return 1;
        return 0;
    }
}
