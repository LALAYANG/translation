Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `k`, then reads `n` integers into an array. It sorts the array and then calculates the sum of the first `k` elements. The result is printed out.

