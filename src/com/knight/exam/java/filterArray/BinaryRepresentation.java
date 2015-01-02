package com.knight.exam.java.filterArray;

import java.util.Arrays;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class BinaryRepresentation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterArray(new int[]{8, 4, 9, 0, 3, 1, 2}, 88)));
        System.out.println(Arrays.toString(filterArray(new int[]{18}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 0)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 1)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 2)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9}, 4)));
        System.out.println(Arrays.toString(filterArray(new int[]{9, -9, 5}, 3)));
        System.out.println(Arrays.toString(filterArray(new int[]{0, 9, 12, 18, -6}, 11)));
    }

    static int[] filterArray(int[] a, int n) {
        int size = 0;
        for (int number = n; number > 0; number /= 2) {
            if (number % 2 == 1)
                size++;
        }
        int[] result = new int[size];
        int i = 0;
        int index = 0;
        for (int number = n; number > 0; number /= 2) {
            if (number % 2 == 1){
                if (index >= a.length)
                    return null;
                result[i] = a[index];
                i++;
            }
            index++;
        }
        return result;
    }
}
