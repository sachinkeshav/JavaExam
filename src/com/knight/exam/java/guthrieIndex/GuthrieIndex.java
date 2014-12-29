package com.knight.exam.java.guthrieIndex;

/**
 * Created by sachinkeshav on 12/29/14.
 */
public class GuthrieIndex {

    static int guthrieIndex(int n) {
        int guthrieIndex = 0;

        while (n > 1) {
            if (n % 2 == 0)
                n = n / 2;
            else n = ((n * 3) + 1);
            guthrieIndex++;
        }

        return guthrieIndex;
    }
}
