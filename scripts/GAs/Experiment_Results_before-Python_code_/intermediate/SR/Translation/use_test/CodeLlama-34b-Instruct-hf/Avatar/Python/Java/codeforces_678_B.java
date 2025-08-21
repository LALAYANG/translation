```
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String d = "f";
        String ans = (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) ? "ly" : "nly";
        while (true) {
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
            if ((d.equals("f") && ans.equals("ly") && leapYear(n) == "y") || (d.equals("f") && ans.equals("nly") && leapYear(n) == "n")) {
                break;
            }
        }
        System.out.println(n);
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
Note: In Java, the `==` operator is used to compare the values of two variables, while the `equals()` method is used to compare the values of two strings.
