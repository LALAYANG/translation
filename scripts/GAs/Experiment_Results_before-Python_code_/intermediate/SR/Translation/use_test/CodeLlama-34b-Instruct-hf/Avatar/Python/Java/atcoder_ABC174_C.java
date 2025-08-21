```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = 0;
        for (int i = 1; i <= k; i++) {
            t = (t % k) * 10 + 7;
            if (t % k == 0) {
                System.out.println(i);
                break;
            }
        }
        if (t % k != 0) {
            System.out.println(-1);
        }
    }
}
```

Note: The `setrecursionlimit` function is not available in Java, so I have removed it from the code. Also, the `mod` variable is not used in the code, so I have removed it as well.
