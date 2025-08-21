To solve this problem, we need to calculate the width of the median interval of the given intervals. Here is the step-by-step solution:

1. Read the input values for `n` and store them in `low` and `high` lists.
2. Sort the `low` and `high` lists.
3. If `n` is odd, calculate the width of the median interval using the middle value of the sorted `high` list.
4. If `n` is even, calculate the width of the median interval using the average of the middle two values of the sorted `low` and `high` lists.
5. Print the calculated width of the median interval.

Here is the Java implementation of the solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];

        for (int i = 0; i < n; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }

        java.util.Arrays.sort(low);
        java.util.Arrays.sort(high);

        if (n % 2 == 1) {
            System.out.println(high[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
        } else {
            double hh = (double) (high[n / 2 - 1] + high[n / 2]) / 2;
            double ll = (double) (low[n / 2 - 1] + low[n / 2]) / 2;
            System.out.println((int) ((hh - ll) * 2) + 1);
        }
    }
}
```

This solution reads the input values, sorts the lists, and calculates the width of the median interval based on the given conditions.
