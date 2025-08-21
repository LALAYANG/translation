import java.util.*;

public class atcoder_AGC033_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] graph = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int j = 0; j < w; j++) {
                graph[i][j] = line.charAt(j);
            }
        }
        int[][] dist = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            if (x + 1 < w && dist[x + 1][y] > dist[x][y] + 1 && graph[x + 1][y] != '#') {
                dist[x + 1][y] = dist[x][y] + 1;
                q.add(new int[]{x + 1, y});
            }
            if (x - 1 >= 0 && dist[x - 1][y] > dist[x][y] + 1 && graph[x - 1][y] != '#') {
                dist[x - 1][y] = dist[x][y] + 1;
                q.add(new int[]{x - 1, y});
            }
            if (y + 1 < h && dist[x][y + 1] > dist[x][y] + 1 && graph[x][y + 1] != '#') {
                dist[x][y + 1] = dist[x][y] + 1;
                q.add(new int[]{x, y + 1});
            }
            if (y - 1 >= 0 && dist[x][y - 1] > dist[x][y] + 1 && graph[x][y - 1] != '#') {
                dist[x][y - 1] = dist[x][y] + 1;
                q.add(new int[]{x, y - 1});
            }
        }
        System.out.println(dist[h - 1][w - 1]);
    }
}