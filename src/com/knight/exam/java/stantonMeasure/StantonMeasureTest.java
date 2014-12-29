package com.knight.exam.java.stantonMeasure;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class StantonMeasureTest {

    public static void main(String[] args) {
        System.out.println(StantonMeasure.stantonMeasure(new int[]{1}));
        System.out.println(StantonMeasure.stantonMeasure(new int[]{0}));
        System.out.println(StantonMeasure.stantonMeasure(new int[]{3, 1, 1, 4}));
        System.out.println(StantonMeasure.stantonMeasure(new int[]{1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(StantonMeasure.stantonMeasure(new int[]{}));
    }
}
