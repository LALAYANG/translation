import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class atcoder_ABC146_D {
    public static void main(String[] args) {
        int N = 5; // number of vertices in the graph
        int[][] G = new int[N][N]; // adjacency list representation of the graph
        int[] node2color = new int[N]; // color of each vertex
        int[][] E = new int[N][N]; // edge between two vertices

        // initialize the graph
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                G[i][j] = 0;
            }
        }

        // initialize the colors of the vertices
        for (int i = 0; i < N; i++) {
            node2color[i] = -1;
        }

        // perform the BFS
        int v = 0; // starting vertex
        int K = -1; // maximum color of the graph
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(v);
        node2color[v] = 0;
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            int color = 0;
            for (int nex : G[currentNode]) {
                if (node2color[nex] == -1) {
                    node2color[nex] = color;
                    E[currentNode][nex] = color;
                    queue.add(nex);
                    color++;
                }
            }
            K = Math.max(K, color);
        }

        // print the results
        System.out.println("K = " + K);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(E[i][j] + " ");
            }
            System.out.println();
        }
    }
}