package com.knight.exam.java.centeredFifteen;

/**
 * Created by skushwaha on 12/29/14.
 */
public class CenteredFifteen {

    static int isCentered15(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum == 15) {
                    if (i == a.length - j - 1)
                        return 1;
                }
            }
        }

        return 0;
    }
}
