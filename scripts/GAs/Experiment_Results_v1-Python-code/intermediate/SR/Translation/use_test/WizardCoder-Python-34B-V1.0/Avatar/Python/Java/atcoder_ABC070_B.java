```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int conditionCheckerThree = 858;
        int conditionCheckerFive = 55;
        int binaryConditionCheckerTwo = 701;
        int binaryConditionCheckerFour = 632;
        int binaryConditionCheckerOne = 505;
        int binaryConditionCheckerSix = 257;
        int[] inputNumbers = new Scanner(System.in).nextLine().split("\\s+").mapToInt(Integer::parseInt).toArray();
        if ((conditionCheckerThree & conditionCheckerFive) != 0) {
            if ((binaryConditionCheckerTwo & binaryConditionCheckerFour) != 0) {
                if ((binaryConditionCheckerOne & binaryConditionCheckerSix) != 0) {
                    if (inputNumbers[1] <= inputNumbers[2] || inputNumbers[3] <= inputNumbers[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(inputNumbers);
                        System.out.println(inputNumbers[2] - inputNumbers[1]);
                    }
                }
            }
        }
    }
}
```

Test input:
0 50 50 100

Expected output:
0 
