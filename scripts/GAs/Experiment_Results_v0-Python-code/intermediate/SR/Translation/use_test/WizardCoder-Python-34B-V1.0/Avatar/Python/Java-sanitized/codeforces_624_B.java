import java.util.Arrays;
import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        Arrays.sort(values);
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        calculate_ans(values, 0, n, 1, pre, ans);
        System.out.println(ans);
    }

    public static void calculate_ans(int[] values, int j, int stop, int step, int pre, int ans) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        ans += Math.max(0, Math.min(subtract(pre, 1), values[j]);
        pre = Math.max(0, Math.min(pre - 1, values[j]);
        calculate_ans(values, j + step, stop, step, pre, ans);
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }
}