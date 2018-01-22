package main.java.Algorithms.ArraysAndStrings;

import java.util.Arrays;

/**
 * Created by hungle on 1/20/18.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(sortString("Paladama"));
    }

    private static String sortString(String s) {
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
