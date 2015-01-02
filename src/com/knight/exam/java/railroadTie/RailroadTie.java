package com.knight.exam.java.railroadTie;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class RailroadTie {

    public static void main(String[] args) {
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 3, -18, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 0, 2, 2}));
        System.out.println(isRailroadTie(new int[]{0, 1, 2, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isRailroadTie(new int[]{1}));
        System.out.println(isRailroadTie(new int[]{}));
        System.out.println(isRailroadTie(new int[]{0}));
        System.out.println(isRailroadTie(new int[]{1, 2}));
        System.out.println(isRailroadTie(new int[]{1, 2, 0, 1, 2, 0, 1, 2}));
        System.out.println(isRailroadTie(new int[]{3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3}));
        System.out.println(isRailroadTie(new int[]{0, 0, 0, 0}));
        System.out.println(isRailroadTie(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isRailroadTie(new int[]{1, 3, 0, 3, 5, 0}));
    }

    static int isRailroadTie(int[] a) {
        if (a.length <= 0 || a.length == 1 || a[0] == 0 || a[a.length - 1] == 0)
            return 0;

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != 0 && ((a[i + 1] != 0 && a[i - 1] != 0) || (a[i + 1] == 0 && a[i - 1] == 0))) {
                return 0;
            } else if (a[i] == 0 && (a[i - 1] == 0 || a[i + 1] == 0)) {
                return 0;
            }

        }
        return 1;
    }
}
