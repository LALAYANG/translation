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

This Java code does the same thing as the Python code. It reads the number of elements and the number of smallest elements to sum, reads the elements into an array, sorts the array, sums the first k elements, and prints the result.

