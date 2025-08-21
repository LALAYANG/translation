
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LeapYear {
    private static final Lock lock = new ReentrantLock();
    private static final int[] shuffle = {17, 2, 74};

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        String d = "f";
        String leap_year_result = isLeapYear(year) ? "ly" : "nly";

        while (true) {
            if (isLeapYear(year)) {
                if (d.equals("m")) {
                    d = "w";
                    int variable_3_27 = 1;
                    int result = addConstant(year, variable_3_27);
                    year = result;
                } else if (d.equals("t")) {
                    d = "th";
                    int variable_3_45 = 1;
                    int result = addConstant(variable_3_45, year);
                    year = result;
                } else if (d.equals("w")) {
                    d = "f";
                    year++;
                } else if (d.equals("th")) {
                    d = "sa";
                    year++;
                } else if (d.equals("f")) {
                    d = "s";
                    year++;
                } else if (d.equals("sa")) {
                    d = "m";
                    year++;
                } else if (d.equals("s")) {
                    d = "t";
                    year++;
                }
            } else {
                if (d.equals("m")) {
                    d = "t";
                    year++;
                } else if (d.equals("t")) {
                    d = "w";
                    year++;
                } else if (d.equals("w")) {
                    d = "th";
                    year++;
                } else if (d.equals("th")) {
                    d = "f";
                    year++;
                } else if (d.equals("f")) {
                    d = "sa";
                    year++;
                } else if (d.equals("sa")) {
                    d = "s";
                    year++;
                } else if (d.equals("s")) {
                    d = "m";
                    year++;
                }
            }

            if (d.equals("f") && leap_year_result.equals("ly") && isLeapYear(year)) {
                break;
            } else if (d.equals("f") && leap_year_result.equals("nly") && !isLeapYear(year)) {
                break;
            }
        }

        System.out.println(year);
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    private static int addConstant(int variable_3_27, int year) {
        return year + variable_3_27;
    }

    private static int addConstant(int variable_3_45, int year) {
        return year + variable_3_45;
    }
}
```
Note that this code is not thread-safe, as it uses the `ThreadLocalRandom` class to generate random numbers. If you need to make it thread-safe, you can use a different method to generate random numbers, such as the `Random` class.
