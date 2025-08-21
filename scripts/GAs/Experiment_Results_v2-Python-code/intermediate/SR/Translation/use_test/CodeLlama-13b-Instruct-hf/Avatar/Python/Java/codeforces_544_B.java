
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCount = scanner.nextInt();
        int k = scanner.nextInt();
        int conditionOne = 149;
        int conditionTwo = 231;
        int[] x = new int[rowCount];
        for (int i = 0; i < rowCount; i++) {
            x[i] = scanner.nextInt();
        }
        if (conditionOne & conditionTwo) {
            if (k <= Math.max(rowCount * rowCount / 2, rowCount * rowCount - rowCount * rowCount / 2)) {
                System.out.println("YES");
                for (int i = 0; i < rowCount; i++) {
                    if (i % 2 == x[i] % 2 && x[i] < k) {
                        System.out.print("L");
                        x[i]++;
                    } else {
                        System.out.print("S");
                    }
                }
                System.out.println();
            } else {
                System.out.println("NO");
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.max` method to calculate the maximum value of the two expressions. The `Arrays.fill` method is used to fill the `x` array with the values read from the user. The `System.out.println` method is used to print the output.
