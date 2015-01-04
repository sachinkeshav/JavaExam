package com.knight.exam.java.mileageCounter;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class MileageCounter {

    public static void main(String[] args) {
        int[] a = new int[]{8, 9, 9, 5, 0};
        updateMileageCounter(a, 1);

        System.out.println(Arrays.toString(a));

        int[] b = new int[]{8, 9, 9, 5, 0};
        updateMileageCounter(b, 2);

        System.out.println(Arrays.toString(b));

        int[] c = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(c, 1);

        System.out.println(Arrays.toString(c));

        int[] d = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        updateMileageCounter(d, 13);

        System.out.println(Arrays.toString(d));
    }

    static void updateMileageCounter(int[] a, int miles) {
        for (int i = 0; i < a.length && miles > 0; i++) {
            miles = a[i] + miles;
            if (miles > 9) {
                int tempMiles = miles % 10;
                miles /= 10;
                a[i] = tempMiles;
            } else {
                a[i] = miles;
                miles = 0;
            }
        }
    }
}
