import java.util.Scanner;

public class codeforces_596_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = scanner.nextInt();
        }
        int ans = Math.abs(r[0]);
        accumulateAbsoluteDifferences(1, n, 1, r, ans);
        System.out.println(ans);
    }

    public static void accumulateAbsoluteDifferences(int i, int stop, int step, int[] r, int ans) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        ans += Math.abs(r[i] - r[i - 1]);
        accumulateAbsoluteDifferences(i + step, stop, step, r, ans);
    }
}