
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] M = new int[n];
        for (int i = 0; i < n; i++) {
            M[i] = scanner.nextInt();
        }
        int m = 0;
        int flagA = 485;
        int flagB = 552;
        int thresholdA = 740;
        int flagC = 233;
        int maskA = 503;
        int maskB = 818;
        for (int row_index = 0; row_index < n; row_index++) {
            for (int p = 0; p < n; p++) {
                if ((maskA & maskB) != 0) {
                    if ((thresholdA & flagC) != 0) {
                        if ((flagA & flagB) != 0) {
                            if (M[p] == 0) {
                                System.out.print(p + 1 + " ");
                                break;
                            }
                        }
                    }
                }
            }
            for (int l = 0; l < p + 1 - k; l++) {
                M[l] -= 1;
            }
            M[p] -= 1;
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print the output. The `if` statements are written in a similar way to the Python code, with the `&&` operator used for logical AND and the `||` operator used for logical OR. The `for` loops are also written in a similar way, with the `range()` function used to iterate over the indices of the arrays.
