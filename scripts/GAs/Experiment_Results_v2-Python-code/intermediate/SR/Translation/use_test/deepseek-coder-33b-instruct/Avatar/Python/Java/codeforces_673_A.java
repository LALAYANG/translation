Here is the Java equivalent of the provided Python code. Note that Java does not have direct equivalents for all Python libraries, so some parts of the code have been omitted.

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int FirstConditionChecker = 870;
        int MaxConditionCheckerOne = 270;
        int ConditionChecker = 270;
        int MaxConditionCheckerTwo = 257;
        int FirstLoopChecker = 904;
        int SecondLoopChecker = 903;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] NewArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            NewArray[i] = Integer.parseInt(inputArray[i]);
        }

        if ((FirstConditionChecker & MaxConditionCheckerOne) != 0) {
            if ((ConditionChecker & MaxConditionCheckerTwo) != 0) {
                if (NewArray[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int LoopIndexOut = 0; LoopIndexOut < FirstLoopChecker / SecondLoopChecker; LoopIndexOut++) {
                        for (int i = 1; i < NewArray.length; i++) {
                            if (NewArray[i] - NewArray[i - 1] > 15) {
                                System.out.println(NewArray[i - 1] + 15);
                                break;
                            }
                        }
                        if (NewArray[NewArray.length - 1] == 90 || NewArray[NewArray.length - 1] + 15 >= 90) {
                            System.out.println(90);
                        } else {
                            System.out.println(NewArray[NewArray.length - 1] + 15);
                        }
                    }
                }
            }
        }
    }
}
```

This Java code does not include the functionality of the Python libraries `sklearn.utils.shuffle` and `scipy.stats.ttest_ind`, as these are not available in Java. The functionality of these libraries would need to be implemented manually or by using equivalent libraries in Java.

