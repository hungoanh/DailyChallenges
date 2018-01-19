package main.java.Algorithms.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hle on 1/18/18.
 */
public class ValidParenthesis {
    public static void main(String [] args) {
        String sample = "[{]}()";
        System.out.println(isValidParenthesis(sample) ? "Yes": "No");
    }

    private static boolean isValidParenthesis(String s) {
        char [] charArray = s.toCharArray();
        List<Character> parenthesis = new ArrayList<>();

        for (int i=0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '(':
                case '[':
                case '{':
                    parenthesis.add(charArray[i]);
                    break;
                case ')':
                    if (i == 0 || parenthesis.size() == 0 || parenthesis.get(parenthesis.size() - 1) != '(') {
                        return false;
                    }
                    parenthesis.remove(parenthesis.size() - 1);
                    break;
                case '}':
                    if (i == 0 || parenthesis.size() == 0 || parenthesis.get(parenthesis.size() - 1) != '{') {
                        return false;
                    }
                    parenthesis.remove(parenthesis.size() - 1);
                    break;

                case ']':
                    if (i == 0 || parenthesis.size() == 0 || parenthesis.get(parenthesis.size() - 1) != '[') {
                        return false;
                    }
                    parenthesis.remove(parenthesis.size() - 1);
                    break;
                default:
            }
        }
        return (parenthesis.size() == 0);
    }

    private static boolean isValidParenthesis2(String s) {
        char [] charArray = s.toCharArray();
        List<Character> parenthesis = new ArrayList<>();

        

        for (int i=0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '(':
                case '[':
                case '{':
                    parenthesis.add(charArray[i]);
                    break;
                case ')':
                    if (i == 0 || parenthesis.size() == 0 || parenthesis.get(parenthesis.size() - 1) != '(') {
                        return false;
                    }
                    parenthesis.remove(parenthesis.size() - 1);
                    break;
                case '}':
                    if (i == 0 || parenthesis.size() == 0 || parenthesis.get(parenthesis.size() - 1) != '{') {
                        return false;
                    }
                    parenthesis.remove(parenthesis.size() - 1);
                    break;

                case ']':
                    if (i == 0 || parenthesis.size() == 0 || parenthesis.get(parenthesis.size() - 1) != '[') {
                        return false;
                    }
                    parenthesis.remove(parenthesis.size() - 1);
                    break;
                default:
            }
        }
        return (parenthesis.size() == 0);
    }
}
