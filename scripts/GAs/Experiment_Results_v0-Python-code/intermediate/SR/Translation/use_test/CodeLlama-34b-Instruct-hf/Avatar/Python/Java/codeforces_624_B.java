```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }

        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.max(0, Math.min(pre - 1, values[i]));
            pre = Math.max(0, Math.min(pre - 1, values[i]));
            ans += diff;
        }

        System.out.println(ans);
    }
}
```
Explanation:

The code is using the `Scanner` class to read the input from the user. The `nextInt()` method is used to read the next integer from the input.

The `values` array is initialized with the input values.

The `pre` variable is initialized with `Integer.MAX_VALUE`.

The `ans` variable is initialized with 0.

The `for` loop is used to iterate over the `values` array.

Inside the loop, the `diff` variable is calculated as the maximum of 0 and the minimum of `pre - 1` and `values[i]`.

The `pre` variable is updated to be the maximum of 0 and the minimum of `pre - 1` and `values[i]`.

The `ans` variable is updated to be the sum of `ans` and `diff`.

The `for` loop continues until the end of the `values` array is reached.

Finally, the `ans` variable is printed to the console.
