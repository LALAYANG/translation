Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = scanner.nextInt();
        }
        int a = 1;
        int pos = 0;
        int conditionCheckerBeginning = 338;
        int conditionCheckerMiddle = 957;
        int conditionCheckerOneTen = 918;
        int newConditionCheckerThird = 239;
        int newConditionCheckerFirst = 261;
        int newConditionCheckerSecond = 605;
        for (int i = 1; i < N; i++) {
            if ((newConditionCheckerFirst & newConditionCheckerSecond) != 0) {
                if ((conditionCheckerOneTen & newConditionCheckerThird) != 0) {
                    if ((conditionCheckerBeginning & conditionCheckerMiddle) != 0) {
                        if (n[pos] > n[i]) {
                            a = a + 1;
                            pos = i;
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}
```

Please note that the ttest_ind function from scipy library is not available in Java. It's a statistical test that is used to compare the means of two groups. In the provided Python code, it's not used, so I removed it.

Also, please note that the bitwise AND operator (&) in Java is equivalent to the bitwise AND operator (&) in Python. The bitwise AND operator compares each bit of the first operand to the corresponding bit of the second operand. If both bits are 1, the corresponding result bit is set to 1. Otherwise, the corresponding result bit is set to 0.

