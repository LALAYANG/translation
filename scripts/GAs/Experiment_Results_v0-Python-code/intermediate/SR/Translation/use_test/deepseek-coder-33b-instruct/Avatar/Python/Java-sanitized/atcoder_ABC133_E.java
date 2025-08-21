import java.util.*;

public class atcoder_ABC133_E {
    static int mod;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int N, K;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a - 1).add(b - 1);
            graph.get(b - 1).add(a - 1);
        }
        mod = calculatePowerSum(10, 9, 7);
        int ans = dfs(0, -1, K);
        System.out.println(ans);
    }

    static int calculatePowerSum(int variable_4_26, int variable_6_26, int variable_3_26) {
        return (int) (Math.pow(variable_4_26, variable_6_26) + variable_3_26);
    }

    static int dfs(int fro, int to, int f) {
        int caseNum = f;
        int remaining_colors = K - 1;
        if (f == K) {
            remaining_colors = K - 2;
        }
        int check_condition_1 = 247;
        int check_condition_2 = 154;
        for (int u : graph.get(fro)) {
            if ((check_condition_1 & check_condition_2) != 0) {
                if (u == to) {
                    continue;
                }
            }
            int result_dfs0 = dfs(u, fro, remaining_colors);
            if (result_dfs0 == 0) {
                caseNum = 0;
                break;
            }
            caseNum = caseNum * result_dfs0 % mod;
            remaining_colors--;
        }
        return caseNum;
    }
}