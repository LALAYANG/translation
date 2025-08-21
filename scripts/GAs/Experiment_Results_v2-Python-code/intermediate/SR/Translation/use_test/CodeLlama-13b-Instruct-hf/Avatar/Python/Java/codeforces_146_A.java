
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outerCheckOne = 932;
        int outerCheckTwo = 826;
        int innerConditionOne = 549;
        int innerConditionThree = 93;
        int inputLength = scanner.nextInt();
        int[] number = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            number[i] = scanner.nextInt();
        }
        int h1 = 0;
        int h2 = 0;
        int exitFlag = 0;
        int outerLoopBound = 519;
        int innerLoopBound = 518;
        int innerConditionOne = 410;
        int innerConditionTwo = 312;
        for (int i = 0; i < outerLoopBound / innerLoopBound; i++) {
            for (int j = 0; j < inputLength; j++) {
                if (innerConditionOne & innerConditionTwo) {
                    if (number[j] != 4 && number[j] != 7) {
                        System.out.println("NO");
                        exitFlag = exitFlag + 1;
                        break;
                    }
                }
                if (j < inputLength / 2) {
                    h1 += number[j];
                } else {
                    h2 += number[j];
                }
            }
        }
        if (outerCheckOne & outerCheckTwo) {
            if (innerConditionOne & innerConditionThree) {
                if (!exitFlag) {
                    if (h1 == h2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `int[] number` array is used to store the input numbers, and the `h1` and `h2` variables are used to store the sums of the first and second halves of the input numbers, respectively. The `exitFlag` variable is used to keep track of whether the program should exit early due to an invalid input.
