```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        while (s < t) {
            s *= q;
            ans++;
        }
        System.out.println(ans);
    }
}
```

Test input:
12351 1223 6

Expected output:
2 
