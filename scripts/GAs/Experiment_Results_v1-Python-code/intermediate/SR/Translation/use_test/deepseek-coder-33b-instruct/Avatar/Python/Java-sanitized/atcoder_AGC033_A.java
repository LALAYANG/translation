public class atcoder_AGC033_A {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] graph = {
            {0, 7, INF, 8},
            {INF, 0, 5, INF},
            {INF, INF, 0, 2},
            {INF, INF, INF, 0}
        };

        int v = graph.length;
        floydWarshall(graph, v);
    }

    private static void floydWarshall(int[][] graph, int v) {
        int[][] dist = new int[v][v];
        int i, j, k;

        for (i = 0; i < v; i++)
            for (j = 0; j < v; j++)
                dist[i][j] = graph[i][j];

        for (k = 0; k < v; k++) {
            for (i = 0; i < v; i++) {
                for (j = 0; j < v; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        printSolution(dist, v);
    }

    private static void printSolution(int[][] dist, int v) {
        System.out.println("The following matrix shows the shortest distances between every pair of vertices");
        for (int i = 0; i < v; ++i) {
            for (int j = 0; j < v; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }
}