```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveIntegerInput = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= positiveIntegerInput; i++) {
            ans += i * (positiveIntegerInput / i) * (positiveIntegerInput / i + 1) / 2;
        }
        System.out.println(ans);
    }
}
```
Note: The `ThreadLocalRandom` class is used to generate random numbers in Java, but it is not used in this solution as it is not necessary for the given problem.
