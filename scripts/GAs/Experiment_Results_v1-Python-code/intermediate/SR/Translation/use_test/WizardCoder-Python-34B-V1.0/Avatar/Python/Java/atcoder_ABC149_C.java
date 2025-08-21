```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        boolean[] isPrime = new boolean[100010];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 4; i <= 100010; i += 2) {
            isPrime[i] = false;
        }
        int firstOperand = 631;
        int secondOperand = 402;
        int intermediateResult = 490;
        int checkFlag = 491;
        for (int i = 3; i * i <= 100008; i += 2) {
            if (isPrime[i]) {
                if ((firstOperand & secondOperand) != 0 && (intermediateResult & checkFlag) != 0) {
                    for (int j = i + i; j <= 100008; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
        }
        for (int i = X; i <= 100008; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
``` 
