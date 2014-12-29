package com.knight.exam.java.primeCount;

import java.util.Scanner;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class PrimeCountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the starting integer: ");
        int start = input.nextInt();

        System.out.printf("Enter the ending integer: ");
        int end = input.nextInt();

        int primeCount = PrimeCount.primeCount(start, end);

        System.out.printf("The number of prime numbers between %d and %d is %d", start, end, primeCount);
    }
}
