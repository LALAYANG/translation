```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();
        int d = s < f ? 1 : -1;
        String res = "";
        int i = 1;
        int j = s;
        while (j != f) {
            if (i > t && k < m) {
                t = scanner.nextInt();
                l = scanner.nextInt();
                r = scanner.nextInt();
                k += 1;
            }
            if (i == t && (l <= j && j <= r || l <= j + d && j + d <= r)) {
                res += 'X';
            } else {
                res += d == 1 ? 'R' : 'L';
                j += d;
            }
            i += 1;
        }
        System.out.println(res);
    }
}
```

