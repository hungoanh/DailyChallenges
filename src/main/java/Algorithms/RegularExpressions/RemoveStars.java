package main.java.Algorithms.RegularExpressions;

/**
 * Created by hle on 1/11/18.
 */
public class RemoveStars {
    public static void main(String[] args) {
        String sample = "abcd***efgh***AFB";
        System.out.print(removeStars(sample));
    }

    public static String removeStars(String str) {
        return str.replaceAll("\\w?\\*+\\w?", "");
    }
}
