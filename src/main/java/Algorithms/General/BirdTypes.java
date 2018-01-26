package main.java.Algorithms.General;

import java.util.Arrays;

/**
 * Created by hle on 1/23/18.
 */
public class BirdTypes {

    public static void main(String [] args) {
        int [] birds = {1, 4, 4, 4, 5, 3};
        migratoryBirds(birds.length, birds);
    }
    private static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        // bType is serving as hash table
        int[] bType = new int[5];
        for (int index = 0; index < n; index++) {
            bType[ar[index] - 1] += 1;
        }
        int[] copyOfBType = new int[5];
        for (int i=0; i < 5; i++) {
            copyOfBType[i] = bType[i];
        }
        Arrays.sort(copyOfBType);
        int max = copyOfBType[copyOfBType.length - 1];
        int popular = 0;
        for (int index = 0; index < bType.length; index++) {
            if (bType[index] == max) {
                popular = index + 1;
                break;
            }
        }
        return popular;
    }
}
