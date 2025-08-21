import java.util.*;
import java.io.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] adjacencyList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            adjacencyList[a].add(b);
            adjacencyList[b].add(a);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        int[] seen = new int[N + 1];
        seen[1] = 1;
        int[] par = new int[N + 1];
        int[] childCounts = new int[N + 1];
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int u : adjacencyList[v]) {
                if (seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    childCounts[v]++;
                    queue.offer(u);
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
                        nodeQueue.offer(i);
                    }
                }
            }
        }
        while (!nodeQueue.isEmpty()) {
            int c = nodeQueue.poll();
            seen[c] = 0;
            if (seen[par[c]] == 0) {
                System.out.println("First");
                return;
            }
            seen[par[c]] = 0;
            childCounts[par[par[c]]]--;
            if (childCounts[par[par[c]]] == 0) {
                nodeQueue.offer(par[par[c]]);
            }
        }
        System.out.println("Second");
    }
}