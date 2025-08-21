
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] prime = new boolean[100010];
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
Note that the Java code uses a `Scanner` object to read the input from the user, and it uses a `boolean` array to store the prime numbers. The `main` method first reads the input from the user, then it initializes the `prime` array with `false` values, and then it uses a loop to mark the composite numbers as `false`. Finally, it uses another loop to print the prime numbers that are greater than the input.
