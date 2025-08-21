import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC133_E {
    int V; // number of vertices
    List<Integer>[] adj; // adjacency list

    // Constructor
    Graph(int v) {
        V = v;
        adj = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // Function to add an edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // Function to perform DFS
    int dfs(int s, int t, int k) {
        // Initialize a boolean array to keep track of visited vertices
        boolean[] visited = new boolean[V];

        // Initialize a stack to perform DFS
        Stack<Integer> stack = new Stack<>();

        // Mark the source vertex as visited and push it onto the stack
        visited[s] = true;
        stack.push(s);

        // Initialize the number of cases to 1
        int cases = 1;

        // Loop until the stack is empty
        while (!stack.isEmpty()) {
            // Pop a vertex from the stack
            int u = stack.pop();

            // If the popped vertex is the target vertex, return the number of cases
            if (u == t) {
                return cases;
            }

            // Loop through all the neighbors of the popped vertex
            for (int v : adj[u]) {
                // If the neighbor has not been visited, mark it as visited and push it onto the stack
                if (!visited[v]) {
                    visited[v] = true;
                    stack.push(v);

                    // If the number of cases is not equal to the number of colors, update the number of cases
                    if (cases != k) {
                        cases = (cases * (k - 1)) % 1000000007;
                    }
                }
            }
        }

        // If the stack is empty and the target vertex has not been found, return 0
        return 0;
    }

    // Function to find the number of cases
    int findCases(int s, int t, int k) {
        // Perform DFS from the source vertex
        int cases = dfs(s, t, k);

        // If the number of cases is 0, return 0
        if (cases == 0) {
            return 0;
        }

        // Otherwise, return the number of cases
        return cases;
    }
}