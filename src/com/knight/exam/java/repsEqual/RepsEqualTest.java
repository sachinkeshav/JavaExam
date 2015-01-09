package com.knight.exam.java.repsEqual;

/**
 * Created by skushwaha on 12/29/14.
 */
public class RepsEqualTest {

    public static void main(String[] args) {
        System.out.println(RepsEqual.repsEqual(new int[]{3, 2, 0, 5, 3}, 32053));
        System.out.println(RepsEqual.repsEqual(new int[]{3, 2, 0, 5}, 32053));
        System.out.println(RepsEqual.repsEqual(new int[]{3, 2, 0, 5, 3, 4}, 32053));
        System.out.println(RepsEqual.repsEqual(new int[]{4, 3, 2, 0, 5, 3}, 32053));
        System.out.println(RepsEqual.repsEqual(new int[]{2, 3, 0, 5, 3}, 32053));
        System.out.println(RepsEqual.repsEqual(new int[]{9, 3, 1, 1, 2}, 32053));
        System.out.println(RepsEqual.repsEqual(new int[]{0, 3, 2, 0, 5, 3}, 32053));
    }
}
