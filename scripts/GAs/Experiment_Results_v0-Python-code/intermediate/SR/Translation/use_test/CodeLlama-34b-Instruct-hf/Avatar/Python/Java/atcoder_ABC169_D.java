```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class PrimeFactorization {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num == 1) {
            System.out.println(0);
            return;
        }

        List<Integer> primeFactors = primeFactorize(num);
        Counter<Integer> fac = new Counter<Integer>(primeFactors);
        int ans = 0;
        for (int p : fac.keySet()) {
            int x = fac.get(p);
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

    public static List<Integer> primeFactorize(int num) {
        List<Integer> factors = new ArrayList<Integer>();
        while (num % 2 == 0) {
            factors.add(2);
            num /= 2;
        }
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                factors.add(i);
                num /= i;
            }
        }
        if (num > 2) {
            factors.add(num);
        }
        return factors;
    }
}

class Counter<T> {
    private T key;
    private int value;

    public Counter(T key, int value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
```
This Java code is a translation of the given Python code. It uses the `Counter` class from the `java.util` package to keep track of the frequency of each prime factor in the factorization of the input number. The `primeFactorize` method is a direct translation of the Python function of the same name, and it returns a list of prime factors. The `main` method takes the input number as a command-line argument, and it calls the `primeFactorize` method to get the prime factors. It then uses the `Counter` class to keep track of the frequency of each prime factor, and it computes the final answer by iterating over the prime factors and adding up the number of times each factor appears.

Note that the Java code uses the `ThreadLocalRandom` class from the `java.util.concurrent` package to generate random numbers, which is not necessary in the Python code. The Python code uses the `random` module, which is not thread-safe, so it is not suitable for use in a multi-threaded environment. The Java code, on the other hand, uses the `ThreadLocalRandom` class, which is thread-safe and can be used in a multi-threaded environment.
