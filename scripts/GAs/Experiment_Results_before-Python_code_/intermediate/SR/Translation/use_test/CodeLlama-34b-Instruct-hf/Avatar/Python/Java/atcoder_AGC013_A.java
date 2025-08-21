```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i < N - 1; i++) {
            if ((A[i - 1] < A[i] && A[i] > A[i + 1]) || (A[i - 1] > A[i] && A[i] < A[i + 1])) {
                ans++;
            }
        }

        System.out.println(ans + 1);
    }
}
```

Note: The above code is in Java, not Python.

Explanation:

The code first takes the input of the number of elements in the array and the elements themselves. Then, it initializes a variable `ans` to 0, which will store the final answer.

The code then iterates over the array, starting from the second element (index 1) and ending at the second-last element (index N-2). For each element, it checks if the previous element is less than the current element and the next element is greater than the current element, or if the previous element is greater than the current element and the next element is less than the current element. If either of these conditions is true, it increments the `ans` variable by 1.

Finally, the code prints the final answer, which is the value of `ans` plus 1. The reason for adding 1 is that the loop starts from the second element, so we need to add 1 to the final answer to account for the first element.
