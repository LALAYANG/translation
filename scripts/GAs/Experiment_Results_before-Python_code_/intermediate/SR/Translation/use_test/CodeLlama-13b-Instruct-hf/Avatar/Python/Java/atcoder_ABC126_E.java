
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < N; i++) {
            edge.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < M; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            edge.get(X - 1).add(Y - 1);
            edge.get(Y - 1).add(X - 1);
        }
        boolean[] used = new boolean[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                ans++;
                Deque<Integer> queue = new LinkedList<Integer>();
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the graph data. The `Deque` class is used to implement the queue data structure.
