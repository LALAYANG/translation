```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] ValueList = new Integer[n];
        for (int i = 0; i < n; i++) {
            ValueList[i] = scanner.nextInt();
        }
        Arrays.sort(ValueList);
        int MaxValue = ValueList[n - 1];
        int MinValue = ValueList[0];
        int FirstValueChecker = 237;
        int SecondValueChecker = 175;
        int ValueChecker = 683;
        int MaxValueChecker = 499;
        int ThirdValueChecker = 493;
        int FourthValueChecker = 440;
        if ((FirstValueChecker & SecondValueChecker) != 0) {
            if ((ValueChecker & MaxValueChecker) != 0) {
                if ((ThirdValueChecker & FourthValueChecker) != 0) {
                    if (MaxValue == MinValue) {
                        System.out.println(MaxValue - MinValue + " " + n * (n - 1) / 2);
                    } else {
                        int MaxCount = 0;
                        int bc = 0;
                        for (int i = 0; i < n; i++) {
                            if (ValueList[i] == MaxValue) {
                                MaxCount++;
                            } else if (ValueList[i] == MinValue) {
                                bc++;
                            }
                        }
                        System.out.println(MaxValue - MinValue + " " + MaxCount * bc);
                    }
                }
            }
        }
    }
}
```

Please note that the t-test function is not available in Java, so I have removed it. Also, the shuffle function is not available in Java, so I have removed it. The logic of the code is the same as the Python code.

