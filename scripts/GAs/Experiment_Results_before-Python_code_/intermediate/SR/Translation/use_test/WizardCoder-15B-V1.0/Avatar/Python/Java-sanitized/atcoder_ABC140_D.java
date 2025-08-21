import java.util.*;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        String S = input.next();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        if (2 * K >= seg_cnt) {
            System.out.println(N - 1);
        } else {
            System.out.println(cur_happy + 2 * K);
        }
    }
}