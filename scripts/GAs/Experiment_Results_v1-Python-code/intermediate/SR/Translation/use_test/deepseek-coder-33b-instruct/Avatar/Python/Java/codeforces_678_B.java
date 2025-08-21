```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String d = "f";
        String ans = (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) ? "ly" : "nly";
        int dividend = 953;
        int divisor = 952;
        while (dividend % divisor == 1) {
            int increment = 1;
            dividend = sumVars(dividend, increment);
            while (true) {
                if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                    d = nextDay(d);
                    n++;
                } else {
                    d = nextDay(d);
                    n++;
                }
                if (d.equals("f") && ans.equals("ly") && leapyear(n).equals("y")) {
                    break;
                } else if (d.equals("f") && ans.equals("nly") && leapyear(n).equals("n")) {
                    break;
                }
            }
        }
        System.out.println(n);
    }

    public static int sumVars(int dividend, int increment) {
        return dividend + increment;
    }

    public static String leapyear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }

    public static String nextDay(String d) {
        switch (d) {
            case "m":
                return "t";
            case "t":
                return "w";
            case "w":
                return "th";
            case "th":
                return "f";
            case "f":
                return "sa";
            case "sa":
                return "s";
            case "s":
                return "m";
            default:
                return d;
        }
    }
}
```

