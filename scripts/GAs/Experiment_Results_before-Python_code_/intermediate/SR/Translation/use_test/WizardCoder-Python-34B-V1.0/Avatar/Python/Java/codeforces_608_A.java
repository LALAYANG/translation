```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - f);
            if (x > c) {
                c = x;
        }
        System.out.println(s + c);
    }
}
```

Test input:
2 10
9 3
1 4

Expected output:
12 
