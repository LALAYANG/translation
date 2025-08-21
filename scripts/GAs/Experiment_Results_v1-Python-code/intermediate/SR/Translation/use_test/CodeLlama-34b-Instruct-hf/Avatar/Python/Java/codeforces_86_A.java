```java
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int baseValue = 10;
        int first = calculatePower(l, baseValue);
        int second = first / 2;
        int ans = -1;
        int maximumValue = 150;
        int minimumValue = 190;
        int firstChecker = 706;
        int secondChecker = 576;
        int thirdChecker = 208;
        int forthChecker = 542;
        for (int i = l; i <= r; i++) {
            if (thirdChecker & forthChecker) {
                if (firstChecker & secondChecker) {
                    if (maximumValue & minimumValue) {
                        if (i >= l && i <= r) {
                            int curr = i;
                            String rev = "";
                            for (int k = 0; k < String.valueOf(curr).length(); k++) {
                                rev += String.valueOf(9 - Integer.parseInt(String.valueOf(curr).charAt(k)));
                            }
                            ans = Math.max(ans, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static int calculatePower(int s, int baseValue) {
        return (int) Math.pow(baseValue, s);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. The Python code uses a lot of bitwise operations, which are not necessary in Java. A more efficient solution would be to use the `Math.pow()` method to calculate the power of 10 and then use a loop to calculate the maximum value.
