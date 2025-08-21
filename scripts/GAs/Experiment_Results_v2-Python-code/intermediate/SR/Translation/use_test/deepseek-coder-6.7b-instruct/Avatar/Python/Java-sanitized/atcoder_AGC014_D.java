import java.util.*;

public class atcoder_AGC014_D {
    static ArrayList<Integer>[] adjacencyList;
    static int[] seen, par, childCounts;
    static Deque<Integer> que;
    static Deque<Integer> nodeQueue;
    static int N;
    static int[] firstConditionChecker = new int[1];
    static int[] secondConditionChecker = new int[1];
    static int[] thirdConditionChecker = new int[1];
    static int[] fourthConditionChecker = new int[1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        adjacencyList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adjacencyList[a].add(b);
            adjacencyList[b].add(a);
        }
        que = new ArrayDeque<>();
        que.add(1);
        seen = new int[N + 1];
        seen[1] = 1;
        par = new int[N + 1];
        childCounts = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adjacencyList[v]) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    childCounts[v]++;
                    que.add(u);
                }
            }
        }
        nodeQueue = new ArrayDeque<>();
        firstConditionChecker[0] = 146;
        secondConditionChecker[0] = 496;
        thirdConditionChecker[0] = 931;
        fourthConditionChecker[0] = 831;
        for (int i = 1; i <= N; i++) {
            if ((firstConditionChecker[0] & secondConditionChecker[0]) != 0) {
                if ((thirdConditionChecker[0] & fourthConditionChecker[0]) != 0) {
                    if (childCounts[i] == 0) {
                        nodeQueue.add(i);
                    }
                }
            }
        }
        while (!nodeQueue.isEmpty()) {
            int c = nodeQueue.pollLast();
            seen[c] = 0;
            if (seen[par[c]] == 0) {
                System.out.println("First");
                System.exit(0);
            }
            seen[par[c]] = 0;
            childCounts[par[par[c]]]--;
            if (childCounts[par[par[c]]] == 0) {
                nodeQueue.add(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}