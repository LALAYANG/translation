
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String d = "f";
        String ans = "";
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        } else {
            ans = "nly";
        }
        while (true) {
            if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    n++;
                } else if (d.equals("t")) {
                    d = "th";
                    n++;
                } else if (d.equals("w")) {
                    d = "f";
                    n++;
                } else if (d.equals("th")) {
                    d = "sa";
                    n++;
                } else if (d.equals("f")) {
                    d = "s";
                    n++;
                } else if (d.equals("sa")) {
                    d = "m";
                    n++;
                } else if (d.equals("s")) {
                    d = "t";
                    n++;
                }
            } else {
                if (d.equals("m")) {
                    d = "t";
                    n++;
                } else if (d.equals("t")) {
                    d = "w";
                    n++;
                } else if (d.equals("w")) {
                    d = "th";
                    n++;
                } else if (d.equals("th")) {
                    d = "f";
                    n++;
                } else if (d.equals("f")) {
                    d = "sa";
                    n++;
                } else if (d.equals("sa")) {
                    d = "s";
                    n++;
                } else if (d.equals("s")) {
                    d = "m";
                    n++;
                }
            }
            if (d.equals("f") && ans.equals("ly") && isLeapYear(n)) {
                break;
            } else if (d.equals("f") && ans.equals("nly") && !isLeapYear(n)) {
                break;
            }
        }
        System.out.println(n);
    }

    public static boolean isLeapYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
```
Note that I have added a new method `isLeapYear` to check if a given year is a leap year or not.

Also, I have used `String.equals` method to compare the values of `d` and `ans` instead of using `==` operator.

I hope this helps! Let me know if you have any questions.
