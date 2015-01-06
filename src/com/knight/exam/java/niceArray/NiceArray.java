package com.knight.exam.java.niceArray;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class NiceArray {

    public static void main(String[] args) {
        System.out.println(isNice(new int[]{2, 10, 9, 3}));
        System.out.println(isNice(new int[]{2, 2, 3, 3, 3}));
        System.out.println(isNice(new int[]{1, 1, 1, 2, 1, 1}));
        System.out.println(isNice(new int[]{0, -1, 1}));
        System.out.println(isNice(new int[]{3, 4, 5, 7}));
    }

    static int isNice(int[] a) {
        for (int a1 : a) {
            boolean niceFlag = false;
            for (int a2 : a) {
                if (a2 == a1 - 1 || a2 == a1 + 1) {
                    niceFlag = true;
                    break;
                }
            }
            if (!niceFlag)
                return 0;
        }
        return 1;
    }
}
