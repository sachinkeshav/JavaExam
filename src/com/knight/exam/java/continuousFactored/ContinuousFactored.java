package com.knight.exam.java.continuousFactored;

/**
 * Created by sachinkeshav on 1/6/15.
 */
public class ContinuousFactored {

    public static void main(String[] args) {
        System.out.println(isContinuousFactored(6));
        System.out.println(isContinuousFactored(60));
        System.out.println(isContinuousFactored(120));
        System.out.println(isContinuousFactored(90));
        System.out.println(isContinuousFactored(121));
        System.out.println(isContinuousFactored(2));
        System.out.println(isContinuousFactored(13));
    }

    static int isContinuousFactored(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && n % (i + 1) == 0)
                return 1;
        }
        return 0;
    }
}
