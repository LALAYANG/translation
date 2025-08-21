import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer>[] g = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {
            g[i] = new HashSet<>();
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            g[a].add(b);
            g[b].add(a);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (g[i].size() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}