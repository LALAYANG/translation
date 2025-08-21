```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        Arrays.sort(x);
        int sum = 0;
        for (int i = 0; i < m; i++) {
            y[i] = scanner.nextInt();
            sum += y[i];
        }
        Arrays.sort(y);
        int remainingCapacity = m - n;
        for (int i = 0; i < n; i++) {
            if (remainingCapacity > 0) {
                y[m - remainingCapacity] = x[i];
                remainingCapacity--;
            } else {
                break;
            }
        }
        Arrays.sort(y);
        for (int i = 0; i < y.length; i++) {
            sum += y[i];
        }
        System.out.println(sum);
    }
}
```

Test input:
5 3
1 2
1 3
1 4
2 1
2 3

Expected output:
10
``` 
