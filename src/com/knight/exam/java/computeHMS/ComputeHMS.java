package com.knight.exam.java.computeHMS;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class ComputeHMS {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(computeHMS(3735)));
        System.out.println(Arrays.toString(computeHMS(380)));
        System.out.println(Arrays.toString(computeHMS(3650)));
        System.out.println(Arrays.toString(computeHMS(55)));
        System.out.println(Arrays.toString(computeHMS(0)));
    }

    static int[] computeHMS(int seconds) {
        int[] hms = new int[3];

        int hour = 0;
        int minute = 0;
        int second = 0;

        hour = seconds / 3600;
        seconds = seconds % 3600;
        hms[0] = hour;

        minute = seconds / 60;
        seconds = seconds % 60;
        hms[1] = minute;

        second = seconds;
        hms[2] = second;

        return hms;
    }
}
