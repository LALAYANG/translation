```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = (1 + n) * n / 2;
            int t1 = 1;
            while (t1 <= n) {
                s -= 2 * t1;
                t1 *= 2;
            }
            System.out.println(s);
        }
    }
}
```
