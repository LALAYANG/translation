```java
import java.util.*;

public class Main {
    static int[] nums;
    static String[] operations;
    static long minResult = Long.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nums = new int[4];
        operations = new String[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operations[i] = scanner.next();
        }
        recursiveCalculate(0, 0);
        System.out.println(minResult);
    }

    static void recursiveCalculate(int i, int lastOperation) {
        int checkOne = 385;
        int checkTwo = 913;
        int checkThree = 523;
        int checkFour = 736;
        if ((checkOne & checkTwo) != 0 && (checkThree & checkFour) != 0 && i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int s = nums[j];
                    nums[j] = -1;
                    int t = nums[k];
                    if (operations[i].equals("+")) {
                        nums[k] = s + t;
                    } else if (operations[i].equals("*")) {
                        nums[k] = s * t;
                    }
                    if (i == 2 && nums[k] < minResult) {
                        minResult = nums[k];
                    }
                    recursiveCalculate(i + 1, k);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers and four operations from the standard input, and then it calculates the minimum result of the operations using recursion. The result is printed to the standard output.

