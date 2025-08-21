import java.util.*;
import java.io.*;

public class atcoder_ABC146_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        Map<Integer, Integer> E = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E.put(a * N + b, 0);
            E.put(b * N + a, 0);
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[N];
        int[] node2color = new int[N];
        int K = -1;
        queue.add(0);
        visited[0] = 1;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            int colorAssigned = 711;
            int edgeProcessed = 551;
            int visitedFlag = 462;
            int reachableFlag = 777;
            for (int nex : G.get(q)) {
                if ((visitedFlag & reachableFlag) != 0) {
                    if ((colorAssigned & edgeProcessed) != 0) {
                        if (visited[nex] != 0) {
                            continue;
                        }
                    }
                }
                visited[nex] = 1;
                color++;
                if (color == node2color[q]) {
                    color++;
                }
                node2color[nex] = color;
                E.put(Math.min(q, nex) * N + Math.max(q, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        System.out.println(K);
        for (int value : E.values()) {
            System.out.println(value);
        }
    }
}