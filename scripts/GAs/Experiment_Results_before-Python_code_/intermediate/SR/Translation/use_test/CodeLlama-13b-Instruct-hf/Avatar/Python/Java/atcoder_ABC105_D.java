
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] cumulativeRemainders = new int[N + 1];
        for (int i = 0; i < N; i++) {
            cumulativeRemainders[i] = (A[i] % M + M) % M;
        }
        cumulativeRemainders[N] = 0;
        int[] remainderCounts = new int[M];
        for (int i = 0; i < N; i++) {
            remainderCounts[cumulativeRemainders[i]]++;
        }
        int combinations = 0;
        for (int i = 0; i < M; i++) {
            combinations += remainderCounts[i] * (remainderCounts[i] - 1) / 2;
        }
        System.out.println(combinations);
    }
}
```
This code uses the `Scanner` class to read input from the console, and the `Arrays` class to create and manipulate arrays. It also uses the `IntStream` and `Collectors` classes to perform operations on the input array.

The code first reads the input `N` and `M` from the console, and then reads the input array `A` of size `N`. It then calculates the cumulative remainders of the elements of `A` modulo `M`, and stores them in an array `cumulativeRemainders`. It then calculates the number of elements in each remainder class, and stores them in an array `remainderCounts`.

Finally, the code calculates the number of combinations of elements with the same remainder, and prints the result to the console.

Note that this code assumes that the input array `A` contains only positive integers. If the input array can contain negative integers, you will need to modify the code accordingly.
