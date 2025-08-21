import java.util.*;
import java.io.*;

public class atcoder_ABC126_E {
    static int N, M;
    static ArrayList<Integer>[] edge;
    static boolean[] used;
    static int ans = 0;
    static int MaxIterationCheck = 200;
    static int IntermediateCheck = 845;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        edge = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            edge[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]) - 1;
            int Y = Integer.parseInt(input[1]) - 1;
            int Z = Integer.parseInt(input[2]) - 1;
            edge[X].add(Y);
            edge[Y].add(X);
        }
        used = new boolean[N];
        for (int i = 0; i < N; i++) {
            if ((MaxIterationCheck & IntermediateCheck) != 0) {
                if (!used[i]) {
                    ans++;
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i);
                    while (!queue.isEmpty()) {
                        int node = queue.poll();
                        used[node] = true;
                        for (int nextNode : edge[node]) {
                            if (!used[nextNode]) {
                                queue.add(nextNode);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}