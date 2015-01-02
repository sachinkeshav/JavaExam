package com.knight.exam.java.oddHeavy;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class OddHeavy {

    public static void main(String[] args) {
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 8}));
        System.out.println(isOddHeavy(new int[]{11, 4, 9, 2, 3, 10}));
        System.out.println(isOddHeavy(new int[]{1}));
        System.out.println(isOddHeavy(new int[]{2}));
        System.out.println(isOddHeavy(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(isOddHeavy(new int[]{2, 4, 6, 8, 11}));
        System.out.println(isOddHeavy(new int[]{-2, -4, -6, -8, -11}));
    }

    static int isOddHeavy(int[] a) {
        boolean oddFlag = false;
        int smallestOdd = Integer.MAX_VALUE;
        int largestEven = Integer.MIN_VALUE;

        for (int anA : a) {
            if (anA % 2 != 0) {
                oddFlag = true;

                if (anA < smallestOdd)
                    smallestOdd = anA;
            } else {
                if (anA > largestEven)
                    largestEven = anA;
            }
        }

        if (oddFlag && smallestOdd > largestEven)
            return 1;
        else return 0;
    }
}
