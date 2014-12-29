package com.knight.exam.java.completeArray;

/**
 * Created by skushwaha on 12/29/14.
 */
public class CompleteArray {

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 8, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 3, 6}));
        System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));
    }

    static int isComplete(int[] a) {
        int max = 0;

        for (int anA : a) {
            if (anA < 0) {
                return 0;
            }

            if (anA % 2 == 0 && anA > max) {
                max = anA;
            }
        }

        for (int i = 1; i < max; i++) {
            if (i % 2 == 0) {
                boolean flag = false;

                for (int anA : a) {
                    if (anA == i) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    return 0;
            }
        }

        return 1;
    }
}
