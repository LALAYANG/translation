
Here is the Java code that translates the Python code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            values.add(scanner.nextInt());
        }
        int S = 0;
        for (int i = 0; i < N; i++) {
            S += values.get(i);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int groupSize = i + 1;
            int currentSum = groupSize * X + 2 * sum(values.subList(N - 2 * groupSize - 1, -1, -groupSize));
            ans = Math.min(ans, currentSum);
        }
        System.out.println(ans + N * X + 5 * values.get(N - 1));
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
```
Note that this code assumes that the input file contains the values for `N`, `X`, and the list of values, separated by spaces.

Also, note that this code uses the `ArrayList` class from the `java.util` package to store the list of values, and the `Scanner` class from the `java.util` package to read the input from the file.

I hope this helps! Let me know if you have any questions or need further assistance.
