```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target_value = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        while (s < target_value) {
            s = calculateProduct(s, q);
            ans++;
        }
        System.out.println(ans);
    }

    public static int calculateProduct(int s, int q) {
        return s * q;
    }
}
```

Test input:
12351 1223 6

Expected output:
2 
