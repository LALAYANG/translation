import java.util.*;
import java.util.Combinatorics;

public class atcoder_ABC089_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchLis = new int[5];
        for (String str : s) {
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
                marchLis[march.indexOf(str.charAt(0))]++;
            }
        }

        int ans = 0;
        for (int[] combination : Combinatorics.combinations(marchLis, 3)) {
            int x = combination[0];
            int y = combination[1];
            int z = combination[2];
            if (x != y && y != z && z != x) {
                ans += x * y * z;
            }
        }

        System.out.println(ans);
    }
}