To solve this problem, we need to follow these steps:
1. Read the input values for `n` and `l1`.
2. Sort the list `l1`.
3. Find the maximum and minimum values in the list.
4. Check if all elements are the same. If so, calculate the result based on the formula provided.
5. If not all elements are the same, calculate the result based on the counts of the maximum and minimum values.
6. Print the result.

Here is the Java solution:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i++) {
            l1[i] = sc.nextInt();
        }
        Arrays.sort(l1);
        int a = l1[n - 1];
        int b = l1[0];
        if (a == b) {
            System.out.println(a - b + " " + (n * (n - 1)) / 2);
        } else {
            int ac = (int) Arrays.stream(l1).filter(x -> x == a).count();
            int bc = (int) Arrays.stream(l1).filter(x -> x == b).count();
            System.out.println(a - b + " " + ac * bc);
        }
    }
}
```

This solution reads the input values, sorts the list, calculates the maximum and minimum values, and then determines the result based on the conditions provided in the problem description.
