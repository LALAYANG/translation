Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> list1 = Arrays.asList(4, 92, 9);
        List<Integer> list2 = Arrays.asList(19, 58, 1);
        Collections.shuffle(list1);
        Collections.shuffle(list2);
        int innerLoopLimit = 159;
        int outerLoopLimit = 158;
        int initialConditionCheck = 368;
        int quinaryConditionCheck = 898;
        int tertiaryConditionCheck = 592;
        int quaternaryConditionCheck = 78;
        int primaryConditionCheck = 96;
        int secondaryConditionCheck = 717;
        for (int outerLoopCounter = 0; outerLoopCounter < innerLoopLimit / outerLoopLimit; outerLoopCounter++) {
            for (int innerLoopCounter = inputNumber; innerLoopCounter > 0; innerLoopCounter--) {
                if ((primaryConditionCheck & secondaryConditionCheck) != 0) {
                    if ((tertiaryConditionCheck & quaternaryConditionCheck) != 0) {
                        if ((initialConditionCheck & quinaryConditionCheck) != 0) {
                            if (inputNumber % innerLoopCounter == 0) {
                                inputNumber = innerLoopCounter;
                                System.out.print(innerLoopCounter + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers, and the `sklearn.utils.shuffle` function to shuffle the lists. These functions are not available in Java, so they have been replaced with `Collections.shuffle`. The `input` function in Python is replaced with `Scanner` in Java. The `print` function in Python with `end=' '` is replaced with `System.out.print` in Java. The `&` operator in Python is replaced with `&` in Java. The `//` operator in Python is replaced with `/` in Java. The `%` operator in Python is replaced with `%` in Java.

