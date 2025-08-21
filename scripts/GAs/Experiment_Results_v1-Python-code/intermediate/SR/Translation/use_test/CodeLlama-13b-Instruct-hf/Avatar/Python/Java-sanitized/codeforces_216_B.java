import java.util.Map;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_216_B {
    private Map<Integer, Set<Integer>> graph;
    private Set<Integer> seen;
    private int numNodes;
    private int m;

    public Graph(int numNodes, int m) {
        this.numNodes = numNodes;
        this.m = m;
        this.graph = new HashMap<>();
        this.seen = new HashSet<>();
    }

    public void initializeGraph(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        graph.put(i, new HashSet<>());
        initializeGraph(i + step, stop, step);
    }

    public void readInts() {
        try {
            int[] line0 = new int[2];
            line0[0] = Integer.parseInt(input.nextLine());
            line0[1] = Integer.parseInt(input.nextLine());
            numNodes = line0[0];
            m = line0[1];
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }
    }

    public void addEdge(int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public void dfs(int i) {
        if (i in seen) {
            return;
        }
        seen.add(i);
        int nodes = 1;
        int edges = graph.get(i).size();
        for (int j : graph.get(i)) {
            if (j in seen) {
                continue;
            }
            dfs(j);
            nodes += 1;
            edges += graph.get(j).size();
        }
        if (nodes > 1 && nodes % 2 == 1 && (2 * nodes == edges)) {
            ans += 1;
        }
    }

    public void solve() {
        readInts();
        initializeGraph(1, numNodes + 1, 1);
        for (int i = 0; i < m; i++) {
            int[] line = new int[2];
            line[0] = Integer.parseInt(input.nextLine());
            line[1] = Integer.parseInt(input.nextLine());
            addEdge(line[0], line[1]);
        }
        for (int i = 1; i <= numNodes; i++) {
            if (i not in seen) {
                dfs(i);
            }
        }
        if ((numNodes - ans) % 2 == 1) {
            ans += 1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Graph graph = new Graph(3, 3);
        graph.solve();
    }
}