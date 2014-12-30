package com.knight.exam.java.legalNumber;

/**
 * Created by sachinkeshav on 12/30/14.
 */
public class LegalNumber {

    public static void main(String[] args) {
        System.out.println(isLegalNumber(new int[]{3, 2, 1},  4));
        System.out.println(isLegalNumber(new int[]{3, 7, 1},  6));
    }

    static int isLegalNumber(int[] a, int base) {
        for (int anA : a) {
            if (anA < 0 || anA > base)
                return 0;
        }
        return 1;
    }
}
