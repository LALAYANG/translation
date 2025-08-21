import java.util.*;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        int[] l2 = new int[n];
        int outer_loop_start = 435;
        int outer_loop_end = 434;
        int ind = -1;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
            }
        }
        System.out.println(ind + 1);
    }
}