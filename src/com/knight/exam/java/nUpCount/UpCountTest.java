package com.knight.exam.java.nUpCount;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class UpCountTest {
    public static void main(String[] args) {
//        int[] a = {2, 3, 1, -6, 8, -3, -1, 2};
        int[] a = {6, 3, 1};
        int upCount = UpCount.nUpCount(a, 6);
        System.out.printf("The n up-count of a is %d", upCount);
    }
}
