package com.knight.exam.java.decodeArray;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class DecodeArray {

    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{2, -3, -2, 6, 9, 18}));
        System.out.println(decodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(decodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(decodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(decodeArray(new int[]{1, 1}));

        System.out.println("\n\n" + decodeArray2(new int[]{1}));
        System.out.println(decodeArray2(new int[]{0, 1}));
        System.out.println(decodeArray2(new int[]{-1, 0, 1}));
        System.out.println(decodeArray2(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray2(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
        System.out.println(decodeArray2(new int[]{0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1}));
        System.out.println(decodeArray2(new int[]{-1, 0, 0, 1, 1, 0, 1}));
    }

    static int decodeArray(int[] a) {
        int sum = 0;

        for (int i = a.length - 1; i > 0; i--) {
            int digit = (a[i] - a[i - 1]) > 0 ? (a[i] - a[i - 1]) : -(a[i] - a[i - 1]);

            for (int j = i; j < a.length - 1; j++) {
                digit *= 10;
            }
            sum += digit;
        }

//        for (int i = 1; i < a.length; i++) {
//            int digit = (a[i] - a[i - 1]) > 0 ? (a[i] - a[i - 1]) : -(a[i] - a[i - 1]);
//
//            for (int j = i; j < a.length - 1; j++) {
//                digit *= 10;
//            }
//            sum += digit;
//        }

        if (a[0] < 0) return -sum;
        return sum;
    }

    static int decodeArray2(int[] a) {
        int sum = 0;

        int position = 0;
        for (int i = a.length - 1; i > 0; i--) {
            int digit = 0;

            for (int j = i; j > 0; j--) {
                if (a[j - 1] != 0) {
                    i = j;
                    break;
                }
                digit++;
                i = j;
            }

            for (int j = 0; j < position; j++) {
                digit *= 10;
            }
            sum += digit;

            position++;
        }

        if (a[0] < 0) return -sum;
        return sum;
    }
}
