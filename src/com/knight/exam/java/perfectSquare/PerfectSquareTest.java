package com.knight.exam.java.perfectSquare;

import java.util.Scanner;

/**
 * Created by sachinkeshav on 12/23/14.
 */
public class PerfectSquareTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a integer number: ");
        int num = input.nextInt();

        int nextPerfectSquare = PerfectSquare.nextPerfectSquare(num);

        System.out.printf("The next perfect square of %d is %d", num, nextPerfectSquare);
    }
}
