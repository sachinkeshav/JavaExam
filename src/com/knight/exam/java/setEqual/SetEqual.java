package com.knight.exam.java.setEqual;

/**
 * Created by sachinkeshav on 1/10/15.
 */
public class SetEqual {

    public static void main(String[] args) {
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1}, new int[]{1, 9, 12, 9, 12, 1, 9}));
        System.out.println(isSetEqual(new int[]{9, 1, 12, 1}, new int[]{1, 9, 12, 9, 12, 1, 9, 10}));
        System.out.println(isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 1}));
        System.out.println(isSetEqual(new int[]{1, 7, 8}, new int[]{1, 7, 6}));
    }

    static int isSetEqual(int[] a, int[] b) {
        for (int anA : a) {
            boolean flag = false;
            for (int aB : b) {
                if (aB == anA) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        for (int aB : b) {
            boolean flag = false;
            for (int anA : a) {
                if (aB == anA) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        return 1;
    }
}
