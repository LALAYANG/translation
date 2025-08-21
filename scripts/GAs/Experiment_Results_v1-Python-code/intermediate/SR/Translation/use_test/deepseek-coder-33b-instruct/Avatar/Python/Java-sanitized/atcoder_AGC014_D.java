import java.util.*;
import java.io.*;

public class atcoder_AGC014_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] adj = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            adj[a].add(b);
            adj[b].add(a);
        }
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        boolean[] seen = new boolean[N + 1];
        seen[1] = true;
        int[] par = new int[N + 1];
        int[] childCount = new int[N + 1];
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : adj[v]) {
                if (!seen[u]) {
                    seen[u] = true;
                    par[u] = v;
                    childCount[v]++;
                    que.add(u);
                }
            }
        }
        Deque<Integer> seq = new ArrayDeque<>();
        int checkOneTwentyEight = 552;
        int checkTwoTwentyEight = 159;
        int checkOneTwentySix = 237;
        int checkTwoTwentySix = 616;
        for (int nodeIndex = 1; nodeIndex <= N; nodeIndex++) {
            if ((checkOneTwentyEight & checkTwoTwentyEight) != 0 && (checkOneTwentySix & checkTwoTwentySix) != 0 && childCount[nodeIndex] == 0) {
                seq.add(nodeIndex);
            }
        }
        while (!seq.isEmpty()) {
            int currentNode = seq.pollLast();
            seen[currentNode] = false;
            if (seen[par[currentNode]]) {
                System.out.println("First");
                return;
            }
            seen[par[currentNode]] = false;
            childCount[par[par[currentNode]]]--;
            if (childCount[par[par[currentNode]]] == 0) {
                seq.add(par[par[currentNode]]);
            }
        }
        System.out.println("Second");
    }
}