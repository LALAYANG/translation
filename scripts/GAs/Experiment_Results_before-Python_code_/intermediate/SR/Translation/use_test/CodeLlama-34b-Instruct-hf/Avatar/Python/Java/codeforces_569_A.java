```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s = sc.nextInt();
        int q = sc.nextInt();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans++;
        }
        System.out.println(ans);
    }
}
```

Note: In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read the next integer from the input stream. The `Scanner` class is imported from the `java.util` package.
