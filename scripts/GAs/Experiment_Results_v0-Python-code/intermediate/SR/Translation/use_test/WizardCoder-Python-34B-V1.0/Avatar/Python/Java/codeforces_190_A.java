```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_a = 132;
        int condition_b = 668;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if ((condition_a & condition_b) != 0) {
            if (n < 1) {
                if (m < 1) {
                    System.out.println(n + " " + m);
                    System.exit(0);
                }
            } else {
                System.out.println("Impossible");
                System.exit(0);
            }
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        } else {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```

Test input:
16 70

Expected output:
70 85 
