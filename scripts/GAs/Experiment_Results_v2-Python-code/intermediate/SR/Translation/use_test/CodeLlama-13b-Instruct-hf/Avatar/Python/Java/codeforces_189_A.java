
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ribbonLength = scanner.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        int ans = 0;
        if (ribbonLength % arr[0] == 0) {
            ans = ribbonLength / arr[0];
        } else {
            int k = 0;
            for (int countLargest = 0; countLargest <= ribbonLength / arr[2]; countLargest++) {
                for (int j = 0; j <= ribbonLength / arr[1]; j++) {
                    int check = ribbonLength - countLargest * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + countLargest + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. It also uses the `System.out.println()` method to print the result to the console.

Note that the code is not optimized for performance, and it may not be the most efficient way to solve the problem. However, it should work correctly and produce the expected output for the given input.
