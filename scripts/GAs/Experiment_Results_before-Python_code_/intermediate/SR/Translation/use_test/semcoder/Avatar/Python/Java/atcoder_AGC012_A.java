Thought process:
1. Read the input integer `n` and list `A`.
2. Sort the list `A` in ascending order.
3. Initialize a variable `ans` to store the sum of selected elements.
4. Iterate over the sorted list `A` from the second last element to the `n`th element (exclusive) with a step of 2.
5. Add the current element to the `ans`.
6. Print the final sum `ans`.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int ans = 0;
        for (int i = A.length - 2; i >= A.length - 2 * n; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}
```
