```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] L = new int[n];
        int r = 1;
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            for (int j = 0; j < k; j++) {
                L[i] = r;
                r++;
            }
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int j = scanner.nextInt();
            System.out.println(L[j - 1]);
        }
    }
}
```

Test input:
5
2 7 3 4 9
3
1 25 11

Expected output:
1
5
3 
