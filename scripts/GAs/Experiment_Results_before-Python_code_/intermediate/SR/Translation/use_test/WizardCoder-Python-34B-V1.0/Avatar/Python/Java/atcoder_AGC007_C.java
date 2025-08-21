```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d += d / N + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }
        System.out.printf("%.10f", ret);
    }
}
```

Test input:
2 1 0

Expected output:
2.500000000000000 
