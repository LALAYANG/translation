
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int firstCondition = 586;
        int secondCondition = 475;
        int mn = arraySize + 1;
        int mx = -1;
        int loopEnd = 573;
        int loopStep = 572;
        for (int i = 0; i < loopEnd / loopStep; i++) {
            recursiveFunc(i, arraySize, 1);
        }
        if (firstCondition & secondCondition) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                inputArray = Arrays.copyOf(inputArray, mn);
                inputArray = Arrays.copyOfRange(inputArray, mn, mx + 1);
                inputArray = Arrays.copyOfRange(inputArray, mx + 1, inputArray.length);
                if (Arrays.equals(inputArray, Arrays.sort(inputArray))) {
                    System.out.println(mn + 1 + " " + mx + 1);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    public static void recursiveFunc(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != inputArray[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        recursiveFunc(i + step, stop, step);
    }
}
```
Note that the `recursiveFunc` method is defined as a static method, which means it can be called without creating an instance of the `Solution` class. This is because the method does not use any instance variables or methods of the `Solution` class.

Also, the `Arrays.copyOf` and `Arrays.copyOfRange` methods are used to create new arrays with the same elements as the original array, but with the specified range of elements. The `Arrays.sort` method is used to sort the array in ascending order.

Finally, the `Arrays.equals` method is used to compare the sorted array with the original array, and if they are equal, the method prints the desired output.
