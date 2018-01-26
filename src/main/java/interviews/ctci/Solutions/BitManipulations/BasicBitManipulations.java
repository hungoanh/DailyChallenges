package main.java.interviews.ctci.Solutions.BitManipulations;

/**
 * Created by hle on 1/19/18.
 */
public class BasicBitManipulations {
    public int leftShift(int number, int rep) {
        return (rep  < 0 ? 0 : number << rep);
    }

    public static void main(String[] args) {
        int binary = 0b00000000000000000000000000001111;
        System.out.println(binary);
        System.out.println(~binary);
        System.out.println(~0);
    }
}
