Thought process:
1. Read the input values for q, h, s, d, and n.
2. Calculate the best prices for 1L, 2L, and n.
3. Determine the minimum cost based on the number of liters required.
4. Print the final cost.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int best1L = Math.min(q * 4, h * 2, s);
        int best2L = Math.min(d, best1L * 2);

        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + best1L);
        }
    }
}
```
