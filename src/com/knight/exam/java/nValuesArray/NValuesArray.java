package com.knight.exam.java.nValuesArray;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class NValuesArray {

    public static void main(String[] args) {
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
    }

    static int hasNValues(int[] a, int n) {

        if (a.length < n)
            return 0;

        int[] uniqueArray = new int[n];
        int totalAdded = 0;
        boolean uniqueFlag;

        for (int anA : a) {
            uniqueFlag = false;
            for (int anUnique : uniqueArray) {
                if (anA == anUnique) {
                    uniqueFlag = true;
                    break;
                }
            }
            if (!uniqueFlag) {
                if (totalAdded >= n) return 0;
                uniqueArray[totalAdded] = anA;
                totalAdded++;
            }
        }

        if (totalAdded == n) return 1;
        return 0;
    }
}
