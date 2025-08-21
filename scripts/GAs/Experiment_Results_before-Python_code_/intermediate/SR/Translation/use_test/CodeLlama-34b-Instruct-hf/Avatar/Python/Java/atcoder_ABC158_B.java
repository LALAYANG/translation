```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1000000007;
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```
Note: In Java, the `Math.min()` method is used to find the minimum of two integers.
