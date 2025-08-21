```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        int[] element_counts = new int[101];
        for (int i = 0; i < n; i++) {
            element_counts[lst[i]]++;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (element_counts[lst[i]] > 1) {
                res += n - i - element_counts[lst[i]];
                element_counts[lst[i]]--;
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```
