
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int j = n - 1; j >= 0; j--) {
            ans += Math.max(0, Math.min(pre - 1, a[j]));
            pre = Math.max(0, Math.min(pre - 1, a[j]));
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The `Integer.MAX_VALUE` constant is used to initialize the `pre` variable to a large value, which is then updated in each iteration of the loop. The `Math.max` and `Math.min` methods are used to ensure that the values of `pre` and `a[j]` are within the correct range. Finally, the `System.out.println` method is used to print the result to the console.
