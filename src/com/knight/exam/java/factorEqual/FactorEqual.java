package com.knight.exam.java.factorEqual;

/**
 * Created by sachinkeshav on 1/7/15.
 */
public class FactorEqual {

    public static void main(String[] args) {
        System.out.println(factorEqual(10, 33));
        System.out.println(factorEqual(9, 10));
    }

    static int factorEqual(int n, int m) {

        if (n < 0 || m < 0)
            return 0;

        int factorsOfN = 2;
        int factorsOfM = 2;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                factorsOfN++;
        }

        for (int j = 2; j < m; j++) {
            if (m % j == 0)
                factorsOfM++;
        }

        if (factorsOfN == factorsOfM) return 1;
        return 0;
    }
}
