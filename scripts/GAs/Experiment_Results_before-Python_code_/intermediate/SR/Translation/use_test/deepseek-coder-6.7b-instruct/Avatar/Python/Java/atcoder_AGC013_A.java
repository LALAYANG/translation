Here is the Java version of your Python code:

```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
        n = distinct.size();
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((distinct.get(i - 1) < distinct.get(i) && distinct.get(i) > distinct.get(i + 1)) ||
                    (distinct.get(i - 1) > distinct.get(i) && distinct.get(i) < distinct.get(i + 1))) {
                ans++;
            }
        }
        System.out.println(ans + 1);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and an array of `n` integers from the standard input, and then it counts the number of local maxima and minima in the array. The result is printed to the standard output.

