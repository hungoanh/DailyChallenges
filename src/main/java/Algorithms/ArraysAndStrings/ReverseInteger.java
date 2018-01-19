package main.java.Algorithms.ArraysAndStrings;

/**
 * Created by hle on 1/18/18.
 */
public class ReverseInteger {
    public static void main(String [] args) {
        int num = 153423646;
        System.out.println(reverse(num));
    }
    private static int reverse(int x) {
        int sign = (x < 0) ? -1 : 1;
        x *= sign;
        long ret = 0;
        while (x > 0) {
            int remainder = x % 10;
            x = x / 10;
            long tmp = (ret * 10 + remainder);
            if (tmp > Integer.MAX_VALUE) {
                return 0;
            }
            ret = tmp;
        }
        return (int)(ret * sign);
    }
}
