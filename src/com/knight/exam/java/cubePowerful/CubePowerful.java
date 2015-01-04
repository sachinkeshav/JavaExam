package com.knight.exam.java.cubePowerful;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class CubePowerful {

    public static void main(String[] args) {
        System.out.println(isCubePowerful(153));
        System.out.println(isCubePowerful(370));
        System.out.println(isCubePowerful(371));
        System.out.println(isCubePowerful(407));
        System.out.println(isCubePowerful(87));
        System.out.println(isCubePowerful(0));
        System.out.println(isCubePowerful(-81));
    }

    static int isCubePowerful(int n) {
        if (n<=0)
            return 0;

        int nCopy = n;
        int sum = 0;
        while (nCopy > 0) {
            int digit = nCopy % 10;
            nCopy /= 10;
            int product = 1;

            for (int i = 1; i <= 3; i++) {
                product *= digit;
            }
            sum += product;
        }

        if (sum == n) return 1;
        return 0;
    }
}
