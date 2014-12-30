package com.knight.exam.java.newCharArray;

/**
 * Created by skushwaha on 12/30/14.
 */
public class NewCharArray {

    public static void main(String[] args) {
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 0, 4));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 0, 3));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 0, 2));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 0, 1));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 1, 3));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 1, 2));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 1, 1));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 2, 2));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 2, 1));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 3, 1));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, 1, 0));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, -1, 2));
        System.out.println(newCharArray(new char[]{'a', 'b', 'c'}, -1, -2));
        System.out.println(newCharArray(new char[]{}, 0, 1));
    }

    static char[] newCharArray(char[] a, int start, int len) {
        if (len > a.length - start) return null;

        char[] resultArray = new char[len];

        int j = 0;
        for (int i = start; i <= len; i++) {
            resultArray[j] = a[i];
            j++;
        }

        return resultArray;
    }
}
