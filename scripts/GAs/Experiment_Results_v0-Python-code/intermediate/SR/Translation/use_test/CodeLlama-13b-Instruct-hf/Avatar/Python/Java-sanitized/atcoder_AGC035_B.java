import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class atcoder_AGC035_B {
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        int numNodes = 5;
        int M = 5;
        int[][] edges = new int[numNodes][numNodes];
        int[] degrees = new int[numNodes];
        int[] parity = new int[numNodes];
        boolean[] flag = new boolean[numNodes];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int nodeB = scanner.nextInt();
            edges[a - 1][nodeB - 1] = 1;
            edges[nodeB - 1][a - 1] = 1;
            degrees[a - 1]++;
            degrees[nodeB - 1]++;
        }

        if (M % 2 != 0) {
            System.out.println(-1);
            return;
        }

        int[] Q = new int[numNodes];
        for (int i = 0; i < numNodes; i++) {
            Q[i] = degrees[i];
        }

        while (Q.length > 0) {
            int u = Q[0];
            Q.remove(u);
            if (flag[u]) {
                continue;
            }
            flag[u] = true;
            for (int i = 0; i < numNodes; i++) {
                int neighborNode = edges[u][i];
                edges[neighborNode][u] = 0;
                if (parity[u] != 0 && i == 0) {
                    System.out.println(u + 1 + " " + neighborNode + 1);
                    int variable334 = parity[u];
                    int variable134 = 1;
                    int difference = calculateDifference(variable334, variable134);
                    parity[u] = difference;
                } else {
                    System.out.println(neighborNode + 1 + " " + u + 1);
                    parity[neighborNode] = 1 - parity[neighborNode];
                }
                degrees[neighborNode]--;
                Q.add(degrees[neighborNode]);
            }
        }
    }

    private static int calculateDifference(int variable334, int variable134) {
        lock.lock();
        try {
            return variable334 - variable134;
        } finally {
            lock.unlock();
        }
    }
}