Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeSize = scanner.nextInt();
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int first_condition = 58;
        int second_condition = 194;
        List<String> cake = new ArrayList<>();
        for (int index = 0; index < cakeSize; index++) {
            String line = scanner.next();
            cake.add(line);
            for (char j : line.toCharArray()) {
                if (j == 'C') {
                    chocCount++;
                }
            }
            if ((first_condition & second_condition) != 0) {
                if (chocCount > 1) {
                    recursiveChocolateFactorial(chocCount, chocCount - 2, -1);
                    happiness += nfat / 2;
                }
            }
            nfat = 1;
            chocCount = 0;
        }
        chocCount = 0;
        for (int j = 0; j < cakeSize; j++) {
            for (int index = 0; index < cakeSize; index++) {
                if (cake.get(index).charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int index = chocCount; index > chocCount - 2; index--) {
                    nfat *= index;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }

    private static void recursiveChocolateFactorial(int index, int stop, int step) {
        int nfat = 1;
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return;
        }
        nfat *= index;
        recursiveChocolateFactorial(index + step, stop, step);
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. You may need to implement it yourself or find an equivalent library in Java.

Also, the `my_decorator` function is not used in the Java version. It's not necessary in Java as Java does not support decorators like Python.

