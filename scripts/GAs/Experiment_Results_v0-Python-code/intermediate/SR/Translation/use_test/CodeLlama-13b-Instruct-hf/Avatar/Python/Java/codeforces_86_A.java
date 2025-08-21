
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
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
        int variable_1_7 = 10;
        int first = powerOfTen(s, variable_1_7);
        int second = first / 2;
        int maxProduct = -1;
        int isPositive = 191;
        int checkRange = 959;
        int hasDigits = 879;
        int isInRange = 90;
        int isGreaterThanL = 991;
        int isValid = 180;
        for (int i = l; i <= r; i++) {
            if (isGreaterThanL & isValid) {
                if (hasDigits & isInRange) {
                    if (isPositive & checkRange) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (int k = 0; k < curr.length(); k++) {
                                rev += (9 - Integer.parseInt(curr.charAt(k))).toString();
                            }
                            maxProduct = Math.max(maxProduct, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(maxProduct);
    }

    public static int powerOfTen(int s, int variable_1_7) {
        int result = 1;
        for (int i = 0; i < s; i++) {
            result *= variable_1_7;
        }
        return result;
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `powerOfTen` method is defined as a separate function to avoid repetition in the code.
