import java.util.*;

class Main {
    static Scanner in = new Scanner(System.in);
    static int N, K;
    static String S;

    public static void main(String[] args) {
        N = in.nextInt();
        K = in.nextInt();
        S = in.next();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int current_happiness = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = current_happiness + 2 * K;
        }
        System.out.println(ans);
    }
}