package com.knight.exam.java.oddValent;

/**
 * Created by skushwaha on 1/5/15.
 */
public class OddValent {

    public static void main(String[] args) {
        System.out.println(isOddValent(new int[]{9, 3, 4, 9, 1}));
        System.out.println(isOddValent(new int[]{3, 3, 3, 3}));
        System.out.println(isOddValent(new int[]{8, 8, 8, 4, 4, 7, 2}));
        System.out.println(isOddValent(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isOddValent(new int[]{2, 2, 2, 4, 4}));
    }

    static int isOddValent(int[] a) {
        boolean occurrenceFlag = false;
        boolean oddFlag = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddFlag = true;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    occurrenceFlag = true;
                    break;
                }
            }
            if (oddFlag && occurrenceFlag)
                return 1;
        }
        return 0;
    }
}
