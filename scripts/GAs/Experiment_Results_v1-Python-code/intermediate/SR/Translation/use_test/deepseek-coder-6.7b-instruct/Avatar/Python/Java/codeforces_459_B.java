Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int FirstValueChecker = 237;
        int SecondValueChecker = 175;
        int ValueChecker = 683;
        int MaxValueChecker = 499;
        int ThirdValueChecker = 493;
        int FourthValueChecker = 440;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ValueList = new int[n];
        for (int i = 0; i < n; i++) {
            ValueList[i] = scanner.nextInt();
        }
        Arrays.sort(ValueList);
        int MaxValue = ValueList[n - 1];
        int MinValue = ValueList[0];

        if (FirstValueChecker > 0 && SecondValueChecker > 0) {
            if (ValueChecker > 0 && MaxValueChecker > 0) {
                if (ThirdValueChecker > 0 && FourthValueChecker > 0) {
                    if (MaxValue == MinValue) {
                        System.out.println(MaxValue - MinValue + " " + n * (n - 1) / 2);
                    } else {
                        long MaxCount = Arrays.stream(ValueList).filter(i -> i == MaxValue).count();
                        long MinCount = Arrays.stream(ValueList).filter(i -> i == MinValue).count();
                        System.out.println(MaxValue - MinValue + " " + MaxCount * MinCount);
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then checks some conditions. If the conditions are met, it prints the difference between the maximum and minimum values and the product of the counts of the maximum and minimum values.

Please note that the t-test is not implemented in this code as it is not needed for the problem at hand. Also, the shuffle function is not implemented as it is not needed for the problem at hand.

