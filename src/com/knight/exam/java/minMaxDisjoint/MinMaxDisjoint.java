package com.knight.exam.java.minMaxDisjoint;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class MinMaxDisjoint {

    public static void main(String[] args) {
        System.out.println(isMinMaxDisjoint(new int[]{5, 4, 1, 3, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{18, -1, 3, 4, 0}));
        System.out.println(isMinMaxDisjoint(new int[]{9, 0, 5, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{0, 5, 18, 0, 9}));
        System.out.println(isMinMaxDisjoint(new int[]{7, 7, 7, 7}));
        System.out.println(isMinMaxDisjoint(new int[]{}));
        System.out.println(isMinMaxDisjoint(new int[]{1, 2}));
        System.out.println(isMinMaxDisjoint(new int[]{1}));
    }

    public static int isMinMaxDisjoint(int[] a) {

        if (a.length <= 0) return 0;

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < minValue) {
                minValue = a[i];
            }

            if (a[i] > maxValue) {
                maxValue = a[i];
            }
        }

        if (minValue == maxValue) return 0;
        int minCount = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] == minValue && a[i + 1] == maxValue) || (a[i] == maxValue && a[i + 1] == minValue)) {
                return 0;
            } else {
                if (a[i] == minValue) minCount++;
                if (a[i] == maxValue) maxCount++;
            }
            if (minCount > 1 || maxCount > 1) return 0;
        }

        return 1;
    }
}
