package com.knight.exam.java.computeDepth;

/**
 * Created by sachinkeshav on 12/30/14.
 */
public class ComputeDepth {

    public static void main(String[] args) {
        System.out.println(computeDepth(42));
        System.out.println(computeDepth(7));
        System.out.println(computeDepth(13));
        System.out.println(computeDepth(25));
    }

    static int computeDepth(int n) {

        boolean[] flags = new boolean[10];
        for (int i = 0; i < 10; i++) flags[i] = false;
        int index = 1;
        while (true) {
            int product = n * index;
            while (product > 0) {
                int rem = product % 10;
                product /= 10;

                if (!flags[rem]) {
                    flags[rem] = true;
                }
            }

            boolean finalFlag = true;
            for (boolean aFlag : flags) {
                if (!aFlag)
                    finalFlag = false;
            }

            if (finalFlag) break;
            index++;
        }

        return index;
    }
}
