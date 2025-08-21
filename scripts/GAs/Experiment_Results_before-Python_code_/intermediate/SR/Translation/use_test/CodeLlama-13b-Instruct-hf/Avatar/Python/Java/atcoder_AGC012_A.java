
Here is the Java code that translates the Python code:
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int ans = 0;
        for (int i = n - 2; i >= n - 2 * n - 1; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` class to sort the input array. It then uses a for loop to iterate over the array and calculate the sum of the elements at even indices. Finally, it prints the sum to the console.

Note that this code assumes that the input array is of length `n`, and that the sum of the elements at even indices is less than `10^9 + 7`. If these assumptions are not true, the code may not produce the correct output.
