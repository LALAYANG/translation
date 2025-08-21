```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        int[] fac = primeFactorize(num);
        for (int i = 1; i <= 99999999; i++) {
            int x = i;
            for (int j = 0; j < fac.length; j++) {
                if (x >= fac[j]) {
                    x -= fac[j];
                } else {
                    break;
                }
            }
            if (x == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static int[] primeFactorize(int num) {
        int[] arr = new int[1000000];
        int i = 0;
        while (num % 2 == 0) {
            arr[i++] = 2;
            num = num / 2;
        }
        int f = 3;
        while (f * f <= num) {
            if (num % f == 0) {
                arr[i++] = f;
                num = num / f;
            } else {
                f += 2;
            }
        }
        if (num != 1) {
            arr[i++] = num;
        }
        int[] res = new int[i];
        for (int j = 0; j < i; j++) {
            res[j] = arr[j];
        }
        return res;
    }
}
```
