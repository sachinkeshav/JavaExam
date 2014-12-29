package com.knight.exam.java.centeredFifteen;

/**
 * Created by skushwaha on 12/29/14.
 */
public class CenteredFifteenTest {

    public static void main(String[] args) {
        System.out.println(CenteredFifteen.isCentered15(new int[]{3, 2, 10, 4, 1, 6, 9}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{2, 10, 4, 1, 6, 9}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{3, 2, 10, 4, 1, 6}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{1, 1, 8, 3, 1, 1}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{9, 15, 6}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{1, 1, 2, 2, 1, 1}));
        System.out.println(CenteredFifteen.isCentered15(new int[]{1, 1, 15 - 1, -1}));
    }
}
