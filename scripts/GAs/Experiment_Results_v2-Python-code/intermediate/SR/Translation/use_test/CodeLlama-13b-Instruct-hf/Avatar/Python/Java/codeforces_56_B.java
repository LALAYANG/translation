
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int mn = N + 1;
        int maximumIndex = -1;
        for (int i = 0; i < N; i++) {
            if (inputArray[i] != i + 1) {
                mn = Math.min(mn, i);
                maximumIndex = Math.max(maximumIndex, i);
            }
        }
        if (maximumIndex == -1) {
            System.out.println("0 0");
        } else {
            inputArray = Arrays.copyOf(inputArray, mn);
            inputArray = Arrays.copyOfRange(inputArray, mn, maximumIndex + 1);
            inputArray = Arrays.copyOfRange(inputArray, maximumIndex + 1, inputArray.length);
            if (Arrays.equals(inputArray, Arrays.sort(inputArray))) {
                System.out.println(mn + 1 + " " + (maximumIndex + 1));
            } else {
                System.out.println("0 0");
            }
        }
    }
}
```
Note that this code assumes that the input array is a list of integers, and it uses the `Arrays` class to perform the necessary operations. The `Scanner` class is used to read the input from the console.
