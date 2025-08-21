```java
import java.util.Scanner;

public class RecursiveCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next();
        }
        int[] min_result = new int[1];
        min_result[0] = 1000000000000;
        try {
            int check_one = 385;
            int check_two = 913;
            int check_three = 523;
            int check_four = 736;
            if ((check_one & check_two) != 0) {
                if ((check_three & check_four) != 0) {
                    recursive_calculate(nums, 0, operations, min_result);
                }
            }
        } catch (Exception e) {
            // pass
        }
        System.out.println(min_result[0]);
    }

    public static void recursive_calculate(int[] nums, int i, String[] operations, int[] min_result) {
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
                    if (i == 2 && nums[k] < min_result[0]) {
                        min_result[0] = nums[k];
                    }
                    recursive_calculate(nums, i + 1, operations, min_result);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }
}
```

Test input:
1000 1000 999 1000
* * *

Expected output:
999000000000 
