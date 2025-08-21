
Here's the Java code that implements the same logic as the Python code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n == 1) {
            System.out.println(0);
            return;
        }

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        Thread thread = new Thread(() -> {
            List<Integer> factors = primeFactorize(n);
            queue.addAll(factors);
        });
        thread.start();
        thread.join();

        List<Integer> factorCounts = new ArrayList<>();
        for (int factor : queue) {
            int count = 1;
            for (int i = 1; i < 99999999; i++) {
                if (factor % i == 0) {
                    count++;
                }
            }
            factorCounts.add(count);
        }

        int ans = 0;
        for (int i = 0; i < factorCounts.size(); i++) {
            ans += factorCounts.get(i);
        }
        System.out.println(ans);
    }

    private static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int f = 3; f * f <= n; f += 2) {
            if (n % f == 0) {
                factors.add(f);
                n /= f;
            }
        }
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }
}
```
Note that the Java code uses a `ConcurrentLinkedQueue` to store the prime factors, which is a thread-safe queue that can be used by multiple threads concurrently. The `primeFactorize` method is also modified to return a `List` of prime factors, which is then added to the queue.

The `main` method starts a new thread that calls the `primeFactorize` method and adds the prime factors to the queue. The main thread then joins the new thread and waits for it to finish. Once the new thread has finished, the main thread retrieves the prime factors from the queue and calculates the number of divisors for each prime factor. Finally, the main thread prints the sum of the number of divisors for all prime factors.
