import java.util.Scanner;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int allowed_changes = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();

        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }

        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * allowed_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * allowed_changes;
        }

        System.out.println(ans);
    }
}