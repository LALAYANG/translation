import java.util.Scanner;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        int m = scanner.nextInt();
        Graph g = new Graph(numNodes);
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g.addEdge(a, b);
            g.addEdge(b, a);
        }
        int ans = 0;
        for (int i = 1; i <= numNodes; i++) {
            if (g.hasEdge(i, i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

class Graph {
    int numNodes;
    int[][] edges;

    public Graph(int numNodes) {
        this.numNodes = numNodes;
        edges = new int[numNodes][numNodes];
    }

    public void addEdge(int a, int b) {
        edges[a][b] = 1;
        edges[b][a] = 1;
    }

    public boolean hasEdge(int a, int b) {
        return edges[a][b] == 1;
    }
}