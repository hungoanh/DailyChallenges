package main.java.Algorithms.ArraysAndStrings;

/**
 * Created by hle on 1/11/18.
 */
public class StringCompression {
    public static void main (String [] args) {
        String testString = "aaabbc1221888";
        System.out.println(decompress(compress(testString).toString()));
    }

    private static StringBuilder compress(String tString) {
        StringBuilder sb = new StringBuilder();
        char curChar = '\0';
        int charCnt = 0;
        // Adding a null terminating character
        tString += '\0';
        for (char c : tString.toCharArray()) {
            if (c == curChar) {
                charCnt++;
            } else {
                // new char
                if (curChar != '\0') {
                    sb.append(curChar);
                    sb.append(charCnt);
                }
                curChar = c;
                charCnt = 1;
            }
        }
        return sb;
    }

    private static StringBuilder decompress(String tString) {
        StringBuilder sb = new StringBuilder();
        char[] chars = tString.toCharArray();
        for (int i = 0; i < chars.length; i += 2) {
            for (int j = 0; j < Character.getNumericValue(chars[i + 1]); j++) {
                sb.append(chars[i]);
            }
        }
        return sb;
    }
}
