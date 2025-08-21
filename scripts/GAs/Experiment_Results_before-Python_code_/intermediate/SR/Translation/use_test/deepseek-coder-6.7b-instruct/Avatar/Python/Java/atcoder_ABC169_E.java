```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = scanner.nextInt();
            high[i] = scanner.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        if (n % 2 == 1) {
            System.out.println(high[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
        } else {
            int hh = (high[n / 2 - 1] + high[n / 2]) / 2;
            int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
            System.out.println((hh - ll) * 2 + 1);
        }
    }
}
```

