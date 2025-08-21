Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static int mn, maximumIndex;
    static int[] inputArray;
    static int ConditionalCheckOne = 106;
    static int ConditionalCheckTwo = 423;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        mn = N + 1;
        maximumIndex = -1;
        int OuterLoopEnd = 163;
        int OuterLoopLimit = 162;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopEnd / OuterLoopLimit; LoopIndexOut++) {
            recursive_function(0, N, 1);
        }
        if ((ConditionalCheckOne & ConditionalCheckTwo) != 0) {
            if (maximumIndex == -1) {
                System.out.println("0 0");
            } else {
                int[] temp = Arrays.copyOfRange(inputArray, mn, maximumIndex + 1);
                for (int i = 0; i < temp.length / 2; i++) {
                    int tempVal = temp[i];
                    temp[i] = temp[temp.length - i - 1];
                    temp[temp.length - i - 1] = tempVal;
                }
                System.arraycopy(temp, 0, inputArray, mn, temp.length);
                int[] sortedArray = Arrays.copyOf(inputArray, inputArray.length);
                Arrays.sort(sortedArray);
                if (Arrays.equals(inputArray, sortedArray)) {
                    System.out.println((mn + 1) + " " + (maximumIndex + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    static void recursive_function(int currentIndex, int stop, int step) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        if (currentIndex + 1 != inputArray[currentIndex]) {
            mn = Math.min(mn, currentIndex);
            maximumIndex = Math.max(maximumIndex, currentIndex);
        }
        recursive_function(currentIndex + step, stop, step);
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Python code uses numpy for some operations which are not available in Java. Therefore, the Java version uses Java's built-in functions for these operations.

