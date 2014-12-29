package com.knight.exam.java.filterArray;

/**
 * Created by skushwaha on 12/29/14.
 */
public class FilterArrayTest {

    public static void main(String[] args) {
        System.out.println(FilterArray.isFilter(new int[]{1, 2, 3, 9, 6, 11}));
        System.out.println(FilterArray.isFilter(new int[]{3, 4, 6, 7, 14, 16}));
        System.out.println(FilterArray.isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
        System.out.println(FilterArray.isFilter(new int[]{3, 6, 5, 5, 13, 6, 13}));
        System.out.println(FilterArray.isFilter(new int[]{9, 6, 18}));
        System.out.println(FilterArray.isFilter(new int[]{4, 7, 13}));
    }
}
