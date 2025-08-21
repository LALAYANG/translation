```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        int ans = Math.abs(r[0]);
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[i - 1]);
        }
        System.out.println(ans);
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `int[] r` array is used to store the input values.
* The `Math.abs()` method is used to calculate the absolute value of the difference between two numbers.
* The `for` loop is used to iterate over the input values and calculate the sum of the absolute differences.
* The `System.out.println()` method is used to print the final result.
