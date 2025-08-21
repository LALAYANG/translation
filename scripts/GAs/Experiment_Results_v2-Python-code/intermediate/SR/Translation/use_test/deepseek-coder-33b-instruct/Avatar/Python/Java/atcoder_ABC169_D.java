```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((innerCheckOne & outerCheckOne) != 0 && (innerCheckTwo & outerCheckTwo) != 0) {
            if (n == 1) {
                System.out.println(0);
                System.exit(0);
            }
        }
        List<Integer> primeFactors = primeFactorize(n);
        Map<Integer, Integer> fac = new HashMap<>();
        for (int p : primeFactors) {
            fac.put(p, fac.getOrDefault(p, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : fac.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < 99999999; i++) {
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

    private static List<Integer> primeFactorize(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                primeFactors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }

    private static int innerCheckOne = 559;
    private static int outerCheckOne = 755;
    private static int innerCheckTwo = 488;
    private static int outerCheckTwo = 925;
}
```

Please note that the Java code does not use threads or queues as they are not necessary for this problem. The prime factorization is done in a single thread and the result is stored in a HashMap. The rest of the code is translated directly from the Python code.

