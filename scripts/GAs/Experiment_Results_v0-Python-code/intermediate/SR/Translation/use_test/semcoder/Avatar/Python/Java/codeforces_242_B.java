Thought process:
1. The code reads input values for `n`, `l`, and `r`.
2. It defines a function `recursive_check` that recursively checks conditions and updates `l` and `r`.
3. The function is called with parameters `(1, n, 1)`.
4. The final output is determined based on the value of `intersection_id`.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int intersection_id = 0;
        for (int i = 1; i <= n; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();
            if (li <= l && r <= ri) {
                intersection_id = i;
            } else if (li < l || r < ri) {
                intersection_id = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(intersection_id == n ? -1 : intersection_id);
    }
}
```
