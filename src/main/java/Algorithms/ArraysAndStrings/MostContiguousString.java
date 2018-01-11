package main.java.Algorithms.ArraysAndStrings;

import java.util.Arrays;

/**
 * Created by hle on 1/11/18.
 */
public class MostContiguousString {
    public static void main(String[] args) {
        System.out.print(calculateOccurrences("fffffffffffffffffabaabbccgggggggghabc"));
    }

    private static int calculate(String str) {
        int maxCnt = 1;
        char lastChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            System.out.println(lastChar);
            System.out.println("cur " + str.charAt(i));
            if (str.charAt(i) == lastChar) {
                System.out.println("inc");
                maxCnt++;
            } else {
                maxCnt = 1;
            }
            lastChar = str.charAt(i);
        }
        return maxCnt + 1;
    }

    private static int calculateOccurrences(String str) {
        int[] charCounters = new int[26];
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            charCounters[index]++;
        }
        Arrays.sort(charCounters);
        return charCounters[charCounters.length - 1];
    }
}
