package com.knight.exam.java.array121;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class Array121 {

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    static int is121Array(int[] a) {
        if (a.length <= 0 || a[0] != 1 || a[a.length - 1] != 1)
            return 0;

        int i, j;
        boolean flag = false;
        for (i = 0, j = a.length - 1; i < a.length && j >= 0 && i <= j; i++, j--) {
            if (a[i] != 1 || a[j] != 1) {
                if (a[i] != 2 || a[j] != 2)
                    return 0;
                else {
                    flag = true;
                    break;
                }
            }
        }

        for (int index = i; index <= j; index++) {
            if (a[index] != 2)
                return 0;
        }

        if (flag) return 1;
        return 0;
    }
}
