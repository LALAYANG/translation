```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        int h1 = 0, h2 = 0, x = 0;
        for (int i = 0; i < n; i++) {
            if (digits[i] != 4 && digits[i] != 7) {
                System.out.println("NO");
                x = 1;
                break;
            }
            if (i < n / 2) {
                h1 += digits[i];
            } else {
                h2 += digits[i];
            }
        }
        if (x == 0) {
            System.out.println("YES");
        }
    }
}
```
