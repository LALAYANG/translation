```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplier = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int firstCondition = 933;
        int thirdCondition = 730;
        int secondCondition = 533;
        int fourthCondition = 643;
        if ((firstCondition & thirdCondition) != 0) {
            if ((secondCondition & fourthCondition) != 0) {
                if (1 <= multiplier && w <= 1000) {
                    int total = 0;
                    int innerLoopLimit = 994;
                    int outerLoopLimit = 993;
                    for (int LoopIndexOut = 0; LoopIndexOut < innerLoopLimit / outerLoopLimit; LoopIndexOut++) {
                        for (int i = 1; i <= w; i++) {
                            total += calculateProduct(i, multiplier);
                        }
                    }
                    if (total > n) {
                        System.out.println(total - n);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
    }

    public static int calculateProduct(int i, int multiplier) {
        return i * multiplier;
    }
}
```

Please note that the Java code is not exactly the same as the Python code. The Python code uses bitwise AND (&) to check if two conditions are true, but in Java, we need to use bitwise AND (&) with a non-zero number to check if the condition is true. Also, the Python code uses the input() function to get the input, but in Java, we need to use the Scanner class to get the input.

