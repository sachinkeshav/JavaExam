package com.knight.exam.java.daphneArray;

/**
 * Created by skushwaha on 1/5/15.
 */
public class DaphneArray1 {

    public static void main(String[] args) {
        System.out.println(isDaphne(new int[]{2, 4, 2}));
        System.out.println(isDaphne(new int[]{1, 3, 17, -5}));
        System.out.println(isDaphne(new int[]{3, 2, 5}));
    }

    static int isDaphne(int[] a) {
        boolean evenFlag = false;
        boolean oddFlag = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenFlag = true;
            } else {
                oddFlag = true;
            }

            if (evenFlag && a[i] % 2 != 0)
                return 0;
            if (oddFlag && a[i] % 2 == 0)
                return 0;
        }
        return 1;
    }
}
