package com.company.challange1;

public class Ladder {

    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {
            int espaces = n - i;
            String asteriscs = "*";
            String espace = " ";
            System.out.println(espace.repeat(espaces) + asteriscs.repeat(i));
        }

    }
}
