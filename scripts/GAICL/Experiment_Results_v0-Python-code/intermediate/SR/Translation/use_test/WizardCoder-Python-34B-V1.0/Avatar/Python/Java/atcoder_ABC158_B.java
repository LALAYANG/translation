```java
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.DAYS, ArrayBlockingQueue.newArrayBlockingQueue(1));
        int[] arr1 = {67, 21, 58};
        int[] arr2 = {58, 58, 14};
        TTest tTest = new TTest();
        tTest.tTest(arr1, arr2);
        int input = scanner.nextInt();
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int limit_b = scanner.nextInt();
        int mod = (int) (1e9 + 7);
        int ans = 0;
        int rep = N / (A + limit_b);
        ans += rep * A;
        int res = N - rep * (A + limit_b);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```

Test input:
840783003083059124 0 327003145473120758

Expected output:
0 
