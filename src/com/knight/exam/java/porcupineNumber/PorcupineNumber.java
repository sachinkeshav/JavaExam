package com.knight.exam.java.porcupineNumber;

/**
 * Created by sachinkeshav on 12/28/14.
 */
public class PorcupineNumber {

    static int findPorcupineNumber(int n) {
        for (int i = n + 1; n < Integer.MAX_VALUE; i++) {
            if (isPrime(i)) {
                int rem1 = i % 10;
                if (rem1 == 9) {
                    for (int j = i + 1; j < Integer.MAX_VALUE; j++) {
                        if (isPrime(j)) {
                            int rem2 = j % 10;
                            if (rem2 == 9)
                                return i;
                            else {
                                i = j;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return 0;
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
