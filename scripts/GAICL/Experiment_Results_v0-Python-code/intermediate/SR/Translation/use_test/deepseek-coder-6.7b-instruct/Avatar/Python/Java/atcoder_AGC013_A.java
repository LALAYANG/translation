Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        A = Arrays.stream(A).distinct().toArray();
        N = A.length;
        int i = 1, ans = 0;
        while (i < N - 1) {
            boolean hasAdjacentDiff = A[i - 1] != A[i] && A[i] != A[i + 1];
            boolean isPeak = A[i - 1] < A[i] && A[i] > A[i + 1];
            boolean isValley = A[i - 1] > A[i] && A[i] < A[i + 1];
            boolean hasExtrema = isPeak || isValley;
            if (hasAdjacentDiff && hasExtrema) {
                ans++;
                i++;
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` and `N` integers from the input, removes duplicates, and then counts the number of extrema (peaks and valleys) in the array. The result is printed to the standard output.

