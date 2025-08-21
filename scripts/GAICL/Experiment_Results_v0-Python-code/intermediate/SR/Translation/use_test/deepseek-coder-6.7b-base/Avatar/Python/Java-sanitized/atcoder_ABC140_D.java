import java.util.Scanner;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max_changes = sc.nextInt();
        String S = sc.next();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int variable_6_47 = 1;
        int cur_happy = calculate_happiness(variable_6_47, N, seg_cnt);
        if (2 * max_changes >= seg_cnt) {
            System.out.println(N - 1);
        } else {
            System.out.println(cur_happy + 2 * max_changes);
        }
    }

    public static int calculate_happiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }
}