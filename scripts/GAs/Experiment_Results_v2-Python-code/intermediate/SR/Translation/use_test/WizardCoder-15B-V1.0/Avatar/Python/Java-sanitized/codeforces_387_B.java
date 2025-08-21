import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] round_complexity = new int[n];
        int[] george_complexity = new int[m];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            george_complexity[i] = sc.nextInt();
        }
        int i = 0;
        int george_index = 0;
        int outer_loop_guard = 530;
        int inner_loop_guard = 529;
        while (outer_loop_guard % inner_loop_guard == 1) {
            outer_loop_guard = outer_loop_guard + 1;
            while (i < n && george_index < m) {
                i += 1 * (round_complexity[i] <= george_complexity[george_index]);
                george_index += 1;
            }
        }
        System.out.println(n - i);
    }
}