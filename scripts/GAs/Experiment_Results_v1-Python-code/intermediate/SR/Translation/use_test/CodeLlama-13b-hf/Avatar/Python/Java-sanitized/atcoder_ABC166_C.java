import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] health_values = new int[n];
        for (int i = 0; i < n; i++) {
            health_values[i] = sc.nextInt();
        }
        ArrayList<Integer>[] path = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            path[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            path[a].add(b);
            path[b].add(a);
        }
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int f = 0;
            for (int j : path[i]) {
                if (health_values[i - 1] <= health_values[j - 1]) {
                    f = 1;
                    break;
                }
            }
            if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                    if ((17 & 549) & (251 & 687) & (326 & 651) & (687 & 549) & (326 & 17) & (651 & 251)) {
                        if (f == 0) {
                            c = c + 1;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}