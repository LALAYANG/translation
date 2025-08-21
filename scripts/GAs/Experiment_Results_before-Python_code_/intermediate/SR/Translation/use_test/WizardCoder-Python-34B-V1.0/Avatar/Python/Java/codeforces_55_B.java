```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        String[] operations = new String[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next();
        }
        int[] ans = {1000000000000};
        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }

    public static void rememberTheNumber(int[] nums, int i, String[] operations, int[] ans) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 3; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int s = nums[j];
                    int t = nums[k];
                    nums[j] = -1;
                    if (operations[i].equals("+")) {
                        nums[k] = s + t;
                    } else if (operations[i].equals("*")) {
                        nums[k] = s * t;
                    }
                    if (i == 2 && nums[k] < ans[0]) {
                        ans[0] = nums[k];
                    }
                    rememberTheNumber(nums, i + 1, operations, ans);
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
* * +

Expected output:
9990000 
