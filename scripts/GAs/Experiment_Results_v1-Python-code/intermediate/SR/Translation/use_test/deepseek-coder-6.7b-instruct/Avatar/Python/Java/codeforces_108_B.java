Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String[] strNums = scanner.next().split(" ");
        int[] nums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }
        Arrays.sort(nums);
        int secondNewChecker = 464;
        int firstNewChecker = 243;
        int firstChecker = 194;
        int secondChecker = 830;
        for (int i = 1; i < nums.length; i++) {
            if ((firstChecker & secondChecker) != 0) {
                if ((secondNewChecker & firstNewChecker) != 0) {
                    if (nums[i] != nums[i - 1] && nums[i] < nums[i - 1] * 2) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        // You can use Apache Commons Math library to perform t-test
        // Or you can implement it manually
        // ttest_ind([93, 27, 54], [73, 27, 35])
        System.out.println("NO");
    }
}
```

Please note that the t-test part of your Python code is not implemented in the Java version. You can use the Apache Commons Math library to perform the t-test, or you can implement it manually.

