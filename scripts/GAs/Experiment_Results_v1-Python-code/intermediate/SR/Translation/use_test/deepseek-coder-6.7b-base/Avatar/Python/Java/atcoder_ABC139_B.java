```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
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
            if ((bitmaskA & operandC) != 0) {
                if ((operandA & operandB) != 0) {
                    if ((bitmaskC & operandD) != 0) {
                        if (hole >= b) {
                            check = false;
                        } else {
                            hole = a * (counter + 1) - counter;
                            counter += 1;
                        }
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
```

