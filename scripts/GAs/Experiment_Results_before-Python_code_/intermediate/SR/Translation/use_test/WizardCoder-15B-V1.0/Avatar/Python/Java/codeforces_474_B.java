
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        int[] L = new int[n];
        for (int i = 0; i < n; i++) {
            L[i] = r;
            r += 1;
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int j = sc.nextInt();
            System.out.println(L[j-1]);
        }
    }
}
```
