Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int calculateSum(int currentNumber, int t) {
        return currentNumber + t;
    }

    static int myDecorator(int[] nums, int i, String[] operations, int[] minimumResult) {
        return Func_rememberTheNumber_0(nums, i, operations, minimumResult);
    }

    static int Func_rememberTheNumber_0(int[] nums, int i, String[] operations, int[] minimumResult) {
        int check1 = 633;
        int check2 = 538;
        if ((check1 & check2) != 0) {
            if (i >= 3) {
                return 0;
            }
            for (int j = 0; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (nums[j] != -1 && nums[k] != -1) {
                        int currentNumber = nums[j];
                        nums[j] = -1;
                        int t = nums[k];
                        if (operations[i].equals("+")) {
                            nums[k] = calculateSum(currentNumber, t);
                        } else if (operations[i].equals("*")) {
                            nums[k] = currentNumber * t;
                        }
                        if (i == 2 && nums[k] < minimumResult[0]) {
                            minimumResult[0] = nums[k];
                        }
                        Func_rememberTheNumber_0(nums, i + 1, operations, minimumResult);
                        nums[j] = currentNumber;
                        nums[k] = t;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] operations = scanner.nextLine().split(" ");
        int[] minimumResult = {1000000000};
        myDecorator(nums, 0, operations, minimumResult);
        System.out.println(minimumResult[0]);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function, which is not available in Java. I have removed the usage of this function in the Java code.

