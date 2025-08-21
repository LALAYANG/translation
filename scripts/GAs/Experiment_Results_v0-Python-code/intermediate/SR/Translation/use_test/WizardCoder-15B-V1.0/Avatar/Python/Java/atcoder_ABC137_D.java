```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x[i] = -day * -salary;
        }
        Arrays.sort(x);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int r = m - y.length;
            if (r >= -x[i]) {
                y[y.length] = -x[i];
                sum += -x[i];
            } else {
                if (y.length > 0) {
                    sum += -x[i];
                    y[0] = -x[i];
                }
            }
        }
        System.out.println(sum);
    }
}
```
