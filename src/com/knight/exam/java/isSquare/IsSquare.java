package com.knight.exam.java.isSquare;

/**
 * Created by skushwaha on 12/30/14.
 */
public class IsSquare {

    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }

    public static int isSquare(int n) {

        if (n < 0) return 0;

        float root = 1.0f;

        for (int i = 0; i < n; i++) {
            root = 0.5f * (root + (n / root));
        }

        if (root == (int) root) return 1;
        else return 0;
    }
}
