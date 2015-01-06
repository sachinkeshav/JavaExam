package com.knight.exam.java.meeraNumber;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class MeeraNumber {

    public static void main(String[] args) {
        System.out.println(isMeera(6));
        System.out.println(isMeera(30));
        System.out.println(isMeera(21));
    }

    static int isMeera(int n) {
        int factorCount = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                factorCount++;
        }
        if (n % factorCount == 0) return 1;
        return 0;
    }
}
