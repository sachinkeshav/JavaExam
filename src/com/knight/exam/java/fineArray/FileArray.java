package com.knight.exam.java.fineArray;

/**
 * Created by skushwaha on 1/5/15.
 */
public class FileArray {

    public static void main(String[] args) {

    }

    static int isFineArray(int[] a) {
        boolean prime1Flag = false;
        boolean prime2Flag = false;

        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                prime1Flag = true;
                p1 = a[i] - 2;
                p2 = a[i] + 2;
            }

            if (prime1Flag)
        }
    }

    static int isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return 0;
        }
        return n > 0 ? 1 : 0;
    }
}
