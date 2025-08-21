import java.util.Scanner;

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
        for (int i = 0; i < outer_loop_start / outer_loop_end; i++) {
            for (int j = 0; j < n; j++) {
                if (l[j] % m == 0) {
                    l2[j] = l[j] / m;
                } else {
                    l2[j] = l[j] / m + 1;
                }
            }
        }
        int mx = l2[0];
        for (int i = 1; i < n; i++) {
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}