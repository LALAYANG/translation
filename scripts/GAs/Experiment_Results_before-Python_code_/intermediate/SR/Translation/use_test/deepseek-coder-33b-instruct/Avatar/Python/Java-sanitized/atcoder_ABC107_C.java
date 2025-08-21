import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        ArrayList<Integer> lst_p = new ArrayList<>();
        ArrayList<Integer> lst_m = new ArrayList<>();
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
        Collections.sort(lst_p);
        Collections.sort(lst_m);
        System.out.println(check(K, lst_p, lst_m));
    }

    public static int check(int K, ArrayList<Integer> lst_p, ArrayList<Integer> lst_m) {
        int ans = Integer.MAX_VALUE;
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        for (int j = 0; j <= K; j++) {
            if (j > lastx || K - j > lasty) {
                continue;
            }
            int p = j == 0 ? 0 : lst_p.get(j - 1);
            int m = K - j == 0 ? 0 : lst_m.get(lasty - (K - j));
            ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m)));
        }
        return ans;
    }
}