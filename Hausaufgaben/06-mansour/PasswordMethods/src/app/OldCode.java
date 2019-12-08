package app;

import java.util.*;

public class OldCode {

    /**
     * 1. method that receives n and returns n^2 2. method that receives n and a
     * string and prints the string n times 3. method that receives a string and a
     * character and returns how many times that character was in the string 4.
     * method that receives an array of numbers and returns the average of them.
     */

    public static int powerTwo(int n) {
        return n ^ 2;
    }

    public static void printNTimes(int n, String s) {
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }

    public static int charNum(String s, char c) {
        int number = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == c)
                number++;
        }
        return number;
    }

    public static void main(String[] args) {
        powerTwo(15);

    }
}