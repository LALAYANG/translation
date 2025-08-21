Thought process:
1. Understand the given code snippet and its functionality.
2. Translate the code snippet into Java code.
3. Implement the Java code to find the next prime number after the input X.

```java
import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();

        boolean[] primeNumbers = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            primeNumbers[i] = true;
        }

        primeNumbers[0] = false;
        primeNumbers[1] = false;

        for (int i = 4; i < 100010; i += 2) {
            primeNumbers[i] = false;
        }

        for (int i = 3; i * i <= 100008; i += 2) {
            if (primeNumbers[i]) {
                for (int j = i + i; j < 100008; j += i) {
                    primeNumbers[j] = false;
                }
            }
        }

        for (int i = X; i < 100008; i++) {
            if (primeNumbers[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```

This solution translates the given Python code snippet into Java code and implements the logic to find the next prime number after the input X.
