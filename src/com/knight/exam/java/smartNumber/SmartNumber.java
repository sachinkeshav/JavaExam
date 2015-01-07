package com.knight.exam.java.smartNumber;

/**
 * Created by sachinkeshav on 1/7/15.
 */
public class SmartNumber {

    public static void main(String[] args) {
        System.out.println(isSmart(11));
        System.out.println(isSmart(22));
        System.out.println(isSmart(8));
    }

    static int isSmart(int n) {
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
