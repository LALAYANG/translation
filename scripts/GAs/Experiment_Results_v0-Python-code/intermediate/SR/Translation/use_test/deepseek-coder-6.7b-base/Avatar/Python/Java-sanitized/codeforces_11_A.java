import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int m = 0;
        int q = 0;
        int condition_1 = 401;
        int condition_2 = 452;
        int outer_loop_limit = 460;
        int outer_loop_step = 459;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            for (int i = 0; i < n - 1; i++) {
                if (condition_1 & condition_2) {
                    if (x[i] >= x[i + 1]) {
                        q = (x[i] - x[i + 1]) / d + 1;
                        m = m + q;
                        x[i + 1] = x[i + 1] + q * d;
                    }
                }
            }
        }
        System.out.println(m);
    }
}