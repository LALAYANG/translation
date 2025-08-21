```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        int ans = Math.abs(r[0]);
        for (int i = 1; i < n; i++) {
            ans += Math.abs(r[i] - r[i - 1]);
        }
        System.out.println(ans);
    }
}
```

Note: The `Scanner` class is used to read input from the user. The `Math.abs()` method is used to calculate the absolute value of a number.
