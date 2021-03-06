package com.company.challange1;

public class Ladder {
    // Question 1
    /**
     * Write an algorithm that shows on the screen a ladder of size n using the
     * * character and spaces. The base and height of the ladder must be equal to
     * the value of n. The last line should not contain any space.
     * */

    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            String asterisks = "*";
            String space = " ";
            System.out.println(space.repeat(spaces) + asterisks.repeat(i));
        }

    }
}
