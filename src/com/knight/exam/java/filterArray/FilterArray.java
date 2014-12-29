package com.knight.exam.java.filterArray;

/**
 * Created by skushwaha on 12/29/14.
 */
public class FilterArray {

    static int isFilter(int[] a) {
        boolean cond1 = true;
        boolean cond2 = true;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 9) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == 11) {
                        cond1 = true;
                        break;
                    } else cond1 = false;
                }
            }

            if (a[i] == 7) {
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == 13) {
                        cond2 = false;
                        break;
                    } else cond2 = true;
                }
            }

        }

        if (cond1 && cond2) return 1;
        else return 0;
    }
}
