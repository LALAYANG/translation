Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int[] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = scanner.nextInt();
        }
        int minValue = Arrays.stream(values).min().getAsInt();
        System.out.println(Math.ceil(decoratedDivision(inputNumber, minValue)) + 4);
    }

    public static double divisionOperation(int arg0, int arg1) {
        return (double)arg0 / arg1;
    }

    public static double divAlias(int arg0, int arg1) {
        return divisionOperation(arg0, arg1);
    }

    public static double divisionFunc(int arg0, int arg1) {
        return divAlias(arg0, arg1);
    }

    public static double myDecorator(double func) {
        return func;
    }

    public static double decoratedDivision(int a, int b) {
        return myDecorator(divisionFunc(a, b));
    }
}
```

Please note that Java does not support decorators like Python. Therefore, the decorator function `my_decorator` is not included in the Java code. Also, the `shuffle` and `ttest_ind` functions from the `sklearn.utils` and `scipy.stats` libraries are not included in the Java code as they are not part of the standard Java library.

