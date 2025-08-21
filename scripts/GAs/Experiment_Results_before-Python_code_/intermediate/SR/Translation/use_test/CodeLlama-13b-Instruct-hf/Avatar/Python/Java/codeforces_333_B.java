
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            b[r - 1] = b[n + c - 1] = 0;
        }
        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < n * 2; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the output. The `map()` function is not available in Java, so we have to use a loop to iterate over the input and convert it to integers.
