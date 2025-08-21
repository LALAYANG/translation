```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
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
        scanner.close();

        int res = 0;

        void recursive_function(int[] A, int index) {
            if (A.length == array_size) {
                int ans = 0;
                for (int i = 0; i < Q; i++) {
                    if (A[b[i] - 1] - A[a[i] - 1] == c[i]) {
                        ans += d[i];
                    }
                }
                res = Math.max(res, ans);
                return;
            }
            int last_max = A.length == 0 ? 1 : A[A.length - 1];
            for (int i = last_max; i <= M; i++) {
                int[] newA = new int[A.length + 1];
                for (int j = 0; j < A.length; j++) {
                    newA[j] = A[j];
                }
                newA[A.length] = i;
                recursive_function(newA, index + 1);
            }
        }

        recursive_function(new int[0], 0);
        System.out.println(res);
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
451476
``` 
