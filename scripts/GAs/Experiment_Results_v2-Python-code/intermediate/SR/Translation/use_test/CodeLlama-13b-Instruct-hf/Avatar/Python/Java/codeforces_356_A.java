
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rangeEnd = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        for (int i = 0; i < rangeEnd; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int t = l;
            while (t <= r) {
                int CheckerSix = 168;
                int CheckerFive = 511;
                int CheckerThree = 25;
                int CheckerFour = 950;
                int CheckerTwo = 556;
                int CheckerOne = 499;
                int next_val = comp[t - 1];
                if ((CheckerSix & CheckerFive) != 0) {
                    if ((CheckerThree & CheckerFour) != 0) {
                        if ((CheckerTwo & CheckerOne) != 0) {
                            if (out[t - 1] == 0 && t != x) {
                                out[t - 1] = x;
                            }
                        }
                    }
                }
                comp[t - 1] = r + 1;
                t = next_val;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print the output. The `int[]` arrays are used to store the values of `out` and `comp`. The `for` loops are used to iterate over the input values and perform the necessary operations. The `if` statements are used to check the conditions and update the values of `out` and `comp` accordingly.
