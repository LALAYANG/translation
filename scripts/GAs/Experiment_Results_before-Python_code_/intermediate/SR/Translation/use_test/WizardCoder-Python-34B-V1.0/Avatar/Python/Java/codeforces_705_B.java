```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int c = 2;
        for (int i = 0; i < n; i++) {
            if (w[i] == 1) {
                System.out.println(c);
            } else if (w[i] % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}
```

Test input:
5
2 2 2 1 1

Expected output:
1
2
1
1
1 
