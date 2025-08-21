```java
import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> primeFactors = primeFactorize(n);
        Map<Integer, Integer> factorCount = new HashMap<>();
        for (int factor : primeFactors) {
            if (!factorCount.containsKey(factor)) {
                factorCount.put(factor, 1);
            } else {
                factorCount.put(factor, factorCount.get(factor) + 1);
            }
        }

        int ans = 0;
        for (int factor : factorCount.keySet()) {
            int count = factorCount.get(factor);
            for (int i = 1; i <= count; i++) {
                ans += i;
            }
        }

        System.out.println(ans);
    }

    public static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
```
Note: The above code uses the `java.util.Scanner` class to read input from the user, and the `java.util.HashMap` class to store the prime factors and their counts. The `primeFactorize` method is a recursive method that returns a list of prime factors of the given number. The `main` method uses this method to prime factorize the input number, and then uses a loop to calculate the sum of the prime factors.
