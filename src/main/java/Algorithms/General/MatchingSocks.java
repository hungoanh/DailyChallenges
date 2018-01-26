package main.java.Algorithms.General;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

/**
 * Created by hle on 1/23/18.
 */
public class MatchingSocks {
    private static int matchSocks(int n, int[] ar) {
        // Setting up hashtable to ingest data
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for (int index = 0; index < n; index++) {
            if (hashtable.get(ar[index]) == null) {
                hashtable.put(ar[index], 1);
            } else {
                hashtable.put(ar[index], hashtable.get(ar[index]) + 1);
            }
        }
        // Iterating through the hashtable to find matched pairs.
        int matchedPairs = 0;
        Set<Integer> keys = hashtable.keySet();
        for (Integer key : keys) {
            int hashValue = hashtable.get(key);
            matchedPairs += hashValue / 2;
        }
        return matchedPairs;
    }

    public static void main(String[] args) {
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20, 20, 20};
        System.out.println(matchSocks(socks.length, socks));
    }
}
