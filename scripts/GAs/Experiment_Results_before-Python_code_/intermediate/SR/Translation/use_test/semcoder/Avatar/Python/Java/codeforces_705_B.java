To solve this problem, we need to understand the given code snippet. The code initializes a variable `c` with a value of 2 and then iterates over a list `w` containing integers. For each integer in `w`, it checks if it is equal to 1, if it is even, and if it is odd. Based on these conditions, it prints the value of `c` and updates `c` accordingly.

Here is the Java solution to match the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int c = 2;
        for (int i : w) {
            if (i == 1) {
                System.out.println(c);
            } else if (i % 2 == 0) {
                c = 3 - c;
                System.out.println(c);
            } else {
                System.out.println(c);
            }
        }
    }
}
```

This Java solution reads the input values for `n` and `w`, iterates over the list `w`, and prints the corresponding values of `c` based on the conditions specified in the Python code snippet.
