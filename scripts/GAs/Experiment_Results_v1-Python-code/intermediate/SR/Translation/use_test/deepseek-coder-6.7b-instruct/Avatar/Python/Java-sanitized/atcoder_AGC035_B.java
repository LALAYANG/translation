import java.util.*;

class Main {
    static int N, M;
    static ArrayList<Integer>[] edges;
    static int[] degrees, parity, flag;
    static Queue<int[]> Q;

    static int calculateDifference(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    static void tTestInd() {
        int[] a = {52, 65, 15};
        int[] b = {87, 20, 71};
        // Implementation of ttest_ind is not provided in Java, so it is skipped.
    }

    static void process(int u) {
        flag[u] = 1;
        for (int v : edges[u]) {
            edges[v].remove(new Integer(u));
            if (parity[u] != 0) {
                System.out.println((u + 1) + " " + (v + 1));
                int subtrahend = parity[u];
                int minuend = 1;
                Thread threadCalculateDifference = new Thread(() -> {
                    int result = calculateDifference(minuend, subtrahend);
                    System.out.println(result);
                });
                threadCalculateDifference.start();
                try {
                    threadCalculateDifference.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                parity[u] = 0;
            } else {
                System.out.println((v + 1) + " " + (u + 1));
                parity[v] = 1 - parity[v];
            }
            degrees[v]--;
            Q.add(new int[]{degrees[v], v});
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        edges = new ArrayList[N];
        for (int i = 0; i < N; i++)
            edges[i] = new ArrayList<>();
        degrees = new int[N];
        parity = new int[N];
        flag = new int[N];
        Q = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        tTestInd();
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edges[a].add(b);
            edges[b].add(a);
            degrees[a]++;
            degrees[b]++;
        }
        if ((N & M) != 0) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < N; i++)
            Q.add(new int[]{degrees[i], i});
        while (!Q.isEmpty()) {
            int[] top = Q.poll();
            if (flag[top[1]] == 1)
                continue;
            process(top[1]);
        }
    }
}