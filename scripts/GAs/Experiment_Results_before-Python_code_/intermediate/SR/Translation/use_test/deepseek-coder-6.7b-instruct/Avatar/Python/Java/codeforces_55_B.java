```java
import java.util.*;

public class Main {
    static long ans = Long.MAX_VALUE;
    static int[] nums;
    static char[] operations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        operations = scanner.nextLine().toCharArray();
        rememberTheNumber(0, 0);
        System.out.println(ans);
    }

    static void rememberTheNumber(int i, int last) {
        if (i >= 3)
            return;
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int s = nums[j];
                    nums[j] = -1;
                    int t = nums[k];
                    if (operations[i] == '+')
                        nums[k] = s + t;
                    else if (operations[i] == '*')
                        nums[k] = s * t;
                    if (i == 2 && nums[k] < ans)
                        ans = nums[k];
                    rememberTheNumber(i + 1, k);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the numbers and operations from the input, and then calls the `rememberTheNumber` method to perform the operations. The result is stored in the `ans` variable. The `rememberTheNumber` method is a recursive method that performs the operations and checks if the result is less than the current minimum. If it is, it updates the `ans` variable. The `main` method reads the input and calls `rememberTheNumber` with the appropriate parameters.

