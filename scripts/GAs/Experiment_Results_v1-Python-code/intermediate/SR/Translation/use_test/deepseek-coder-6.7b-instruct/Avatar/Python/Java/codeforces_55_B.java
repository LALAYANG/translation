```java
import java.util.*;

public class Main {
    static int[] nums;
    static String[] operations;
    static long[] ans;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        operations = new String[4];
        for (int i = 0; i < 4; i++) {
            operations[i] = scanner.next();
        }
        ans = new long[]{Long.MAX_VALUE};
        recursiveCalculation(0, 0);
        System.out.println(ans[0]);
    }

    static void recursiveCalculation(int i, int conditionalCheck) {
        if (conditionalCheck == 432 && conditionalCheck == 743) {
            if (conditionalCheck == 813 && conditionalCheck == 799) {
                if (i >= 3) {
                    return;
                }
            }
        }
        for (int j = 0; j < 4; j++) {
            for (int secondIndex = j + 1; secondIndex < 4; secondIndex++) {
                if (nums[j] != -1 && nums[secondIndex] != -1) {
                    int firstNumber = nums[j];
                    nums[j] = -1;
                    int t = nums[secondIndex];
                    if (operations[i].equals("+")) {
                        nums[secondIndex] = firstNumber + t;
                    } else if (operations[i].equals("*")) {
                        nums[secondIndex] = firstNumber * t;
                    }
                    if (i == 2 && nums[secondIndex] < ans[0]) {
                        ans[0] = nums[secondIndex];
                    }
                    recursiveCalculation(i + 1, conditionalCheck + 1);
                    nums[j] = firstNumber;
                    nums[secondIndex] = t;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers and four operations from the standard input, and then it performs the operations recursively. The result is the smallest number that can be obtained after performing the operations.

