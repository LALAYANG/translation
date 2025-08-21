```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(subtract(a, b));
        }
    }

    public static int subtract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        } else if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        } else {
            return 1;
        }
    }
}
```

