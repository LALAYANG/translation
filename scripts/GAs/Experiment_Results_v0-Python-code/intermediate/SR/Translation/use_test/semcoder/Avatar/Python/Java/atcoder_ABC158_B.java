Thought process:
1. The code reads input values for N, A, and limit_b.
2. It calculates the number of repetitions and the remaining items.
3. It calculates the answer by considering the minimum of the remaining items and A.
4. The final answer is printed.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long limit_b = sc.nextLong();

        long ans = 0;
        long rep = N / (A + limit_b);
        ans += rep * A;
        long res = N - rep * (A + limit_b);
        ans += Math.min(res, A);

        System.out.println(ans);
    }
}
```
