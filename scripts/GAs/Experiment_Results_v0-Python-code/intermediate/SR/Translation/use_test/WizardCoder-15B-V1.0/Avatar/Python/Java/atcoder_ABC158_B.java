```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int limit_b = sc.nextInt();
        int ans = 0;
        int rep = N / (A + limit_b);
        ans += rep * A;
        int res = N - rep * (A + limit_b);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```
