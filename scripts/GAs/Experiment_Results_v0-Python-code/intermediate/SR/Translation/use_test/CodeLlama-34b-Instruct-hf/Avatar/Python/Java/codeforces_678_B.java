```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String leapYearResult = "nly";
        String d = "f";

        while (true) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                leapYearResult = "ly";
            }

            if (d.equals("m")) {
                d = "w";
                year += 1;
            } else if (d.equals("t")) {
                d = "th";
                year += 1;
            } else if (d.equals("w")) {
                d = "f";
                year += 1;
            } else if (d.equals("th")) {
                d = "sa";
                year += 1;
            } else if (d.equals("f")) {
                d = "s";
                year += 1;
            } else if (d.equals("sa")) {
                d = "m";
                year += 1;
            } else if (d.equals("s")) {
                d = "t";
                year += 1;
            }

            if (d.equals("f") && leapYearResult.equals("ly") && leapyear(year).equals("y")) {
                break;
            } else if (d.equals("f") && leapYearResult.equals("nly") && leapyear(year).equals("n")) {
                break;
            }
        }

        System.out.println(year);
    }

    public static String leapyear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}
```
Note: The `leapyear` method is a simple implementation of the leap year rule. It is not a complete implementation of the leap year rule, as it does not take into account the specific rules for leap years in the Gregorian calendar.
