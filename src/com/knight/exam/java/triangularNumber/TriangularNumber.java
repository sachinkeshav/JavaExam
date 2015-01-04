package com.knight.exam.java.triangularNumber;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class TriangularNumber {

    public static void main(String[] args) {
        System.out.println(isTriangular(1));
        System.out.println(isTriangular(3));
        System.out.println(isTriangular(4));
        System.out.println(isTriangular(6));
        System.out.println(isTriangular(10));
        System.out.println(isTriangular(11));
        System.out.println(isTriangular(12));
        System.out.println(isTriangular(13));
        System.out.println(isTriangular(14));
        System.out.println(isTriangular(15));
    }

    static int isTriangular(int n) {

        int sum = 0;
        for (int i = 1; sum < n; i++) {
            sum += i;
        }
        if (sum == n) return 1;
        return 0;
    }
}
