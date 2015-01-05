package com.knight.exam.java.countOnes;

/**
 * Created by skushwaha on 1/5/15.
 */
public class CountOnes {

    public static void main(String[] args) {
        System.out.println(countOnes(9));
        System.out.println(countOnes(5));
        System.out.println(countOnes(15));
    }

    static int countOnes(int n) {
        int count=0;

        while (n > 0) {
            int digit = n%2;
            n /=2;
            if (digit == 1)
                count++;
        }
        return count;
    }
}
