To solve this problem, we can follow these steps:
1. Read the input integer `n` representing the number of pairs.
2. Read `n` pairs of integers and store them in a list of lists `m`.
3. Sort the list `m` in descending order based on the second element of each pair.
4. Initialize a variable `a` to the first pair in the sorted list.
5. Iterate through the remaining pairs in the sorted list.
6. If the second element of the current pair is greater than the second element of the previous pair, print 'Happy Alex' and break the loop.
7. If no such pair is found, print 'Poor Alex'.

Here is the Java solution implementing the above steps:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<int[]> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] pair = scanner.nextLine().split(" ");
            m.add(new int[]{Integer.parseInt(pair[0]), Integer.parseInt(pair[1])});
        }
        Collections.sort(m, (a, b) -> b[1] - a[1]);
        int[] a = m.get(0);
        for (int[] i : m.subList(1, m.size())) {
            if (i[1] > a[1]) {
                System.out.println("Happy Alex");
                break;
            }
            a = i;
        } else {
            System.out.println("Poor Alex");
        }
    }
}
```

This solution reads the input, sorts the pairs based on the second element, and checks if there exists a pair where the second element is greater than the previous pair's second element.
