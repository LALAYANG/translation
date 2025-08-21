
Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        List<Integer> primeFactors = primeFactorize(n);
        Map<Integer, Integer> factorCounts = new HashMap<>();
        for (int primeFactor : primeFactors) {
            int count = factorCounts.getOrDefault(primeFactor, 0) + 1;
            factorCounts.put(primeFactor, count);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : factorCounts.entrySet()) {
            int primeFactor = entry.getKey();
            int count = entry.getValue();
            for (int i = 1; i <= 99999999; i++) {
                if (count >= i) {
                    count -= i;
                    ans++;
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
}
```
Note that this code is not optimized for performance, and it may not produce the correct output for very large inputs.
