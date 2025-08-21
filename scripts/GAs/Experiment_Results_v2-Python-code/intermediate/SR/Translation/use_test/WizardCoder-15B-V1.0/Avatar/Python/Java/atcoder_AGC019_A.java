```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int min_one_liter_cost = Math.min(q * 4, Math.min(h * 2, s));
        int best2L = Math.min(d, min_one_liter_cost * 2);
        if (n % 2 == 0) {
            System.out.println(best2L * (n / 2));
        } else {
            System.out.println(best2L * (n / 2) + min_one_liter_cost);
        }
    }
}
```
