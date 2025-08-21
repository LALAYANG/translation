Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int[] lista = new int[inp];
        for (int i = 0; i < inp; i++) {
            lista[i] = scanner.nextInt();
        }
        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < lista.length; i++) {
                if ((firstConditionChecker & secondConditionChecker) != 0) {
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
                if ((thirdConditionChecker & fourthConditionChecker) != 0) {
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

Please note that the Java version of the code is slightly different from the Python version. The Python code uses list comprehension to create the `lista` list, while the Java version uses a for loop to populate the `lista` array. Also, the Python code uses the `print` function with the `end` parameter to control the end of the printed line, while the Java version uses the `System.out.print` method to print without a newline.

