```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 0;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 != 0) {
                t++;
            }
        }
        System.out.printf("%.10f", (double) t / n);
    }
}
```

Test input:
98

Expected output:
0.500000000000 
