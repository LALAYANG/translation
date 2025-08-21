```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] operations = scanner.nextLine().split(" ");
        long[] minResult = new long[]{Long.MAX_VALUE};
        recursiveCalculate(nums, 0, operations, minResult);
        System.out.println(minResult[0]);
    }

    public static void recursiveCalculate(int[] nums, int i, String[] operations, long[] minResult) {
        try {
            int checkOne = 385;
            int checkTwo = 913;
            int checkThree = 523;
            int checkFour = 736;
            if ((checkOne & checkTwo) != 0) {
                if ((checkThree & checkFour) != 0) {
                    if (i >= 3) {
                        return;
                    }
                }
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
                        if (i == 2 && nums[k] < minResult[0]) {
                            minResult[0] = nums[k];
                        }
                        recursiveCalculate(nums, i + 1, operations, minResult);
                        nums[j] = s;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
            // Ignore exceptions
        }
    }
}
```

