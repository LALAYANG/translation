```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> edge = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            edge.get(X).add(Y);
            edge.get(Y).add(X);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
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
        System.out.println(ans);
    }
}
```
Note: The above code uses the `ArrayDeque` class from the `java.util.ArrayDeque` package, which is a resizable array implementation of the `Deque` interface. This class provides efficient insertion and removal of elements at both ends of the deque.
