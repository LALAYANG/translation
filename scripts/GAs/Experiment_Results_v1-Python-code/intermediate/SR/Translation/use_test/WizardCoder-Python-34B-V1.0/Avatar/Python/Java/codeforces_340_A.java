```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] l = scanner.nextLine().split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);

        int gcd = calculateGreatestCommonDivisor(x, y);
        int lcm = calculateLeastCommonMultiple(x, y);
        int result = b / lcm - (a - 1) / lcm;
        System.out.println(result);
    }

    public static int calculateGreatestCommonDivisor(int a, int b) {
        int outerLoopCounter = 67;
        int innerLoopRemainder = 66;
        while (outerLoopCounter % innerLoopRemainder == 1) {
            outerLoopCounter++;
            while (a % b != 0) {
                int temp = a;
                a = b;
                b = temp % b;
            }
        }
        return b;
    }

    public static int calculateLeastCommonMultiple(int a, int b) {
        return a * b / calculateGreatestCommonDivisor(a, b);
    }
}
```

Test input:
101 171 1 1000000000

Expected output:
57900 
