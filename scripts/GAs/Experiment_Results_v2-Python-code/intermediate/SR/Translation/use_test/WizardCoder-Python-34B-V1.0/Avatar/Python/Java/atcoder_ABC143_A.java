```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_one = 594;
        int condition_two = 455;
        int operand_one, operand_two;
        Scanner scanner = new Scanner(System.in);
        operand_one = scanner.nextInt();
        operand_two = scanner.nextInt();
        int multiplier = 2;
        int ans = calculate(operand_one, multiplier, operand_two);
        if ((condition_one & condition_two) != 0) {
            if (ans < 0) {
                ans = 0;
            }
            System.out.println(ans);
        }
    }

    public static int calculate(int operand_one, int multiplier, int operand_two) {
        return operand_one - multiplier * operand_two;
    }
}
```

Test input:
79 6

Expected output:
67 
