package main.java.Algorithms.ArraysAndStrings;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hle on 1/22/18.
 */
public class ArrayShift {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        int [] result = leftShift(myArr, 2);
    }

    private static int[] leftShift(int[] arr, int k) {
        int[] left = new int[k];
        int[] right = new int[arr.length - k];

        System.arraycopy(arr, 0, left, 0, k);
        System.arraycopy(arr, k, right, 0, arr.length - k);

        int[] result = new int[arr.length];
        System.arraycopy(right, 0, result, 0, right.length);
        System.arraycopy(left, 0, result, right.length, left.length);

        return result;
    }
}
