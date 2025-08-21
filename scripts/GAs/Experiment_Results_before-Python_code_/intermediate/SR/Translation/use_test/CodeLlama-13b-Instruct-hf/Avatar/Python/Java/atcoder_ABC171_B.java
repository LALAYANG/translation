
Here is the Java code that produces the same output as the Python code:
```java
import java.util.Scanner;

public class Solution {
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
This code uses the `Scanner` class to read input from the user, and the `Arrays.sort()` method to sort the array of integers. The `sum` variable is used to keep track of the sum of the first `k` elements of the sorted array. Finally, the `System.out.println()` method is used to print the sum to the console.
