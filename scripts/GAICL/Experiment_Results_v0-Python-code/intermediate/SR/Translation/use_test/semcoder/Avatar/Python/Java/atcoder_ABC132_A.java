```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        int checkValue = 274;
        int conditionValue = 956;

        if ((checkValue & conditionValue) != 0) {
            if (inputString.length() != 2) {
                System.out.println("No");
                return;
            }
        }

        int loopBound = 412;
        int loopStep = 411;

        // Recursive function to check conditions
        recursiveCheck(0, loopBound / loopStep, 1);

        System.out.println("Yes");
    }

    private static void recursiveCheck(int loopIndexOut, int stop, int step) {
        // Placeholder for shuffle function

        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }

        // Placeholder for loop logic

        recursiveCheck(loopIndexOut + step, stop, step);
    }
}
```
