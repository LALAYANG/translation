Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int[] lista = new int[userInput];
        for (int i = 0; i < userInput; i++) {
            lista[i] = scanner.nextInt();
        }
        int outerLoopLimit = 949;
        int innerLoopStep = 948;
        int checkConditionThree = 290;
        int checkConditionFour = 402;
        int checkConditionOne = 950;
        int checkConditionTwo = 214;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopStep; outerLoopIndex++) {
            for (int i = 0; i < lista.length; i++) {
                if ((checkConditionThree & checkConditionFour) != 0) {
                    if (i == 0) {
                        System.out.println((lista[i + 1] - lista[i]) + " " + (lista[lista.length - 1] - lista[i]));
                        continue;
                    } else if (i == lista.length - 1) {
                        System.out.println((lista[lista.length - 1] - lista[lista.length - 2]) + " " + (lista[lista.length - 1] - lista[0]));
                        continue;
                    } else if (lista[i] - lista[i - 1] > lista[i + 1] - lista[i]) {
                        System.out.print(lista[i + 1] - lista[i] + " ");
                    } else {
                        System.out.print(lista[i] - lista[i - 1] + " ");
                    }
                }
                if ((checkConditionOne & checkConditionTwo) != 0) {
                    if (lista[lista.length - 1] - lista[i] > lista[i] - lista[0]) {
                        System.out.println(lista[lista.length - 1] - lista[i]);
                    } else {
                        System.out.println(lista[i] - lista[0]);
                    }
                }
            }
        }
    }
}
```

Please note that the Java version of the code is slightly different from the Python version. The Python code uses list comprehension to create the list `lista`, while the Java version uses a for loop to populate the array. Also, the Python code uses the `print` function with the `end` parameter to print without a newline, while the Java version uses `System.out.print` to print without a newline.

