
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(scanner.nextInt());
            }
            li.add(list);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> inputSet = new HashSet<>();
        for (List<Integer> list : li) {
            for (int i : list) {
                inputSet.add(i);
            }
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>();
        for (int i : r) {
            if (!inputSet.contains(i)) {
                v.add(i);
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (li.get(i).get(j) % 2 != p[i]) {
                    ans += 2;
                }
            }
        }
        System.out.println(ans);
    }
}
```
The Java code is similar to the Python code, but with some differences in syntax and data structures. Here's a brief explanation of the Java code:

1. The `Scanner` class is used to read input from the user.
2. The `List` interface is used to store the input lists.
3. The `Set` interface is used to store the input set and the set of integers that are not in the input set.
4. The `Iterator` interface is used to iterate over the elements of the input set.
5. The `for` loop is used to iterate over the elements of the input set and check if they are in the input set.
6. The `if` statement is used to check if the current element is in the input set.
7. The `ans` variable is used to store the final answer.

Note that the Java code is not exactly the same as the Python code, but it should produce the same output for the given input.
