package com.knight.exam.java.inertialArray;

/**
 * Created by sachinkeshav on 12/27/14.
 */
public class InertialArrayTest {
    public static void main(String[] args) {
        System.out.println(InertialArray.isInertial(new int[]{1}));
        System.out.println(InertialArray.isInertial(new int[]{2}));
        System.out.println(InertialArray.isInertial(new int[]{1, 2, 3, 4}));
        System.out.println(InertialArray.isInertial(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(InertialArray.isInertial(new int[]{2, 12, 4, 6, 8, 11}));
        System.out.println(InertialArray.isInertial(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(InertialArray.isInertial(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(InertialArray.isInertial(new int[]{2, 3, 5, 7}));
        System.out.println(InertialArray.isInertial(new int[]{2, 4, 6, 8, 10}));
    }
}
