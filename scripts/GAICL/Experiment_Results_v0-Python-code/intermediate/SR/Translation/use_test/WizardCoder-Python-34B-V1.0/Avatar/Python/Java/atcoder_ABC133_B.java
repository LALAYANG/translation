```java
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int n, d;
        n = 3;
        d = 4;
        int[][] points = {{3, 4}, {-3, 7, 8, 2}, {-12, 1, 10, 2}, {-2, 8, 9, 3}};
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double tmp = 0.0;
                for (int k = 0; k < d; k++) {
                    tmp += Math.pow(points[i][k] - points[j][k], 2);
                }
                if (Math.sqrt(tmp) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

Test input:
3 4
-3 7 8 2
-12 1 10 2
-2 8 9 3

Expected output:
2 
