package com.knight.exam.java.nUnique;

/**
 * Created by skushwaha on 12/30/14.
 */
public class NUnique {

    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 6));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 10));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 11));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 8));
        System.out.println(isNUnique(new int[]{7, 3, 3, 2, 4}, 4));
        System.out.println(isNUnique(new int[]{1}, 4));
    }

    static int isNUnique(int[] a, int n) {
        if (a.length >= 2) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] + a[j] == n)
                        count++;
                    if (count > 1) return 0;
                }
            }

            if (count == 1) return 1;
            else return 0;
        }

        return 0;
    }
}
