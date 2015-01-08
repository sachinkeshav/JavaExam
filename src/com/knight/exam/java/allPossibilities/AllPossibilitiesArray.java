package com.knight.exam.java.allPossibilities;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class AllPossibilitiesArray {

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[]{1, 2, 0, 3}));
        System.out.println(isAllPossibilities(new int[]{3, 2, 1, 0}));
        System.out.println(isAllPossibilities(new int[]{1, 2, 4, 3}));
        System.out.println(isAllPossibilities(new int[]{0, 2, 3}));
        System.out.println(isAllPossibilities(new int[]{0}));
        System.out.println(isAllPossibilities(new int[]{}));
    }

    static int isAllPossibilities1(int[] a) {
        if (a.length == 0)
            return 0;

        int[] tempArray = new int[a.length];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = i;
        }

        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            flag = false;
            for (int j = 0; j < tempArray.length; j++) {
                if (a[i] == tempArray[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }
        return 1;
    }

    static int isAllPossibilities(int[] a) {
        if (a.length <= 0)
            return 0;

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int anA : a) {
                if (anA == i) {
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
