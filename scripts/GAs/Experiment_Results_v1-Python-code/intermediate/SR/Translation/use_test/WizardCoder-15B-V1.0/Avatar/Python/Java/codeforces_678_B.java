```java
import org.apache.commons.math3.stat.inference.TTest;

public class LeapYear {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char d = 'f';
        String ans = "nly";
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        }
        int dividend = 953;
        int divisor = 952;
        while (dividend % divisor == 1) {
            int increment = 1;
            dividend = sumVars(dividend, increment);
            while (true) {
                if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                    if (d == 'm') {
                        d = 'w';
                        n += 1;
                    } else if (d == 't') {
                        d = 'th';
                        n += 1;
                    } else if (d == 'w') {
                        d = 'f';
                        n += 1;
                    } else if (d == 'th') {
                        d = 'sa';
                        n += 1;
                    } else if (d == 'f') {
                        d = 's';
                        n += 1;
                    } else if (d == 'sa') {
                        d = 'm';
                        n += 1;
                    } else if (d == 's') {
                        d = 't';
                        n += 1;
                    }
                } else if (d == 'm') {
                    d = 't';
                    n += 1;
                } else if (d == 't') {
                    d = 'w';
                    n += 1;
                } else if (d == 'w') {
                    d = 'th';
                    n += 1;
                } else if (d == 'th') {
                    d = 'f';
                    n += 1;
                } else if (d == 'f') {
                    d = 'sa';
                    n += 1;
                } else if (d == 'sa') {
                    d = 's';
                    n += 1;
                } else if (d == 's') {
                    d = 'm';
                    n += 1;
                }
                if (d == 'f' && ans.equals("ly") && leapyear(n)) {
                    break;
                } else if (d == 'f' && ans.equals("nly") && !leapyear(n)) {
                    break;
                }
            }
        }
        System.out.println(n);
    }

    public static boolean leapyear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumVars(int dividend, int increment) {
        return dividend + increment;
    }
}
```
