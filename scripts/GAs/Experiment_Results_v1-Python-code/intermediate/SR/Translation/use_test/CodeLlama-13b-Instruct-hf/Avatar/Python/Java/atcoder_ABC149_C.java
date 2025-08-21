
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        boolean[] isPrime = new boolean[100010];
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
        for (int i = X; i < 100008; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```
Note that the Java code uses the `java.util.Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `boolean[]` array is used to represent the array of prime numbers, and the `for` loops are used to iterate over the array and perform the necessary operations.
