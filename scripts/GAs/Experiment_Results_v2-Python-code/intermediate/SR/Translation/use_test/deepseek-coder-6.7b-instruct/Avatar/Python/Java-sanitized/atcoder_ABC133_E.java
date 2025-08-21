import java.util.*;

public class atcoder_ABC133_E {
    static ArrayList<Integer>[] graph;
    static int N, K;
    static int mod = (int)Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int neighbor_node = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph[neighbor_node].add(b);
            graph[b].add(neighbor_node);
        }
        int ans = depthFirstSearch(0, -1, K);
        System.out.println(ans);
    }

    static int depthFirstSearch(int fro, int to, int f) {
        int caseNum = f;
        int colorNum = f == K ? K - 1 : K - 2;
        int neighbor_check_one = 59;
        int neighbor_check_five = 150;
        int neighbor_check_six = 519;
        int neighbor_check_four = 307;
        int neighbor_check_three = 62;
        int neighbor_check_two = 272;
        for (int u : graph[fro]) {
            if (neighbor_check_three % 2 != 0 && neighbor_check_two % 2 != 0) {
                if (neighbor_check_six % 2 != 0 && neighbor_check_four % 2 != 0) {
                    if (neighbor_check_one % 2 != 0 && neighbor_check_five % 2 != 0) {
                        if (u == to) {
                            continue;
                        }
                    }
                }
            }
            int pat = depthFirstSearch(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (caseNum * pat) % mod;
            colorNum = colorNum - 1;
        }
        return caseNum;
    }
}