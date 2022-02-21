package com.company.challange3;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Question 3
 * Two words can be considered anagrams of themselves if the letters of one word can be relocated to form the other word.
 * Given any string, develop an algorithm that finds the number of pairs of substrings that are anagrams.
 */

public class AnagramsValidation {
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        else {
            char[] str1Array = str1.toCharArray(); // declaration of arrays
            char[] str2Array = str2.toCharArray(); // I used two arrays

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            return Arrays.equals(str1Array, str2Array);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nType a first word: "); // We request the entry of the data to the users
        String str1 = sc.nextLine();

        System.out.println("Type a second word: ");
        String str2 = sc.nextLine();
        // With the two user inputs, then the variables receive the arrays from the previous function
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // We make a condition in our if, case is anagrams or not
        if(isAnagram(str1, str2))
            System.out.println(" Words: " + str1 +" e " + str2 + " is Anagrams");
        else
            System.out.println(" Words: " + str1 +" e " + str2 + " not is Anagrams");
    }
}
