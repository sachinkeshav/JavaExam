package com.knight.exam.java.newCharArray;

import java.util.Arrays;

/**
 * Created by skushwaha on 12/30/14.
 */
public class NewCharArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 0, 4)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 0, 3)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 0, 2)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 0, 1)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 1, 3)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 1, 2)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 1, 1)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 2, 2)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 2, 1)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 3, 1)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, 1, 0)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, -1, 2)));
        System.out.println(Arrays.toString(newCharArray(new char[]{'a', 'b', 'c'}, -1, -2)));
        System.out.println(Arrays.toString(newCharArray(new char[]{}, 0, 1)));
    }

    static char[] newCharArray(char[] a, int start, int length) {
        if (length < 0 || start < 0 || start + length - 1 >= a.length) {
            return null;
        }

        char[] resultArray = new char[length];
        for (int i = start, j = 0; j < length; i++, j++) {
            resultArray[j] = a[i];
        }

        return resultArray;
    }
}
