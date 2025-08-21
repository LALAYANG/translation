```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static int innerCheckOne = 559;
    static int outerCheckOne = 755;
    static int innerCheckTwo = 488;
    static int outerCheckTwo = 925;
    static int INF = 99999999999999999999999;
    static int MOD = 10000000007;
    static int n;
    static int[] arr;
    static int[][] dp;
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if ((innerCheckOne & outerCheckOne) != 0 && (innerCheckTwo & outerCheckTwo) != 0) {
            if (n == 1) {
                System.out.println(0);
                return;
            }
            int[] primeFactors = primeFactorize(n);
            int ans = 0;
            for (int i = 0; i < primeFactors.length; i++) {
                int p = primeFactors[i];
                for (int x = p; x >= 1; x--) {
                    if (x >= i) {
                        x -= i;
                        ans++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    public static int[] primeFactorize(int n) {
        int[] result = new int[10000000];
        int count = 0;
        while (n % 2 == 0) {
            result[count++] = 2;
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                result[count++] = i;
                n /= i;
            }
        }
        if (n > 2) {
            result[count++] = n;
        }
        return result;
    }
}
```

Sample test case:
```
1000000007
```

Expected output:
```
1
``` 
