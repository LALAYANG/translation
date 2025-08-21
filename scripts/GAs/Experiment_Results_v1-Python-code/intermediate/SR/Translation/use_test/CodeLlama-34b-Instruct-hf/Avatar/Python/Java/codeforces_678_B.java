```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        } else {
            ans = "nly";
        }
        int dividend = 953;
        int divisor = 952;
        while (dividend % divisor == 1) {
            int increment = 1;
            dividend = sumVars(dividend, increment);
            String d = "f";
            while (true) {
                if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                    if (d == "m") {
                        d = "w";
                        n += 1;
                    } else if (d == "t") {
                        d = "th";
                        n += 1;
                    } else if (d == "w") {
                        d = "f";
                        n += 1;
                    } else if (d == "th") {
                        d = "sa";
                        n += 1;
                    } else if (d == "f") {
                        d = "s";
                        n += 1;
                    } else if (d == "sa") {
                        d = "m";
                        n += 1;
                    } else if (d == "s") {
                        d = "t";
                        n += 1;
                    }
                } else if (d == "m") {
                    d = "t";
                    n += 1;
                } else if (d == "t") {
                    d = "w";
                    n += 1;
                } else if (d == "w") {
                    d = "th";
                    n += 1;
                } else if (d == "th") {
                    d = "f";
                    n += 1;
                } else if (d == "f") {
                    d = "sa";
                    n += 1;
                } else if (d == "sa") {
                    d = "s";
                    n += 1;
                } else if (d == "s") {
                    d = "m";
                    n += 1;
                }
                if (d == "f" && ans == "ly" && leapYear(n) == "y") {
                    break;
                } else if (d == "f" && ans == "nly" && leapYear(n) == "n") {
                    break;
                }
            }
        }
        System.out.println(n);
    }

    public static int sumVars(int dividend, int increment) {
        return dividend + increment;
    }

    public static String leapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}
```
Note: The `leapYear` method is not a part of the Java standard library, so it has been implemented in the code above.
