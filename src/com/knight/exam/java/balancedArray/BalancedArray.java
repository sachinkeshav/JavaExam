package com.knight.exam.java.balancedArray;

/**
 * Created by sachinkeshav on 1/5/15.
 */
public class BalancedArray {

    public static void main(String[] args) {
        System.out.println(isBalanced(new int[]{-2, 3, 2, -3}));
        System.out.println(isBalanced(new int[]{-2, 2, 2, 2}));
        System.out.println(isBalanced(new int[]{-5, 2, -2}));

        System.out.println();
        System.out.println(isBalanced1(new int[]{2, 3, 6, 7}));
        System.out.println(isBalanced1(new int[]{6, 7, 2, 3, 12}));
        System.out.println(isBalanced1(new int[]{7, 15, 2, 3}));
        System.out.println(isBalanced1(new int[]{16, 6, 2, 3}));
    }

    static int isBalanced(int[] a) {
        if (a.length % 2 != 0)
            return 0;

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == -a[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }
        return 1;
    }

    static int isBalanced1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if ((i % 2 == 0 && a[i] % 2 != 0) || (i % 2 != 0 && a[i] % 2 == 0))
                return 0;
        }
        return 1;
    }
}
