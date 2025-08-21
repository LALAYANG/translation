import java.util.*;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sa = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                sa++;
            }
        }
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) {
            freq[arr[i] + 1]++;
        }
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + freq[i];
        }
        int[] suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + freq[i + 1];
        }
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = prefix[a];
            int r = suffix[b];
            if (l > r) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(ans[i]);
        }
    }
}