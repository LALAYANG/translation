Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "10010010";
        char[] inputChars = input.toCharArray();
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < inputChars.length; i++) {
            if (i % 2 == 0) {
                if (inputChars[i] == '0') {
                    evenCount++;
                }
            } else {
                if (inputChars[i] == '1') {
                    oddCount++;
                }
            }
        }

        System.out.println(Math.min(inputChars.length - calculateSum(evenCount, oddCount), inputChars.length - (evenCount + oddCount)));
    }

    public static int calculateSum(int a, int b) {
        return sumIndirect(a, b);
    }

    public static int sumIndirect(int a, int b) {
        return sumFwd2(a, b);
    }

    public static int sumFwd2(int a, int b) {
        return sumFwd(a, b);
    }

    public static int sumFwd(int a, int b) {
        return sumValues(a, b);
    }

    public static int sumValues(int a, int b) {
        return a + b;
    }
}
```

Please note that the Java code does not include the functionality of the Python code that uses `scipy.stats.ttest_ind` and `sklearn.utils.shuffle`. These are statistical and machine learning libraries in Python, and do not have direct equivalents in Java.

