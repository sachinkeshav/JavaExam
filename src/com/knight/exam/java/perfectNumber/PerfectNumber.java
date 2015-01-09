package com.knight.exam.java.perfectNumber;

/**
 * Created by skushwaha on 12/29/14.
 */
public class PerfectNumber {

    static int henry1(int i, int j) {
        int count = 0;
        int result = 0;
        int largest = i > j ? i : j;

        for (int k = 1; k < Integer.MAX_VALUE; k++) {
            int sum = 0;
            int factorNumber = 1;

            while (factorNumber < k) {
                if (k % factorNumber == 0) {
                    sum += factorNumber;
                }
                factorNumber++;
            }
            if (k == sum) {
                count++;
                if (count == i) {
                    result += sum;
                }

                if (count == j) {
                    result += sum;
                }
            }
            if (count == largest)
                break;
        }

        return result;
    }

    static int henry(int i, int j) {
        int count = 0;
        int result = 0;
        int largest = i > j ? i : j;
        int number = 1;

        while (true) {
            int sum = 0;
            int factorNumber = 1;

            while (factorNumber < number) {
                if (number % factorNumber == 0) {
                    sum += factorNumber;
                }
                factorNumber++;
            }
            if (number == sum) {
                count++;
                if (count == i) {
                    result += sum;
                }

                if (count == j) {
                    result += sum;
                }
            }
            if (count == largest)
                return result;

            number++;
        }
    }
}
