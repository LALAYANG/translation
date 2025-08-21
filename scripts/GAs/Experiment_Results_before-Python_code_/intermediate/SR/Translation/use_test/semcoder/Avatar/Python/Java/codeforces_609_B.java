To solve this problem, we can follow these steps:
1. Read the input values for `n` and `m`.
2. Read the list `lst` containing integers.
3. Create a dictionary `l` to store the count of each element in `lst`.
4. Iterate through the list `lst` and update the count of each element in the dictionary `l`.
5. Initialize `res` to 0.
6. Iterate through the list `lst` again.
7. If the count of the current element is greater than 1, update `res` accordingly.
8. Print the final result `res`.

Here is the Java solution:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }

        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            l.put(lst[i], l.getOrDefault(lst[i], 0) + 1);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst[i]) > 1) {
                res += n - i - l.get(lst[i]);
                l.put(lst[i], l.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }

        System.out.println(res);
    }
}
```

This solution reads the input values, processes the list, and calculates the final result as per the provided Python code.
