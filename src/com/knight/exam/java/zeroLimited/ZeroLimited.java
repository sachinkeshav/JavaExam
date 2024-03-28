package com.knight.exam.java.zeroLimited;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class ZeroLimited {

    public static void main(String[] args) {
        System.out.println(isZeroLimited(new int[]{0, 0, 0, 0, 0}));
        System.out.println(isZeroLimited(new int[]{1, 0}));
        System.out.println(isZeroLimited(new int[]{0, 1}));
        System.out.println(isZeroLimited(new int[]{5}));
        System.out.println(isZeroLimited(new int[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0}));
        System.out.println(isZeroLimited(new int[]{}));
    }

    static int isZeroLimited(int[] a) {
        for (int i=0, k=1; i < a.length; i++) {
            if(i==k) {
                if(a[i] != 0) return 0;
                k += 3;
            } else 
                if(a[i] == 0) return 0;
        }
        return 1;
    }
}
