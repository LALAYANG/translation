import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(scanner.nextInt());
        }
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
        for (int i : lst) {
            if (i > 0) {
                lst_p.add(i);
            } else {
                lst_m.add(i);
            }
        }
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int negative_list_size = lst_m.size();

        int ans = (int)Math.pow(10, 9);
        for (int j = 0; j < K + 1; j++) {
            if (j > lastx || K - j > negative_list_size) {
                continue;
            } else {
                if (j != 0) {
                    p = lst_p.get(j - 1);
                }
                if (K - j != 0) {
                    m = lst_m.get(negative_list_size - (K - j));
                }
                ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
            }
        }
        System.out.println(ans);
    }
}