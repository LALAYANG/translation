```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_length = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        int res = solve(array_length, M, Q, a, b, c, d);
        System.out.println(res);
    }

    public static int solve(int array_length, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        for (int i = 0; i < Q; i++) {
            if (c[i] == 0) {
                res += d[i];
            }
        }
        return res;
    }
}
```

Test input:
5 2 20
2 3 1 84578
1 4 0 7182
2 4 1 25494
1 5 0 81831
1 3 1 14734
1 4 1 39268
1 5 1 594
3 5 0 27228
1 2 0 95
2 3 0 56166
2 5 0 87980
4 5 0 5659
3 4 1 20460
1 2 1 28731
2 5 1 46448

Expected output:
27228
``` 
