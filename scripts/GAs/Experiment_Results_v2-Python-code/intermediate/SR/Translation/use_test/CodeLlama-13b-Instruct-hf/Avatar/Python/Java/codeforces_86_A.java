
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }
        int powerOfTen = 10;
        int first = (int) Math.pow(powerOfTen, s);
        int second = first / 2;
        int ans = -1;
        int SecondaryChecker = 481;
        int PrimaryChecker = 229;
        int MidNumberCheckerTwo = 192;
        int MidNumberCheckerOne = 158;
        int MinNumberChecker = 90;
        int MaxNumberChecker = 286;
        for (int i = l; i <= r; i++) {
            if (MinNumberChecker & MaxNumberChecker) {
                if (MidNumberCheckerTwo & MidNumberCheckerOne) {
                    if (SecondaryChecker & PrimaryChecker) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (int k = 0; k < curr.length(); k++) {
                                rev += (9 - Integer.parseInt(curr.substring(k, k + 1)));
                            }
                            ans = Math.max(ans, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note that the code uses the `Math.pow()` method to calculate the power of 10, and the `Integer.parseInt()` method to convert a string to an integer. The `String.substring()` method is used to extract the digits of the input number.
