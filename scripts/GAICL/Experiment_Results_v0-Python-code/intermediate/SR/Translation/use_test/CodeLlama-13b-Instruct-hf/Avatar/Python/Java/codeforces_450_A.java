
The provided Python code is a bit complex and contains several nested loops and functions. However, I can provide a Java implementation of the same logic.

Here's the Java code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            int element = l.get(i);
            if (element % m == 0) {
                l2.add(element / m);
            } else {
                l2.add(element / m + 1);
            }
        }
        int mx = Collections.max(l2);
        int ind = 0;
        for (int i = 0; i < l2.size(); i++) {
            if (l2.get(i) == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}
```
This code first reads the input from the user, which consists of two integers `n` and `m`. It then creates a list `l` of `n` integers, and a list `l2` of `n` integers.

The code then iterates over the elements of `l` and calculates the ceiling of each element divided by `m`. If the result is an integer, it adds the result to `l2`. Otherwise, it adds the result plus 1 to `l2`.

The code then finds the maximum value in `l2` and stores it in a variable `mx`. It then iterates over the elements of `l2` and finds the index of the first element that is equal to `mx`. This index is stored in a variable `ind`.

Finally, the code prints the value of `ind + 1` as the output.

Note that the code uses the `Collections.max()` method to find the maximum value in `l2`, and the `List.get()` method to access the elements of `l2`.
