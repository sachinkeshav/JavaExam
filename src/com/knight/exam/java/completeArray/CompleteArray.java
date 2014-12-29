package com.knight.exam.java.completeArray;

/**
 * Created by skushwaha on 12/29/14.
 */
public class CompleteArray {

    public static void main(String[] args) {
        System.out.println(isComplete(new int[]{2, 3, 2, 4, 11, 6, 10, 9, 8}));
        System.out.println(isComplete(new int[]{2, 3, 3, 6}));
        System.out.println(isComplete(new int[]{2, -3, 4, 3, 6}));
    }

    static int isComplete(int[] a) {
        int max = 0;
        int count = 0;

        for (int anA : a) {
            if (anA < 0) {
                return 0;
            }

            if (anA % 2 == 0) {
                count++;
                if (anA > max)
                    max = anA;
            }
        }

        int[] tempArray = new int[count - 1];
        int j = 0;
        for (int i = 1; i < max; i++) {
            if (i % 2 == 0) {
                tempArray[j] = i;
                j++;
            }
        }

        for (int temp : tempArray) {
            boolean flag = false;

            for (int anA : a) {
                if (anA == temp) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

//        if (count - 1 == max / 2) return 1;
//        else return 0;
        return 1;
    }
}
