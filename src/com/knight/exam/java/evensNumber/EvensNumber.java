package com.knight.exam.java.evensNumber;

/**
 * Created by sachinkeshav on 1/5/15.
 */
public class EvensNumber {

    public static void main(String[] args) {
        System.out.println(isEvens(2426));
        System.out.println(isEvens(3224));
    }

    static int isEvens(int n) {
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit % 2 != 0)
                return 0;
        }
        return 1;
    }
}
