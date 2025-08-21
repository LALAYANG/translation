```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        for (int i : a) {
            x += i;
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            z += i;
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}
```

Test input:
6
1 4 3 3 5 7
3 7 5 4 3
4 3 7 5

Expected output:
1
3 
