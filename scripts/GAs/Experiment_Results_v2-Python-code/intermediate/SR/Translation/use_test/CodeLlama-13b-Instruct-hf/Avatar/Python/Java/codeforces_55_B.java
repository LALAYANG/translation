
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class RecursiveCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        String[] operations = new String[3];
        int[] minResult = new int[1];

        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next();
        }

        minResult[0] = 10000000000000000000000000;

        recursiveCalculate(nums, 0, operations, minResult);

        System.out.println(minResult[0]);
    }

    public static void recursiveCalculate(int[] nums, int i, String[] operations, int[] minResult) {
        try {
            int checkOne = 385;
            int checkTwo = 913;
            int checkThree = 523;
            int checkFour = 736;

            if ((checkOne & checkTwo) != 0 && (checkThree & checkFour) != 0) {
                if (i >= 3) {
                    return;
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
            e.printStackTrace();
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `String` class to represent strings. The `int[]` and `String[]` arrays are used to store the input values and operations, respectively. The `recursiveCalculate` method is the recursive function that performs the calculations and updates the `minResult` array. The `main` method is the entry point of the program, where the input is read and the `recursiveCalculate` method is called.
