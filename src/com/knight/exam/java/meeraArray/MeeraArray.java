package com.knight.exam.java.meeraArray;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class MeeraArray {

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{-4, 0, 1, 0, 2}));
        System.out.println(isMeera(new int[]{-1, 0, 0, 8, 0}));

        System.out.println();
        System.out.println(isMeera1(new int[]{3, 5, -2}));
        System.out.println(isMeera1(new int[]{8, 3, 4}));

        System.out.println();
        System.out.println(isMeera2(new int[]{-4, 0, 1, 0, 2, 1}));
        System.out.println(isMeera2(new int[]{-8, 0, 0, 8, 0}));
        System.out.println(isMeera2(new int[]{-8, 0, 0, 2, 0}));

        System.out.println();
        System.out.println(isMeera3(new int[]{7, 6, 0, 10, 1}));
        System.out.println(isMeera3(new int[]{6, 10, 1}));
        System.out.println(isMeera3(new int[]{7, 6, 10}));
        System.out.println(isMeera3(new int[]{6, 10, 0}));
        System.out.println(isMeera3(new int[]{3, 7, 0, 8, 0, 5}));

        System.out.println();
        System.out.println(isMeera4(new int[]{7, 9, 0, 10, 1}));
        System.out.println(isMeera4(new int[]{6, 10, 8}));
        System.out.println(isMeera4(new int[]{7, 6, 1}));
        System.out.println(isMeera4(new int[]{9, 10, 0}));
        System.out.println(isMeera4(new int[]{1, 1, 0, 8, 0, 9, 9, 1}));
    }

    static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= i)
                return 0;
        }

        return 1;
    }

    static int isMeera1(int[] a) {
        for (int a1 : a) {
            for (int a2 : a) {
                if (a1 == a2 * 2)
                    return 0;
            }
        }
        return 1;
    }

    static int isMeera2(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= i)
                return 0;
            sum += a[i];
        }
        if (sum == 0) return 1;
        return 0;
    }

    static int isMeera3(int[] a) {
        boolean primeFlag = false;
        boolean zeroFlag = false;

        for (int anA : a) {
            if (anA == 0)
                zeroFlag = true;
            if (isPrime(anA) == 1) {
                primeFlag = true;
            }
        }

        if ((primeFlag && zeroFlag) || (!primeFlag && !zeroFlag)) return 1;
        return 0;
    }

    static int isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return 0;
        }
        return n > 1 ? 1 : 0;
    }

    static int isMeera4(int[] a) {
        boolean flagOf1 = false;
        boolean flagOf9 = false;

        for (int anA : a) {
            if (anA == 1)
                flagOf1 = true;
            if (anA == 9)
                flagOf9 = true;
        }

        if ((flagOf1 && flagOf9) || (!flagOf1 && !flagOf9)) return 1;
        return 0;
    }
}
