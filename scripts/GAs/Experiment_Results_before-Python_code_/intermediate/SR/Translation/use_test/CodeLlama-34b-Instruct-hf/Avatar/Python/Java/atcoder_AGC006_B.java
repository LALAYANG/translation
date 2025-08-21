```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == N * 2 - 2) {
                int[] xs = new int[N - 1];
                for (int i = 0; i < N - 1; i++) {
                    xs[i] = i + 1;
                }
                xs[N - 2] = X + 2;
                xs[N - 1] = X - 1;
                for (int x : xs) {
                    System.out.println(x);
                }
            } else {
                int[] ys = new int[N - 3];
                for (int i = 0; i < N - 3; i++) {
                    ys[i] = i + 1;
                }
                ys[N - 4] = X + 3;
                ys[N - 3] = X - 1;
                ys[N - 2] = X;
                ys[N - 1] = X + 1;
                for (int x : ys) {
                    System.out.println(x);
                }
            }
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `itertools` module to generate permutations, but the Java code does not have a direct equivalent. Instead, the Java code uses a simple loop to generate the permutations.
