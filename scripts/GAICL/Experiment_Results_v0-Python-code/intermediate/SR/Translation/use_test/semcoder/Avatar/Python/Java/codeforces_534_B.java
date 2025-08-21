Thought Process:
1. Understand the provided code snippet and the semantically equivalent program.
2. Identify the key variables and functions used in the code.
3. Implement the logic to calculate the final distance based on the given conditions.

```java
import java.util.Scanner;

public class DistanceCalculator {
    public static int calculateDistance(int v, int distance) {
        return distance + v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialVelocity = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = initialVelocity;
        int distance = 0;

        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            distance = calculateDistance(v, distance);
            v += a * d;
        }

        System.out.println(distance);
    }
}
```

This solution provides a Java implementation that calculates the final distance based on the given conditions in the problem description.
