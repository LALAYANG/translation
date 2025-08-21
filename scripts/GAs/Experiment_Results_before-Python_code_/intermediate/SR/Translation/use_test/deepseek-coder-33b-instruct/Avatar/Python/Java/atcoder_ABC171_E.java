```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i = 0; i < N; i++) {
            total ^= a[i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] ^ total);
            if (i != N - 1) {
                System.out.print(" ");
            }
        }
    }
}
```

