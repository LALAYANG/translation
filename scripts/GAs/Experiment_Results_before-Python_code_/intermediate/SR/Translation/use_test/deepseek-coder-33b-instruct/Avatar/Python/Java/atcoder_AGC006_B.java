Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> xs;
            if (X == N * 2 - 2) {
                xs = new ArrayList<>();
                for (int i = N - 1; i <= X + 2; i++) {
                    xs.add(i);
                }
                for (int i = 1; i < N - 1; i++) {
                    xs.add(i);
                }
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i < X - 1; i++) {
                    ys.add(i);
                }
                for (int i = X + 3; i <= N * 2; i++) {
                    ys.add(i);
                }
                xs = new ArrayList<>(ys.subList(0, N - 3));
                xs.add(X + 2);
                xs.add(X - 1);
                xs.add(X);
                xs.add(X + 1);
                xs.addAll(ys.subList(N - 3, ys.size()));
            }
            for (int x : xs) {
                System.out.println(x);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, checks if they meet certain conditions, and if they do, it prints "Yes" and a list of integers. If they don't meet the conditions, it prints "No".

