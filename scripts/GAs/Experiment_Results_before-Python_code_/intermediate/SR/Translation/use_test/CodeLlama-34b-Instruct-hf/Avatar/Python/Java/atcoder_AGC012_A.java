```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        Arrays.sort(A);

        int ans = 0;
        for (int i = 0; i < n - 2; i += 2) {
            ans += A[i];
        }

        System.out.println(ans);
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. If you want to use the `readInts()` method, you can define it as follows:
```java
public static int[] readInts() {
    return Arrays.stream(System.in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
}
```
This method reads a line of input from the user, splits it into an array of strings using the space character as the delimiter, and then converts each string to an integer using the `Integer.parseInt()` method. The resulting array of integers is returned.
