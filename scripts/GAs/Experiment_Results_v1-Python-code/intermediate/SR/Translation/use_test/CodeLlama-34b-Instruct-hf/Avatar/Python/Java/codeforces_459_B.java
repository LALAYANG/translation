```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ValueList = new int[n];
        for (int i = 0; i < n; i++) {
            ValueList[i] = sc.nextInt();
        }
        Arrays.sort(ValueList);
        int MaxValue = ValueList[n - 1];
        int MinValue = ValueList[0];
        if (FirstValueChecker & SecondValueChecker) {
            if (ValueChecker & MaxValueChecker) {
                if (ThirdValueChecker & FourthValueChecker) {
                    if (MaxValue == MinValue) {
                        System.out.println(MaxValue - MinValue + " " + n * (n - 1) / 2);
                    } else {
                        int MaxCount = 0;
                        int bc = 0;
                        for (int i = 0; i < n; i++) {
                            if (ValueList[i] == MaxValue) {
                                MaxCount++;
                            }
                            if (ValueList[i] == MinValue) {
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
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Arrays.sort()` method to sort the input array. The `FirstValueChecker`, `SecondValueChecker`, `ValueChecker`, `MaxValueChecker`, `ThirdValueChecker`, and `FourthValueChecker` variables are not used in the Java code, as they are not defined in the Python code you provided.
