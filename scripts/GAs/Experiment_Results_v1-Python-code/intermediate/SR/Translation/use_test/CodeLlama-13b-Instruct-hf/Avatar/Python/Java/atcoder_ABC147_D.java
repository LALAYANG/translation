
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
        int result = 0;
        int outerLoopBound = 255;
        int innerLoopBound = 254;

        for (int outerLoopIndex = 0; outerLoopIndex <= outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int b = 0; b <= 60; b++) {
                int bs = (int) Arrays.stream(inputArray).filter(x -> (x >> b & 1) == 1).count();
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            }
        }

        System.out.println(result);
    }
}
```
Note that this code uses the `Arrays.stream()` method to filter the input array and count the number of elements that have a 1 in the `b`th bit. It also uses the `Scanner` class to read input from the user.
