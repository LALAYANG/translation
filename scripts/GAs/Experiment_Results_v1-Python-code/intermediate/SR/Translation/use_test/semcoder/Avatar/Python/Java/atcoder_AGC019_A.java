Thought process:
1. Read the input values for q, h, s, d, and n.
2. Calculate the minimum of q*4, h*2, and s as best1L.
3. Calculate the minimum of d and best1L*2 as best2L.
4. If n is even, print best2L * (n // 2).
5. If n is odd, print best2L * (n // 2) + best1L.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        int best1L = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, best1L * 2);

        if (n % 2 == 0) {
            System.out.println((long) best2L * (n / 2));
        } else {
            System.out.println((long) best2L * (n / 2) + best1L);
        }
    }
}
```
