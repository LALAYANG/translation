import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer>[] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            G[a].add(b);
            G[b].add(a);
        }
        int[] node2color = new int[N];
        int K = -1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        node2color[0] = 1;
        while (!queue.isEmpty()) {
            int current_node = queue.poll();
            int color = 0;
            for (int nex : G[current_node]) {
                if (node2color[nex] != 0) {
                    continue;
                }
                color = color + 1;
                if (color == node2color[current_node]) {
                    color = color + 1;
                }
                node2color[nex] = color;
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        System.out.println(K);
        for (int i = 0; i < N - 1; i++) {
            int a = i;
            int b = i + 1;
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            System.out.println(node2color[a] < node2color[b] ? node2color[a] : node2color[b]);
        }
    }
}