```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[8];
        for (int i = 0; i < 8; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int ans = 0;
        for (int i = A.length - 2; i > A.length - 2 * n - 1; i -= 2) {
            ans += A[i];
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array of 8 integers from the input, sorts the array, and then sums up every second number from the end of the array (starting from the end) and prints the sum.

