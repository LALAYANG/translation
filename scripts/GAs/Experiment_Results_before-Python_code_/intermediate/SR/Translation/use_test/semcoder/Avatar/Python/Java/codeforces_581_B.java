To solve this problem, we can follow these steps:
1. Read the input integer `n`.
2. Read the list `arr` of integers with a length of `n`.
3. Initialize a list `ans` of zeros with the same length as `arr`.
4. Initialize `mx` with the last element of `arr`.
5. Iterate from the second last element of `arr` to the first element.
6. Update `ans[i]` as the maximum of 0 and `mx - arr[i] + 1`.
7. Update `mx` if `arr[i]` is greater than `mx`.
8. Print the elements of `ans` separated by spaces.

Here is the Java solution:

```java
import java.util.*;

public class Main {
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

This solution reads the input, processes the data as described, and then prints the output as expected.
