package com.knight.exam.java.guthrieSequence;

/**
 * Created by sachinkeshav on 12/28/14.
 */
public class GuthrieSequenceTest {
    public static void main(String[] args) {
        System.out.println(GuthrieSequence.isGuthrieSequence(new int[]{8, 4, 2, 1}));
        System.out.println(GuthrieSequence.isGuthrieSequence(new int[]{8, 17, 4, 1}));
        System.out.println(GuthrieSequence.isGuthrieSequence(new int[]{8, 4, 1}));
        System.out.println(GuthrieSequence.isGuthrieSequence(new int[]{8, 4, 2}));
    }
}
