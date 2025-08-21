
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class RememberTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        int[] ans = new int[1];

        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next();
        }

        ans[0] = 10000000000000000000000000;

        rememberTheNumber(nums, 0, operations, ans);

        System.out.println(ans[0]);
    }

    public static void rememberTheNumber(int[] nums, int i, String[] operations, int[] ans) {
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to represent strings. The `rememberTheNumber` method is a recursive method that takes an array of integers, an array of strings, and an array of integers as input, and returns an array of integers as output. The method uses a `for` loop to iterate over the input arrays, and a `if` statement to check if the current element is a valid operation. If it is, the method uses the `equals` method to check if the operation is "+" or "*", and performs the corresponding operation on the two numbers. The method then calls itself recursively with the updated arrays.
