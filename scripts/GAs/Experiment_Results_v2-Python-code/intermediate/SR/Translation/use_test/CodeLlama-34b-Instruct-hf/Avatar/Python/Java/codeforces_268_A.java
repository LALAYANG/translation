```java
import java.util.concurrent.atomic.AtomicInteger;

public class IncrementCount {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[][] q = new String[n][2];
        AtomicInteger count = new AtomicInteger(0);

        for (int i = 0; i < n; i++) {
            String[] input = args[i + 1].split(" ");
            q[i][0] = input[0];
            q[i][1] = input[1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (q[i][0].equals(q[j][1])) {
                    count.incrementAndGet();
                }
            }
        }

        System.out.println(count.get());
    }
}
```
Explanation:

The Python code uses a recursive function `readAndStoreInput` to read the input and store it in a list of lists. The list of lists is then used to perform the counting.

In Java, we can use a 2D array to store the input and perform the counting in a similar way. We use an `AtomicInteger` to keep track of the count, and the `incrementAndGet` method to increment the count.

The Java code is much simpler and more concise than the Python code, and it should be easier to understand and maintain.
