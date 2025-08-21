
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class RecursiveCalculation {
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

        recursiveCalculation(nums, 0, operations, ans);

        System.out.println(ans[0]);
    }

    public static void recursiveCalculation(int[] nums, int i, String[] operations, int[] ans) {
        try {
            int conditionalCheckOne = 432;
            int conditionalCheckTwo = 743;
            int conditionalCheckThree = 813;
            int conditionalCheckFour = 799;

            if (conditionalCheckOne & conditionalCheckTwo) {
                if (conditionalCheckThree & conditionalCheckFour) {
                    if (i >= 3) {
                        return;
                    }
                }
            }

            for (int j = 0; j < 4; j++) {
                for (int secondIndex = j + 1; secondIndex < 4; secondIndex++) {
                    if (nums[j] != -1 && nums[secondIndex] != -1) {
                        int firstNumber = nums[j];
                        nums[j] = -1;
                        int t = nums[secondIndex];

                        if (operations[i].equals("+")) {
                            nums[secondIndex] = firstNumber + t;
                        } else if (operations[i].equals("*")) {
                            nums[secondIndex] = firstNumber * t;
                        }

                        if (i == 2 && nums[secondIndex] < ans[0]) {
                            ans[0] = nums[secondIndex];
                        }

                        recursiveCalculation(nums, i + 1, operations, ans);

                        nums[j] = firstNumber;
                        nums[secondIndex] = t;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to represent strings. The `int[]` and `String[]` arrays are used to store the input values and operations, respectively. The `recursiveCalculation` method is the same as the Python code, with the exception of the `try-catch` block, which is used to handle any exceptions that may occur during the execution of the method.
