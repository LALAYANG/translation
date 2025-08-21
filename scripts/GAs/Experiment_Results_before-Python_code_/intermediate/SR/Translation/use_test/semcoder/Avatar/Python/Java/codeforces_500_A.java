To solve this problem, we need to understand the Python code snippet provided. The code initializes variables `n` and `t`, reads input for `s`, sets `current_cell` to 0, and enters a loop to move through the cells based on the values in `s`.

**Thought Process:**
1. Read input for `n` and `t`.
2. Read input for `s` as a list of integers.
3. Initialize `current_cell` to 0.
4. Enter a loop that iterates until `current_cell` is greater than `t`.
5. Inside the loop, update `current_cell` by adding the value at index `current_cell - 1` in `s`.
6. If `current_cell` is equal to `t`, print "YES" and exit the program.
7. If `current_cell` is not equal to `t`, continue the loop.
8. If the loop completes without reaching `t`, print "NO".

**Solution:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int current_cell = 0;
        while (current_cell <= t) {
            current_cell += s[current_cell - 1];
            if (current_cell == t) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
```

This Java solution replicates the functionality of the Python code snippet provided in the problem description.
