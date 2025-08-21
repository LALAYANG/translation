```java
import java.util.ArrayList;
import java.util.List;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int mod = 1000000007;
        int ans = calculatePatterns(graph, 0, -1, K, mod);
        System.out.println(ans);
    }

    public static int calculatePatterns(List<List<Integer>> graph, int fro, int to, int f, int mod) {
        int numPatterns = 1;
        int colorNum = K - 1;
        for (int u : graph.get(fro)) {
            if (u == to) {
                continue;
            }
            int pat = calculatePatterns(graph, u, fro, colorNum, mod);
            if (pat == 0) {
                numPatterns = 0;
                break;
            }
            numPatterns = (numPatterns * pat) % mod;
            colorNum--;
        }
        return numPatterns;
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses a defaultdict to store the graph, but in Java, we use a List of Lists to represent the graph. The Python code also uses a modulo operator to handle large numbers, but in Java, we use the modulo operator to perform the same operation. The rest of the code is similar to the Python code.
