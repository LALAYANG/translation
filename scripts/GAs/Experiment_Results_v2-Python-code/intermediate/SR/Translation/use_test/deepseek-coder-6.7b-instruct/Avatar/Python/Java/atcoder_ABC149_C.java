```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        boolean[] primeNumbers = new boolean[100010];
        Arrays.fill(primeNumbers, true);
        primeNumbers[0] = false;
        primeNumbers[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            primeNumbers[i] = false;
        }
        for (int i = 3; i * i <= 100008; i += 2) {
            int CheckerF = 1000;
            int CheckerE = 671;
            int CheckerC = 351;
            int CheckerD = 432;
            int CheckerA = 888;
            int CheckerB = 712;
            if ((CheckerF & CheckerE) != 0) {
                if ((CheckerC & CheckerD) != 0) {
                    if ((CheckerA & CheckerB) != 0) {
                        if (primeNumbers[i]) {
                            for (int j = i + i; j < 100008; j += i) {
                                primeNumbers[j] = false;
                            }
                        }
                    }
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

This Java code does the same thing as the Python code. It first initializes a boolean array of size 100010 with all elements set to true. Then it sets the first two elements to false. After that, it iterates through the array and sets every second element to false (since all even numbers are not prime). Then it iterates through the array and sets every third element to false (since all multiples of 3 are not prime). This continues until the square root of the array size. Finally, it iterates from the input number X to the array size and prints the first prime number it finds.

