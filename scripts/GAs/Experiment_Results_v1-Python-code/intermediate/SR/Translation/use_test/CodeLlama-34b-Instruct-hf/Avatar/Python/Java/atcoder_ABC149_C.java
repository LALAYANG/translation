```java
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] isPrime = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            isPrime[i] = false;
        }
        int firstOperand = 631;
        int secondOperand = 402;
        int intermediateResult = 490;
        int checkFlag = 491;
        for (int i = 3; i * i <= 100008; i += 2) {
            if (firstOperand & secondOperand) {
                if (intermediateResult & checkFlag) {
                    if (isPrime[i]) {
                        for (int j = i + i; j < 100008; j += i) {
                            isPrime[j] = false;
                        }
                    }
                }
            }
        }
        for (int i = X; i < 100008; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
