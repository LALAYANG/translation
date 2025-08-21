```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] menu = new int[n];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int e = m % 10;
            if (e == 0) {
                e = 10;
            }
            menu[i] = m * e;
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans += menu[i] / 10 + 1;
        }
        ans += menu[0] / 10;
        System.out.println(ans);
    }
}
```
