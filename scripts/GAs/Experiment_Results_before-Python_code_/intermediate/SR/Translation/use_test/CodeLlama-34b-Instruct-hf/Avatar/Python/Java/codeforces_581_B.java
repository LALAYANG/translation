```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int mx = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = Math.max(0, mx - arr[i] + 1);
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```

Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the user. The `Math.max()` method is used to find the maximum of two integers. The `for` loop is used to iterate over the elements of the array in reverse order.
