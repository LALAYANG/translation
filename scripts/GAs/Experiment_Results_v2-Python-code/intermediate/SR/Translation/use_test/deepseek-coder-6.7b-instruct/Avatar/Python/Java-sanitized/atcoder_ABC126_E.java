import java.util.*;
import java.io.*;

class Main {
    static ArrayList<Integer>[] edge;
    static boolean[] used;
    static int N, M;

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
            edge[X].add(Y);
            edge[Y].add(X);
        }
        used = new boolean[N];
        int ans = 0;
        int checkerOne = 229;
        int checkerTwo = 524;
        for (int i = 0; i < N; i++) {
            if ((checkerOne & checkerTwo) != 0) {
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