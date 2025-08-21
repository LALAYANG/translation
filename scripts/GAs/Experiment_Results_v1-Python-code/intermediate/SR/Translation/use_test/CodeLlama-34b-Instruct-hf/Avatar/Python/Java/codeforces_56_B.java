```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }

        int firstCondition = 586;
        int secondCondition = 475;
        int mn = arraySize + 1;
        int mx = -1;

        for (int i = 0; i < arraySize; i++) {
            if (inputArray[i] != i + 1) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }

        if (firstCondition & secondCondition) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                inputArray = Arrays.copyOfRange(inputArray, 0, mn);
                inputArray = Arrays.copyOfRange(inputArray, mn, mx + 1);
                inputArray = Arrays.copyOfRange(inputArray, mx + 1, arraySize);
                if (Arrays.equals(inputArray, Arrays.sort(inputArray))) {
                    System.out.println(mn + 1 + " " + mx + 1);
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution, and there may be better ways to solve the problem.
