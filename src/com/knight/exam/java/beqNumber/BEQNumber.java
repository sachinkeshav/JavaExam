package com.knight.exam.java.beqNumber;

/**
 * Created by sachinkeshav on 1/4/15.
 */
public class BEQNumber {

    public static void main(String[] args) {
        System.out.println(findSmallestBEQNumber());
    }

    static int findSmallestBEQNumber() {
        int beqNumber;
        int number = 1;
        while (true) {
            beqNumber = number * number * number;
            int countOf6 = 0;

            while (beqNumber > 0) {
                int digit = beqNumber % 10;
                beqNumber /= 10;
                if (digit == 6)
                    countOf6++;
            }
            if (countOf6 == 4) {
                return number;
            }
            number++;
        }
    }
}
