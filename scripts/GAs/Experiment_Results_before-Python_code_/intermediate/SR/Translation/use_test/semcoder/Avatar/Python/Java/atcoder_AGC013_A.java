Thought process:
1. Read the input list `A` and remove consecutive duplicates to get a list `A` with unique elements.
2. Initialize variables `N` as the length of `A`, `i` as 1, and `ans` as 0.
3. Iterate over the list `A` starting from index 1.
4. Check if the current element breaks the increasing or decreasing order with its neighbors.
5. If it does, increment `ans` and move to the next element.
6. Finally, print the total number of peaks found plus 1.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] uniqueA = new int[N];
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                uniqueA[k++] = A[i];
            }
        }

        N = k;
        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            if ((uniqueA[i - 1] < uniqueA[i] && uniqueA[i] > uniqueA[i + 1]) ||
                    (uniqueA[i - 1] > uniqueA[i] && uniqueA[i] < uniqueA[i + 1])) {
                ans++;
                i++;
            }
            i++;
        }

        System.out.println(ans + 1);
    }
}
```
