```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println(0);
            System.exit(0);
        }
        List<Integer> fac = primeFactorize(num);
        Map<Integer, Integer> facCount = new HashMap<>();
        for (int p : fac) {
            facCount.put(p, facCount.getOrDefault(p, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : facCount.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < 100000000; i++) {
                if (x >= i) {
                    x -= i;
                    ans += 1;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static List<Integer> primeFactorize(int num) {
        List<Integer> a = new ArrayList<>();
        while (num % 2 == 0) {
            a.add(2);
            num /= 2;
        }
        int f = 3;
        while (f * f <= num) {
            if (num % f == 0) {
                a.add(f);
                num /= f;
            } else {
                f += 2;
            }
        }
        if (num != 1) {
            a.add(num);
        }
        return a;
    }
}
```

