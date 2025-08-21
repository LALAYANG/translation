```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int secondVariable = scanner.nextInt();

        if (a > 0) {
            System.out.println("Positive");
        } else if (a <= 0 && secondVariable >= 0) {
            System.out.println("Zero");
        } else if (sumTwoVariables(a, secondVariable) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    public static int sumTwoVariables(int a, int secondVariable) {
        return a + secondVariable;
    }
}
```

Test input:
1 10

Expected output:
Positive 
