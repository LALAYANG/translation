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
        for (int i = 0; i < n; i++) {
            if (i < k) {
                ans[i] = (sk % k > i) ? sk / k + 1 : sk / k;
            } else {
                ans[i] = ((sa - sk) % (n - k) > i - k) ? (sa - sk) / (n - k) + 1 : (sa - sk) / (n - k);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}