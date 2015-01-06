package com.knight.exam.java.beanArray;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class BeanArray {

    public static void main(String[] args) {
        System.out.println(isBeanArray(new int[]{21, 3, 7, 9, 11, 4, 6}));
        System.out.println(isBeanArray(new int[]{13, 4, 4, 4, 4}));
        System.out.println(isBeanArray(new int[]{10, 5, 5}));
        System.out.println(isBeanArray(new int[]{0, 6, 8, 20}));
        System.out.println(isBeanArray(new int[]{3}));
        System.out.println(isBeanArray(new int[]{8, 5, -5, 5, 3}));

        System.out.println();
        System.out.println(isBean1(new int[]{1, 2, 3, 9, 6, 13}));
        System.out.println(isBean1(new int[]{3, 4, 6, 7, 13, 15}));
        System.out.println(isBean1(new int[]{1, 2, 3, 4, 10, 11, 12}));
        System.out.println(isBean1(new int[]{3, 6, 9, 5, 7, 13, 6, 17}));
        System.out.println(isBean1(new int[]{9, 6, 18}));
        System.out.println(isBean1(new int[]{4, 7, 16}));
    }

    static int isBeanArray(int[] a) {
        int a1 = a[0];
        int sum = 0;

        for (int anA : a) {
            if (isPrime(anA)) {
                sum += anA;
            }
        }

        if ((sum == 0 && a1 != 0) || sum != a1) return 0;
        else return 1;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return n > 0;
    }

    static int isBean1(int[] a) {
        boolean flag9 = false;
        boolean flag13 = false;
        boolean flag7 = false;
        boolean flag16 = false;

        for (int anA : a) {
            if (anA == 9)
                flag9 = true;
            else if (anA == 13)
                flag13 = true;
            else if (anA == 7)
                flag7 = true;
            else if (anA == 16)
                flag16 = true;
        }

        if ((flag9 && flag13) || (flag7 && !flag16) || (!flag9 && !flag7))
            return 1;
        return 0;
    }
}
