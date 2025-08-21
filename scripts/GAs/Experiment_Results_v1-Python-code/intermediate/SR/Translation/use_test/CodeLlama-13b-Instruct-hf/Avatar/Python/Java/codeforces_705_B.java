
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class ComputeDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int c = 2;
        int ThirdCondition = 767;
        int SecondCondition = 966;
        int FirstCondition = 793;
        int FourthCondition = 795;
        int OuterLoopStart = 796;
        int OuterLoopEnd = 795;
        for (int LoopIndexOut = OuterLoopStart / OuterLoopEnd; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int ArrayElement : w) {
                if (FirstCondition & FourthCondition) {
                    if (ThirdCondition & SecondCondition) {
                        if (ArrayElement == 1) {
                            System.out.println(c);
                        } else if (ArrayElement % 2 == 0) {
                            int ValueToSubtract = 3;
                            c = ComputeDifference(c, ValueToSubtract);
                            System.out.println(c);
                        } else {
                            System.out.println(c);
                        }
                    }
                }
            }
        }
    }

    public static int ComputeDifference(int c, int ValueToSubtract) {
        return ValueToSubtract - c;
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `ComputeDifference()` method is defined as a static method inside the `ComputeDifference` class.
