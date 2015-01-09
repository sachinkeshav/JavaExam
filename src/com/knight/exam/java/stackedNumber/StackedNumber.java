package com.knight.exam.java.stackedNumber;

/**
 * Created by sachinkeshav on 12/31/14.
 */
public class StackedNumber {

    public static void main(String[] args) {
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
    }

    static int isStacked1(int n) {
        int index = 1;
        int sum = 1;
        while (true) {
            if (n == sum)
                return 1;

            if (sum > n)
                return 0;

            index++;
            sum += index;
        }
    }

    static int isStacked(int n) {
        int number = 1;
        int sum = 0;
        while (sum < n) {
            sum += number;
            number++;
        }
        if (sum == n) return 1;
        return 0;
    }
}
