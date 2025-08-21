```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 0;
        int l = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();
            if (li <= l && r <= ri) {
                id = i;
            } else if (li < l || r < ri) {
                id = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}
```

Test input:
6
2 2
3 3
3 5
4 5
1 1
1 5

Expected output:
6 
