```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextDouble());
        }
        arr.sort((a, b) -> Double.compare(a - Math.floor(a), b - Math.floor(b)));
        int o = 2 * n - arr.size();
        double arr_sum = arr.stream().mapToDouble(x -> x).sum();
        double res = 2e9;
        for (int i = 0; i <= n; i++) {
            if (i + o >= n) {
                res = Math.min(res, Math.abs(i - arr_sum));
            }
        }
        System.out.printf("%.3f", res);
    }
}
```
