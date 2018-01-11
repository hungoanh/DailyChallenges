package main.java.interviews.ctci.Solutions.ArraysAndStrings;

/**
 * Created by hle on 1/11/18.
 */
public class IsUnique {
    public static void main(String [] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            if (isUniqueString(word)) {
                System.out.println(word + " is unique");
            } else {
                System.out.println(word + " is NOT unique");
            }
        }
        for (String word : words) {
            if (isUniqueString2(word)) {
                System.out.println(word + " is unique");
            } else {
                System.out.println(word + " is NOT unique");
            }
        }
    }

    private static boolean isUniqueString(String word) {
        int checker = 0;
        for (int i = 0; i < word.length(); i++) {
            int val = word.charAt(i) - 'a';
            // val is the number of left-shifts
            if ((checker & (1 << val )) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    private static boolean isUniqueString2(String word) {
        boolean[] hashMap = new boolean[128];
        for (char c : word.toCharArray()) {
            int index = c;
            if (hashMap[index]) { return false; }
            hashMap[index] = true;
        }
        return true;
    }
}
