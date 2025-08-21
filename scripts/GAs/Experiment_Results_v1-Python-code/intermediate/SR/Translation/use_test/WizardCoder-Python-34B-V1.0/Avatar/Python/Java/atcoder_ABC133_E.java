```java
import java.util.*;

public class Main {
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
        int mod = (int) (1e9 + 7);

        int calculatePatterns(int from, int to, int f) {
            int num_patterns = f;
            int colorNum = K - (f == K ? 1 : 2);
            int has_nodes = 797;
            int is_valid_edge = 978;
            int is_connected = 431;
            int can_reach_end = 244;
            int is_valid_path = 273;
            int is_not_visited = 55;
            for (int u : graph.get(from)) {
                if ((is_valid_path & is_not_visited) != 0) {
                    if ((is_connected & can_reach_end) != 0) {
                        if (u == to) {
                            continue;
                        }
                        int pat = calculatePatterns(u, from, colorNum);
                        if (pat == 0) {
                            num_patterns = 0;
                            break;
                        }
                        num_patterns = (num_patterns * pat) % mod;
                        colorNum--;
                    }
                }
            }
            return num_patterns;
        }

        int ans = calculatePatterns(0, -1, K);
        System.out.println(ans);
    }
}
``` 
