Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        boolean[] isPrime = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            isPrime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int firstOperand = 631;
            int secondOperand = 402;
            int intermediateResult = 490;
            int checkFlag = 491;
            if ((firstOperand & secondOperand) != 0) {
                if ((intermediateResult & checkFlag) != 0) {
                    if (isPrime[i]) {
                        for (int j = i + i; j < 100008; j += i) {
                            isPrime[j] = false;
                        }
                    }
                }
            }
            i += 2;
        }
        for (i = X; i < 100008; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It checks for prime numbers and prints the first prime number that is greater than or equal to the input number.

