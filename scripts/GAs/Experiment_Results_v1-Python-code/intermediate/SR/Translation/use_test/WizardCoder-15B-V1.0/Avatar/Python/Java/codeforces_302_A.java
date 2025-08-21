```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (sc.next().equals("-")) {
                sa++;
            }
        }
        sa = Math.min(sa, n - sa);
        sc.nextLine();
        List<String> results = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int diff = b - a;
            if (diff % 2 == 0 && diff <= sa * 2) {
                results.add("1\n");
            } else {
                results.add("0\n");
            }
        }
        System.out.print(String.join("", results));
    }
}
```
