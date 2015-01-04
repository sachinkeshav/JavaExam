package com.knight.exam.java.vesuvian;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class Vesuvian {

    public static void main(String[] args) {
        System.out.println(isVesuvian(50));
        System.out.println(isVesuvian(65));
        System.out.println(isVesuvian(85));
    }

    static int isVesuvian(int n) {
        int count = 0;
        for (int i = 1; (i * i) < n; i++) {
            int sum1 = i * i;
            for (int j = 1; (j * j) < n; j++) {
                int sum2 = j * j;

                if (sum1 + sum2 == n) {
                    count++;
                    break;
                }
            }
            if (count >= 2) return 1;
        }
        return 0;
    }
}
