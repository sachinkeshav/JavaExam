package com.knight.exam.java.eval;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class Eval {

    public static void main(String[] args) {
        System.out.println(eval(1.0, new int[]{0, 1, 2, 3, 4}));
        System.out.println(eval(3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, -2, -1}));
        System.out.println(eval(-3.0, new int[]{3, 2, 1}));
        System.out.println(eval(2.0, new int[]{3, 2}));
        System.out.println(eval(2.0, new int[]{4, 0, 9}));
        System.out.println(eval(2.0, new int[]{10}));
        System.out.println(eval(10.0, new int[]{0, 1}));
    }

    static double eval0(double x, int[] a) {
        double sum = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            double product = 1;
            for (int j = 0; j < i; j++) {
                product *= x;
            }
            sum += a[i] * product;
        }

        return sum;
    }

    static double eval(double x, int[] a) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            double product = 1;
            for (int j = 0; j < i; j++) {
                product *= x;
            }
            sum += a[i] * product;
        }

        return sum;
    }
}
