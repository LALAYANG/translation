```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int s = (1 + n) * n / 2;
            int t = 1;
            while (t <= n) {
                s -= 2 * t;
                t *= 2;
            }
            System.out.println(s);
        }
    }
}
```

Test input:
10
1
2
3
4
5
6
7
8
9
10

Expected output:
-1
-3
0
-4
1
7
14
6
15
25 
