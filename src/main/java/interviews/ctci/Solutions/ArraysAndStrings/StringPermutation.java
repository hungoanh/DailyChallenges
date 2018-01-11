package main.java.interviews.ctci.Solutions.ArraysAndStrings;

import java.util.Arrays;

/**
 * Created by hle on 1/11/18.
 */
public class StringPermutation {
    public static void main(String [] args) {
        String [][] wordPairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};

        for (String[] wordPair : wordPairs ) {
            if (isPermutation(wordPair)) {
                System.out.println(wordPair[0] + "," + wordPair[1] + " are permutation");
            } else {
                System.out.println(wordPair[0] + "," + wordPair[1] + " are NOT permutation");
            }
        }
    }

    private static boolean isPermutation(String[] pair) {
        char[] second = pair[1].toCharArray();
        Arrays.sort(second);
        String s = Arrays.toString(second);
        char[] first = pair[0].toCharArray();
        Arrays.sort(first);
        String f = Arrays.toString(first);
        boolean eq = s.equals(f);
        return eq;
    }
}
