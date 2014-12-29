package com.knight.exam.java.guthrieSequence;

/**
 * Created by sachinkeshav on 12/28/14.
 */
public class GuthrieSequence {

    static int isGuthrieSequence(int[] a) {
        int result = 0;
        int num = a[0];

        int[] b = new int[a.length * 2];
        b[0] = num;
        int counter = 1;

        if (num > 0) {
            do {
                if (num % 2 == 0) {
                    num = num / 2;
                    b[counter] = num;
                } else {
                    num = (num * 3) + 1;
                    b[counter] = num;
                }

                counter++;
            } while (num != 1);
        }
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                result = 1;
            } else return 0;
        }

        if (result == 1 && a[i - 1] == 1)
            return 1;
        else return 0;
    }
}
