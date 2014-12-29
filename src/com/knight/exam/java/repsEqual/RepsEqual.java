package com.knight.exam.java.repsEqual;

/**
 * Created by skushwaha on 12/29/14.
 */
public class RepsEqual {

    static int repsEqual(int[] a, int n) {
        for (int i = a.length - 1; i >= 0; i--) {
            int rem = n % 10;
            n = n / 10;

            if (a[i] != rem)
                return 0;
        }

        if (n != 0) return 0;
        else
            return 1;
    }
}
