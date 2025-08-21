import java.util.Arrays;

public class codeforces_678_B {

    public static void main(String[] args) {
        int n = 12345;
        int dividend = 953;
        int divisor = 952;
        String d = "f";
        String ans;

        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        } else {
            ans = "nly";
        }

        while (dividend % divisor == 1) {
            int increment = 1;
            dividend = sumVars(dividend, increment);

            while (true) {
                if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                    if (d.equals("m")) {
                        d = "w";
                        n += 1;
                    } else if (d.equals("t")) {
                        d = "th";
                        n += 1;
                    } else if (d.equals("w")) {
                        d = "f";
                        n += 1;
                    } else if (d.equals("th")) {
                        d = "sa";
                        n += 1;
                    } else if (d.equals("f")) {
                        d = "s";
                        n += 1;
                    } else if (d.equals("sa")) {
                        d = "m";
                        n += 1;
                    } else if (d.equals("s")) {
                        d = "t";
                        n += 1;
                    }
                } else if (d.equals("m")) {
                    d = "t";
                    n += 1;
                } else if (d.equals("t")) {
                    d = "w";
                    n += 1;
                } else if (d.equals("w")) {
                    d = "th";
                    n += 1;
                } else if (d.equals("th")) {
                    d = "f";
                    n += 1;
                } else if (d.equals("f")) {
                    d = "sa";
                    n += 1;
                } else if (d.equals("sa")) {
                    d = "s";
                    n += 1;
                } else if (d.equals("s")) {
                    d = "m";
                    n += 1;
                }

                if (d.equals("f") && ans.equals("ly") && leapYear(n)) {
                    break;
                } else if (d.equals("f") && ans.equals("nly") && !leapYear(n)) {
                    break;
                }
            }
        }

        System.out.println(n);
    }

    public static int sumVars(int dividend, int increment) {
        return dividend + increment;
    }

    public static boolean leapYear(int n) {
        return n % 400 == 0 || (n % 4 == 0 && n % 100 != 0);
    }
}