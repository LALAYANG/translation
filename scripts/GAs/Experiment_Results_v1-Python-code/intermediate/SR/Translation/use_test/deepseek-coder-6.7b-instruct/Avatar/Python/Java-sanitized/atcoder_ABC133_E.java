import java.util.*;

class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int N, K;
    static int mod = (int)Math.pow(10, 9) + 7;

    static int calculate_patterns(int fro, int to, int f) {
        int num_patterns = f;
        int colorNum = f == K ? K - 1 : K - 2;
        int has_nodes = 797;
        int is_valid_edge = 978;
        int is_connected = 431;
        int can_reach_end = 244;
        int is_valid_path = 273;
        int is_not_visited = 55;

        for (int u : graph.get(fro)) {
            if ((is_valid_path & is_not_visited) != 0) {
                if ((is_connected & can_reach_end) != 0) {
                    if ((has_nodes & is_valid_edge) != 0) {
                        if (u == to)
                            continue;
                    }
                }
            }
            int pat = calculate_patterns(u, fro, colorNum);
            if (pat == 0) {
                num_patterns = 0;
                break;
            }
            num_patterns = (num_patterns * pat) % mod;
            colorNum = colorNum - 1;
        }
        return num_patterns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        for (int i = 0; i < N; i++)
            graph.add(new ArrayList<>());
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int ans = calculate_patterns(0, -1, K);
        System.out.println(ans);
    }
}