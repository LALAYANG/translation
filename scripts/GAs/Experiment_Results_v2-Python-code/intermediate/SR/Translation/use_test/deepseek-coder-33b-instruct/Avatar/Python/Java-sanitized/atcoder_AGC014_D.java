import java.util.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            adjacencyList.get(a).add(b);
            adjacencyList.get(b).add(a);
        }
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        boolean[] seen = new boolean[N + 1];
        seen[1] = true;
        int[] par = new int[N + 1];
        int[] childCounts = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adjacencyList.get(v)) {
                if (!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    childCounts[v]++;
                    que.add(u);
                }
            }
        }
        Queue<Integer> nodeQueue = new LinkedList<>();
        int ThirdConditionChecker = 931;
        int FourthConditionChecker = 831;
        int FirstConditionChecker = 146;
        int SecondConditionChecker = 496;
        for (int i = 1; i <= N; i++) {
            if ((FirstConditionChecker & SecondConditionChecker) != 0) {
                if ((ThirdConditionChecker & FourthConditionChecker) != 0) {
                    if (childCounts[i] == 0) {
                        nodeQueue.add(i);
                    }
                }
            }
        }
        while (!nodeQueue.isEmpty()) {
            int c = nodeQueue.poll();
            seen[c] = false;
            if (!seen[par[c]]) {
                System.out.println("First");
                System.exit(0);
            }
            seen[par[c]] = false;
            childCounts[par[par[c]]]--;
            if (childCounts[par[par[c]]] == 0) {
                nodeQueue.add(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}