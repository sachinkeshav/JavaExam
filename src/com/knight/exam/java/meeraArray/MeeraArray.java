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
}
