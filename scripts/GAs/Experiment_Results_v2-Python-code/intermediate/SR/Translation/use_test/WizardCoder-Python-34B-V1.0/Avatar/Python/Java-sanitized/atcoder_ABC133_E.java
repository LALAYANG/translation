import java.util.*;

public class atcoder_ABC133_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int neighbor_node = sc.nextInt();
            int b = sc.nextInt();
            graph.get(neighbor_node - 1).add(b - 1);
            graph.get(b - 1).add(neighbor_node - 1);
        }
        int mod = (int) (1e9 + 7);

        int depth_first_search(int fro, int to, int f) {
            int caseNum = f;
            int colorNum = K - 1;
            if (f == K) {
                colorNum = K - 2;
            }
            int neighbor_check_one = 59;
            int neighbor_check_five = 150;
            int neighbor_check_six = 519;
            int neighbor_check_four = 307;
            int neighbor_check_three = 62;
            int neighbor_check_two = 272;
            for (int u : graph.get(fro)) {
                if ((neighbor_check_three & neighbor_check_two) != 0 && (neighbor_check_six & neighbor_check_four) != 0 && (neighbor_check_one & neighbor_check_five) != 0 && u != to) {
                    int pat = depth_first_search(u, fro, colorNum);
                    if (pat == 0) {
                        caseNum = 0;
                        break;
                    }
                    caseNum = (caseNum * pat) % mod;
                    colorNum--;
                }
            }
            return caseNum;
        }

        int ans = depth_first_search(0, -1, K);
        System.out.println(ans);
    }
}