package com.knight.exam.java.anagrams;

/**
 * Created by sachinkeshav on 1/3/15.
 */
public class Anagrams {

    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(areAnagrams(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(areAnagrams(new char[]{}, new char[]{}));
        System.out.println(areAnagrams(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }

    static int areAnagrams(char[] a1, char[] a2) {
        if (a1.length != a2.length)
            return 0;

        char[] a1Copy = new char[a1.length];
        char[] a2Copy = new char[a2.length];

        for (int i = 0; i < a1.length; i++) {
            a1Copy[i] = a1[i];
            a2Copy[i] = a2[i];
        }

        for (int i = 0; i < a1Copy.length; i++) {
            for (int j = 0; j < a2Copy.length; j++) {
                if (a1Copy[i] == a2Copy[j]) {
                    a1Copy[i] = ' ';
                    a2Copy[j] = ' ';
                }
            }
        }

        for (int i = 0; i < a1Copy.length; i++) {
            if (a1Copy[i] != ' ' || a2Copy[i] != ' ')
                return 0;
        }

        return 1;
    }
}
