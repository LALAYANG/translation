```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        String[] operations = new String[3];
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next();
        }
        long minResult = Long.MAX_VALUE;
        recursiveCalculate(nums, 0, operations, minResult);
        System.out.println(minResult);
    }

    public static void recursiveCalculate(int[] nums, int i, String[] operations, long minResult) {
        if (i >= 3) {
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
                    recursiveCalculate(nums, i + 1, operations, minResult);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }
}
```

