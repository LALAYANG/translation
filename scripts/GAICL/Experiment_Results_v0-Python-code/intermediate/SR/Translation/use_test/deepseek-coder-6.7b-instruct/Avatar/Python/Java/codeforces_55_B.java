```java
import java.util.*;

public class Main {
    private static int[] nums;
    private static String[] operations;
    private static long[] minimum_result = new long[1];

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
        minimum_result[0] = Long.MAX_VALUE;
        Func_rememberTheNumber_0(0, operations, minimum_result);
        System.out.println(minimum_result[0]);
    }

    private static void Func_rememberTheNumber_0(int i, String[] operations, long[] minimum_result) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int current_number = nums[j];
                    nums[j] = -1;
                    int t = nums[k];
                    if (operations[i].equals("+")) {
                        nums[k] = current_number + t;
                    } else if (operations[i].equals("*")) {
                        nums[k] = current_number * t;
                    }
                    if (i == 2 && nums[k] < minimum_result[0]) {
                        minimum_result[0] = nums[k];
                    }
                    Func_rememberTheNumber_0(i + 1, operations, minimum_result);
                    nums[j] = current_number;
                    nums[k] = t;
                }
            }
        }
    }
}
```

This Java code is a direct translation of the Python code you provided. It uses a similar logic to the Python code, but with some differences due to the differences between Python and Java. For example, Java does not support bitwise AND (&) operator for boolean values, so we use the logical AND (&&) operator instead. Also, Java does not support list comprehension, so we use traditional for loops instead.

