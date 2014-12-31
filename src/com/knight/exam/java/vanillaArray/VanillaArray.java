package com.knight.exam.java.vanillaArray;

/**
 * Created by skushwaha on 12/31/14.
 */
public class VanillaArray {

    public static void main(String[] args) {
        System.out.println(isVanilla(new int[]{1, 1, 11, 1111, 1111111}));
        System.out.println(isVanilla(new int[]{11, 101, 1111, 11111}));
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11, 22, 13, 34, 125}));
        System.out.println(isVanilla(new int[]{9, 999, 99999, -9999}));
        System.out.println(isVanilla(new int[]{}));
    }

    static int isVanilla(int[] a) {
        for (int anA : a) {
            anA = anA < 0 ? -anA : anA;
            int digit = anA % 10;
            while (anA > 0) {
                int remainder = anA % 10;
                anA /= 10;

                if (digit != remainder)
                    return 0;
            }
        }

        return 1;
    }
}
