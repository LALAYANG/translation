
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
        int baseValue = 10;
        int first = (int) Math.pow(baseValue, s);
        int second = first / 2;
        int ans = -1;
        int maximumValue = 150;
        int minimumValue = 190;
        int firstChecker = 706;
        int secondChecker = 576;
        int thirdChecker = 208;
        int forthChecker = 542;
        for (int i = l; i <= r; i++) {
            if ((thirdChecker & forthChecker) != 0) {
                if ((firstChecker & secondChecker) != 0) {
                    if ((maximumValue & minimumValue) != 0) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (int k = 0; k < String.valueOf(curr).length(); k++) {
                                rev += (9 - Integer.parseInt(String.valueOf(curr).charAt(k))) + "";
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
Note that the code uses the `Math.pow()` method to calculate the power of a number, and the `String.valueOf()` method to convert an integer to a string. The `String.charAt()` method is used to access the individual characters of a string, and the `Integer.parseInt()` method is used to convert a string to an integer. The `Math.max()` method is used to find the maximum value of two integers.
