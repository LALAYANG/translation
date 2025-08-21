```java
import java.util.*;
import java.math.*;

public class Main {
    static int innerCheckOne = 559;
    static int outerCheckOne = 755;
    static int innerCheckTwo = 488;
    static int outerCheckTwo = 925;
    static int MOD = (int)Math.pow(10, 9) + 7;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if ((innerCheckOne & outerCheckOne) != 0 && (innerCheckTwo & outerCheckTwo) != 0 && n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        List<Integer> primeFactors = primeFactorize(n);
        Map<Integer, Integer> fac = new HashMap<>();
        for (int p : primeFactors) {
            fac.put(p, fac.getOrDefault(p, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : fac.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < 100000000; i++) {
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

    public static List<Integer> primeFactorize(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        for (int f = 3; f * f <= n; f += 2) {
            while (n % f == 0) {
                primeFactors.add(f);
                n /= f;
            }
        }
        if (n != 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}
```

