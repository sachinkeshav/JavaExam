package com.knight.exam.java.tripleArray;

/**
 * Created by sachinkeshav on 1/7/15.
 */
public class TripleArray {

    public static void main(String[] args) {
        System.out.println(isTriple(new int[]{3, 1, 2, 1, 3, 1, 3, 2, 2}));
        System.out.println(isTriple(new int[]{2, 5, 2, 5, 5, 2, 5}));
        System.out.println(isTriple(new int[]{3, 1, 1, 1}));
    }

    static int isTriple(int[] a) {
        for (int a1 : a) {
            int count = 0;
            for (int a2 : a) {
                if (a1 == a2)
                    count++;
            }

            if (count != 3)
                return 0;
        }
        return 1;
    }
}
