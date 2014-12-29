package com.knight.exam.java.stantonMeasure;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class StantonMeasure {

    static int stantonMeasure(int[] a) {

        int oneCount=0;
        int stantonMeasure = 0;

        for (int anA : a) {
            if (anA == 1) {
                oneCount++;
            }
        }

        for (int anA : a) {
            if (anA == oneCount)
                stantonMeasure++;
        }

        return stantonMeasure;
    }
}
