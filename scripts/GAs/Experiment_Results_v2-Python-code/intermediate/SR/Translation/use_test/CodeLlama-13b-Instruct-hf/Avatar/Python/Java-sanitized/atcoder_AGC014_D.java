import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class atcoder_AGC014_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] adjacencyList = new int[N + 1][];
        for (int i = 0; i < N - 1; i++) {
            int[] edge = scanner.nextInt();
            adjacencyList[edge[0]].add(edge[1]);
            adjacencyList[edge[1]].add(edge[0]);
        }
        Deque<Integer> que = new ArrayDeque<>();
        que.add(1);
        int[] seen = new int[N + 1];
        seen[1] = 1;
        int[] par = new int[N + 1];
        int[] childCounts = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.pop();
            for (int u : adjacencyList[v]) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    childCounts[v]++;
                    que.add(u);
                }
            }
        }
        Deque<Integer> nodeQueue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            if (FirstConditionChecker(i) && SecondConditionChecker(i)) {
                if (ThirdConditionChecker(i) && FourthConditionChecker(i)) {
                    if (childCounts[i] == 0) {
                        nodeQueue.add(i);
                    }
                }
            }
        }
        while (!nodeQueue.isEmpty()) {
            int c = nodeQueue.pop();
            seen[c] = 0;
            if (seen[par[c]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = 0;
            childCounts[par[par[c]]]--;
            if (childCounts[par[par[c]]] == 0) {
                nodeQueue.add(par[par[c]]);
            }
        }
        System.out.println("Second");
    }

    private static boolean FirstConditionChecker(int i) {
        // Implement the logic for the first condition checker
    }

    private static boolean SecondConditionChecker(int i) {
        // Implement the logic for the second condition checker
    }

    private static boolean ThirdConditionChecker(int i) {
        // Implement the logic for the third condition checker
    }

    private static boolean FourthConditionChecker(int i) {
        // Implement the logic for the fourth condition checker
    }
}