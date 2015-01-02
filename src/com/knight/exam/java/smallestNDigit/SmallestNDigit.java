package com.knight.exam.java.smallestNDigit;

/**
 * Created by sachinkeshav on 1/2/15.
 */
public class SmallestNDigit {

    public static void main(String[] args) {
        System.out.println(smallest(1));
        System.out.println(smallest(2));
        System.out.println(smallest(3));
        System.out.println(smallest(4));
        System.out.println(smallest(5));
        System.out.println(smallest(6));
        System.out.println(smallest(7));
    }

    static int smallest(int n) {
        int num = 1;
        while (true) {
            boolean flag = false;
            for (int i = 1; i <= n; i++) {
                flag = false;
                int product = num * i;
                while (product > 0) {
                    int digit = product % 10;
                    product /= 10;
                    if (digit == 2) {
                        flag = true;
                        break;
                    }
                }
                if (!flag)
                    break;
            }
            if (flag) return num;
            num++;
        }
    }
}
