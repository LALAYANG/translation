import java.util.Scanner;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int[] l = new int[101];
        int inner_loop_limit = 869;
        int outer_loop_limit = 868;
        int res = 0;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                l[lst[i]]++;
            }
            for (int i = 0; i < n; i++) {
                if (l[lst[i]] > 1) {
                    res += n - i - l[lst[i]];
                    l[lst[i]]--;
                } else {
                    res += n - i - 1;
                }
            }
        }
        System.out.println(res);
    }
}