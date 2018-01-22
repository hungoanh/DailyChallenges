package main.java.HKR;

/**
 * Created by hungle on 1/21/18.
 */
public class TimeConversion {
    private static String timeConversion(String s) {
        // Complete this function
        String[] mytime = s.split(":");
        int hour = Integer.parseInt(mytime[0]);
        String second = mytime[2].substring(0, 2);
        String period = mytime[2].substring(2, 4);
        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }
        return String.format("%1$02d", hour) + ':' + mytime[1] + ':' + second;
    }

    private static String encode(String s, int n) {
        char[] charArr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : charArr) {
            char t;
            if (c != '-') {
                t = (char)(c + n);
            } else {
                t = c;
            }
            if (c >= 'a' && c <= 'z') {
                if (t > 'z') {
                    t -= 'z' - 'a' - 1;
                }
            }
            if (c >= 'A' && c <= 'Z') {
                if (t > 'Z') {
                    t -= 'Z' - 'A' - 1;
                }
            }
            result.append(t);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:59:39AM"));
        System.out.println(encode("middle-Outz", 2));
    }
}
