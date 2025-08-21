Thought process:
1. The code reads multiple inputs using `read_multiple_inputs()` and stores them in `result_MI0`.
2. It calculates the number of repetitions `rep` and the remaining items `res`.
3. The minimum of `res` and `A` is added to the answer `ans`.
4. The final answer is printed.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int rep = N / (A + B);
        int ans = rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);

        System.out.println(ans);
    }
}
```
