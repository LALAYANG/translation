import java.util.Scanner;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = new int[n];
        for (int i = 0; i < k; i++) {
            ans[i] = sk / k + (i < sk % k ? 1 : 0);
        }
        for (int i = k; i < n; i++) {
            ans[i] = (sa - sk) / (n - k) + ((i - k) < (sa - sk) % (n - k) ? 1 : 0);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}