package com.knight.exam.java.inertialArray;

/**
 * Created by sachinkeshav on 12/27/14.
 */
public class InertialArray {

    static int isInertialArray(int[] a) {
        boolean oddFlag = false;
        boolean maxEvenFlag = false;
        boolean oddGtEvenFlag = false;

        int max = Integer.MIN_VALUE;

        int largestEven = max;

        int smallestOdd = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];

            if (a[i] % 2 != 0) {
                oddFlag = true;
                if (a[i] < smallestOdd)
                    smallestOdd = a[i];
            } else if (largestEven < max)
                largestEven = a[i];

            if (max % 2 == 0)
                maxEvenFlag = true;
            else maxEvenFlag = false;

        }
        if (smallestOdd > largestEven)
            oddGtEvenFlag = true;

        System.out.println("smallestOdd = " + smallestOdd);
        System.out.println("largestEven = " + largestEven);;

        System.out.println("oddFlag = " + oddFlag);
        System.out.println("maxEvenFlag = " + maxEvenFlag);
        System.out.println("oddGtEvenFlag = " + oddGtEvenFlag);

        if (oddFlag && maxEvenFlag && oddGtEvenFlag)
            return 1;
        else
            return 0;
    }

    static int isInertial(int[] a) {
        int greatestEven1 = Integer.MIN_VALUE;
        int greatest = greatestEven1;
        int greatestEven2 = greatestEven1;
        int smallestOdd = Integer.MAX_VALUE;
        int totalOdd = 0;
        for (int number : a) {
            if (number > greatest) greatest = number;
            if (number % 2 == 0) {
                if (number > greatestEven1) {
                    greatestEven2 = greatestEven1;
                    greatestEven1 = number;
                } else if (number != greatestEven1 && number > greatestEven2) {
                    greatestEven2 = number;
                }
            } else {
                if (number < smallestOdd) smallestOdd = number;
                totalOdd++;
            }
        }
        if (greatest == greatestEven1 && smallestOdd > greatestEven2 && totalOdd > 0) return 1;
        else return 0;
    }
}
