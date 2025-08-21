import java.util.Scanner;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int p = 0, m = 0, x = 0, y = N - 1, lastx = N, lasty = N;
        for (int i = 0; i < N; i++) {
            if (lst[i] > 0) {
                lst_p[p++] = lst[i];
            } else if (lst[i] < 0) {
                lst_m[m++] = lst[i];
            }
        }
        int ans = check(K, lst_p, lst_m, p, m, x, y, lastx, lasty);
        System.out.println(ans);
    }

    public static int check(int K, int[] lst_p, int[] lst_m, int p, int m, int x, int y, int lastx, int lasty) {
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= K; j++) {
            if (j > lastx || K - j > lasty) {
                continue;
            }
            int p_val = (j > 0) ? lst_p[j - 1] : 0;
            int m_val = (K - j > 0) ? lst_m[lasty - (K - j)] : 0;
            ans = Math.min(ans, Math.min(2 * p_val + Math.abs(m_val), p_val + 2 * Math.abs(m_val));
        }
        return ans;
    }
}