Thought process:
1. Understand the given code snippet and its functionality.
2. Translate the code snippet into Java code.
3. Ensure the Java code is correct and runs without errors.

```java
// Translated code snippet into Java

public class Main {
    public static void main(String[] args) {
        // Sample input: 2 1
        int N = 2;
        int X = 1;

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == N * 2 - 2) {
                int[] xs = new int[N - 1];
                for (int i = 0; i < N - 1; i++) {
                    xs[i] = N - 1 + i;
                }
                for (int i = 1; i < N - 1; i++) {
                    xs[i] = i;
                }
                for (int x : xs) {
                    System.out.println(x);
                }
            } else {
                int[] ys = new int[N * 2 - 4];
                for (int i = 0; i < N * 2 - 4; i++) {
                    ys[i] = i + 1;
                }
                int[] xs = new int[N - 3];
                for (int i = 0; i < N - 3; i++) {
                    xs[i] = ys[i];
                }
                xs[N - 3] = X + 2;
                xs[N - 4] = X - 1;
                xs[N - 5] = X;
                xs[N - 6] = X + 1;
                for (int i = N - 3; i < N * 2 - 4; i++) {
                    xs[i] = ys[i];
                }
                for (int x : xs) {
                    System.out.println(x);
                }
            }
        }
    }
}
```

This Java code snippet replicates the functionality of the Python code snippet provided in the problem description.
