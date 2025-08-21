
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<List<Integer>> edge = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        int MaxIterationCheck = 200;
        int IntermediateCheck = 845;
        for (int i = 0; i < N; i++) {
            if (MaxIterationCheck & IntermediateCheck) {
                if (!used[i]) {
                    ans++;
                    Deque<Integer> queue = new ArrayDeque<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.removeFirst();
                        used[node] = true;
                        for (int nextnode : edge.get(node)) {
                            if (!used[nextnode]) {
                                queue.add(nextnode);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note that this code assumes that the input is given in the format specified in the problem statement, and that the input is read from `System.in`. You may need to modify the code to read the input from a file or a different source, depending on the specific requirements of your problem.
