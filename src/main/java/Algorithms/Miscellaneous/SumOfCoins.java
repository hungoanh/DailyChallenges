package main.java.Algorithms.Miscellaneous;

/**
 * Created by hungle on 1/21/18.
 */
public class SumOfCoins {
    public static void main(String [] args) {
        int total = 100;
        findCoinCombinations(total);
    }

    private static void findCoinCombinations(int total) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        do {
            do {
                do {
                    while (sumUp(i, j, k, l ) <  total) {
                        l++;
                    }
                    System.out.println(i + " " + j + " " + k + " " + l);
                    l = 0;
                    k++;
                    if (sumUp(i, j, k, l ) >  total) {
                        k = 0;
                        break;
                    }
                } while (true);
                j++;
                if (sumUp(i, j, k, l ) >  total) {
                  j = 0;
                  break;
                }
            } while (true);
            i++;
            if (sumUp(i, j, k, l ) >  total) {
                break;
            }
        } while (true);
    }

    private static int sumUp(int i, int j, int k, int l) {
        return i * 25 + j * 10 + k * 5 + l;
    }
}
