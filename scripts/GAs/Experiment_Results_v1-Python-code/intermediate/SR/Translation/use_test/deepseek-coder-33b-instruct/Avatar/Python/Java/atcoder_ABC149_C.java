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

Please note that the t-test function is not available in Java, so it is not included in the translation. Also, the bitwise AND operation (&) is used in the original Python code to check if a number is odd or even, but in Java, the modulus operator (%) can be used instead.

