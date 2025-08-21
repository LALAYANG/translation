Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        boolean[] prime = new boolean[100010];
        Arrays.fill(prime, true);
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

This Java code does the same thing as the Python code. It first initializes an array of boolean values to represent whether each number up to 100008 is prime. It then iteratively marks the multiples of each prime number as not prime. Finally, it prints the first prime number greater than or equal to X.

