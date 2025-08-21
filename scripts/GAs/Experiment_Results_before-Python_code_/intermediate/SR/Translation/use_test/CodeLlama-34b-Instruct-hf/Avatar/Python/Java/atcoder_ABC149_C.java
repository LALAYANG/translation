```java
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] prime = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        for (int i = 3; i * i <= 100008; i += 2) {
            if (prime[i]) {
                for (int j = i + i; j < 100008; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = X; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it can be optimized further by using more efficient algorithms for finding prime numbers, such as the Sieve of Eratosthenes.
