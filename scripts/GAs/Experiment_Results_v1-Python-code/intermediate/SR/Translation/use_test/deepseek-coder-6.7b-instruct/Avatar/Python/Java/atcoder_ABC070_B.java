Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumbers = new int[4];
        for (int i = 0; i < 4; i++) {
            inputNumbers[i] = scanner.nextInt();
        }

        if (conditionCheckerThree(858) && conditionCheckerFive(55)) {
            if (binaryConditionCheckerTwo(701) && binaryConditionCheckerFour(632)) {
                if (binaryConditionCheckerOne(505) && binaryConditionCheckerSix(257)) {
                    if (inputNumbers[1] <= inputNumbers[2] || inputNumbers[3] <= inputNumbers[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(inputNumbers);
                        System.out.println(inputNumbers[2] - inputNumbers[1]);
                    }
                }
            }
        }
        scanner.close();
    }

    public static boolean conditionCheckerThree(int num) {
        // Implement your condition checker logic here
        return true;
    }

    public static boolean conditionCheckerFive(int num) {
        // Implement your condition checker logic here
        return true;
    }

    public static boolean binaryConditionCheckerTwo(int num) {
        // Implement your condition checker logic here
        return true;
    }

    public static boolean binaryConditionCheckerFour(int num) {
        // Implement your condition checker logic here
        return true;
    }

    public static boolean binaryConditionCheckerOne(int num) {
        // Implement your condition checker logic here
        return true;
    }

    public static boolean binaryConditionCheckerSix(int num) {
        // Implement your condition checker logic here
        return true;
    }
}
```

Please note that the t-test and shuffle functions from scipy and sklearn libraries are not available in Java. The t-test function is not used in the provided Python code, so it was removed. The shuffle function is not used in the provided Python code either, so it was also removed.

The conditionCheckerThree, conditionCheckerFive, binaryConditionCheckerTwo, binaryConditionCheckerFour, binaryConditionCheckerOne, and binaryConditionCheckerSix methods are placeholders and should be implemented according to your specific conditions.

