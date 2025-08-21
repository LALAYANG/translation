import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = sc.nextInt();
        }
        List<Integer> lst_p = new ArrayList<Integer>();
        List<Integer> lst_m = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            if (lst[i] == 0) {
                K--;
            }
            if (lst[i] > 0) {
                lst_p.add(lst[i]);
            } else if (lst[i] < 0) {
                lst_m.add(lst[i]);
            }
        }
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        int ans = 1000000000;
        for (int k = 0; k <= K; k++) {
            int j = x;
            int k_j = k - j;
            int m_k_j = lasty - k_j;
            if (j > lastx || k_j > lasty) {
                continue;
            }
            if (j == 0) {
                p = 0;
            } else {
                p = lst_p.get(j - 1);
            }
            if (k_j == 0) {
                m = 0;
            } else {
                m = lst_m.get(m_k_j);
            }
            ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
            if (j < lastx) {
                x++;
            }
            if (k_j < lasty) {
                y--;
            }
        }
        System.out.println(ans);
    }
}