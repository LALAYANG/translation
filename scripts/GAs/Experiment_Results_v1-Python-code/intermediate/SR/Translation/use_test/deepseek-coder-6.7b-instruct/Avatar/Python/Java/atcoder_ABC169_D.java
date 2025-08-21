```java
import java.util.*;
import java.math.*;

public class Main {
    static int MOD = (int)1e9 + 7;
    static int INF = (int)1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        List<Integer> factors = primeFactorize(n);
        Map<Integer, Integer> factorCounts = new HashMap<>();
        for (int factor : factors) {
            factorCounts.put(factor, factorCounts.getOrDefault(factor, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : factorCounts.entrySet()) {
            int x = entry.getValue();
            for (int i = 1; i < INF; i++) {
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

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's 1, and if not, it calculates the prime factors of the number and counts the occurrences of each prime factor. The count is then used to calculate the answer. The prime factorization is done using the `primeFactorize` method, which returns a list of prime factors. The `main` method is the entry point of the program.

