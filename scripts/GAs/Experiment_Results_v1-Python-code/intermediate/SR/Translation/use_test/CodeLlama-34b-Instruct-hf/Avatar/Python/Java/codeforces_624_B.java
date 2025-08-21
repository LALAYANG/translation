```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        int[] a = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            a[i] = scanner.nextInt();
        }

        int pre = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < numElements; i++) {
            int current = a[i];
            result += Math.max(0, Math.min(pre - 1, current));
            pre = Math.max(0, Math.min(pre - 1, current));
        }

        System.out.println(result);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
