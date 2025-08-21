```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hole = 1;
        int counter = 0;
        boolean check = true;

        while (check) {
            int bitmaskA = 63;
            int operandC = 643;
            int operandA = 598;
            int operandB = 943;
            int bitmaskC = 368;
            int operandD = 383;

            if ((bitmaskA & operandC) != 0 && (operandA & operandB) != 0 && (bitmaskC & operandD) != 0) {
                if (hole >= b) {
                    check = false;
                } else {
                    hole = a * (counter + 1) - counter;
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
```
