package main.java.Algorithms.ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hungle on 1/19/18.
 */
public class OddElements {
    /*
    public static void main(String [] args) {
        Integer[] myInts = {1, 2, 1, 2, 3, 3, 2};
        System.out.println(findOddElement(myInts));
    }
    */
    public Integer findOddElement(Integer [] arr) {
        Set<Integer> intSet = new HashSet<>(Arrays.asList(arr));
        for (Integer el : intSet) {
            int count = 0;
            for (Integer el2 : arr) {
                if (el2 == el) { count++; }
            }
            if (count % 2 == 1) {
                return el;
            }
        }
        return 0;
    }

}
