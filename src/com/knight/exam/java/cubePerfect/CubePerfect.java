package com.knight.exam.java.cubePerfect;

/**
 * Created by sachinkeshav on 1/10/15.
 */
public class CubePerfect {

    public static void main(String[] args) {
        System.out.println(isCubePerfect(new int[]{1, 1, 1, 1}));
        System.out.println(isCubePerfect(new int[]{64}));
        System.out.println(isCubePerfect(new int[]{63}));
        System.out.println(isCubePerfect(new int[]{-1, 0, 1}));
        System.out.println(isCubePerfect(new int[]{}));
        System.out.println(isCubePerfect(new int[]{3, 7, 21, 36}));
    }

    static int isCubePerfect(int[] a) {
        if (a.length == 0)
            return 1;

        for (int anA : a) {

            anA = anA > 0 ? anA : -anA;
            int number = 1;
            int cube = 0;
            while (cube < anA) {
                cube = number * number * number;
                number++;
            }
            if (cube != anA)
                return 0;
        }
        return 1;
    }
}
