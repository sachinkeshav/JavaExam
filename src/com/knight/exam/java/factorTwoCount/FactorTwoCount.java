package com.knight.exam.java.factorTwoCount;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class FactorTwoCount {

    public static void main(String[] args) {
        System.out.println(factorTwoCount(48));
        System.out.println(factorTwoCount(27));
    }

    static int factorTwoCount(int n) {
        int count = 0;

        while (n % 2 == 0) {
//            if (n % 2 == 0) {
                count++;
                n /= 2;
//            }
        }

        return count;
    }
}
