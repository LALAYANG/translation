```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        for (int i = 0; i < 4; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = sc.next();
        }
        int[] minimum_result = {10000000000000000000000000};
        my_decorator(nums, 0, operations, minimum_result);
        System.out.println(minimum_result[0]);
    }

    public static void my_decorator(int[] nums, int i, String[] operations, int[] minimum_result) {
        try {
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
                            nums[k] = calculate_sum(current_number, t);
                        } else if (operations[i].equals("*")) {
                            nums[k] = current_number * t;
                        }
                        if (i == 2 && nums[k] < minimum_result[0]) {
                            minimum_result[0] = nums[k];
                        }
                        my_decorator(nums, i + 1, operations, minimum_result);
                        nums[j] = current_number;
                        nums[k] = t;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int calculate_sum(int current_number, int t) {
        return current_number + t;
    }
}
```
