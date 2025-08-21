```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] a = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            a[i] = scanner.nextInt();
        }

        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < arraySize; i++) {
            int current = a[i];
            if (current < pre) {
                ans += pre - current;
                pre = current;
            }
        }

        System.out.println(ans);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses a single loop to iterate over the input array and calculates the maximum difference between consecutive elements. The `pre` variable is used to keep track of the previous element in the array, and the `ans` variable is used to keep track of the sum of the differences.
