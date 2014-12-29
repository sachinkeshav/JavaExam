package com.knight.exam.java.goodSpread;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class GoodSpread {

    public static void main(String[] args) {
        System.out.println(goodSpread(new int[]{2, 1, 2, 5, 2, 1, 5, 9}));
        System.out.println(goodSpread(new int[]{3, 1, 3, 1, 3, 5, 5, 3}));
    }

    static int goodSpread(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;

                    if (count > 3) return 0;
                }
            }
        }

        return 1;
    }
}
